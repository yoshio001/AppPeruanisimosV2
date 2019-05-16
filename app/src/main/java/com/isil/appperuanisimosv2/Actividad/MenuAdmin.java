package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.isil.appperuanisimosv2.R;

public class MenuAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
    }
    public void btnMenu(View view){Menu();}
    public void btnHistorial(View view){Historial();}
    public void btnPerfil(View view){Perfil();}
    public void btnSalir(View view){Salir();}
    public void btnAgregar(View view) {Agregar();}
    public void btnCancelar(View view){borrar();}

    private void borrar() {


    }

    private void Menu() {
        Intent btnMenu=new Intent(this,com.isil.appperuanisimosv2.Actividad.Menu.class);
        startActivity(btnMenu);
    }
    private void Historial() {
        Intent btnHistorial=new Intent(this,com.isil.appperuanisimosv2.Actividad.Historial.class);
        startActivity(btnHistorial);
    }
    private void Perfil() {
        Intent btnPerfil=new Intent(this,com.isil.appperuanisimosv2.Actividad.Perfil.class);
        startActivity(btnPerfil);
    }
    private void Salir() {
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosv2.Actividad.Principal.class);
        startActivity(btnSalir);
    }
    private void Agregar() {


        Toast.makeText(this, "PRODUCTO AGREGADO", Toast.LENGTH_SHORT).show();
        Intent btnAgregar = new Intent(this, com.isil.appperuanisimosv2.Actividad.MenuAdmin.class);
        startActivity(btnAgregar);
    }
}
