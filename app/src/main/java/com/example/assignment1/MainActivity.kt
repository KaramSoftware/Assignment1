package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultTV: TextView = findViewById(R.id.textResult)
        val button: Button = findViewById(R.id.btResult)

        var flag : String = "pizza"
        val spinnerVal : Spinner = findViewById(R.id.foodSelect)
        var options = arrayOf("Hamburger","Pizza","Shawrma",)
        button.setOnClickListener{ view ->
            //code here

            if(flag =="Hamburger")
                resultTV.text = Hamburger().toString();
            else if(flag=="Pizza")
                resultTV.text = Pizza().toString();
            else
                resultTV.text = Shawrma().toString();
        }

        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
}
}
public fun Hamburger(): String {
    return "Hamburger"
}
public fun Pizza(): String {
    return "Pizza"
}
public fun Shawrma(): String {
    return "Shawrma"
}
