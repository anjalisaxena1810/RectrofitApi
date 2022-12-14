package com.example.rectrofitapisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.rectrofitapisproject.databinding.ActivityFakeStoreBinding

class fakeStoreActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding :ActivityFakeStoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_fake_store)

        binding.btnProduct.setOnClickListener(this)
        binding.btnJewelery.setOnClickListener(this)

    }

    override fun onClick(button: View?) {
        when(button!!.id){
            R.id.btn_Product->{
                val intent = Intent(this@fakeStoreActivity,ProductActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_jewelery ->{
                val intent = Intent(this@fakeStoreActivity,jeweleryrActivity::class.java)
                startActivity(intent)
            }
        }

    }

}