package com.example.freelanceservicesmarketplace

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val freelancerName = findViewById<EditText>(R.id.etFreelancerName)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val review = findViewById<EditText>(R.id.etReview)
        val submitButton = findViewById<Button>(R.id.btnSubmitReview)
        val reviewList = findViewById<TextView>(R.id.tvReviewList)

        submitButton.setOnClickListener {

            val name = freelancerName.text.toString().trim()
            val reviewText = review.text.toString().trim()
            val rating = ratingBar.rating

            if (name.isEmpty() || reviewText.isEmpty()) {

                Toast.makeText(
                    this,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                val newReview =
                    "Freelancer: $name\nRating: $rating/5\nReview: $reviewText\n\n"

                reviewList.append(newReview)

                Toast.makeText(
                    this,
                    "Review submitted successfully!",
                    Toast.LENGTH_SHORT
                ).show()

                freelancerName.text.clear()
                review.text.clear()
                ratingBar.rating = 0f
            }
        }
    }
}