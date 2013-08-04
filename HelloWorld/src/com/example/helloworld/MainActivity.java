package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    
    // Esto es un comentario 


    //Añado un comentario desde Github como si estubiéramos trabajando varias personas en un mismo proyecto 
    //y alguien sube algo que me interesa bajar a mi repositorio local
    
    //A ver si funcionaaaaa desde Cristina

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
