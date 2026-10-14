package com.example.freelanceservicesmarketplace

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bid)

        val serviceTitle = findViewById<EditText>(R.id.etBidService)
        val freelancerName = findViewById<EditText>(R.id.etFreelancerName)
        val bidAmount = findViewById<EditText>(R.id.etBidAmount)
        val proposal = findViewById<EditText>(R.id.etProposal)

        val submitButton = findViewById<Button>(R.id.btnSubmitBid)
        val viewButton = findViewById<Button>(R.id.btnViewBids)

        submitButton.setOnClickListener {

            if (serviceTitle.text.toString().isEmpty() ||
                freelancerName.text.toString().isEmpty() ||
                bidAmount.text.toString().isEmpty() ||
                proposal.text.toString().isEmpty()
            ) {

                Toast.makeText(
                    this,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "Bid submitted successfully!",
                    Toast.LENGTH_SHORT
                ).show()

                serviceTitle.text.clear()
                freelancerName.text.clear()
                bidAmount.text.clear()
                proposal.text.clear()
            }
        }

        viewButton.setOnClickListener {

            Toast.makeText(
                this,
                "Submitted bids will appear here",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}