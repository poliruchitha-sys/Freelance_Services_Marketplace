package com.example.freelanceservicesmarketplace

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ServiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        val title = findViewById<EditText>(R.id.etServiceTitle)
        val description = findViewById<EditText>(R.id.etServiceDescription)
        val budget = findViewById<EditText>(R.id.etServiceBudget)

        val postButton = findViewById<Button>(R.id.btnPostService)
        val browseButton = findViewById<Button>(R.id.btnBrowseServices)

        postButton.setOnClickListener {

            if (title.text.toString().isEmpty() ||
                description.text.toString().isEmpty() ||
                budget.text.toString().isEmpty()
            ) {
                Toast.makeText(
                    this,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(
                    this,
                    "Service posted successfully!",
                    Toast.LENGTH_SHORT
                ).show()

                title.text.clear()
                description.text.clear()
                budget.text.clear()
            }
        }

        browseButton.setOnClickListener {
            Toast.makeText(
                this,
                "Services will be displayed here",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}