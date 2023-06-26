package com.project.skripsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.skripsi.databinding.FragmentTbmeningitisBinding
import com.project.skripsi.databinding.FragmentTbsaluranpencernaanBinding


class tbmeningitis : Fragment() {
    lateinit var binding: FragmentTbmeningitisBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTbmeningitisBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tbmeningitisHome.setOnClickListener{
            findNavController().navigate(R.id.action_tbmeningitis_to_homeFragment)
        }
    }

}