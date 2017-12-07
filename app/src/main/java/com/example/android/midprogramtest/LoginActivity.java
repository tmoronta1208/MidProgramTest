package com.example.android.midprogramtest;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button submit;
    private CheckBox checkBox;
    private SharedPreferences login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.edit_text1);
        password = (EditText) findViewById(R.id.edit_text2);
        submit = (Button) findViewById(R.id.button);
        checkBox = (CheckBox) findViewById(R.id.checkBox);

        login = getApplicationContext().getSharedPreferences("sharedPrefs", MODE_PRIVATE);

        FirstFragment firstFragment = new FirstFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag_container, firstFragment);
        fragmentTransaction.commit();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = login.edit();
                String checkEmail = email.getText().toString().toLowerCase();
                String checkPassword = password.getText().toString().toLowerCase();

                if(checkEmail.equals("user@aol.com") && checkPassword.equals("password1234")){
                    editor.putString("email", email.getText().toString() );
                    editor.putString("password", password.getText().toString());
                    editor.putBoolean("isChecked", checkBox.isChecked());
                    editor.commit();

                }
                Intent intent = new Intent(LoginActivity.this, ListActivity.class);
                intent.putExtra("email",email.getText().toString());
                startActivity(intent);

            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }
}
