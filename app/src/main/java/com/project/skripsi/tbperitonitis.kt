package com.project.skripsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.skripsi.databinding.FragmentTbmeningitisBinding
import com.project.skripsi.databinding.FragmentTbperitonitisBinding


class tbperitonitis : Fragment() {
    lateinit var binding: FragmentTbperitonitisBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTbperitonitisBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tbperitonitishome.setOnClickListener{
            findNavController().navigate(R.id.action_tbperitonitis_to_homeFragment)
        }
    }

}