package com.example.designpatterns.feature.feature1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.designpatterns.data.repository.PatternRepository
import com.example.designpatterns.feature.feature1.model.PatternInfo
import com.example.designpatterns.feature.feature1.model.PatternProvider
import com.example.designpatterns.utility.toDP
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(patternRepository: PatternRepository) : ViewModel() {
    private val designPatterns = patternRepository.provideDesignPatterns().toDP()

    val title = designPatterns.title
    val patterns = mutableListOf<PatternInfo>()
    var pattern: PatternInfo? = null
    var patternProvider: PatternProvider? = null

    val patternProviders = designPatterns.patternProviders.toMutableList()
}