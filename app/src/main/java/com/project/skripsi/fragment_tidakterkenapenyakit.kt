package com.project.skripsi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.skripsi.databinding.FragmentTBParuBinding
import com.project.skripsi.databinding.FragmentTidakterkenapenyakitBinding


class fragment_tidakterkenapenyakit : Fragment() {
    lateinit var binding: FragmentTidakterkenapenyakitBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTidakterkenapenyakitBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tidakterkenapenyakitHome.setOnClickListener{
            findNavController().navigate(R.id.action_fragment_tidakterkenapenyakit_to_homeFragment)
        }
    }

}