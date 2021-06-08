package gabriel.rm83955

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import gabriel.rm83955.databinding.ActivityMostraDadosBinding

class Activity_mostra_dados : AppCompatActivity() {

    private lateinit var binding: ActivityMostraDadosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMostraDadosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val peso = intent.getStringExtra("peso")
        val altura = intent.getStringExtra("altura")
        val imc = intent.getStringExtra("imc")

        with(binding){

            tilMostraPeso.text = "Peso: $peso"
            tilMostraAltura.text = "Altura: $altura"
            tilMostraMostraIMC.text = "IMC: $imc"

            btVoltar.setOnClickListener(){
                val intent = Intent(
                    this@Activity_mostra_dados,
                    Activity_entrada::class.java
                )
                startActivity(
                    intent
                )
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart - Register")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume - Register")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause - Register")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop - Register")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy - Register")
    }

    companion object {
        const val KEY_INTENT_USER = "user"
    }
}