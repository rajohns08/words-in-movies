package com.wordsinmovies.api

import org.junit.Assert
import org.junit.Test

class SubProcessorTest {

    @Test
    fun getWordCount_returns4_forGodzillaBeginning() {
        val inputStream = javaClass.getResourceAsStream("godzilla_kong_2021_beginning.srt")!!
        val wordCount = SubProcessor.getWordCount(inputStream)

        Assert.assertEquals(4, wordCount)
    }

    // test for counting words with accented characters like café
    // test for counting digits like '23' as a word
    // test for not counting <i> or other markup codes
    // test for not counting exclamation

}