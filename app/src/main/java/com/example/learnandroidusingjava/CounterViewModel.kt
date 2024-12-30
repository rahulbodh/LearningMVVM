package com.example.learnandroidusingjava

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    // This method no longer takes a View parameter
    fun incrementCounter() {
        counter.value = counter.value?.plus(1)
    }
}
