package com.example.eigeneprojekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnmultiply: Button
    private lateinit var btnDivision: Button
    private lateinit var etA: EditText
    private lateinit var etB: EditText
    private lateinit var resultTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btn_add)
        btnSub=findViewById(R.id.btn_substraction)
        btnmultiply=findViewById(R.id.btn_multiplication)
        btnDivision=findViewById(R.id.btn_division)
        etA=findViewById(R.id.et_a)
        etB=findViewById(R.id.et_b)
        resultTV=findViewById(R.id.result_Tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnmultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        var a=etA.text.toString().toDouble()
        var b=etB.text.toString().toDouble()
        var result=0.0
        when(v?.id){
            R.id.btn_add->{
                result=a+b
            }
            R.id.btn_substraction->{
                result=a-b
            }
            R.id.btn_multiplication->{
                result=a*b
            }
            R.id.btn_division->{
                result=a/b
            }

        }
        resultTV.text="Result ist $result"
    }
}