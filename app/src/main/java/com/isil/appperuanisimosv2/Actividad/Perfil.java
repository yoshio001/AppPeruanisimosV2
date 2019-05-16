package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.isil.appperuanisimosv2.R;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void buscador(View view){Buscador();}
    public void Historial(View view){Historial();}
    public void Menu(View view){Menu();}
    public void Salir(View view){Salir();}

    private void Historial() {
        Intent Historial=new Intent(this,com.isil.appperuanisimosv2.Actividad.Historial.class);
        startActivity(Historial);
    }
    private void Menu() {
        Intent Menu=new Intent(this,com.isil.appperuanisimosv2.Actividad.Menu.class);
        startActivity(Menu);
    }
    private void Salir() {
        Intent Salir=new Intent(this,com.isil.appperuanisimosv2.Actividad.Principal.class);
        startActivity(Salir);
    }
    private void Buscador() {
        Intent Buscador=new Intent(this,com.isil.appperuanisimosv2.Actividad.Buscador.class);
        startActivity(Buscador);
    }

}
