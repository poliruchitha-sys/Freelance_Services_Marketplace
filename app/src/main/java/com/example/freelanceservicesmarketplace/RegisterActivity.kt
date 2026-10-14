package com.example.freelanceservicesmarketplace

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.freelanceservicesmarketplace.api.RetrofitClient
import com.example.freelanceservicesmarketplace.model.User
import kotlinx.coroutines.launch

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val name = findViewById<EditText>(R.id.etName)
        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val role = findViewById<Spinner>(R.id.spinnerRole)
        val register = findViewById<Button>(R.id.btnRegister)

        val roles = arrayOf(
            "Select Role",
            "Freelancer",
            "Client"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            roles
        )

        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        role.adapter = adapter

        register.setOnClickListener {

            val nameText = name.text.toString().trim()
            val emailText = email.text.toString().trim()
            val passwordText = password.text.toString().trim()
            val roleText = role.selectedItem.toString()

            if (nameText.isEmpty() ||
                emailText.isEmpty() ||
                passwordText.isEmpty() ||
                role.selectedItemPosition == 0
            ) {

                Toast.makeText(
                    this,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val user = User(
                name = nameText,
                email = emailText,
                password = passwordText,
                role = roleText
            )

            registerUser(user)
        }
    }

    private fun registerUser(user: User) {

        lifecycleScope.launch {

            try {

                val response = RetrofitClient.apiService.registerUser(user)

                if (response.isSuccessful) {

                    Toast.makeText(
                        this@RegisterActivity,
                        "Registration successful!",
                        Toast.LENGTH_SHORT
                    ).show()

                    val intent = Intent(
                        this@RegisterActivity,
                        HomeActivity::class.java
                    )

                    startActivity(intent)
                    finish()

                } else {

                    Toast.makeText(
                        this@RegisterActivity,
                        "Registration failed: ${response.code()}",
                        Toast.LENGTH_LONG
                    ).show()
                }

            } catch (e: Exception) {

                Toast.makeText(
                    this@RegisterActivity,
                    "Server connection failed: ${e.message}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}