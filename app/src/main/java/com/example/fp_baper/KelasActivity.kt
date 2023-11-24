package com.example.fp_baper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KelasActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelas)

        //instance
        val rvKelas: RecyclerView = findViewById(R.id.rvKelas)

        //set layout
        rvKelas.layoutManager = LinearLayoutManager(this)

        //list kelas
        val data = ArrayList<KelasModel>()
        data.add(KelasModel(R.drawable.arvr, "AR/VR"))
        data.add(KelasModel(R.drawable.vid, "AI"))

        //set adapter
        val adapter = AdapterKelas(data)

        //set adapter ke recycler view
        rvKelas.adapter = adapter

    }
}