package com.example.designpatterns.feature.feature1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.designpatterns.data.repository.PatternRepository

class SharedViewModelProviderFactory(private val patternRepository: PatternRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(PatternRepository::class.java).newInstance(patternRepository)
    }
}