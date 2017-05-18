package com.example.android.brutaljuices;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JugosNaturales extends AppCompatActivity {
    private ListView ls;
    private Resources res;
    private String[] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugos_naturales);
        ls = (ListView)findViewById(R.id.lvoOpciones);
        res = this.getResources();
        opc = res.getStringArray(R.array.opciones2);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        i = new Intent(JugosNaturales.this, JZapote.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(JugosNaturales.this, JNispero.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(JugosNaturales.this, JBanano.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(JugosNaturales.this, JFresa.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(JugosNaturales.this, JMora.class);
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(JugosNaturales.this, JBorojo.class);
                        startActivity(i);
                        break;
                    case 6:
                        i = new Intent(JugosNaturales.this, JMango.class);
                        startActivity(i);
                        break;
                    case 7:
                        i = new Intent(JugosNaturales.this, JGuanabana.class);
                        startActivity(i);
                        break;
                    case 8:
                        i = new Intent(JugosNaturales.this, JNaranja.class);
                        startActivity(i);
                        break;
                    case 9:
                        i = new Intent(JugosNaturales.this, JRemolacha.class);
                        startActivity(i);
                        break;
                    case 10:
                        i = new Intent(JugosNaturales.this, JCereza.class);
                        startActivity(i);
                        break;
                    case 11:
                        i = new Intent(JugosNaturales.this, JPina.class);
                        startActivity(i);
                        break;
                    case 12:
                        i = new Intent(JugosNaturales.this, JPapaya.class);
                        startActivity(i);
                        break;
                    case 13:
                        i = new Intent(JugosNaturales.this, JGuayaba.class);
                        startActivity(i);
                        break;
                    case 14:
                        i = new Intent(JugosNaturales.this, JZanahoria.class);
                        startActivity(i);
                        break;
                    case 15:
                        i = new Intent(JugosNaturales.this, JTamarindo.class);
                        startActivity(i);
                        break;
                    case 16:
                        i = new Intent(JugosNaturales.this, JCarambola.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
