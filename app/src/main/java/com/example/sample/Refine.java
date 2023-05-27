package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ToggleButton;

public class Refine extends AppCompatActivity {

    String[] arrAvailability = {
            "Available | Hey Let Us Connect",
            "Away | Stay Discreet And Watch",
            "Busy | Do not Disturb | Will Catch Up Later",
            "SOS | Emergency! Need Assistance! HELP!"
    };
    AutoCompleteTextView autoComplete1;
    ArrayAdapter<String> adapterItems;
    private ToggleButton btnCoffee;
    private ToggleButton btnBusiness;
    private ToggleButton btnHobbies;
    private ToggleButton btnFriendship;
    private ToggleButton btnMovies;
    private ToggleButton btnDinning;
    private ToggleButton btnDating;
    private ToggleButton btnMatrimony;
    Drawable d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        autoComplete1 = findViewById(R.id.autoComplete1);
        adapterItems = new ArrayAdapter<>(this,R.layout.list_availability,arrAvailability);

        autoComplete1.setAdapter(adapterItems);
        autoComplete1.setSelection(0);

        btnCoffee = findViewById(R.id.btnCoffee);
        btnBusiness = findViewById(R.id.btnBusiness);
        btnHobbies = findViewById(R.id.btnHobbies);
        btnFriendship = findViewById(R.id.btnFriendship);
        btnMovies = findViewById(R.id.btnMovies);
        btnDinning = findViewById(R.id.btnDinning);
        btnDating = findViewById(R.id.btnDating);
        btnMatrimony = findViewById(R.id.btnMatrimony);

        btnHobbies.setChecked(true);
        handleToggleButton(btnHobbies);
        btnMovies.setChecked(true);
        handleToggleButton(btnMovies);
        btnDinning.setChecked(true);
        handleToggleButton(btnDinning);
        btnDating.setChecked(true);
        handleToggleButton(btnDating);
        btnMatrimony.setChecked(true);
        handleToggleButton(btnMatrimony);
        btnCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnCoffee);
            }
        });
        btnBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnBusiness);
            }
        });
        btnHobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnHobbies);
            }
        });
        btnFriendship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnFriendship);
            }
        });
        btnMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnMovies);
            }
        });
        btnDinning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnDinning);
            }
        });
        btnDating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnDating);
            }
        });
        btnMatrimony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleToggleButton(btnMatrimony);
            }
        });

    }
    private void handleToggleButton(ToggleButton button) {
        if (button.isChecked()) {
            button.setBackgroundColor(getResources().getColor(R.color.btnDisableBG));
            button.setTextColor(getResources().getColor(R.color.btnDisableFG));
            button.setBackgroundResource(R.drawable.rounded_toggle_off);
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.btnEnabledBG));
            button.setTextColor(getResources().getColor(R.color.btnEnabledFG));
            button.setBackgroundResource(R.drawable.rounded_toggle_on);
        }
    }
}