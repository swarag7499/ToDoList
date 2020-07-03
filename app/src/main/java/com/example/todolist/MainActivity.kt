package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ViewSwitcher

class MainActivity : AppCompatActivity() {

    private var editText: EditText ?= null
    private var button: Button ?= null
    private var textView: TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText=findViewById<EditText>(R.id.editText)
        button=findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text= ""
        textView?.movementMethod=ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {

                textView?.append(editText?.text)
                textView?.append(("\n\n"))


            }
        })

    }
}