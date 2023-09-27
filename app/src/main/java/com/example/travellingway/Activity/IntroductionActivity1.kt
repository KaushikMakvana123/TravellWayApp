package com.example.travellingway.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travellingway.databinding.ActivityIntroduction1Binding


class IntroductionActivity1 : AppCompatActivity() {



    lateinit var  binding: ActivityIntroduction1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroduction1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


        binding.imgSkip.setOnClickListener {
            var  i = Intent(this, IntroductionActivity2::class.java)
            startActivity(i)

        }

    }
}