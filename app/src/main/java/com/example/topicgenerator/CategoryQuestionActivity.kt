package com.example.topicgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CategoryQuestionActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val EXTRA_TEXT = "extra_text"
        val INTENT_PARCELABLE ="OBJECT_INTENT"
    }

    private lateinit var btnTech : Button
    private lateinit var btnFood : Button

    private lateinit var tvName : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_question)

        val QuestionList = listOf<Question>(
            Question(1,1,"Tech question 1"),
            Question(2,1,"Tech question 2"),
            Question(3,1,"Tech question 3"),
            Question(4,1,"Tech question 4"),
            Question(5,1,"Tech question 5"),
            Question(6,2,"Food question 1"),
            Question(7,2,"Food question 2"),
            Question(8,2,"Food question 3"),
            Question(9,2,"Food question 4"),
            Question(10,2,"Food question 5"),
        )

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = tvReceived

        tvName.text = text
//
//        val intent = Intent(this,QuestionActivity::class.java)
//        intent.putExtra("question list: ", QuestionList)
//        startActivity(intent)

        tvName = findViewById(R.id.nameTxt)
        btnTech = findViewById(R.id.techBtn)
        btnFood = findViewById(R.id.foodBtn2)

        btnTech.setOnClickListener(this)
        btnFood.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.techBtn ->{
                sendData()
            }
            R.id.foodBtn2 ->{
                sendData()
            }
        }
    }

    private fun sendData(){
        val intent = Intent(this,QuestionActivity::class.java)
        intent.putExtra("question list: ", QuestionList)
        startActivity(intent)

    }
}