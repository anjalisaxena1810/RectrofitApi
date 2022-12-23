package com.example.rectrofitapisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.rectrofitapisproject.databinding.ActivityTmdbStoreBinding

class TmdbStore : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityTmdbStoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tmdb_store)

        binding.btnMovie.setOnClickListener(this)
        binding.btnPeople.setOnClickListener(this)
        binding.btnTvshow.setOnClickListener(this)
    }

    override fun onClick(button: View?) {
        when(button!!.id){
            R.id.btn_movie ->{
                val intent = Intent(this@TmdbStore,movieActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_people ->{
                val intent = Intent(this@TmdbStore,peopleActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_tvshow ->{
                val intent = Intent(this@TmdbStore,TvShowActivity::class.java)
                startActivity(intent)

            }

        }

    }
}