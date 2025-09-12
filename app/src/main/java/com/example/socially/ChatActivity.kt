package com.example.socially
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        // Find the back button and set a click listener to go back
        val btnBack = findViewById<ImageView>(R.id.btnBackFromChat)
        btnBack.setOnClickListener {
            finish() // This closes the current activity and returns to the previous one
        }

        // Get the Intent that started this activity
        val intent = intent

        // Retrieve the username passed as an extra
        val userName = intent.getStringExtra("CHAT_USER_NAME")

        // Find the TextView for the username in the header
        val tvChatUserName = findViewById<TextView>(R.id.tvChatUserName)

        // Set the text of the TextView to the retrieved username, if it exists
        if (userName != null) {
            tvChatUserName.text = userName
        }
    }
}