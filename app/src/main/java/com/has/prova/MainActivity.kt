package com.has.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Signo calculado!", Toast.LENGTH_SHORT).show()
            achasigno()
        }
    }

    fun achasigno() {
        val diadoAniversario = findViewById<EditText>(R.id.dia)
        val mesdoAniversario = findViewById<EditText>(R.id.mes)
        val diaNascimento = diadoAniversario.text.toString().toInt()
        val numerodomes = mesdoAniversario.text.toString().toInt()

        val signo = when (numerodomes) {
            1 -> if (diaNascimento <= 20) "Capricórnio" else "Aquário"
            2 -> if (diaNascimento <= 19) "Aquário" else "Peixes"
            3 -> if (diaNascimento <= 20) "Peixes" else "Áries"
            4 -> if (diaNascimento <= 20) "Áries" else "Touro"
            5 -> if (diaNascimento <= 20) "Touro" else "Gêmeos"
            6 -> if (diaNascimento <= 20) "Gêmeos" else "Câncer"
            7 -> if (diaNascimento <= 21) "Câncer" else "Leão"
            8 -> if (diaNascimento <= 22) "Leão" else "Virgem"
            9 -> if (diaNascimento <= 22) "Virgem" else "Libra"
            10 -> if (diaNascimento <= 22) "Libra" else "Escorpião"
            11 -> if (diaNascimento <= 21) "Escorpião" else "Sagitário"
            12 -> if (diaNascimento <= 21) "Sagitário" else "Capricórnio"
            else -> "Mês inválido"
        }
        val img = when (signo) {
            "Capricórnio" ->   R.drawable.capricorn
            "Aquário" -> R.drawable.aquarius
            "Peixes" -> R.drawable.pisces
            "Áries" -> R.drawable.aries_2
            "Touro" -> R.drawable.taurus
            "Gêmeos" -> R.drawable.gemini
            "Câncer" -> R.drawable.cancer_2
            "Leão" -> R.drawable.leo
            "Virgem" -> R.drawable.virgo
            "Libra" -> R.drawable.libra_2
            "Escorpião" -> R.drawable.scorpio
            else -> R.drawable.sargittarius
        }
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(img)
    }
}