package com.example.s_cam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
    }
    public void login (View view){
        Intent intentlm = new Intent(login_admin.this,home_mhs.class);
        startActivity(intentlm);
    }
}
