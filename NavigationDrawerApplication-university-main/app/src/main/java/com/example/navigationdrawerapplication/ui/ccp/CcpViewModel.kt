package com.example.navigationdrawerapplication.ui.ccp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CcpViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ciência da Computação"
    }
    val text: LiveData<String> = _text
}