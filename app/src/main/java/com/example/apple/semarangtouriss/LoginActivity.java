package com.example.apple.semarangtouriss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText name, college;
    MyCoreDatabase myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText)findViewById(R.id.edit1);
        college = (EditText)findViewById(R.id.edit2);

        myData = new MyCoreDatabase(this);
    }


    public void doSave(View view) {
        myData.insertData(name.getText().toString(),college.getText().toString());

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
