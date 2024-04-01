package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText editTextNewName = findViewById(R.id.editTextNewName);
        Button btnSubmitName = findViewById(R.id.btnSubmitName);

        btnSubmitName.setOnClickListener(view -> {
            String newName = editTextNewName.getText().toString();
            Intent returnIntent = new Intent();
            returnIntent.putExtra("newName", newName);
            setResult(RESULT_OK, returnIntent);
            finish(); // Finish this Activity, back to FirstActivity
        });
    }
}
