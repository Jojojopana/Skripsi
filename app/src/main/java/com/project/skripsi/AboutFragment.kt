package com.project.skripsi

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.skripsi.databinding.DialogDeveloperBinding
import com.project.skripsi.databinding.DialogPakarBinding
import com.project.skripsi.databinding.FragmentAboutBinding
import com.project.skripsi.databinding.FragmentHomeBinding


class AboutFragment : Fragment() {
    private lateinit var binding: FragmentAboutBinding
    private lateinit var binding2: DialogDeveloperBinding
    private lateinit var binding3: DialogPakarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.juan.setOnClickListener {
            binding2 = DialogDeveloperBinding.inflate(layoutInflater)
            val view = binding2.root
            val dialogBuilder = AlertDialog.Builder(requireContext())
            dialogBuilder.setView(view)
            val dialog = dialogBuilder.create()
            dialog.setCancelable(true)

            dialog.show()
        }

        binding.pakar.setOnClickListener {
            binding3 = DialogPakarBinding.inflate(layoutInflater)
            val view = binding3.root
            val dialogBuilder = AlertDialog.Builder(requireContext())
            dialogBuilder.setView(view)
            val dialog2 = dialogBuilder.create()
            dialog2.setCancelable(true)

            dialog2.show()
        }
    }


}