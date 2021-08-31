package com.example.mauricio;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;



import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button btn_borrar =(Button) this.findViewById(R.id.btn_borrar);
    Button btn_cero =(Button) this.findViewById(R.id.btn_cero);
    Button btn_dos =(Button) this.findViewById(R.id.btn_dos);
    Button btn_tres =(Button) this.findViewById(R.id.btn_tres);
    Button btn_cuatro =(Button) this.findViewById(R.id.btn_cuatro);
    Button btn_cinco=(Button) this.findViewById(R.id.btn_cinco);
    Button btn_seis =(Button) this.findViewById(R.id.btn_seis);
    Button btn_siete =(Button) this.findViewById(R.id.btn_siete);
    Button btn_ocho =(Button) this.findViewById(R.id.btn_ocho);
    Button btn_nueve =(Button) this.findViewById(R.id.btn_nueve);
    Button btn_limpiar =(Button) this.findViewById(R.id.btn_limpiar);
    Button btn_suma =(Button) this.findViewById(R.id.btn_suma);
    Button btn_resta =(Button) this.findViewById(R.id.btn_resta);
    Button btn_multiplicacion =(Button) this.findViewById(R.id.btn_multiplicacion);
    Button btn_division =(Button) this.findViewById(R.id.btn_division);
    Button btn_punto =(Button) this.findViewById(R.id.btn_punto);

    TextView txt_pantalla = (TextView) this.findViewById(R.id.pantalla);

    btn_cero.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            setDigito("0");
        }
    });

    btn_uno.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            setDigito("1");
        }
    });

    btn_dos.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            setDigito("2");
        }
    });

    btn_tres.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            setDigito("3");
        }
    });

    btn_cuatro.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            setDigito(4);
        }
    });

    btn_cinco.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            setDigito("5");
        }
    });

    










}