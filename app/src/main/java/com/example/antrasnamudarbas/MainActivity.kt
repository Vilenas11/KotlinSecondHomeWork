package com.example.antrasnamudarbas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    val Tag = "MyTag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fuelPriceEditText : EditText = findViewById(R.id.fuelPriceEditText)
        val nameEditText : TextView = findViewById(R.id.nameEditText)
        val numberOfLettersTextView : TextView = findViewById(R.id.numberOfLettersTextView)
        val fuelPriceTextView : TextView = findViewById(R.id.fuelPriceTextView)
        val sumTextView : TextView = findViewById(R.id.sumTextView)
        val isSumPositiveTextView : TextView = findViewById(R.id.isSumPositiveTextView)
        val firstLetterTextView : TextView = findViewById(R.id.firstLetterTextView)
        val subtractTextView : TextView = findViewById(R.id.subtractTextView)
        val isStillPositiveTextView : TextView = findViewById(R.id.isStillPositiveTextView)
        val letterIdPositiveTextView : TextView = findViewById(R.id.letterIdPositiveTextView)
        val okButton : Button = findViewById(R.id.okButton)
        okButton.setOnClickListener{
            var fuelPriceValue : Double  = fuelPriceEditText.text.toString().toDouble()
            var nameVariable : String  = nameEditText.text.toString()
            var nameLength : Int  = nameVariable.length
            //Log.i(Tag, "fuel price: $fuelPriceValue, the name: $nameVariable, name length: $nameLength")

            //The length of the Name
            numberOfLettersTextView.text = "The name contains $nameLength symbols"

            //Show the fuel price
            fuelPriceTextView.text = "Fuel price is $fuelPriceValue"

            //Show the sum of the addition
            sumTextView.text = "Sum of symbols and fuel price is ${(nameLength + fuelPriceValue).toDouble()}"

            //Is the sum positive??
            val positiveOrNot : Boolean = (nameLength + fuelPriceValue).toDouble() > 0
            isSumPositiveTextView.text = "Is sum Positive? $positiveOrNot"

            //First letter of the name
            firstLetterTextView.text = "First letter of the name is: ${nameVariable[0]}"

            //Subtraction
            subtractTextView.text = "Result of subtraction: ${(nameLength - fuelPriceValue).toDouble() }"

            //Is the subtraction positive?
            val stillPositive : Boolean = (nameLength - fuelPriceValue).toDouble() > 0
            isStillPositiveTextView.text = "Is sum still positive???: $stillPositive"

            // First letter ID
            letterIdPositiveTextView.text = "The id of ${nameVariable[0]} is ${nameVariable[0].code}"
        }
    }
}