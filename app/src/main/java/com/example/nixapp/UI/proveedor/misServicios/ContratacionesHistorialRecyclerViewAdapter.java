package com.example.nixapp.UI.proveedor.misServicios;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.nixapp.DB.Contrataciones;
import com.example.nixapp.R;
import com.example.nixapp.UI.proveedor.serviciosProximos.ServiciosPendientesFragmentProveedor;

import java.util.List;

public class ContratacionesHistorialRecyclerViewAdapter extends RecyclerView.Adapter<ContratacionesHistorialRecyclerViewAdapter.ViewHolder> {

    private final List<Contrataciones> mValues;
    private final HistorialFragmentProveedor.OnListFragmentInteractionListener mListener;

    public ContratacionesHistorialRecyclerViewAdapter(List<Contrataciones> items, HistorialFragmentProveedor.OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_cotizaciones_buscar, parent, false);
        return new ViewHolder(view);

        
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.id_evento.setText("Del evento: " + holder.mItem.getNombre_evento());
        holder.nombre.setText(String.valueOf(holder.mItem.getFecha()));
        holder.nombreServicio.setText("Servicio: "+ holder.mItem.getNombre());
        holder.nombreServicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }


            }
        });



    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView nombre, nombreServicio,id_evento;
        public final ImageView eventImage;
        public Contrataciones mItem;
        public final Button borrar;

        public ViewHolder(View view) {
            super(view);
            mView = view;
           nombre = view.findViewById(R.id.textViewTitulo);
           id_evento = view.findViewById(R.id.nombre_evento);
           nombreServicio= view.findViewById(R.id.nombreServicio);
            eventImage=view.findViewById(R.id.imageViewEvento);
            borrar=view.findViewById(R.id.buttonDelete);


        }



        @Override
        public String toString() {
            return super.toString() + " '" + nombre.getText() + "'";
        }

    }
}
