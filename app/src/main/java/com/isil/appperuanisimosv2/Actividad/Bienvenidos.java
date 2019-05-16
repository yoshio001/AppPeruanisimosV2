package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.isil.appperuanisimosv2.R;

public class Bienvenidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenidos);
    }

    public void Menu(View view){
        menu();
    }


    private void menu(){
        Intent menu=new Intent(Bienvenidos.this,com.isil.appperuanisimosv2.Actividad.Menu.class);
        startActivity(menu);
    }
}

