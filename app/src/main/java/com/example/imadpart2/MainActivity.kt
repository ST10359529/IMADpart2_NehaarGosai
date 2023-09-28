package com.example.imadpart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    var buttonAdd = findViewById<Button>(R.id.buttonAdd)

    var textResult = findViewById<TextView>(R.id.textResult)

    var textViewError = findViewById<TextView>(R.id.textViewError)

    var editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)

    var editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)

    var buttonSub = findViewById<Button>(R.id.buttonSub)

    var buttonMulti = findViewById<Button>(R.id.buttonMulti)

    var buttonDiv = findViewById<Button>(R.id.buttonDiv)

    var buttonRoot = findViewById<Button>(R.id.buttonRoot)

    var buttonPower = findViewById<Button>(R.id.buttonPower)

    buttonAdd.setOnClickListener {

        val Num1 = editTextNumber1.text.toString().toInt()
        val Num2 = editTextNumber2.text.toString().toInt()

        val Answer = Num1 + Num2

        val Result = "$Num1 + $Num2 = $Answer"
        textResult.text = Result
    }


    buttonSub.setOnClickListener {

        //create and initialize variables
        val Num1 = editTextNumber1.text.toString().toInt()
        val Num2 = editTextNumber2.text.toString().toInt()

        //create and initialize a variable
        //subtract the two numbers entered from each other
        val Answer = Num1 - Num2

        //create and initialize a variable
        //create a string that contains the entire equation with the numbers entered and the answer
        val Result = "$Num1 - $Num2 = $Answer"

        //display the equation
        textResult.text = Result
    }

    //
    buttonMulti.setOnClickListener {

        //create and initialize variables
        val Num1 = editTextNumber1.text.toString().toInt()
        val Num2 = editTextNumber2.text.toString().toInt()

        //create and initialize a variable
        //multiply the two numbers entered with each other
        val Answer = Num1 * Num2

        //create and initialize a variable
        //create a string that contains the entire equation with the numbers entered and the answer
        val Result = "$Num1 x $Num2 = $Answer"

        //display the equation
        textResult.text = Result
    }

    buttonDiv.setOnClickListener {

        val Num1 = editTextNumber1.text.toString().toDouble()
        val Num2 = editTextNumber2.text.toString().toDouble()

        if (Num2 == 0.0) {
            textViewError.text = "Undefinded"
        }else{
            val Answer = Num1/ Num2
            textResult.text= "$Num1 / $Num2 = $Answer"


        }
    }

    buttonRoot.setOnClickListener {
        val Num1 = editTextNumber1.text.toString().toDouble()
        val Result = Math.sqrt(Num1)

        if (Num1 < 0) {
            val Result = Math.sqrt(Math.abs(Num1))
            textResult.text = "sqrt($Num1) = ${Result}i"
        } else {
            val Result = Math.sqrt(Num1)
            textResult.text = "sqrt($Num1) = $Result"
        }
    }

    buttonPower.setOnClickListener {
        val num1=editTextNumber1.text.toString().toDouble()
        val num2=editTextNumber2.text.toString().toDouble()
        val sum = Math.pow(num1, num2)
        textResult.text= "" + num1 + "^" + num2 + "=" + sum
    }
}
}







