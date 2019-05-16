package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.isil.appperuanisimosv2.R;

public class Historial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
    }


    public void btnMenu(View view){Menu();}
    public void btnBuscador(View view){buscador();}
    public void btnPerfil(View view){Perfil();}
    public void btnSalir(View view){Salir();}

    private void Menu() {
        Intent btnMenu=new Intent(this,com.isil.appperuanisimosv2.Actividad.Menu.class);
        startActivity(btnMenu);
    }
    private void buscador() {
        Intent btnBuscador=new Intent(this,com.isil.appperuanisimosv2.Actividad.Buscador.class);
        startActivity(btnBuscador);
    }
    private void Perfil() {
        Intent btnPerfil=new Intent(this,com.isil.appperuanisimosv2.Actividad.Perfil.class);
        startActivity(btnPerfil);
    }
    private void Salir() {
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosv2.Actividad.Principal.class);
        startActivity(btnSalir);
    }

}
