package com.example.settingsscreenlast;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayout temaButton = findViewById(R.id.button4);

        temaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cria o AlertDialog para mostrar as opções
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Escolha o tema");

                // Opções de tema
                String[] temas = {"Claro", "Escuro"};

                // Adiciona as opções ao diálogo
                builder.setItems(temas, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Apenas mostrar as opções, nenhuma ação programada por enquanto
                        switch (which) {
                            case 0:
                                // Caso "Claro" seja selecionado
                                Toast.makeText(getApplicationContext(), "Tema Claro selecionado", Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                // Caso "Escuro" seja selecionado
                                Toast.makeText(getApplicationContext(), "Tema Escuro selecionado", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });

                // Mostra o diálogo
                builder.show();
            }
        });


    }
}