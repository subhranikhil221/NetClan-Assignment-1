package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Refine extends AppCompatActivity {

    String[] arrAvailability = {
            "Available | Hey Let Us Connect",
            "Away | Stay Discreet And Watch",
            "Busy | Do not Disturb | Will Catch Up Later",
            "SOS | Emergency! Need Assistance! HELP!"
    };
    AutoCompleteTextView autoComplete1;
    AutoCompleteTextView autoComplete2;
    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        autoComplete1 = findViewById(R.id.autoComplete1);
//        autoComplete2 = findViewById(R.id.autoComplete2);
        adapterItems = new ArrayAdapter<>(this,R.layout.list_availability,arrAvailability);

        autoComplete1.setAdapter(adapterItems);
    }
}