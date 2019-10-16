package com.learnprogramming.rating_bar

import android.content.Context
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.media.MediaPlayer
import android.os.Handler
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var player: MediaPlayer
    private lateinit var runnable:Runnable
    private var handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Start the media player
        button_play.setOnClickListener{
            player = MediaPlayer.create(applicationContext,R.raw.song)

            player.start()
            initializeSeekBar()

            it.isEnabled = false
            button_stop.isEnabled = true

            player.setOnCompletionListener {
                button_stop.isEnabled = false
                button_play.isEnabled = true
                toast("end")
            }
        }


        // Stop the media player
        button_stop.setOnClickListener{
            if(player.isPlaying){
                player.stop()
                player.reset()
                player.release()
                handler.removeCallbacks(runnable)

                it.isEnabled = false
                button_play.isEnabled = true
            }
        }


        // Seek bar change listener
        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                if (b) {
                    player.seekTo(i * 1000)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
    }


    // Method to initialize seek bar and audio stats
    private fun initializeSeekBar() {
        seek_bar.max = player.seconds

        runnable = Runnable {
            seek_bar.progress = player.currentSeconds

            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }
}



// Extension property to get media player duration in seconds
val MediaPlayer.seconds:Int
    get() {
        return this.duration / 1000
    }


// Extension property to get media player current position in seconds
val MediaPlayer.currentSeconds:Int
    get() {
        return this.currentPosition/1000
    }


// Extension function to show toast message quickly
fun Context.toast(message:String){
    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}