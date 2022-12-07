package com.example.designpatterns.tools.modules.common

interface PatternProvider : com.example.designpatterns.tools.modules.common.Patterns {
    fun providePatterns() : List<com.example.designpatterns.tools.modules.common.SpecificPattern>
    fun providePattern(index: Int): com.example.designpatterns.tools.modules.common.SpecificPattern
}