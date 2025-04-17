package com.example.navigationdrawerapplication.ui.ccp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navigationdrawerapplication.databinding.FragmentCcpBinding

class CcpFragment: Fragment() {
    private var _binding: FragmentCcpBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ccpViewModel =
            ViewModelProvider(this).get(CcpViewModel::class.java)

        _binding = FragmentCcpBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCcp
        ccpViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}