package com.reeta.videoviewandwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class WebviewActivity : AppCompatActivity() {

    lateinit var webView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webView=findViewById(R.id.webView)
//        var webSettings:WebSettings=webView.settings
//        webSettings.javaScriptEnabled=true
        webView.loadUrl("https://www.masaischool.com/")
    }
}