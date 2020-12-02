package com.tokbox.test.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tokbox.test.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(this.layoutInflater)
        setContentView(mBinding.root)

        mBinding.buttonRoll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        mBinding.textViewResult.text = (Random().nextInt(6) + 1).toString()
    }
}