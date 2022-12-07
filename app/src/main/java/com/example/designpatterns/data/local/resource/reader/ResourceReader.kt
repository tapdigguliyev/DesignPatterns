package com.example.designpatterns.data.local.resource.reader

import android.content.Context

interface ResourceReader {
    fun readStringFromResourceFile(context: Context, fileName: String): String?
}