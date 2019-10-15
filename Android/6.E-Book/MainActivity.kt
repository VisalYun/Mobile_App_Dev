package com.learnprogramming.e_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num = 1;
        change(num)
        click.setOnClickListener{
            num = edtxt.text.toString().toInt()
            change(num)
        }
        next.setOnClickListener {
            num++
            if(num > 3){
                num = 1
            }
            change(num)
        }
        previous.setOnClickListener {
            num--
            if(num < 1){
                num = 3
            }
            change(num)
        }
    }
    fun change(a:Int){
        when(a){
            1 ->{
                pic1.visibility = View.VISIBLE
                pic2.visibility = View.GONE
                pic3.visibility = View.GONE
            }
            2 ->{
                pic1.visibility = View.GONE
                pic2.visibility = View.VISIBLE
                pic3.visibility = View.GONE
            }
            3 ->{                
		pic1.visibility = View.GONE
                pic2.visibility = View.GONE
                pic3.visibility = View.VISIBLE
            }
            else ->{
                Toast.makeText(MainActivity(),"Defaq...",Toast.LENGTH_LONG).show()
            }
        }

    }
}
