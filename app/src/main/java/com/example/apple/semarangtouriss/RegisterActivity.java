package com.example.apple.semarangtouriss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText nama, email, passw;
    MyCoreDRegister myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nama = (EditText)findViewById(R.id.teks1);
        email = (EditText)findViewById(R.id.teks2);
        passw = (EditText)findViewById(R.id.teks3);

        myData = new MyCoreDRegister(this);
    }

    public void doRegis(View view) {
        myData.insertData(nama.getText().toString(),email.getText().toString(),passw.getText().toString());

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
