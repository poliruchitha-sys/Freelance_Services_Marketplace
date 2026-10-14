package com.example.freelanceservicesmarketplace

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<EditText>(R.id.etLoginEmail)
        val password = findViewById<EditText>(R.id.etLoginPassword)
        val login = findViewById<Button>(R.id.btnLogin)

        login.setOnClickListener {

            if (email.text.toString().isEmpty() ||
                password.text.toString().isEmpty()
            ) {
                Toast.makeText(
                    this,
                    "Enter email and password",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                Toast.makeText(
                    this,
                    "Login successful",
                    Toast.LENGTH_SHORT
                ).show()

                startActivity(
                    Intent(this, HomeActivity::class.java)
                )

                finish()
            }
        }
    }
}