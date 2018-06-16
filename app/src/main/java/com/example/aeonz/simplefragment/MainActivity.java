package com.example.aeonz.simplefragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button staticBtn = (Button) findViewById(R.id.staticBtn);
        staticBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent staticFragment = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(staticFragment);
            }
        });

        Button dynamicBtn = (Button) findViewById((R.id.dynamicBtn));
        dynamicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            testFragment testFragment = new testFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.test, testFragment, testFragment.getTag()).commit();





            }
        });

    }
}
