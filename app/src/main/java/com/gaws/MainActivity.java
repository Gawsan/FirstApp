package com.gaws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void register(View view){

        TextView name =findViewById(R.id.nameUser);
        TextView sureName =findViewById(R.id.sureName);
        TextView email = findViewById(R.id.email);
        EditText fname = findViewById(R.id.fName);
        EditText sname = findViewById(R.id.lastName);
        EditText emailID = findViewById(R.id.emailId);


        name.setText("First Name : "+fname.getText().toString());
        sureName.setText("Sure Name :"+sname.getText().toString());
        email.setText("Email :"+emailID.getText().toString());
    }
}