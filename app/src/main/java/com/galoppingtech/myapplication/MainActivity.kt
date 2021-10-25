package com.galoppingtech.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.galoppingtech.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
         binding.btnOrder.setOnClickListener(){
             val size = binding.rgSize.checkedRadioButtonId

             //
             val s = findViewById<RadioButton>(size).text
             //
             val  cheese = binding.cbCheese.isChecked
             val chicken = binding.cbChicken.isChecked
             val beef = binding.cbBeef.isChecked
             val all = binding.cbAll.isChecked
             val toppings = "with"+
                     (if (cheese )"\n Cheese Toppings" else "")+
                     (if (chicken )"\n Chicken Toppings" else "")+
                     (if (beef)"\n Beef Toppings" else "")+
                     (if (all)"\n Cheese, Chicken and Beef Toppings" else "")


             binding.tvResult.text= "You have ordered $s Pizza $toppings"


         }

    }
}