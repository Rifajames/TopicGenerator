package com.example.topicgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val questions = intent.getParcelableExtra<Question>(CategoryQuestionActivity.INTENT_PARCELABLE)

        val questionsAsk = findViewById<TextView>(R.id.QuestionTxt)
        val questionNextBtn = findViewById<Button>(R.id.nextBtn)

        if(questions != null){
            questionsAsk.text = questions.questiontanya
        }

    }
}