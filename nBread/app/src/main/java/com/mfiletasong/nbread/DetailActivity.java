package com.mfiletasong.nbread;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mfiletasong.nbread.databinding.ActivityMainBinding;
import com.mfiletasong.nbread.databinding.LayoutDetailBinding;

public class DetailActivity extends Activity {

    private LayoutDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LayoutDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
