package com.wordsinmovies.api

import java.io.InputStream
import java.util.*

class SubProcessor {

    companion object {
        fun getWordCount(inputStream: InputStream) {
            val scanner = Scanner(inputStream, Charsets.UTF_8)
            while (scanner.hasNextLine()) {
                val line = scanner.nextLine()
                println(line)
            }
        }
    }

}