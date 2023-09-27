package com.example.travellingway.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travellingway.databinding.ActivityIntroduction3Binding

class IntroductionActivity3 : AppCompatActivity() {
    lateinit var  binding: ActivityIntroduction3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroduction3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {

        binding.imgSkip.setOnClickListener {
            var  i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

    }
}