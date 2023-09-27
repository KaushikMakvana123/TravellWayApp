package com.example.travellingway.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.travellingway.R


class SpalshScreenActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh_screen)
        initview()
    }

    private fun initview() {


        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this, IntroductionActivity1::class.java)
                startActivity(i)
                finish()
            }, 2000)

    }
}