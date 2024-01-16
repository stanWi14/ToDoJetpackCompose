package com.example.composecourse.data

import androidx.compose.ui.graphics.Color
import com.example.composecourse.ui.theme.HighPriorityColor
import com.example.composecourse.ui.theme.LowPriorityColor
import com.example.composecourse.ui.theme.MidPriorityColor
import com.example.composecourse.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MidPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}