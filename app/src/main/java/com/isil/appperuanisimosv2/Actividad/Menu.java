package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.isil.appperuanisimosv2.R;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void plaro1(View view){plato1();}
    public void buscador(View view){Buscador();}
    public void Historial(View view){Historial();}
    public void Perfil(View view){Perfil();}
    public void Salir(View view){Salir();}

    private void Historial() {
        Intent Historial=new Intent(this,com.isil.appperuanisimosv2.Actividad.Historial.class);
        startActivity(Historial);
    }
    private void Perfil() {
        Intent Perfil=new Intent(this,com.isil.appperuanisimosv2.Actividad.Perfil.class);
        startActivity(Perfil);
    }
    private void Salir() {
        Intent Salir=new Intent(this,com.isil.appperuanisimosv2.Actividad.Principal.class);
        startActivity(Salir);
    }
    private void Buscador() {
        Intent Buscador=new Intent(this,com.isil.appperuanisimosv2.Actividad.Buscador.class);
        startActivity(Buscador);
    }
    private void plato1(){
        Intent plato1=new Intent(this,com.isil.appperuanisimosv2.Actividad.Plato1.class);
        startActivity(plato1);
    }
}
