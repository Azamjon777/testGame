package com.example.testgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var javob = 0
    var random1 = 0
    var random2 = 0
    var random3 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       random()

        button.setOnClickListener {
            if (radioButton.isChecked){

                if (radioButton.text.toString().toInt() == javob) {
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }
            if (radioButton2.isChecked) {
                if (radioButton2.text.toString().toInt() == javob) {
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }
            if (radioButton3.isChecked) {
                if (radioButton3.text.toString().toInt() == javob) {
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }
            if (radioButton4.isChecked) {
                if (radioButton4.text.toString().toInt() == javob) {
                    Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
                }
            }
            random()
        }

    }
    private fun random() {
        var number1 = Random().nextInt(20)
        var number2 = Random().nextInt(20)
        var amal = Random().nextInt(4)
        when (amal) {
            0 -> {
                tv1.text = "$number1 + $number2 = "
                javob = number1+number2
            }
            1 -> {
                tv1.text = "$number1 - $number2 = "
                javob = number1-number2
            }
            2 -> {
                tv1.text = "$number1 * $number2 = "
                javob = number1*number2
            }
            3 -> {
                try {
                    if (number1/number2!=0) throw Exception()
                        tv1.text = "$number1 / $number2 = "
                        javob = number1/number2


                }
                catch (e:Exception) {
                    random()
                }
            }
        }
        radEkran()
    }
    fun randomAniqla() {
        random1 = Random().nextInt(20)
        random2 = Random().nextInt(20)
        random3 = Random().nextInt(20)

        if (random1 == random2 || random2 == random3 || random1 == random3) {
            randomAniqla()
        }
    }
        fun radEkran () {
            var tj = Random().nextInt(4)
            randomAniqla()
            when (tj) {
                0->{
                    radioButton.text = javob.toString()
                    radioButton2.text = random1.toString()
                    radioButton3.text = random2.toString()
                    radioButton4.text = random3.toString()
                }
                1->{
                    radioButton2.text = javob.toString()
                    radioButton.text = random1.toString()
                    radioButton3.text = random2.toString()
                    radioButton4.text = random3.toString()
                }
                2->{
                    radioButton3.text = javob.toString()
                    radioButton2.text = random1.toString()
                    radioButton.text = random2.toString()
                    radioButton4.text = random3.toString()
                }
                3->{
                    radioButton4.text = javob.toString()
                    radioButton2.text = random1.toString()
                    radioButton3.text = random2.toString()
                    radioButton.text = random3.toString()
                }
            }
        }
}