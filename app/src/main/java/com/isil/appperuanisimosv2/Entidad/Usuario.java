package com.isil.appperuanisimosv2.Entidad;

import com.isil.appperuanisimosv2.Enums.Sexo;

public class Usuario {
    private String usuario;
    private String nombre;
    private String apellido;
    private String clave;
    private String confirmacion;
    private String edad;
    private String sexo;

    public Usuario(String usuario, String nombre, String apellido, String clave, String confirmacion, String edad,String sexo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.confirmacion = confirmacion;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getSexo(){return sexo;}

    public void setSexo(String sexo){this.sexo=sexo; }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}

