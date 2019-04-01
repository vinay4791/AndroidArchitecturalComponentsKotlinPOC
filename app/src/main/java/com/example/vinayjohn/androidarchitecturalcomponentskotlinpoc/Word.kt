package com.example.vinayjohn.androidarchitecturalcomponentskotlinpoc

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*

/**
 * Created by vinayjohn on 30/03/19.
 */

@Entity(tableName = "word_table")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)

@Dao
interface WordDao {
    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>
}



