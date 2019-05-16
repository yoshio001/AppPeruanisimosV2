package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.isil.appperuanisimosv2.R;

public class Pedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
    }

    public void btnMenu(View view){Menu();}

    private void Menu() {
        Intent btnMenu=new Intent(this,com.isil.appperuanisimosv2.Actividad.Menu.class);
        startActivity(btnMenu);
    }

}
