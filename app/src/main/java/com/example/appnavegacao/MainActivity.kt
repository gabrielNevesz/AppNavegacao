package com.example.appnavegacao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val perfil = findViewById<Button>(R.id.btnPerfil);
        val jogos = findViewById<Button>(R.id.btnJogos);
        val configuracoes = findViewById<Button>(R.id.btnConfig);
        val sobre = findViewById<Button>(R.id.btnSobre);

        perfil.setOnClickListener {
            val intent = Intent(this, Perfil::class.java);
            startActivity(intent);
        }

        jogos.setOnClickListener {
            val intent = Intent(this, Jogos::class.java)
        }
    }
}