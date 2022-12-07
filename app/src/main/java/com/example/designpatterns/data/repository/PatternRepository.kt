package com.example.designpatterns.data.repository

import android.content.Context
import com.example.designpatterns.data.local.resource.ResourceManager
import com.example.designpatterns.data.local.resource.models.DesignPatterns

class PatternRepository(context: Context) : PatternProvider {

    private val resourceManager: ResourceManager by lazy { ResourceManager(context) }

    override fun provideDesignPatterns(): DesignPatterns {
        return resourceManager.loadPatterns()
    }
}