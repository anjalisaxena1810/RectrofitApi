package com.example.rectrofitapisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.rectrofitapisproject.databinding.ActivityPeopleBinding

class peopleActivity : AppCompatActivity() {
    private lateinit var binding:ActivityPeopleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding=DataBindingUtil.setContentView(this,R.layout.activity_people)

        binding.btnPopular.setOnClickListener {
            val intent = Intent(this@peopleActivity,PopularPeopleApi::class.java)
            startActivity(intent)
        }
    }
}