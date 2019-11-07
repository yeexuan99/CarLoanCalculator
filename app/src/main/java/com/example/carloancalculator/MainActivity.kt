package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.*
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.buttonCalculate).setOnClickListener {
            calll(it)
        }


    }

    private fun calll(view: View) {
        var carText = findViewById<EditText>(R.id.editTextCarPrice).text.toString()
        var downText = findViewById<EditText>(R.id.editTextDownPayment).text.toString()
        var loanText = findViewById<EditText>(R.id.editTextLoanPeriod).text.toString()
        var interestText = findViewById<EditText>(R.id.editTextInterestRate).text.toString()

        var loan = carText.toDouble() - downText.toDouble()
        var interest = loan * loanText.toDouble() * interestText.toDouble()
        var monthly = (loan + interest) / loanText.toDouble() / 12
        textViewLoan.text = "%.2f".format(loan)
        textViewInterest.text = "%.2f".format(interest)
        textViewMonthlyRepayment.text = "%.2f".format(monthly)
    }

}
