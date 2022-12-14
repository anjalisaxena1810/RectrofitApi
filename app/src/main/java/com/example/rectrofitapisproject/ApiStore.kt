package com.example.rectrofitapisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.rectrofitapisproject.databinding.ActivityApiStoreBinding
import com.example.rectrofitapisproject.databinding.ActivityMainBinding

class ApiStore : AppCompatActivity(),View.OnClickListener  {
  private lateinit var binding:ActivityApiStoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_api_store)

        binding.btnJsnplaceholder.setOnClickListener(this)
        binding.btnFakestore.setOnClickListener(this)
        binding.btnQuote.setOnClickListener(this)
        binding.btnTmdb.setOnClickListener(this)

    }

    override fun onClick(button: View?) {
      when(button!!.id){
          R.id.btn_jsnplaceholder ->{
//              Toast.makeText(this,"working",Toast.LENGTH_SHORT).show()
              val intent = Intent(this@ApiStore,MainActivity::class.java)
              startActivity(intent)
          }
          R.id.btn_fakestore ->{
              val intent = Intent(this@ApiStore,fakeStoreActivity::class.java)
              startActivity(intent)

          }
          R.id.btn_quote ->{
              val intent = Intent(this@ApiStore,quotesActivity::class.java)
              startActivity(intent)
          }
          R.id.btn_tmdb ->{
              val intent = Intent(this@ApiStore,tmdbActivity::class.java)
              startActivity(intent)

          }
      }
    }
}