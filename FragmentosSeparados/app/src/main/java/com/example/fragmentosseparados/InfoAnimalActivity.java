package com.example.fragmentosseparados;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class InfoAnimalActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_animal);

        Intent intent = getIntent();
        if(intent != null){
            String animal = intent.getStringExtra("animal");
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            InfoAnimalFragment infoAnimalFragment = new InfoAnimalFragment();
            Bundle args = new Bundle();
            args.putString("animal",animal);
            infoAnimalFragment.setArguments(args);

            fragmentTransaction.replace(R.id.fragment_info_animal,infoAnimalFragment);
            fragmentTransaction.commit();

        }
    }
}
