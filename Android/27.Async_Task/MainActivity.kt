package com.learnprogramming.asynctask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun download(v:View){
        var myTask = MyTask(this@MainActivity, button, progressBar, textView)
        myTask.execute()
    }
}
