package io.rifat.code.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.rifat.code.diceroller.databinding.ActivityMainBinding
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
        val diceDrawable = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        mBinding.imageViewResult.setImageResource(diceDrawable)
    }
}