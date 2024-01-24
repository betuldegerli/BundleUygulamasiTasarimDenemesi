package com.betuldegerli.bundletasarimidenemesi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.betuldegerli.bundletasarimidenemesi.R
import com.betuldegerli.bundletasarimidenemesi.data.entity.haberOzellikleri
import com.betuldegerli.bundletasarimidenemesi.databinding.FragmentHaberDetayBinding

class HaberDetayFragment : Fragment() {
    private lateinit var binding:FragmentHaberDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentHaberDetayBinding.inflate(inflater, container, false)

        val bundle:HaberDetayFragmentArgs by  navArgs()
         val haber=bundle.haberOzellikleri
        binding.haberTitleTxt.text="${bundle.haberOzellikleri.haberBaslik}"
        binding.haberCerikTxt.text="${bundle.haberOzellikleri.haberIcerik}"
        binding.imageView.setImageResource(resources.getIdentifier(bundle.haberOzellikleri.haberResimAdi, "drawable", requireContext().packageName))

        return binding.root
    }

}