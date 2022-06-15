package com.example.libertymcbattle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startImageButton :ImageButton = findViewById(R.id.startImageButton)

        startImageButton.setOnClickListener{
            val intent = Intent(this, AttentionActivity::class.java)
            startActivity(intent)
        }
    }
}