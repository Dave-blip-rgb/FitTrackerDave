package com.example.fittrackerdave;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IniciarSesion extends AppCompatActivity {

    Button boton_enviar_sesion;
    Button boton_volver_sesion;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_iniciar_sesion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        boton_volver_sesion = findViewById(R.id.boton_volver_sesion);

        boton_volver_sesion.setOnClickListener(v ->
                startActivity( new Intent(IniciarSesion.this , MainActivity.class))
        );

        boton_enviar_sesion = findViewById(R.id.boton_enviar_sesion);

        boton_enviar_sesion.setOnClickListener(v ->
                startActivity( new Intent(IniciarSesion.this , SpinnerActivity.class))
        );

    }
}