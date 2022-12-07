package com.example.designpatterns.tools.modules.creationaldp.specificpatterns

class SpecificCreationalPatterns {
    val patterns: MutableList<com.example.designpatterns.tools.modules.common.SpecificPattern> = mutableListOf()

    private val abstractFactory =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.ChainOfResponsibility()
    private val builder: com.example.designpatterns.tools.modules.creationaldp.specificpatterns.patterns.Builder =
        com.example.designpatterns.tools.modules.creationaldp.specificpatterns.patterns.Builder()
    private val factoryMethod =
        com.example.designpatterns.tools.modules.creationaldp.specificpatterns.patterns.FactoryMethod()
    private val prototype =
        com.example.designpatterns.tools.modules.creationaldp.specificpatterns.patterns.Prototype()
    private val singleton: com.example.designpatterns.tools.modules.creationaldp.specificpatterns.patterns.Singleton =
        com.example.designpatterns.tools.modules.creationaldp.specificpatterns.patterns.Singleton()

    init {
        addToPatterns()
    }

    private fun addToPatterns() {
        patterns.add(abstractFactory)
        patterns.add(builder)
        patterns.add(factoryMethod)
        patterns.add(prototype)
        patterns.add(singleton)
    }
}