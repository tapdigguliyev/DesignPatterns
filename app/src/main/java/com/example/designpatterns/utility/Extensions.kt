package com.example.designpatterns.utility

import com.example.designpatterns.data.local.resource.models.*
import com.example.designpatterns.feature.feature1.model.*

fun DesignPatterns.toDP() : DP {
    val patternProviderList = patternTypes.map {
        it.toPatternProvider()
    }

    return DP(
        patternProviders = patternProviderList,
        title = title
    )
}

fun Pattern.toPatternInfo() =
    PatternInfo(
        checkList = checkList,
        discussion = discussion,
        example = example.toExampleInfo(),
        id = id,
        intent = intent,
        problem = problem,
        rulesOfThumb = rulesOfThumb,
        structure = structure.toStructureInfo(),
        title = title
    )

fun Structure.toStructureInfo() =
    StructureInfo(
        image = image,
        text = text
    )

fun Example.toExampleInfo() =
    ExampleInfo(
        image = image,
        text = text
    )

fun PatternType.toPatternProvider() : PatternProvider {
    val patternInfoList = patterns.map {
        it.toPatternInfo()
    }

    return PatternProvider(
        icon = icon,
        id = id,
        patterns = patternInfoList,
        title = title
    )
}