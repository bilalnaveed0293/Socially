package com.example.socially
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.content.Intent
class FeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        val btnHome = findViewById<ImageView>(R.id.btnHome)
        val btnSearch = findViewById<ImageView>(R.id.btnSearch)
        val btnAdd = findViewById<ImageView>(R.id.btnAdd)
        val btnHeart = findViewById<ImageView>(R.id.btnHeart)
        val btnProfile = findViewById<ImageView>(R.id.btnProfile)
        val btnMessages = findViewById<ImageView>(R.id.btnMessages) // Find the messages button

        btnHome.setOnClickListener {
            // Already on home screen - you can add refresh functionality here if needed
        }

        btnSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        btnAdd.setOnClickListener {
            // TODO: Add functionality for Add button
        }

        btnHeart.setOnClickListener {
            // TODO: Add functionality for Notifications
        }

        btnProfile.setOnClickListener {
            // TODO: Add functionality for Profile
        }

        // Start the MessagesActivity when the messages button is clicked
        btnMessages.setOnClickListener {
            val intent = Intent(this, MessagesActivity::class.java)
            startActivity(intent)
        }
    }
}