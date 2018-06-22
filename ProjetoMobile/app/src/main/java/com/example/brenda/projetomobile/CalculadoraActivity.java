package com.example.brenda.projetomobile;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraActivity extends AppCompatActivity {
    EditText valor1,valor2;
    Button soma,subtracao,multiplicacao,porcentagem,divisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        valor1=(EditText) findViewById(R.id.valor1);
        valor2=(EditText) findViewById(R.id.valor2);
        soma=(Button) findViewById(R.id.soma);
        subtracao=(Button) findViewById(R.id.subtracao);
        multiplicacao=(Button) findViewById(R.id.multiplicacao);
        porcentagem=(Button) findViewById(R.id.porcentagem);
        divisao=(Button) findViewById(R.id.divisao);

        soma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double num1= Double.parseDouble(valor1.getText().toString());
                double num2= Double.parseDouble(valor2.getText().toString());
                double soma= num1+num2;
                AlertDialog.Builder dialogo=new AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Soma");
                dialogo.setMessage("A Soma é"+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
        subtracao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                double num1= Double.parseDouble(valor1.getText().toString());
                double num2= Double.parseDouble(valor2.getText().toString());
                double soma= num1-num2;
                AlertDialog.Builder dialogo=new AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Subtração");
                dialogo.setMessage("A Subtração é"+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
        multiplicacao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                double num1= Double.parseDouble(valor1.getText().toString());
                double num2= Double.parseDouble(valor2.getText().toString());
                double soma= num1*num2;
                AlertDialog.Builder dialogo=new AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Multiplicação");
                dialogo.setMessage("A Multiplicação é"+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
        porcentagem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                double num1= Double.parseDouble(valor1.getText().toString());
                double num2= Double.parseDouble(valor2.getText().toString());
                double soma= (num1*num2)/100;
                AlertDialog.Builder dialogo=new AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Porcentagem");
                dialogo.setMessage("A Porcentagem é"+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
        divisao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                double num1= Double.parseDouble(valor1.getText().toString());
                double num2= Double.parseDouble(valor2.getText().toString());
                double soma= num1/num2;
                AlertDialog.Builder dialogo=new AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Divisão");
                dialogo.setMessage("A Divisão é"+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
    }
}
