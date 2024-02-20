package com.example.mobilecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button displayButton;
    EditText nameEditText;

    TextView displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayoutComponents();
        initButtonDisplay();
    }


    private void initLayoutComponents(){
        displayButton = findViewById(R.id.buttonDisplay);
        nameEditText = findViewById(R.id.editTextName);
        displayText = findViewById(R.id.textViewDisplay);
    }

    private void initButtonDisplay(){
        displayButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String textViewDisplay =nameEditText.getText().toString();
                displayText.setText("Hello "+ textViewDisplay);
            }
        });
    }
}