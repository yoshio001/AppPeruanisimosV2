package com.isil.appperuanisimosv2.Actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.isil.appperuanisimosv2.Entidad.Usuario;
import com.isil.appperuanisimosv2.Enums.Sexo;
import com.isil.appperuanisimosv2.R;

public class Registro extends AppCompatActivity {
    private EditText nombre,apellido,edad,usuario,clave,confirmacion;
    private RadioGroup sexo;
    private RadioButton hombre,mujer;
    private CheckBox check;
    private Sexo sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

    }

    public void aceptar(View view){IngresoDatosUsuario();}
    public void btnSalir(View view){IrSalir();}

    private void IrSalir() {
        Intent btnSalir=new Intent(this,com.isil.appperuanisimosv2.Actividad.Principal.class);
        startActivity(btnSalir);
    }

    private void IngresoDatosUsuario(){

        nombre=findViewById(R.id.nombres);
        apellido=findViewById(R.id.apellidos);
        edad=findViewById(R.id.edad);
        sexo=findViewById(R.id.rgsexo);
        hombre=findViewById(R.id.rbHombre);
        mujer=findViewById(R.id.rbMujer);
        usuario=findViewById(R.id.nombreusuario);
        clave=findViewById(R.id.clave);
        confirmacion=findViewById(R.id.confirmacion);
        check=findViewById(R.id.terminos);

        if(nombre.getText().toString().isEmpty() || apellido.getText().toString().isEmpty() || edad.getText().toString().isEmpty() ||
                hombre.getText().toString().isEmpty() ||mujer.getText().toString().isEmpty() ||usuario.getText().toString().isEmpty() ||
                clave.getText().toString().isEmpty()||confirmacion.getText().toString().isEmpty()) {
            String msg = camposVacios();
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }else if(!check.isChecked()) {
            String msg = terminos();

        }else{

            switch (sexo.getCheckedRadioButtonId()){
                case R.id.rbHombre:
                    sex=Sexo.Hombre;
                    break;
                case R.id.rbMujer:
                    sex=Sexo.Mujer;
                    break;
            }

            String sexo=sex.toString();

            Usuario persona=new Usuario(usuario.getText().toString(),nombre.getText().toString(),apellido.getText().toString(),clave.getText().toString(),confirmacion.getText().toString(),
                    edad.getText().toString(),sexo);
                    Intent siguiente = new Intent(this, com.isil.appperuanisimosv2.Actividad.Bienvenidos.class);
            startActivity(siguiente);

            Toast.makeText(this, persona.getConfirmacion(), Toast.LENGTH_SHORT).show();

            Toast.makeText(this, msg(), Toast.LENGTH_SHORT).show();



        }
    }

    private String msg() {

        return "DATOS INGRESADOS CORRECTAMENTE";
    }

    private String camposVacios() {

        return "COMPLETE LOS CAMPOS";
    }

    private String terminos() {

        return  "NO A ACEPTADO LOS TERMINOS";
    }
}
