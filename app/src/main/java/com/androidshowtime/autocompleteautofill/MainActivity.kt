package com.androidshowtime.autocompleteautofill

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create an array for Phrases
        val currencies = arrayOf("USD", "KES", "UGX", "TZS", "GBP")

        //create arrayAdapter
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, currencies)

        //set the AutoComplete EditText to the Adapter
        autoCompleteTextView.setAdapter(adapter)

        //set character number to show prompts
        autoCompleteTextView.threshold = 1

        //adding facebook
        val facebook = "Facebook"



    }
}