package com.example.doadandzikir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>)//constructor untuk mengatrbusasikan data
    : RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //inisialisasi view dari layout row_item_dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvlafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemahan: TextView = view.findViewById(R.id.tv_terjemahan)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa,parent,false)
    )

    //Mangetribusikan data menjadi sebuah tampilan
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvlafaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemahan.text = listDzikirDoa[position].terjemahan
    }
    //menentukan jumlah yang ditampilkan
    override fun getItemCount(): Int = listDzikirDoa.size


}