package com.example.rectrofitapisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.rectrofitapisproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnPost.setOnClickListener(this)
        binding.btnPhoto.setOnClickListener(this)
        binding.btnComment.setOnClickListener(this)
        binding.btnTodo.setOnClickListener(this)
        binding.btnAlbum.setOnClickListener(this)
        binding.btnUser.setOnClickListener(this)

    }

    override fun onClick(button: View?) {
        when(button!!.id){
            R.id.btn_post ->{
                val intent = Intent(this@MainActivity,PostActivity::class.java)
                 startActivity(intent)
            }
            R.id.btn_photo ->{
                val intent = Intent(this@MainActivity,PhotoActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_comment ->{
                val intent = Intent(this@MainActivity,CommentActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_Todo ->{
                val intent = Intent(this@MainActivity,TodoActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_album ->{
                val intent = Intent(this@MainActivity,AlbumActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_User ->{
                val intent = Intent(this@MainActivity,UserActivity::class.java)
                startActivity(intent)
            }


}

    }
}