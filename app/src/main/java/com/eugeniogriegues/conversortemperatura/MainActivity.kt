package com.eugeniogriegues.conversortemperatura

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConvertir.setOnClickListener {

            if (input.text.isEmpty()) {

               Toast.makeText(this, resources.getString(R.string.inputVacio), Toast.LENGTH_LONG).show()

            }   else   {

                val inputValue = java.lang.Float.parseFloat(input.text.toString())

                if (celsius.isChecked) {



                    input.setText(convertirDeFarenheitACelsius(inputValue).toString())

                }

                if (fahrenheit.isChecked) {



                    input.setText(convertirDeCelsiusAFarenheit(inputValue).toString())

                }


            }



        }

    }
}

private fun convertirDeCelsiusAFarenheit (celsius: Float) : Float = ( celsius - 32 ) * 5 / 9



private fun convertirDeFarenheitACelsius (fahrenheit: Float) : Float  = ( fahrenheit * 9 / 5 ) + 32





