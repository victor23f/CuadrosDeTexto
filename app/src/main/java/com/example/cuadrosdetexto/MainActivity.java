package com.example.cuadrosdetexto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

    }

    public void intentoAdivinar(View view){
        createSimpleDialog();

    }
    public void createSimpleDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        EditText v1 = (EditText)findViewById(R.id.introducirPalabra);
        String  palabra = v1.getText().toString();
        builder.setTitle("Titulo")
                .setMessage("Suerte ")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (palabra.equals("camion")){
                                    Toast.makeText(MainActivity.this, "ACERTASTE!", Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(MainActivity.this, "FALLASTE!", Toast.LENGTH_LONG).show();
                                }

                            }
                        })
                .setNegativeButton("CANCELAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "cancelar", Toast.LENGTH_SHORT).show();
                            }
                        });
    builder.create();
         builder.show();
    }
}