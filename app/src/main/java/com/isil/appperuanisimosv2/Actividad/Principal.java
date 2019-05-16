package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.isil.appperuanisimosv2.Entidad.Administrador;
import com.isil.appperuanisimosv2.R;

public class Principal extends AppCompatActivity {

    private EditText usuario;
    private EditText clave;
    private CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void Validar(View view){

        usuario=findViewById(R.id.nombreusuario);
        clave=findViewById(R.id.clave);
        check=findViewById(R.id.ckbox);

        Administrador administrador = new Administrador(usuario.getText().toString(), clave.getText().toString());

        if (check.isChecked()){checking();}
        else if (usuario.getText().toString().isEmpty() || clave.getText().toString().isEmpty())
            Toast.makeText(this, espaciosVacios(), Toast.LENGTH_SHORT).show();
        else if (!usuario.getText().toString().equals(administrador.user()) && !clave.getText().toString().equals(administrador.pass()))
            bienvenidos();
        else if (!usuario.getText().toString().equals(administrador.user()))
            Toast.makeText(this, noExisteUsuario(), Toast.LENGTH_SHORT).show();
        else if (!clave.getText().toString().equals(administrador.pass()))
            Toast.makeText(this,claveIncorrecta() , Toast.LENGTH_SHORT).show();
        else if (usuario.getText().toString().equals(administrador.user()) && clave.getText().toString().equals(administrador.pass()))
            menuAdmin();
        }

    public void cancelar(View view){
        borrar();
    }

    private void checking(){
        Intent registro = new Intent(Principal.this,com.isil.appperuanisimosv2.Actividad.Registro.class);
        startActivity(registro);
    }
    private void bienvenidos() {
        Intent siguiente=new Intent(Principal.this,com.isil.appperuanisimosv2.Actividad.Bienvenidos.class);
        startActivity(siguiente);
    }
    private void menuAdmin(){
        Intent menuAdmin=new Intent(Principal.this,com.isil.appperuanisimosv2.Actividad.MenuAdmin.class);
        startActivity(menuAdmin);
    }
    private String espaciosVacios(){

        return "COMPLETE LOS ESPACIOS";
    }
    private String noExisteUsuario(){

        return "NOMBRE DE USUARIO NO EXISTE";
    }
    private String claveIncorrecta(){

        return "CLAVE INCORRECTA";
    }
    private void borrar(){
        usuario.setText("");
        clave.setText("");
    }
}
