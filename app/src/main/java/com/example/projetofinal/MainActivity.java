package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button login1;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button helloWorld = findViewById(R.id.hello_world);


        helloWorld.setAlpha(0f);


        helloWorld.animate().alpha(1f).setDuration(1500);

        helloWorld = findViewById(R.id.hello_world);

        helloWorld.setAlpha(0f);
        helloWorld.setTranslationY(50);

        helloWorld.animate().alpha(1f).translationYBy(-50).setDuration(1500);



        Button login1 = findViewById(R.id.loginButton);


        login1.setAlpha(0f);


        login1.animate().alpha(1f).setDuration(1500);

        login1 = findViewById(R.id.loginButton);

        login1.setAlpha(0f);
        login1.setTranslationY(50);

        login1.animate().alpha(1f).translationYBy(-50).setDuration(1500);



        Button yourButton = (Button) findViewById(R.id.loginButton);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, loginScreen.class));
            }
        });



        helloWorld = findViewById(R.id.hello_world);
        helloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), registroScreen.class);
                startActivity(intent);
            }
        });


    }
}