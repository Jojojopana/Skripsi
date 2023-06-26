package com.project.skripsi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.project.skripsi.databinding.FragmentDiagnosaBinding


class DiagnosaFragment : Fragment() {
    lateinit var batuk3minggu: CheckBox
    lateinit var batukberlendir: CheckBox
    lateinit var batukdarah: CheckBox
    lateinit var nyeridada: CheckBox

    lateinit var binding: FragmentDiagnosaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiagnosaBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvResult.setText("")
        binding.btnDiagnosa.setOnClickListener{

        }
    }
    }


