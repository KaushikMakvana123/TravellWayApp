package com.example.travellingway.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.travellingway.R
import com.example.travellingway.databinding.ActivityDataDisplayBinding

class DataDisplayActivity : AppCompatActivity() {
    lateinit var binding : ActivityDataDisplayBinding
    lateinit var data : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityDataDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()

    }

    private fun initview() {



        binding.imgdisback.setOnClickListener {
            onBackPressed()
        }



        if(intent!=null){


            var key = intent.getStringExtra("key").toString()
            var Location = intent.getStringExtra("Location").toString()
            var Price = intent.getStringExtra("Price").toString()
            var place = intent.getStringExtra("place").toString()
            var Rate = intent.getStringExtra("Rate").toString()
            var img = intent.getStringExtra("img").toString()
            var btnBuy = intent.getStringExtra("btnBuy").toString()

            binding.txtplace.text = place
            binding.txtLocation.text = Location
            binding.txtPrice.text=Price
            binding.txtRate.text = Rate

            Glide.with(baseContext).load(img).into(binding.imgBeach)




        }

    }
}