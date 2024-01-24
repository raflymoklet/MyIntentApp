package com.rafly.myintentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnMoveToPersonalData: Button = findViewById(R.id.btn_move_to_personal_data)
        btnMoveToPersonalData.setOnClickListener(this
        )
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(
                    this@MainActivity,
                    MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data ->{
                val moveWithDataIntent = Intent(this@MainActivity,
                    MoveWithDataActivity::class.java)

                moveWithDataIntent.putExtra(
                    MoveWithDataActivity.EXTRA_NAME,
                    "Muhammad Zacky Abdillah")

                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 18)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_dial_number ->{
                val phoneNumber = "+6289509480382"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            R.id.btn_move_to_personal_data -> {
                val moveToPersonalDataIntent = Intent(this@MainActivity,
                    MoveToPersonalData::class.java)

                moveToPersonalDataIntent.putExtra(
                    MoveToPersonalData.EXTRA_TITLE,
                    "BIODATA")
                moveToPersonalDataIntent.putExtra(
                    MoveToPersonalData.EXTRA_NAME,
                    "Muhammad Rafly Saputera")
                moveToPersonalDataIntent.putExtra(
                    MoveToPersonalData.EXTRA_AGE,
                    17)
                moveToPersonalDataIntent.putExtra(
                    MoveToPersonalData.EXTRA_ADDRESS,
                    "Bululawang Kab. Malang")
                moveToPersonalDataIntent.putExtra(
                    MoveToPersonalData.EXTRA_IDENTITY,
                    "XI RPL 3 (22)")

                startActivity(moveToPersonalDataIntent)
            }
        }
    }
}