package com.isil.appperuanisimosv2.Entidad;

public class db_historial {
    private String fecha;
    private String nombrePlato;

    public db_historial(String cliente, String fecha, String nombrePlato) {
        this.fecha = fecha;
        this.nombrePlato = nombrePlato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }


}

