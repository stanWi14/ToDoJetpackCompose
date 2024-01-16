package com.example.composecourse.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.composecourse.data.Constant.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
) {
}