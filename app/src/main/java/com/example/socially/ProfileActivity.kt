package com.example.socially
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        // Add a listener to a back button if you have one in the header
        val btnBack = findViewById<ImageView>(R.id.btnBack) // Make sure to add this ID in your XML if you want a back button
        btnBack.setOnClickListener {
            finish()
        }
    }
}