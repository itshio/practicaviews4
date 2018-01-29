package com.example.practicaviews4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView facebook,instagram,twitter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = (TextView)findViewById(R.id.textfacebook);
        instagram = (TextView)findViewById(R.id.textoinstagram);
        twitter = (TextView)findViewById(R.id.textotwitter);






    }

    public void clickfacebook(View view){
        facebook.setText("has pulsado facebook");


    }


    public void clickinstagram(View view){

        instagram.setText("has pulsado instagram");
    }

    public void clicktwitter(View view){

        twitter.setText("has pulsado twitter");

    }

    public void limpiar(View view){

        facebook.setText("");
        instagram.setText("");
        twitter.setText("");
    }









    }

