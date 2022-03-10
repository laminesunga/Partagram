package com.example.partagram2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private EditText etDescription;
    private Button btCaptureImage;
    private Button btSubmit;
    private ImageView ivPostImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDescription = findViewById(R.id.etDescription);
        btCaptureImage = findViewById(R.id.btCaptureImage);
        ivPostImage = findViewById(R.id.ivPostImage);
        btSubmit = findViewById(R.id.btSubmit);

    }
}