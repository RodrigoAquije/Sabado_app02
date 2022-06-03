package com.raquije.sabado_app02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class InterfazActivity extends AppCompatActivity {

    Button btn01, btn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz);

        asignarReferencias();
    }

    private void asignarReferencias(){
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InterfazActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InterfazActivity.this, RelativeActivity.class);
                startActivity(intent);
            }
        });
    }
}