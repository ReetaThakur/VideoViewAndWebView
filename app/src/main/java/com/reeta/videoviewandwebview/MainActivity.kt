package com.reeta.videoviewandwebview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnVideoView.setOnClickListener {
            val intent=Intent(this,ViedViewActivity::class.java)
            startActivity(intent)
        }
        btnWebView.setOnClickListener {
            val intent=Intent(this,WebviewActivity::class.java)
            startActivity(intent)
        }

    }
}
