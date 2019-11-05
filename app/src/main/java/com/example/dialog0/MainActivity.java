package com.example.dialog0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected MyDialog d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void createDialog(View view){
        d= new MyDialog();
        d.show(getSupportFragmentManager(), "missiles");
    }
}
