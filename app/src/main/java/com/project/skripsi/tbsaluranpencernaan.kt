package com.project.skripsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.skripsi.databinding.FragmentTbsaluranpencernaanBinding
import com.project.skripsi.databinding.FragmentTbtulangBinding


class tbsaluranpencernaan : Fragment() {
    lateinit var binding: FragmentTbsaluranpencernaanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTbsaluranpencernaanBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.TBSaluranHome.setOnClickListener{
            findNavController().navigate(R.id.action_tbsaluranpencernaan_to_homeFragment)
        }
    }

}