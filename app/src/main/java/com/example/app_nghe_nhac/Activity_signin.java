package com.example.app_nghe_nhac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_signin extends AppCompatActivity {
    Button btn_gotoSignup, btn_login;
    EditText edt_login_name, edt_login_password;
    String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        btn_gotoSignup = findViewById(R.id.btn_gotoSignup);
        btn_login = findViewById(R.id.btn_login);
        edt_login_name = findViewById(R.id.edt_login_name);
        edt_login_password = findViewById(R.id.edt_login_password);
        Intent intent= getIntent();
        user = intent.getStringExtra("user");
        pass =intent.getStringExtra("pass");

        btn_gotoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_signin.this, Activity_signup.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = edt_login_password.getText().toString().trim();
                String username = edt_login_name.getText().toString().trim();
                if(username.equalsIgnoreCase(user) && pass.equalsIgnoreCase(pass)) {
                    Intent intent = new Intent(Activity_signin.this, ActivityContaint.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Activity_signin.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}