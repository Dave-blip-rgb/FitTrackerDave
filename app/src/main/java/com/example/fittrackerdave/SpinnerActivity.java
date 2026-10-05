package com.example.fittrackerdave;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    Button boton_entrar_recycler;
    List<String> Entrenamientos = new ArrayList<>();
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spinner);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        boton_entrar_recycler = findViewById(R.id.boton_entrar_recycler);

        boton_entrar_recycler.setOnClickListener(v ->
                startActivity( new Intent(SpinnerActivity.this , Recycler.class))
        );

        Entrenamientos.add("Fuerza");
        Entrenamientos.add("Cardio");
        Entrenamientos.add("Yoga");
        Entrenamientos.add("Calistenia");

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,
                android.R.layout.simple_spinner_item , Entrenamientos);

        spinner.setAdapter(adapter);
    }
}