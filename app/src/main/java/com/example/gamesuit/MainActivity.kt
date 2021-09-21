package com.example.gamesuit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun paperButtonPressed(view: View){
        val opponentChoice = Random.nextInt(3)
        when(opponentChoice){
            0 -> whatTheyChose.text = "Com : paper"
            1 -> whatTheyChose.text = "Com : rock"
            2 -> whatTheyChose.text = "Com : scissors"
        }
        whatWeChose.text = "P1 : paper "

        when(opponentChoice){
            0 -> winLoseView.text = "DRAW"
            1 -> winLoseView.text = "Pemain 1 MENANG!"
            2 -> winLoseView.text = "Pemain 2 MENANG!"
        }

    }
    fun rockButtonPressed(view: View){
        val opponentChoice = Random.nextInt(3)
        when(opponentChoice){
            0 -> whatTheyChose.text = "Com : paper"
            1 -> whatTheyChose.text = "Com : rock"
            2 -> whatTheyChose.text = "Com : scissors"
        }
        whatWeChose.text = "P1 : rock "

        when(opponentChoice){
            0 -> winLoseView.text = "Pemain 2 MENANG!"
            1 -> winLoseView.text = "DRAW"
            2 -> winLoseView.text = "Pemain 1 MENANG!"
        }
    }
    fun scissorsButtonPressed(view: View){
        val opponentChoice = Random.nextInt(3)
        when(opponentChoice){
            0 -> whatTheyChose.text = "Com : paper"
            1 -> whatTheyChose.text = "Com : rock"
            2 -> whatTheyChose.text = "Com : scissors"
        }
        whatWeChose.text = "P1 : scissors "

        when(opponentChoice){
            0 -> winLoseView.text = "Pemain 1 MENANG!"
            1 -> winLoseView.text = "Pemain 2 MENANG!"
            2 -> winLoseView.text = "DRAW"
        }
    }

}