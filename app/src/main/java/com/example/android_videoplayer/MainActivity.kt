package com.example.android_videoplayer

import android.net.Uri
import android.net.Uri.*
import android.R.*
import android.widget.MediaController
import android.widget.VideoView
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.android_videoplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // git test
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // refer to videoView
        val videoView = findViewById<VideoView>(binding.testView.id)

        // create media controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)


        // specify the location of video file
        val uri: Uri = parse("android.resource://" + packageName + "/raw/test")

        // Set up MediaController and URI
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus() // start video immediately
        videoView.start() // start video view




    }
}