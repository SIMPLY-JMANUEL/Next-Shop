package com.example.nextshop;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// Asegúrate de que el nombre del layout sea correcto.

        // Conectar vistas con sus respectivos IDs del archivo XML.

        TextView appName= findViewById(R.id.textViewAppName);

        TextView productNameCaptus = findViewById(R.id.textViewProductNameCaptus);
        ImageView imageCaptus = findViewById(R.id.imageViewProductCaptus);
        Button buttonSelectImageCaptus = findViewById(R.id.buttonSelectImageCaptus);

        TextView productNameBonsai = findViewById(R.id.textViewProductNameBonsai);
        ImageView imageBonsai = findViewById(R.id.imageViewProductBonsai);
        Button buttonSelectImageBonsai = findViewById(R.id.buttonSelectImageBonsai);

        // Aquí puedes añadir funcionalidad adicional
        // Por ejemplo, añadir listener al botón

        buttonSelectImageCaptus.setOnClickListener(v ->{
            // Código para seleccionar imagen
        });

        buttonSelectImageBonsai.setOnClickListener(v ->{
            // Código para seleccionar imagen
        });
    }
}