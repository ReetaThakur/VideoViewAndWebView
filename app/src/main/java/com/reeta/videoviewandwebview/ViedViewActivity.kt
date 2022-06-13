package com.reeta.videoviewandwebview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class ViedViewActivity : AppCompatActivity() {

    lateinit var videoView: VideoView
    lateinit var mediaController1: MediaController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vied_view)
        videoView = findViewById(R.id.videoView)
        mediaController1 = MediaController(this)
        videoView.setMediaController(mediaController1)
        var path1="android.resource://"+this.packageManager+"/"+R.raw.video1
        var path2="android.resource://"+this.packageManager+"/"+R.raw.video2
        var path3="C:\\Users\\Reeta Thakur\\AndroidStudioProjects\\VideoViewAndWebView\\app\\src\\main\\res\\raw"
        var load=" https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"
         var uri:Uri=Uri.parse(load)
      //  videoView.setVideoPath(path3)
        videoView.setVideoURI(uri)
        videoView.start()
//        videoView.setOnCompletionListener {
//            videoView.setVideoPath(path2)
//            videoView.start()
//        }
    }
}