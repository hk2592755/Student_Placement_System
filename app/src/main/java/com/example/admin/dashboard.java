package com.example.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {


    CardView cardHome;
    CardView cardChats;
    CardView cardProfile;
    CardView cardSetting;
    CardView cardWidgets;
    CardView cardLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cardHome = findViewById(R.id.Home);
        cardChats = findViewById(R.id.Chat);
        cardProfile = findViewById(R.id.Profile);
        cardSetting = findViewById(R.id.Setting);
        cardWidgets = findViewById(R.id.Widgets);
        cardLogout = findViewById(R.id.Logout);


        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Home Clicked");
            }

        });

        cardChats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Chats Clicked");
            }
        });

        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Profile Clicked");
            }
        });

        cardSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Setting Clicked");
            }
        });

        cardWidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Widgets Clicked");
            }
        });

        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Logout Clicked");

            }
        });


    }
    private void showToast(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}