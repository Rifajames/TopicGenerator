package com.example.topicgenerator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etName : EditText
    private lateinit var btnStart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnStart = findViewById(R.id.btn_start)
        etName = findViewById(R.id.et_name)

        btnStart.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_start -> {
                if(etName.text.isEmpty()){
                    Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
                }else{
                    saveData()
                }
            }
            R.id.techBtn ->{

            }
            R.id.foodBtn2 ->{

            }
        }
    }

    private fun saveData(){
        val name = etName.text.toString().trim()

        val intentData = Intent(this@MainActivity, CategoryQuestionActivity::class.java)
        intentData.putExtra(CategoryQuestionActivity.EXTRA_TEXT, name)
        startActivity(intentData)
    }
}

