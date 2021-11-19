package com.techos.elrapdefernanfloo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.techos.elrapdefernanfloo.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : Activity() {
    lateinit var text : TextView;
    lateinit var string : String;

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        text = findViewById(R.id.textView);
    }
    fun changeText(view: android.view.View) {
        text.text = Random(1000).toString();
    }
}