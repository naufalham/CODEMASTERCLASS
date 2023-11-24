package com.example.fp_baper

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //instance
//        val bottomNav: Button = findViewById(R.id.imageButton4)
//
//        //even button home
//        bottomNav.setOnClickListener {
//            val intentHome = Intent(this, HomeFragment::class.java)
//            startActivity(intentHome)
//        }

        //set fragment
        val homeFragment=HomeFragment()
        val kelasFragment=KelasFragment()

        //default fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.)
            commit()
        }
    }
}