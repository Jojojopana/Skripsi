package com.project.skripsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.skripsi.databinding.FragmentHomeBinding
import com.project.skripsi.databinding.FragmentTBParuBinding


class fragment_TBParu : Fragment() {
    lateinit var binding: FragmentTBParuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTBParuBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.TBParuHome.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_TBParu_to_homeFragment)
        }
    }

}