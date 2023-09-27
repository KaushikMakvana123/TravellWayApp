package com.example.travellingway.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travellingway.Adapter.CategorieAdapter
import com.example.travellingway.ModelClass.MountainModalClass
import com.example.travellingway.databinding.ActivityCategorieBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class CategorieActivity : AppCompatActivity() {

    lateinit var binding:ActivityCategorieBinding
    var reference = FirebaseDatabase.getInstance().reference
    var list = ArrayList<MountainModalClass>()
    lateinit var placeName:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCategorieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {

        if (intent!=null)
        {
            placeName=intent.getStringExtra("category").toString()
            binding.txtTitle.text = placeName

            if (placeName=="mountain")
            {
                MountainCall()
            }
            else if (placeName=="beach")
            {
                BeachCall()
            }
            if (placeName=="Lakes")
            {
                LakesCall()
            }
            if (placeName=="Desert")
            {
                DesertCall()
            }
        }

    }

    private fun DesertCall() {
        reference.root.child("DesertTb").addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (child in snapshot.children) {
                    var data: MountainModalClass? = child.getValue(MountainModalClass::class.java)
                    if (data != null) {
                        list.add(data)
                    }
                }
                var adpter = CategorieAdapter(this@CategorieActivity,list, onItemClick = {
                    place, Location, Price, Rate, img, key ->


                    var i = Intent(this@CategorieActivity,DataDisplayActivity :: class.java)

                    i.putExtra("place",place)
                    i.putExtra("Location",Location)
                    i.putExtra("Price",Price)
                    i.putExtra("Rate",Rate)
                    i.putExtra("img",img)
                    i.putExtra("key",key)


                    startActivity(i)
                })
                var manager = LinearLayoutManager(this@CategorieActivity, LinearLayoutManager.VERTICAL,false)
                binding?.rcvCategorie?.layoutManager =manager
                binding.rcvCategorie.adapter = adpter

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }

    private fun LakesCall() {
        reference.root.child("LakesTb").addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (child in snapshot.children) {
                    var data: MountainModalClass? = child.getValue(MountainModalClass::class.java)
                    if (data != null) {
                        list.add(data)
                    }
                }
                var adpter = CategorieAdapter(this@CategorieActivity,list ,onItemClick = {
                        place, Location, Price, Rate, img, key ->


                    var i = Intent(this@CategorieActivity,DataDisplayActivity :: class.java)

                    i.putExtra("place",place)
                    i.putExtra("Location",Location)
                    i.putExtra("Price",Price)
                    i.putExtra("Rate",Rate)
                    i.putExtra("img",img)
                    i.putExtra("key",key)


                    startActivity(i)
                })
                var manager = LinearLayoutManager(this@CategorieActivity, LinearLayoutManager.VERTICAL,false)
                binding?.rcvCategorie?.layoutManager =manager
                binding.rcvCategorie.adapter = adpter

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })



    }

    private fun BeachCall() {
        reference.root.child("BeachTb").addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (child in snapshot.children) {
                    var data: MountainModalClass? = child.getValue(MountainModalClass::class.java)
                    if (data != null) {
                        list.add(data)
                    }
                }
                var adpter = CategorieAdapter(this@CategorieActivity,list, onItemClick = {
                        place, Location, Price, Rate, img, key ->


                    var i = Intent(this@CategorieActivity,DataDisplayActivity :: class.java)

                    i.putExtra("place",place)
                    i.putExtra("Location",Location)
                    i.putExtra("Price",Price)
                    i.putExtra("Rate",Rate)
                    i.putExtra("img",img)
                    i.putExtra("key",key)


                    startActivity(i)
                })
                var manager = LinearLayoutManager(this@CategorieActivity, LinearLayoutManager.VERTICAL,false)
                binding?.rcvCategorie?.layoutManager =manager
                binding.rcvCategorie.adapter = adpter

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }

    private fun MountainCall() {
        reference.root.child("MountainTb").addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (child in snapshot.children) {
                    var data: MountainModalClass? = child.getValue(MountainModalClass::class.java)
                    if (data != null) {
                        list.add(data)
                    }
                }
                var adpter = CategorieAdapter(this@CategorieActivity,list, onItemClick = {
                        place, Location, Price, Rate, img, key ->


                    var i = Intent(this@CategorieActivity,DataDisplayActivity :: class.java)

                    i.putExtra("place",place)
                    i.putExtra("Location",Location)
                    i.putExtra("Price",Price)
                    i.putExtra("Rate",Rate)
                    i.putExtra("img",img)
                    i.putExtra("key",key)


                    startActivity(i)
                })
                var manager = LinearLayoutManager(this@CategorieActivity, LinearLayoutManager.VERTICAL,false)
                binding?.rcvCategorie?.layoutManager =manager
                binding.rcvCategorie.adapter = adpter

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }

}