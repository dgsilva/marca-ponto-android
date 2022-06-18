package com.example.marcaodeponto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 private ImageView ponto;
 private ImageView cheque;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ponto = (ImageView) findViewById(R.id.imgPonto);

        cheque = (ImageView) findViewById(R.id.imgCheque);


        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.pontocertificado.com.br/")));
            }
        });

        cheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://lerioesilva.athenas.online/Usuarios/login")));
            }
        });

    }
}