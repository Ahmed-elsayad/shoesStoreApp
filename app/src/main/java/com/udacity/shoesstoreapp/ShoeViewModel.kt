package com.udacity.shoesstoreapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoesstoreapp.models.Shoe

class ShoeViewModel : ViewModel(){

    private val _shoesList = MutableLiveData<List<Shoe>>()

    val shoeItem = Shoe("adidas","44","adidas","good shoe")

    val shoesList: LiveData<List<Shoe>> get() = _shoesList
    init {
    }

    fun addShoe(){
        val list = _shoesList.value?.toMutableList() ?: mutableListOf()

        list.add(shoeItem.copy())
        _shoesList.value = list

    }

}