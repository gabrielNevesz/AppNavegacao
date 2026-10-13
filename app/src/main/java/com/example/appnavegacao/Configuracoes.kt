
package com.example.appnavegacao

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Configuracoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracoes)

        val voltar = findViewById<Button>(R.id.btnVoltarConfig)

        voltar.setOnClickListener {
            finish()
        }
    }
}
