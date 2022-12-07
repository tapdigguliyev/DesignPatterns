package com.example.designpatterns.feature.feature1.model

data class PatternInfo(
    val checkList: String,
    val discussion: String,
    val example: ExampleInfo,
    val id: Int,
    val intent: String,
    val problem: String,
    val rulesOfThumb: String,
    val structure: StructureInfo,
    val title: String
)