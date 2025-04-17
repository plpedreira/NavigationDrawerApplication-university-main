package com.example.navigationdrawerapplication.ui.about_us

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutUsViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "About Us"
    }
    val text: LiveData<String> = _text
}