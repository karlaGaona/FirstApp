package com.example.android.firstapp;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Se crean las variables a utilizar
    ImageView img1, img2, img3, img4, img5, img6;   // Variable de las imagenes a mostrar
    ImageView imagenAnimacion;      // Variable de la animación de imagenes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EXTRA: SE DEFINE UNA ANIMACIÓN DE IMAGENES QUE SERÁN MOSTRADAS SECUENCIALMENTE CON UNA DETERMINADA
        // DURACIÓN EN UN ELEMENTO IMAGEVIEW

        // Se crea un objeto de tipo AnimationDrawable
        AnimationDrawable animacion = new AnimationDrawable();

        // Se añaden las imagenes que serán almacenadas en el objeto AnimationDrawable para crear la
        // animación correspondiente, cada imagen tendrá una duración de 2500s
        animacion.addFrame(getResources().getDrawable(R.drawable.joyas),2500);
        animacion.addFrame(getResources().getDrawable(R.drawable.joyas2),2500);
        animacion.addFrame(getResources().getDrawable(R.drawable.joyas3),2500);
        animacion.addFrame(getResources().getDrawable(R.drawable.joyas4),2500);
        animacion.addFrame(getResources().getDrawable(R.drawable.joyas5),2500);
        animacion.setOneShot(false);

        // Se manda llamar al identificador del ImageView que será utilizado para realizar la animación
        // y se almacena en un objeto ImageView
        imagenAnimacion = (ImageView) findViewById(R.id.imagen_animacion);

        // Se agrega la animación como fondo del ImagenView seleccionado
        imagenAnimacion.setBackgroundDrawable(animacion);

        // Se inicializa la animación
        animacion.start();


        // EXTRA: SE IMPLEMENTO UN EVENTO DE ONCLICK PARA QUE AL SELECCIONAR UNA IMAGEN DE LA GALERIA
        // EN LA APLICACIÓN, ESTA SE MUESTRE EN OTRA PANTALLA Y EL USUARIO PUEDA VISUALIZAR DE MEJOR
        // ESA IMAGEN Y PUEDA INTERACTUAR CON LA APLICACIÓN

        // Se inicializan los objetos ImageView llamando en cada uno su imagen correspondiente en el
        // XML con el ID y se almacenen sus valores
        img1 = (ImageView) findViewById(R.id.img1); // Apuntador a la imagen 1
        img2 = (ImageView) findViewById(R.id.img2); // Apuntador a la imagen 2
        img3 = (ImageView) findViewById(R.id.img3); // Apuntador a la imagen 3
        img4 = (ImageView) findViewById(R.id.img4); // Apuntador a la imagen 4
        img5 = (ImageView) findViewById(R.id.img5); // Apuntador a la imagen 5
        img6 = (ImageView) findViewById(R.id.img6); // Apuntador a la imagen 6

        // Se asigna el listener en cada uno de los objetos ImagenView para que al hacer click en ella
        // se despliegue otra actividad que muestre la imagen en grande
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre en un segunda actividad la imagen llamando a la actividad que corresponde en
                // cada imagen y mostrando el contenido de la misma
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main2, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //Asignar el listener
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Abre en un segunda actividad la imagen
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main2, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //Asignar el listener
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Metodo para el click
                //Abre en un segunda actividad la imagen
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main2, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //Asignar el listener
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Metodo para el click
                //Abre en un segunda actividad la imagen
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main3, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //Asignar el listener
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Metodo para el click
                //Abre en un segunda actividad la imagen
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main4, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //Asignar el listener
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Metodo para el click
                //Abre en un segunda actividad la imagen
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main5, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //Asignar el listener
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Metodo para el click
                //Abre en un segunda actividad la imagen
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main6, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //Asignar el listener
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //Metodo para el click
                //Abre en un segunda actividad la imagen
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_main7, null);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }
}
