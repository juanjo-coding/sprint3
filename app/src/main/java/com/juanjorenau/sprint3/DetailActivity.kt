package com.juanjorenau.sprint3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.juanjorenau.sprint3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.miCard.titulo = getString(R.string.detail_titulo_card)
        binding.miCard.subtitulo = getString(R.string.detail_subtitulo_card)
        binding.miCard.descripcion = getString(R.string.detail_descripcion_card)
        binding.miCard.textoBoton = getString(R.string.detail_boton_card)

        binding.miCard.setImagen(
            R.drawable.perro_ibai,
            getString(R.string.card_imagen_desc)
        )

        binding.miCard.setOnAccionClickListener {
            Toast.makeText(
                this,
                getString(R.string.detail_toast_card),
                Toast.LENGTH_SHORT
            )
                .show()
        }
    }
}