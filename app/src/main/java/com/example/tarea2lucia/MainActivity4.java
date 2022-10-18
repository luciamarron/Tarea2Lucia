package com.example.tarea2lucia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //no consigo que la aplicacion se cierre, sino que vuelve a la pestaña anterior
      Button cerrar = (Button) findViewById(R.id.Button40);
      cerrar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              finish();
          }
      });
}

}