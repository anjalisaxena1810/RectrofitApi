package com.example.rectrofitapisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.rectrofitapisproject.databinding.ActivityQuotesBinding

class quotesActivity : AppCompatActivity(),View.OnClickListener  {
    private  lateinit var  binding:ActivityQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_quotes)

        binding.btnQuotess.setOnClickListener(this)

    }

    override fun onClick(button: View?) {
      when(button!!.id){
          R.id.btn_quotess ->{
              val intent = Intent(this@quotesActivity,QuotesApiActivity::class.java)
              startActivity(intent)
          }
      }
    }

}