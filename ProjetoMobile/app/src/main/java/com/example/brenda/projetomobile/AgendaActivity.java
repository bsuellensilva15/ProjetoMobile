package com.example.brenda.projetomobile;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class AgendaActivity extends AppCompatActivity {
    ListView lista_contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        lista_contatos = (ListView) findViewById(R.id.lista_contatos);
        lista_contatos.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nome = ((TextView) view).getText().toString();
                AlertDialog.Builder dialogo = new AlertDialog.Builder(AgendaActivity.this);
                dialogo.setTitle("Contato");
                dialogo.setMessage("Contato selecionado: " + nome);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }

            });
    }
}
