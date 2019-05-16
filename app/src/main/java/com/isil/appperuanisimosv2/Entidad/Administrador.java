package com.isil.appperuanisimosv2.Entidad;

public class Administrador {
    private String usuario;
    private String clave;

    public Administrador(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    private String usuario() {
        return "a";
    }

    private String clave() {
        return "a";
    }

    public String user() {
        return usuario();
    }

    public String pass() {
        return clave();
    }
}
