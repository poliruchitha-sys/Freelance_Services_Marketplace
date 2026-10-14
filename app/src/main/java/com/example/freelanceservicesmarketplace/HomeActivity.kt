package com.example.freelanceservicesmarketplace

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btnServices).setOnClickListener {
            startActivity(Intent(this, ServiceActivity::class.java))
        }

        findViewById<Button>(R.id.btnBidding).setOnClickListener {
            startActivity(Intent(this, BidActivity::class.java))
        }

        findViewById<Button>(R.id.btnChat).setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))
        }

        findViewById<Button>(R.id.btnReviews).setOnClickListener {
            startActivity(Intent(this, ReviewActivity::class.java))
        }
    }
}