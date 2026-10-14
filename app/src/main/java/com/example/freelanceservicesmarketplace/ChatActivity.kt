package com.example.freelanceservicesmarketplace

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {

    private lateinit var messageContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        messageContainer = findViewById(R.id.messageContainer)

        val messageInput = findViewById<EditText>(R.id.etMessage)
        val sendButton = findViewById<Button>(R.id.btnSend)

        sendButton.setOnClickListener {

            val message = messageInput.text.toString().trim()

            if (message.isEmpty()) {
                Toast.makeText(
                    this,
                    "Enter a message",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                addMessage(message)

                messageInput.text.clear()
            }
        }
    }

    private fun addMessage(message: String) {

        val textView = TextView(this)

        textView.text = "You: $message"
        textView.textSize = 17f
        textView.setPadding(15, 15, 15, 15)

        messageContainer.addView(textView)
    }
}