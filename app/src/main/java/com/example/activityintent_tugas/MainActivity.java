package com.example.activityintent_tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.activityintent_tugas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        View view = binding.getRoot();
        setContentView(view);

        binding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = binding.username.getText() .toString();
                String password = binding.password.getText().toString();
                String email = binding.email.getText().toString();
                String phone = binding.phone.getText().toString();

                Intent intent = new Intent(MainActivity.this, HomepageActivity.class);
                intent.putExtra("USERNAME", username);
                intent.putExtra("PASSWORD", password);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PHONE", phone);
                startActivity(intent);
            }
        });
        binding.loginSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

    }
}