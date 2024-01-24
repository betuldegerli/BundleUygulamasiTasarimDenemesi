package com.betuldegerli.bundletasarimidenemesi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betuldegerli.bundletasarimidenemesi.data.entity.KonuKategorileri
import com.betuldegerli.bundletasarimidenemesi.databinding.CardTasarimBinding
import com.betuldegerli.bundletasarimidenemesi.databinding.KategoriCardBinding


class KategoriAdapter(val mContext: Context, val konuListesi:List<KonuKategorileri>) : RecyclerView.Adapter<KategoriAdapter.cardTasarimTutucu>(){

    inner class cardTasarimTutucu(var tasarim: KategoriCardBinding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimTutucu {
     val binding=KategoriCardBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return cardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return konuListesi.size
    }

    override fun onBindViewHolder(holder: cardTasarimTutucu, position: Int) {
      val kategori=konuListesi.get(position)
        val k=holder.tasarim
        k.kategoriTxt.text="${kategori.kategoriIsim}"

    }


}