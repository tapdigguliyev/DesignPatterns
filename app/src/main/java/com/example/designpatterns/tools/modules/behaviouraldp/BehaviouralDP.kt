package com.example.designpatterns.tools.modules.behaviouraldp

import com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.SpecificBehaviouralPatterns
import com.example.designpatterns.tools.modules.common.PatternProvider
import com.example.designpatterns.tools.modules.common.SpecificPattern

class BehaviouralDP : com.example.designpatterns.tools.modules.common.PatternProvider {
    private val specificBehaviouralPatterns =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.SpecificBehaviouralPatterns()

    override fun getName(): String? {
        return this::class.simpleName
    }

    override fun providePatterns(): List<com.example.designpatterns.tools.modules.common.SpecificPattern> {
        return specificBehaviouralPatterns.patterns
    }

    override fun providePattern(index: Int): com.example.designpatterns.tools.modules.common.SpecificPattern {
        return specificBehaviouralPatterns.patterns[index]
    }
}