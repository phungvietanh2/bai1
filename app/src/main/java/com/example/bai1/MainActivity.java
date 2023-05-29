package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout name, pass;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intagam2);
        name = findViewById(R.id.usernameLayout);
        pass=findViewById(R.id.passwordLayout);
        login = findViewById(R.id.outlinedButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name2 = "anh";
                String pass2 ="1";
                String name1 =name.getEditText().getText().toString();
                String pass1 = pass.getEditText().getText().toString();
                if (name1.equals(name2) && pass1.equals(pass2)) {
                    Toast.makeText(MainActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login failure", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}