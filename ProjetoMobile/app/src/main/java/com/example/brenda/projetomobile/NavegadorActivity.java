package com.example.brenda.projetomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class NavegadorActivity extends AppCompatActivity {
    Button entrar;
    EditText site;
    WebView navegadorWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        entrar=(Button) findViewById(R.id.entrar);
        site=(EditText) findViewById(R.id.site);
        navegadorWeb=(WebView) findViewById(R.id.navegadorWeb);

        entrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                navegadorWeb.loadUrl(site.getText().toString());
            }
        });
    }
}
