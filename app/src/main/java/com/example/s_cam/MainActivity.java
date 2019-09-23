package com.example.s_cam;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            }
    public void admin (View view){
        Intent intent = new Intent(MainActivity.this,login_admin.class);
        startActivity(intent);
    }
    public void mahasiswa (View view){
        Intent intentm = new Intent(MainActivity.this,login_mhs.class);
        startActivity(intentm);
    }}
