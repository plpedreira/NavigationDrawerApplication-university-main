package com.example.navigationdrawerapplication.ui.ads

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navigationdrawerapplication.databinding.FragmentAdsBinding

class AdsFragment: Fragment() {
    private var _binding: FragmentAdsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val adsViewModel =
            ViewModelProvider(this).get(AdsViewModel::class.java)

        _binding = FragmentAdsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAds
        adsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}