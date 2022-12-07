package com.example.designpatterns.tools.modules.creationaldp

import com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.SpecificBehaviouralPatterns
import com.example.designpatterns.tools.modules.common.PatternProvider
import com.example.designpatterns.tools.modules.common.SpecificPattern

class  CreationalDP : com.example.designpatterns.tools.modules.common.PatternProvider {
    private val specificCreationalPatterns =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.SpecificBehaviouralPatterns()

    override fun getName(): String? {
        return this::class.simpleName
    }

    override fun providePatterns(): List<com.example.designpatterns.tools.modules.common.SpecificPattern> {
        return specificCreationalPatterns.patterns
    }

    override fun providePattern(index: Int): com.example.designpatterns.tools.modules.common.SpecificPattern {
        return specificCreationalPatterns.patterns[index]
    }
}