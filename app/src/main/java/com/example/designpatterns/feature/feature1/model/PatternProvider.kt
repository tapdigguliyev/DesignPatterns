package com.example.designpatterns.feature.feature1.model

data class PatternProvider(
    val icon: String,
    val id: Int,
    val patterns: List<PatternInfo>,
    val title: String
)