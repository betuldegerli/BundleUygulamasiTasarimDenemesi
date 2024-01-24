package com.betuldegerli.bundletasarimidenemesi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.betuldegerli.bundletasarimidenemesi.R
import com.betuldegerli.bundletasarimidenemesi.data.entity.KonuKategorileri
import com.betuldegerli.bundletasarimidenemesi.data.entity.haberOzellikleri
import com.betuldegerli.bundletasarimidenemesi.databinding.FragmentAnasayfaBinding
import com.betuldegerli.bundletasarimidenemesi.ui.adapter.HaberAdapter
import com.betuldegerli.bundletasarimidenemesi.ui.adapter.KategoriAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.haberRv.layoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.kategoriRv.layoutManager=StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)




        val haberlerListesi=ArrayList<haberOzellikleri>()
        val h1=haberOzellikleri(1,"Basın Yine İş Başında!", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "HaberTürk", "resim1")
        val h2=haberOzellikleri(2,"Bu İkinci Haber Başlığı!", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "CnnTürk", "resim2")
        val h3=haberOzellikleri(3,"Bu Üçüncü Haber Başlığı!", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "WebTekno", "resim3")
        val h4=haberOzellikleri(4,"Bu Dördüncü Haber Başlığı!", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.", "Posta", "indir")
        haberlerListesi.add(h1)
        haberlerListesi.add(h2)
        haberlerListesi.add(h3)
        haberlerListesi.add(h4)


        val konuListesi=ArrayList<KonuKategorileri>()
        val k1=KonuKategorileri(1, "Bilim")
        val k2=KonuKategorileri(2, "Sanat")
        val k3=KonuKategorileri(3, "Spor")
        konuListesi.add(k1)
        konuListesi.add(k2)
        konuListesi.add(k3)
        val haberAdapter= HaberAdapter(requireContext(), haberlerListesi)
        binding.haberRv.adapter=haberAdapter

        val kategoriAdapter= KategoriAdapter(requireContext(), konuListesi)
        binding.kategoriRv.adapter=kategoriAdapter
        return binding.root
    }
}