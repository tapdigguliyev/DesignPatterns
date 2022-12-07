package com.example.designpatterns.data.repository

import com.example.designpatterns.data.local.resource.models.DesignPatterns

interface PatternProvider {
    fun provideDesignPatterns(): DesignPatterns
}