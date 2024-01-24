package com.betuldegerli.bundletasarimidenemesi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.betuldegerli.bundletasarimidenemesi.data.entity.haberOzellikleri
import com.betuldegerli.bundletasarimidenemesi.databinding.CardTasarimBinding
import com.betuldegerli.bundletasarimidenemesi.ui.fragment.AnasayfaFragmentDirections
import com.betuldegerli.bundletasarimidenemesi.ui.fragment.HaberDetayFragmentArgs

class HaberAdapter (val mContext:Context, val haberListesi:List<haberOzellikleri>)
    : RecyclerView.Adapter<HaberAdapter.cardTasarimTutucu>(){

    inner class cardTasarimTutucu(var tasarim: CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimTutucu {
        val binding= CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return cardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return haberListesi.size
    }

    override fun onBindViewHolder(holder: cardTasarimTutucu, position: Int) {
        val haber=haberListesi.get(position)
        val h=holder.tasarim
        h.haberBaslikTxt.text="${haber.haberBaslik}"
        h.haberKanalTxt.text="${haber.haberKanal}"
        h.haberResim.setImageResource(
            mContext.resources.getIdentifier(haber.haberResimAdi, "drawable", mContext.packageName))
        h.haberResim.setOnClickListener {
            val gecis=AnasayfaFragmentDirections.detayGecis(haberOzellikleri=haber)//burda neyi neye eşitlediğimi anlaamdım, hata olursa buraya bak
            Navigation.findNavController(it).navigate(gecis)
        }
        h.card.setOnClickListener {
            val gecis=AnasayfaFragmentDirections.detayGecis(haberOzellikleri=haber)
            Navigation.findNavController(it).navigate(gecis)
        }
    }
}