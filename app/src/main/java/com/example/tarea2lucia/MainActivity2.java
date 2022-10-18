package com.example.tarea2lucia;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText txtNombre;
        final Button btnAceptar;
        txtNombre = (EditText) findViewById(R.id.TxtNombre);
        btnAceptar = (Button) findViewById(R.id.BtnAceptar);
    }

    public void btnAceptar2 (View view){
        Intent btnAceptar2 = new Intent(this, MainActivity3.class);
        startActivity(btnAceptar2);
    }
}
