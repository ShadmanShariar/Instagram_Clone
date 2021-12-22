package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView email, password, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Sign In");
        btn = (Button) findViewById(R.id.button2);
        email = (TextView)findViewById(R.id.email2);
        password = (TextView)findViewById(R.id.password2);
        signup = (TextView)findViewById(R.id.signup);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getApplicationContext(), "Login is not successful", Toast.LENGTH_SHORT).show();
           }
       });
       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,Signup.class);
               startActivity(intent);
           }
       });
    }
}