package com.example.s_cam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class login_mhs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mhs);
    }
    public void btnlogin (View view){
        Intent intentlm = new Intent(login_mhs.this,home_mhs.class);
        startActivity(intentlm);
    }
}