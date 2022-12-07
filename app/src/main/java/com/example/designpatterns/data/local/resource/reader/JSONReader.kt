package com.example.designpatterns.data.local.resource.reader

import android.content.Context
import android.util.Log
import java.io.IOException

object JSONReader : ResourceReader {

    private val TAG = this::class.simpleName

    override fun readStringFromResourceFile(context: Context, fileName: String): String? {
        var jsonString: String? = null
        try {
            val inputStream = context.assets.open(fileName)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            jsonString = String(buffer)
        } catch (ex: IOException) {
            Log.e(TAG, "Error reading from $fileName", ex)
        }
        return jsonString
    }
}