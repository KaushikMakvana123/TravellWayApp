package com.example.travellingway.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travellingway.databinding.ActivityIntroduction2Binding

class IntroductionActivity2 : AppCompatActivity() {

    lateinit var  binding: ActivityIntroduction2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroduction2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


        binding.imgSkip.setOnClickListener {
            var i = Intent(this, IntroductionActivity3::class.java)
            startActivity(i)

        }
    }
}