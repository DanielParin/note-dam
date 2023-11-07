package com.dam.ad.notedam.presentation.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dam.ad.notedam.R
import com.dam.ad.notedam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}