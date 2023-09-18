package com.example.activityintent_tugas;

import android.os.Bundle;
import android.renderscript.ScriptGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activityintent_tugas.databinding.ActivityHomepageBinding;

public class HomepageActivity extends AppCompatActivity {
    private ActivityHomepageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomepageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String username = getIntent().getStringExtra("USERNAME");
        binding.username.setText(username);
        String nama = getIntent().getStringExtra("EMAIL");
        binding.email.setText(nama);
        String phone = getIntent().getStringExtra("PHONE");
        binding.phone.setText(phone);

    }


}