package com.example.navigationdrawerapplication.ui.ads

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AdsViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Análise e Desenvolvimento de Sistemas"
    }
    val text: LiveData<String> = _text
}