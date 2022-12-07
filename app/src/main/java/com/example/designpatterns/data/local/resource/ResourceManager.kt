package com.example.designpatterns.data.local.resource

import android.content.Context
import com.example.designpatterns.data.local.resource.models.DesignPatterns
import com.example.designpatterns.data.local.resource.reader.JSONReader
import com.example.designpatterns.utility.FileName.RESOURCE_NAME
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ResourceManager(val context: Context) {

    private val gson = Gson()
    private val jsonString = JSONReader.readStringFromResourceFile(context, RESOURCE_NAME)

    fun loadPatterns(): DesignPatterns {
        val type = object : TypeToken<DesignPatterns>() {}.type
        return gson.fromJson(jsonString, type)
    }
}