package com.Giyanmuhammad.UTSApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private ImageView btnWeb, btnMaps, btnmail, btnCall;
    private long backPressedTime;
    private Toast backToast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnWeb = findViewById(R.id.web);
        btnMaps = findViewById(R.id.maps);
        btnmail = findViewById(R.id.gmail);
        btnCall = findViewById(R.id.telphone);

     btnWeb.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             FragmentManager fm = getSupportFragmentManager();
             FragmentTransaction ft = fm.beginTransaction();
             ft.replace(R.id.container, new WebFragment());
             ft.commit();

             btnCall.setVisibility(View.INVISIBLE);
             btnmail.setVisibility(View.INVISIBLE);
             btnMaps.setVisibility(View.INVISIBLE);
             btnWeb.setVisibility(View.INVISIBLE);

         }
     });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new MapsFragment());
                ft.commit();

                btnCall.setVisibility(View.INVISIBLE);
                btnmail.setVisibility(View.INVISIBLE);
                btnMaps.setVisibility(View.INVISIBLE);
                btnWeb.setVisibility(View.INVISIBLE);
            }
        });

        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new EmailFragment());
                ft.commit();

                btnCall.setVisibility(View.INVISIBLE);
                btnmail.setVisibility(View.INVISIBLE);
                btnMaps.setVisibility(View.INVISIBLE);
                btnWeb.setVisibility(View.INVISIBLE);

            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new TelephoneFragment());
                ft.commit();

                btnCall.setVisibility(View.INVISIBLE);
                btnmail.setVisibility(View.INVISIBLE);
                btnMaps.setVisibility(View.INVISIBLE);
                btnWeb.setVisibility(View.INVISIBLE);

            }
        });

    }

    @Override
    public void onBackPressed() {


        if(backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{

            btnCall.setVisibility(View.VISIBLE);
            btnmail.setVisibility(View.VISIBLE);
            btnMaps.setVisibility(View.VISIBLE);
            btnWeb.setVisibility(View.VISIBLE);

            backToast = Toast.makeText(getBaseContext(),"Press Back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();


    }
}