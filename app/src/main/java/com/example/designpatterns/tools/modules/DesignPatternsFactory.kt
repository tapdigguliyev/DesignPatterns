package com.example.designpatterns.tools.modules

import com.example.designpatterns.tools.modules.behaviouraldp.BehaviouralDP
import com.example.designpatterns.tools.modules.common.PatternProvider
import com.example.designpatterns.tools.modules.common.Patterns
import com.example.designpatterns.tools.modules.creationaldp.CreationalDP
import com.example.designpatterns.tools.modules.structuraldp.StructuralDP

class DesignPatternsFactory {

    private val patternProviderList = mutableListOf<com.example.designpatterns.tools.modules.common.Patterns>(
        com.example.designpatterns.tools.modules.creationaldp.CreationalDP(),
        com.example.designpatterns.tools.modules.structuraldp.StructuralDP(),
        com.example.designpatterns.tools.modules.behaviouraldp.BehaviouralDP()
    )

    fun getPatterns(): MutableList<com.example.designpatterns.tools.modules.common.Patterns> {
        return patternProviderList
    }
}