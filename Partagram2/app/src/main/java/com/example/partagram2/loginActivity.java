package com.example.partagram2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class loginActivity extends AppCompatActivity {


    public static  final String TAG = "loginActivity";
    private EditText etUsername;
    private EditText etPassword;
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (ParseUser.getCurrentUser() != null){
            goMainActivity();
        }

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"onClick login Button");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                loginUser(username,password);

            }
        });
    }

    private void loginUser(String username, String password){
        Log.i(TAG, "Atttempting to login user" + username);
        // Navigate to the main activity
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e != null){
                    Log.e(TAG, "Issue with login ", e);
                    Toast.makeText(loginActivity.this, "Issue with login", Toast.LENGTH_SHORT);

                    return;
                }
                // navigate to the manin activity if the user has signe in
                goMainActivity();
                Toast.makeText(loginActivity.this, "success!", Toast.LENGTH_SHORT);
            }
        });
    }

    private void goMainActivity(){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}