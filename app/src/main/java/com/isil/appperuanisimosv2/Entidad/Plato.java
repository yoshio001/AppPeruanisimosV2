package com.isil.appperuanisimosv2.Entidad;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.concurrent.ThreadLocalRandom;

public class Plato {
    private String nombrePlato;
    private String descripcion;
    private String precio;
    private  String msg;

    public Plato(String nombrePlato, String descripcion, String precio) {
        this.nombrePlato = nombrePlato;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    private String GenNom(){
        return nombrePlato.substring(0,3);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private int GenCod(){
        return ThreadLocalRandom.current().nextInt(100,999);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public String MostrarInfo(){
        return msg= "    CODIGO : "+"\n"+GenNom()+GenCod()+"\n\n"+
                    "    NOMBRE DEL PLATO : "+"\n"+nombrePlato+"\n\n"+
                    "    DESCRIPCION : "+"\n"+descripcion+"\n\n"+
                    "    PRECIO: S/."+precio;
    }

}
