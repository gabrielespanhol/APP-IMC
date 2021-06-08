package gabriel.rm83955

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import gabriel.rm83955.databinding.ActivityEntradaBinding

class Activity_entrada : AppCompatActivity() {

    private lateinit var binding: ActivityEntradaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("lifecycle", "onCreate - Calculo")



        with(binding) {
            btCalcular.setOnClickListener() {

                val mySnackbar = Snackbar.make(btCalcular, R.string.Preencher, 1000)

                var pesod = tieRegisterPeso.text.toString()
                var alturad = tieRegisterAltura.text.toString()

                if (pesod.isEmpty() || alturad.isEmpty()) {
                    mySnackbar.show()
                } else {

                    var imcd = pesod.toDouble().div(alturad.toDouble().times(alturad.toDouble()))

                    var peso = pesod.toString()
                    var altura = alturad.toString()
                    var imc = String.format("%.1f", imcd)

                    val intent = Intent(
                        this@Activity_entrada,
                        Activity_mostra_dados::class.java

                    )

                    intent.putExtra("peso", peso)
                    intent.putExtra("altura", altura)
                    intent.putExtra("imc", imc)

                    startActivity(
                        intent
                    )


                }

            }

            btSobre.setOnClickListener() {
                val intent = Intent(
                    this@Activity_entrada,
                    Activity_sobre_mim::class.java

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
