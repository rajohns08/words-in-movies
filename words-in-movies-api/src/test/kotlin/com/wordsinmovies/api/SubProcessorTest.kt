package com.wordsinmovies.api

import org.junit.Test

class SubProcessorTest {

    @Test
    fun getWordCount_acceptsInputStreamParameter() {
        val inputStream = javaClass.getResourceAsStream("godzilla_kong_2021.srt")!!
        SubProcessor.getWordCount(inputStream)
    }

}