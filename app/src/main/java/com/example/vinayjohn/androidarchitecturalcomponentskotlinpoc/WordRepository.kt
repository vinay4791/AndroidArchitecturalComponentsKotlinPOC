package com.example.vinayjohn.androidarchitecturalcomponentskotlinpoc

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

/**
 * Created by vinayjohn on 30/03/19.
 */
class WordRepository(private val wordDao: WordDao) {

    val allWords : LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}