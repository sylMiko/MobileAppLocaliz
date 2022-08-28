package com.example.kostek_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText phone = findViewById(R.id.et_phone);
        Button number = findViewById(R.id.btn_send);


        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String numberstr = phone.getText().toString();

                Intent intent = new Intent(MainActivity.this, VerifyActivity.class);
                intent.putExtra("phonenumber", numberstr);
                startActivity(intent);
            }
        });
    }
}