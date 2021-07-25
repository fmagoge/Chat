package com.dmatrix.chat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dmatrix.chat.R;
import com.dmatrix.chat.databinding.ActivitySignInBinding;
import com.dmatrix.chat.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    private void setListeners(){
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}