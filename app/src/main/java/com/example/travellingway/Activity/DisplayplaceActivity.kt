package com.example.travellingway.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.travellingway.Adapter.CategorieAdapter
import com.example.travellingway.R
import com.example.travellingway.databinding.ActivityDisplayplaceBinding

class DisplayplaceActivity : AppCompatActivity() {

    lateinit var binding: ActivityDisplayplaceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayplaceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {
        if (intent != null) {




            var key = intent.getStringExtra("key").toString()

            var place = intent.getStringExtra("place").toString()
            var Rate = intent.getStringExtra("Rate").toString()
            var img = intent.getStringExtra("img").toString()
            var location = intent.getStringExtra("location").toString()
            var Book_beach = intent.getStringExtra("Book_beach").toString()

            binding.palce.text = place
            binding.txtlocation.text = location
            binding.txtRating.text = Rate

            Glide.with(baseContext).load(img).into(binding.img)


        }

    }
}