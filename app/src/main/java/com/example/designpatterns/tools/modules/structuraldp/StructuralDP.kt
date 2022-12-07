package com.example.designpatterns.tools.modules.structuraldp

import com.example.designpatterns.tools.modules.common.PatternProvider
import com.example.designpatterns.tools.modules.common.SpecificPattern
import com.example.designpatterns.tools.modules.structuraldp.specificpatterns.SpecificStructuralPatterns

class StructuralDP : com.example.designpatterns.tools.modules.common.PatternProvider {
    private val specificStructuralPatterns =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.SpecificStructuralPatterns()

    override fun getName(): String? {
        return this::class.simpleName
    }

    override fun providePatterns(): List<com.example.designpatterns.tools.modules.common.SpecificPattern> {
        return specificStructuralPatterns.patterns
    }

    override fun providePattern(index: Int): com.example.designpatterns.tools.modules.common.SpecificPattern {
        return specificStructuralPatterns.patterns[index]
    }
}