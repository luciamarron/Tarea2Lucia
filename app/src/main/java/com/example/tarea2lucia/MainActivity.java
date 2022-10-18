package com.example.tarea2lucia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnAceptar;
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editTextTextPersonName);
        btnAceptar = (Button) findViewById(R.id.BtnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                startActivity(intent);

            }

            public void onClick2 (View view) {
                searchWeb(editText.getText()+ "");
            }
            public void searchWeb( String query) {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query);
                if (intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }

        });

    }
    }
