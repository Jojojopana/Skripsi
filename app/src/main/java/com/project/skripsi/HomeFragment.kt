package com.project.skripsi

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.skripsi.databinding.*

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var binding2: DialogBatukBinding
    private lateinit var binding3: DialogBatukdarahBinding
    private lateinit var binding4: DialogBatuklendirBinding
    private lateinit var binding5: DialogNyeridadaBinding
    private lateinit var binding6: DialogNyeritulangbelakangBinding
    private lateinit var binding7: DialogTulangterasakakuBinding
    private lateinit var binding8: DialogPembengkakansekitartulangBinding
    private lateinit var binding9: DialogKelenjarBinding
    private lateinit var binding10: DialogDemamBinding
    private lateinit var binding11: DialogKelelahanBinding
    private lateinit var binding12: DialogKeringatBinding
    private lateinit var binding13: DialogNyeribuangairBinding
    private lateinit var binding14: DialogBabdanbakBinding
    private lateinit var binding15: DialogNyeripanggulBinding
    private lateinit var binding16: DialogPembengkakantestisBinding
    private lateinit var binding17: DialogNyeriperutBinding
    private lateinit var binding18: DialogPerutberatBinding
    private lateinit var binding19: DialogHilangnafsumakanBinding
    private lateinit var binding20: DialogDiareBinding
    private lateinit var binding21: DialogSakitkepalaBinding
    private lateinit var binding22: DialogNyeritubuhBinding
    private lateinit var binding23: DialogSensitifcahayaBinding
    private lateinit var binding24: DialogLeherkakuBinding
    private lateinit var binding25: DialogCairanperutBinding
    private lateinit var binding26: DialogMualmuntahBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val view = binding.root
        return (view)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.diagnosa.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_diagnosaActivity)
        }

        binding.penyakit.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_daftarPenyakitActivity)
        }

        binding.obat.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_daftarObatActivity)
        }

        binding.about.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        }
    }

    private fun dialog() {
        binding2 = DialogBatukBinding.inflate(layoutInflater)
        val view = binding2.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog = dialogBuilder.create()
        dialog.setCancelable(false)

        dialog.show()

        binding2.Yabatuk3minggu.setOnClickListener {
            dialog.dismiss()
            dialogParu1()
        }

        binding2.Tidakbatuk3minggu.setOnClickListener {
            dialog.dismiss()
            dialogTulang1()
        }
    }

    private fun dialogParu1(){
        binding3 = DialogBatukdarahBinding.inflate(layoutInflater)
        val view = binding3.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog2 = dialogBuilder.create()
        dialog2.setCancelable(false)

        dialog2.show()

        binding3.Yabatukdarah.setOnClickListener {
            dialog2.dismiss()
            dialogParu2()
        }

        binding3.Tidakbatukdarah.setOnClickListener {
            dialog2.dismiss()
            dialogTulang1()
        }
    }

    private fun dialogParu2(){
        binding4 = DialogBatuklendirBinding.inflate(layoutInflater)
        val view = binding4.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog3 = dialogBuilder.create()
        dialog3.setCancelable(false)

        dialog3.show()

        binding4.Yabatuklendir.setOnClickListener {
            dialog3.dismiss()
            dialogParu3()
        }

        binding4.Tidakbatuklendir.setOnClickListener {
            dialog3.dismiss()
            dialogTulang1()
        }
    }

    private fun dialogParu3(){
        binding5 = DialogNyeridadaBinding.inflate(layoutInflater)
        val view = binding5.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog4 = dialogBuilder.create()

        dialog4.show()


        binding5.Yanyeridada.setOnClickListener {
            dialog4.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_fragment_TBParu)
        }

        binding5.Tidaknyeridada.setOnClickListener {
            dialog4.dismiss()
            dialogTulang1()
        }

    }

    private fun dialogTulang1(){
        binding6 = DialogNyeritulangbelakangBinding.inflate(layoutInflater)
        val view = binding6.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog5 = dialogBuilder.create()

        dialog5.show()

        binding6.Yanyeritulangbelakang.setOnClickListener {
            dialog5.dismiss()
            dialogTulang2()
        }

        binding6.Tidaknyeritulangbelakang.setOnClickListener {
            dialog5.dismiss()
            dialoglimfa1()
        }
    }

    private fun dialogTulang2(){
        binding7 = DialogTulangterasakakuBinding.inflate(layoutInflater)
        val view = binding7.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog6 = dialogBuilder.create()

        dialog6.show()

        binding7.Yatulangterasakaku.setOnClickListener {
            dialog6.dismiss()
            dialogTulang3()
        }

        binding7.Tidaktulangterasakaku.setOnClickListener {
            dialog6.dismiss()
            dialoglimfa1()
        }
    }

    private fun dialogTulang3(){
        binding8 = DialogPembengkakansekitartulangBinding.inflate(layoutInflater)
        val view = binding8.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog7 = dialogBuilder.create()

        dialog7.show()

        binding8.Yabengkak.setOnClickListener {
            dialog7.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_tbtulang)
        }

        binding8.Tidakbengkak.setOnClickListener {
            dialog7.dismiss()
            dialoglimfa1()
        }
    }

    private fun dialoglimfa1(){
        binding9 = DialogKelenjarBinding.inflate(layoutInflater)
        val view = binding9.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog8 = dialogBuilder.create()

        dialog8.show()

        binding9.Yabenjolan.setOnClickListener {
            dialog8.dismiss()
            dialoglimfa2()
        }

        binding9.Tidakbenjolan.setOnClickListener {
            dialog8.dismiss()
            dialoggenital1()
        }
    }

    private fun dialoglimfa2(){
        binding10 = DialogDemamBinding.inflate(layoutInflater)
        val view = binding10.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog9 = dialogBuilder.create()

        dialog9.show()

        binding10.Yademam.setOnClickListener {
            dialog9.dismiss()
            dialoglimfa3()
        }

        binding10.Tidakdemam.setOnClickListener {
            dialog9.dismiss()
            dialoggenital1()
        }
    }

    private fun dialoglimfa3(){
        binding11 = DialogKelelahanBinding.inflate(layoutInflater)
        val view = binding11.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog10 = dialogBuilder.create()

        dialog10.show()

        binding11.Yalelah.setOnClickListener {
            dialog10.dismiss()
            dialoglimfa4()
        }

        binding11.Tidaklelah.setOnClickListener {
            dialog10.dismiss()
            dialoggenital1()
        }
    }

    private fun dialoglimfa4(){
        binding12 = DialogKeringatBinding.inflate(layoutInflater)
        val view = binding12.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog11 = dialogBuilder.create()

        dialog11.show()

        binding12.Yakeringat.setOnClickListener {
            dialog11.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_tblimfadenitis)
        }

        binding12.Tidakkeringat.setOnClickListener {
            dialog11.dismiss()
            dialoggenital1()
        }
    }

    private fun dialoggenital1(){
        binding13 = DialogNyeribuangairBinding.inflate(layoutInflater)
        val view = binding13.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog12 = dialogBuilder.create()

        dialog12.show()

        binding13.Yanyeribuangair.setOnClickListener {
            dialog12.dismiss()
            dialoggenital2()
        }

        binding13.Tidakbuangair.setOnClickListener {
            dialog12.dismiss()
            dialogpencernaan1()
        }
    }

    private fun dialoggenital2(){
        binding14 = DialogBabdanbakBinding.inflate(layoutInflater)
        val view = binding14.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog13 = dialogBuilder.create()

        dialog13.show()

        binding14.Yasering.setOnClickListener {
            dialog13.dismiss()
            dialoggenital3()
        }

        binding14.Tidaksering.setOnClickListener {
            dialog13.dismiss()
            dialogpencernaan1()
        }
    }

    private fun dialoggenital3(){
        binding15 = DialogNyeripanggulBinding.inflate(layoutInflater)
        val view = binding15.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog14 = dialogBuilder.create()

        dialog14.show()

        binding15.Yanyeripanggul.setOnClickListener {
            dialog14.dismiss()
            dialoggenital4()
        }

        binding15.Tidaknyeripanggul.setOnClickListener {
            dialog14.dismiss()
            dialogpencernaan1()
        }
    }

    private fun dialoggenital4(){
        binding16 = DialogPembengkakantestisBinding.inflate(layoutInflater)
        val view = binding16.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog15 = dialogBuilder.create()

        dialog15.show()

        binding16.Yabengkaktestis.setOnClickListener {
            dialog15.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_tburogenital)
        }

        binding16.Tidakbengkaktestis.setOnClickListener {
            dialog15.dismiss()
            dialogpencernaan1()
        }
    }

    private fun dialogpencernaan1(){
        binding17 = DialogNyeriperutBinding.inflate(layoutInflater)
        val view = binding17.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog16 = dialogBuilder.create()

        dialog16.show()

        binding17.Yanyeriperut.setOnClickListener {
            dialog16.dismiss()
            dialogpencernaan2()
        }

        binding17.Tidaknyeriperut.setOnClickListener {
            dialog16.dismiss()
            dialogmeningitis1()
        }
    }

    private fun dialogpencernaan2(){
        binding18 = DialogPerutberatBinding.inflate(layoutInflater)
        val view = binding18.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog17 = dialogBuilder.create()

        dialog17.show()

        binding18.Yaperutberat.setOnClickListener {
            dialog17.dismiss()
            dialogpencernaan3()
        }

        binding18.Tidakperutberat.setOnClickListener {
            dialog17.dismiss()
            dialogmeningitis1()
        }
    }

    private fun dialogpencernaan3(){
        binding19 = DialogHilangnafsumakanBinding.inflate(layoutInflater)
        val view = binding19.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog18 = dialogBuilder.create()

        dialog18.show()

        binding19.Yahilangnafsumakan.setOnClickListener {
            dialog18.dismiss()
            dialogpencernaan4()
        }

        binding19.Tidakhilangnafsumakan.setOnClickListener {
            dialog18.dismiss()
            dialogmeningitis1()
        }
    }

    private fun dialogpencernaan4(){
        binding20 = DialogDiareBinding.inflate(layoutInflater)
        val view = binding20.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog19 = dialogBuilder.create()

        dialog19.show()

        binding20.Yadiare.setOnClickListener {
            dialog19.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_tbsaluranpencernaan)
        }

        binding20.Tidakdiare.setOnClickListener {
            dialog19.dismiss()
            dialogmeningitis1()
        }
    }

    private fun dialogmeningitis1(){
        binding21 = DialogSakitkepalaBinding.inflate(layoutInflater)
        val view = binding21.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog20 = dialogBuilder.create()

        dialog20.show()

        binding21.Yasakitkepala.setOnClickListener {
            dialog20.dismiss()
            dialogmeningitis2()
        }

        binding21.Tidaksakitkepala.setOnClickListener {
            dialog20.dismiss()
            dialogperitonitis1()
        }
    }

    private fun dialogmeningitis2(){
        binding22 = DialogNyeritubuhBinding.inflate(layoutInflater)
        val view = binding22.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog21 = dialogBuilder.create()

        dialog21.show()

        binding22.Yanyeritubuh.setOnClickListener {
            dialog21.dismiss()
            dialogmeningitis3()
        }

        binding22.Tidaknyeritubuh.setOnClickListener {
            dialog21.dismiss()
            dialogperitonitis1()
        }
    }

    private fun dialogmeningitis3(){
        binding23 = DialogSensitifcahayaBinding.inflate(layoutInflater)
        val view = binding23.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog22 = dialogBuilder.create()

        dialog22.show()

        binding23.Yasensitif.setOnClickListener {
            dialog22.dismiss()
            dialogmeningitis4()
        }

        binding23.Tidaksensitif.setOnClickListener {
            dialog22.dismiss()
            dialogperitonitis1()
        }
    }

    private fun dialogmeningitis4(){
        binding24 = DialogLeherkakuBinding.inflate(layoutInflater)
        val view = binding24.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog23 = dialogBuilder.create()

        dialog23.show()

        binding24.Yaleherkaku.setOnClickListener {
            dialog23.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_tbmeningitis)
        }

        binding24.Tidakleherkaku.setOnClickListener {
            dialog23.dismiss()
            dialogperitonitis1()
        }
    }

    private fun dialogperitonitis1(){
        binding25 = DialogCairanperutBinding.inflate(layoutInflater)
        val view = binding25.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog24 = dialogBuilder.create()

        dialog24.show()

        binding25.Yamunculcairan.setOnClickListener {
            dialog24.dismiss()
            dialogperitonitis2()
        }

        binding25.Tidakmunculcairan.setOnClickListener {
            dialog24.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_fragment_tidakterkenapenyakit)
        }
    }

    private fun dialogperitonitis2(){
        binding26 = DialogMualmuntahBinding.inflate(layoutInflater)
        val view = binding26.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog25 = dialogBuilder.create()

        dialog25.show()

        binding26.Yamual.setOnClickListener {
            dialog25.dismiss()
            dialogperitonitis3()
        }

        binding26.Tidakmual.setOnClickListener {
            dialog25.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_fragment_tidakterkenapenyakit)
        }
    }

    private fun dialogperitonitis3(){
        binding10 = DialogDemamBinding.inflate(layoutInflater)
        val view = binding10.root
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setView(view)
        val dialog26 = dialogBuilder.create()

        dialog26.show()

        binding10.Yademam.setOnClickListener {
            dialog26.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_tbperitonitis)
        }

        binding10.Tidakdemam.setOnClickListener {
            dialog26.dismiss()
            findNavController().navigate(R.id.action_homeFragment_to_fragment_tidakterkenapenyakit)
        }
    }

}