package com.learnprogramming.formvalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Validate(v:View){
        var name = txtName.text.toString()
        var email = txtEmail.text.toString()
        var phoneNumber = txtPhone.text.toString()
        var flag = 0
        var e=0

        for(i in name){
            if(i.toInt() in 65..90 || i.toInt() in 97..122) continue
            else{
                flag++
                break
            }
        }

        for(i in email){
            if(i!='@') {
                if(i!='.') e++
            }
        }
        if(email.length - e < 2) flag++

        for(i in phoneNumber) {
            if (i.isDigit()) continue
            else{
                flag++
                break
            }
        }

        if(flag>0){
            Toast.makeText(this, "Wrong Input", Toast.LENGTH_LONG).show()
        }
    }
}
