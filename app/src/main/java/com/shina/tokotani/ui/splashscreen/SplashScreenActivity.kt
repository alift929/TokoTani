package com.shina.tokotani.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.shina.tokotani.R
import com.shina.tokotani.ui.auth.AuthActivity


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({

            //automove to authactivity with 3sec delay
            startActivity(Intent(this,AuthActivity::class.java))
        },3000)
    }
}