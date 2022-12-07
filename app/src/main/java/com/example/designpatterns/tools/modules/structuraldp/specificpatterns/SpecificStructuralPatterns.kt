package com.example.designpatterns.tools.modules.structuraldp.specificpatterns

class SpecificStructuralPatterns {
    val patterns: MutableList<com.example.designpatterns.tools.modules.common.SpecificPattern> = mutableListOf()

    private val adapter =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.patterns.Adapter()
    private val bridge =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.patterns.Bridge()
    private val composite =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.patterns.Composite()
    private val decorator =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.patterns.Decorator()
    private val facade =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.patterns.Facade()
    private val flyweight =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.patterns.Flyweight()
    private val proxy =
        com.example.designpatterns.tools.modules.structuraldp.specificpatterns.patterns.Proxy()

    init {
        addToPatterns()
    }

    private fun addToPatterns() {
        patterns.add(adapter)
        patterns.add(bridge)
        patterns.add(composite)
        patterns.add(decorator)
        patterns.add(facade)
        patterns.add(flyweight)
        patterns.add(proxy)
    }
}