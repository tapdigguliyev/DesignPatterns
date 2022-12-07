package com.example.designpatterns.data.local.resource.models

data class PatternType(
    val icon: String,
    val id: Int,
    val patterns: List<Pattern>,
    val title: String
)