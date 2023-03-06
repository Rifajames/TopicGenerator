package com.example.topicgenerator

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Question(
    val questionId: Int,
    val questionType: Int,
    val questiontanya: String?
) : Parcelable
