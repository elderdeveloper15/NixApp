package com.example.nixapp.DB;

public class Eventos {
    String nombre_evento;
    int privacidad;
    int categoria_evento;
    String fecha;
    String hora;
    String lugar;
    String descripcion;
    int cupo;
    int cover;

    public Eventos(String nombre_evento, int privacidad, int categoria_evento, String fecha, String hora, String lugar, String descripcion, int cupo, int cover) {
        this.nombre_evento = nombre_evento;
        this.privacidad = privacidad;
        this.categoria_evento = categoria_evento;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.cupo=cupo;
        this.cover=cover;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
