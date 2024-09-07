package com.example.settingsscreenlast;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referência ao botão "Tema" (LinearLayout)
        LinearLayout temaButton = findViewById(R.id.button4);

        // Definindo o OnClickListener para mostrar o MaterialAlertDialog
        temaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Opções de tema
                String[] temas = {"Claro", "Escuro"};

                // Cria o Material AlertDialog simples
                new MaterialAlertDialogBuilder(MainActivity.this)
                        .setTitle("Escolha o tema")
                        .setItems(temas, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Responder à escolha do item
                                if (which == 0) {
                                    Toast.makeText(getApplicationContext(), "Tema Claro selecionado", Toast.LENGTH_SHORT).show();
                                } else if (which == 1) {
                                    Toast.makeText(getApplicationContext(), "Tema Escuro selecionado", Toast.LENGTH_SHORT).show();
                                }
                            }
                        })
                        .show();
            }
        });
    }
}
