package com.example.brayan.object;

/**
 * Created by Brayan on 14/04/2017.
 */

public class Posicion {

    private double longitud;
    private double latitud;
    private String nombreSitio;

    public Posicion(){

    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public String getNombreSitio() {
        return nombreSitio;
    }

    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }
}
