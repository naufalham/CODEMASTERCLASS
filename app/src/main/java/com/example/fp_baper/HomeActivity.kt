package com.example.fp_baper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance
        val rvKelasBaru:RecyclerView = findViewById(R.id.rlKelasbaru)

        //set layout managerndi RecyclerView
        rvKelasBaru.layoutManager = LinearLayoutManager(this)

        //list kelas terbaru
        val kelas = ArrayList<KelasBaru>()
        kelas.add(KelasBaru(R.drawable.aplikasisi, "Aplikasi"))
        kelas.add(KelasBaru(R.drawable.vid, "Vidio dan Animasi"))

        //set adapter
        val adapter = AdapterHome(kelas)

        //set adapter ke recycler view
        rvKelasBaru.adapter = adapter
    }
}