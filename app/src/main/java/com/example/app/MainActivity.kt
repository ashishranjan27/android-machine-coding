package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

/**
There was a delay in pushing the code because I had to create a new SSH key on my company laptop, 
and there were several issues mainly due to restrictions from my current company. That’s why it took time to push the code.
*/

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

