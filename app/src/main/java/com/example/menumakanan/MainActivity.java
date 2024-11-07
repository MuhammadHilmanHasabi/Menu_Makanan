package com.example.menumakanan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare variables
    private Spinner spinnerMenu;
    private Button buttonChoose;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize variables
        spinnerMenu = findViewById(R.id.spinnerMenu);
        buttonChoose = findViewById(R.id.buttonChoose);
        textViewResult = findViewById(R.id.textViewResult);

        // Array of menu items
        String[] menuItems = {"Nasi Goreng", "Mie Ayam", "Sate Ayam", "Bakso", "Rendang"};

        // Set up the Spinner with ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, menuItems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMenu.setAdapter(adapter);

        // Set button click listener
        buttonChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get selected item
                String selectedItem = spinnerMenu.getSelectedItem().toString();
                // Show the selected item in TextView
                textViewResult.setText("Anda memilih: " + selectedItem);
                // Show Toast message
                Toast.makeText(MainActivity.this, "Menu yang dipilih: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}