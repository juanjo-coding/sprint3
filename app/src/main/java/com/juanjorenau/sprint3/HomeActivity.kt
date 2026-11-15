package com.juanjorenau.sprint3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.juanjorenau.sprint3.databinding.ActivityHomeBinding

// Principios y consideraciones aplicados:
// - Personalización: Botón con recurso XML <shape> (degradado, esquinas, borde y padding).
// - UI (CRAP): Contraste alto texto/fondo, Repetición de estilos, Alineación vertical y Proximidad título-subtítulo.
// - UX: Ley de Hick (una única acción clara), Ley de Fitts (botón grande y fácil de tocar) y Ley de Jakob.
// - Accesibilidad y buenas prácticas: Componentes estándar, contentDescription en imagen, accessibilityHeading en título,
//   zona táctil >= 48dp, textos en sp con wrap_content dentro de ScrollView, strings.xml y View Binding.

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAccion.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.toast_no_implementado),
                Toast.LENGTH_SHORT
            )
                .show()
        }
    }
}