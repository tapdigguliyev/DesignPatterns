package com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns

class SpecificBehaviouralPatterns {
    val patterns: MutableList<com.example.designpatterns.tools.modules.common.SpecificPattern> = mutableListOf()

    private val chainOfResponsibility =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.ChainOfResponsibility()
    private val command =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Command()
    private val interpreter =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Interpreter()
    private val iterator =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Iterator()
    private val mediator =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Mediator()
    private val memento =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Memento()
    private val observer =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Observer()
    private val state =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.State()
    private val strategy =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Strategy()
    private val templateMethod =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.TemplateMethod()
    private val visitor =
        com.example.designpatterns.tools.modules.behaviouraldp.specificpatterns.patterns.Visitor()

    init {
        addToPatterns()
    }

    private fun addToPatterns() {
        patterns.add(chainOfResponsibility)
        patterns.add(command)
        patterns.add(interpreter)
        patterns.add(iterator)
        patterns.add(mediator)
        patterns.add(memento)
        patterns.add(observer)
        patterns.add(state)
        patterns.add(strategy)
        patterns.add(templateMethod)
        patterns.add(visitor)
    }
}