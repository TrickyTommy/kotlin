package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var string: String
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.kata)
        textView = findViewById(R.id.hasil)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            string = editText.text.toString()
            string = string.replace("\\s+".toRegex(), "")
            val regex = Regex("[^\\w]")
            val result = regex.replace(string, "")

            print(result)

            if (isPalindromeString(result)) {
                textView.text = "$result is  a Palindrome String"
            } else {
                textView.text = "$result is not a Palindrome String"
//                println("$result is not a Palindrome String")
            }

        }
    }
}

