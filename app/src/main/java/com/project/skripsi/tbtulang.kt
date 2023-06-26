package com.project.skripsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.skripsi.databinding.FragmentTBParuBinding
import com.project.skripsi.databinding.FragmentTbtulangBinding


class tbtulang : Fragment() {
    lateinit var binding: FragmentTbtulangBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTbtulangBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.TBTulangHome.setOnClickListener{
            findNavController().navigate(R.id.action_tbtulang_to_homeFragment)
        }
    }



}