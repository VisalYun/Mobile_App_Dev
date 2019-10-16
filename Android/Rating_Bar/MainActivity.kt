package com.learnprogramming.rating_bar

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RatingBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar.setOnRatingBarChangeListener(object: RatingBar.OnRatingBarChangeListener{
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                ratingBar?.numStars = 5
                if (rating <= 3){
                    ratingBar?.progressTintList = ColorStateList.valueOf(Color.RED)
                }else if (rating > 3 && rating < 5){
                    ratingBar?.progressTintList = ColorStateList.valueOf(Color.YELLOW)
                }else{
                    ratingBar?.progressTintList = ColorStateList.valueOf(Color.GREEN)
                }
            }
        })
    }


}
