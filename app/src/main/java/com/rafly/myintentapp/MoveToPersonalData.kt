package com.rafly.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveToPersonalData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_to_personal_data)

        val tvPersonalData: TextView =
            findViewById(R.id.tv_personal_data)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val identity = intent.getStringExtra(EXTRA_IDENTITY)
        val address = intent.getStringExtra(EXTRA_ADDRESS)


        val text = """
            |$title
            |
            |Name: $name
            |Age: $age
            |Class: $identity
            |Address: $address
        """.trimMargin()
        tvPersonalData.text = text

    }
    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IDENTITY = "extra_identity"
        const val EXTRA_ADDRESS = "extra_address"
    }
}