package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.isil.appperuanisimosv2.R;

public class Plato1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plato1);
    }

    public void atras(View view){
        atras();
    }

    public void agregar(View view){
        agregar();
    }

    private void atras(){
        Intent atras=new Intent(Plato1.this,com.isil.appperuanisimosv2.Actividad.Menu.class);
        startActivity(atras);
    }

    private void agregar() {
        Intent btnAgregar = new Intent(this, com.isil.appperuanisimosv2.Actividad.Pedido.class);
        startActivity(btnAgregar);
    }

}
