package com.example.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DzikirPetangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvDzikirPetangActivity = findViewById<RecyclerView>(R.id.rv_dzikir_petang)
        rvDzikirPetangActivity.layoutManager = LinearLayoutManager(this)
        rvDzikirPetangActivity.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPetang)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}