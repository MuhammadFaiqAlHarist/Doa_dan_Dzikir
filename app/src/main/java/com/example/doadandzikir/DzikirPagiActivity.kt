package com.example.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvDzikirPagiActivity = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        rvDzikirPagiActivity.layoutManager = LinearLayoutManager(this)
        rvDzikirPagiActivity.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}