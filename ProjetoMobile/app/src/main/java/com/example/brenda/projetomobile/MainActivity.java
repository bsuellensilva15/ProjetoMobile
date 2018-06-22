package com.example.brenda.projetomobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botaoA,botaoB,botaoC,botaoD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoA = (Button) findViewById(R.id.botaoA);
        botaoB = (Button) findViewById(R.id.botaoB);
        botaoC = (Button) findViewById(R.id.botaoC);
        botaoD = (Button) findViewById(R.id.botaoD);

        botaoA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,CalculadoraActivity.class);
                startActivity(intent);
                finish();
            }
        });
        botaoB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,NavegadorActivity.class);
                startActivity(intent);
                finish();
            }
        });
        botaoC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        botaoD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,AgendaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
