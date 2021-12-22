package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {
    private EditText email22, password22;
    private Button btn2;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.setTitle("Sign Up");
        email22 = (EditText)findViewById(R.id.email2);
        password22 = (EditText) findViewById(R.id.password2);
        btn2 = (Button) findViewById(R.id.button2);
        mAuth = FirebaseAuth.getInstance();
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eml = email22.getText().toString().trim();
                String pass = password22.getText().toString().trim();
mAuth.signInWithEmailAndPassword(eml,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
        if (task.isSuccessful()) {
            // Sign in success, update UI with the signed-in user's information
            Toast.makeText(getApplicationContext(), "Registration is successful", Toast.LENGTH_LONG).show();
        } else {
            // If sign in fails, display a message to the user.
            Toast.makeText(getApplicationContext(), "Registration is not successful", Toast.LENGTH_LONG).show();
        }
    }
});



            }
        });
    }
}