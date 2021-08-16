package com.benjamin.tourdel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benjamin.tourdel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setSupportActionBar(findViewById(R.id.my_toolbar))
    }
}