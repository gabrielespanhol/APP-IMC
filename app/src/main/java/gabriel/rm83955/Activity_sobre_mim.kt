package gabriel.rm83955

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import gabriel.rm83955.databinding.ActivitySobreMimBinding

class Activity_sobre_mim : AppCompatActivity() {

    private lateinit var binding: ActivitySobreMimBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySobreMimBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            btVoltarSobre.setOnClickListener(){
                val intent = Intent(
                    this@Activity_sobre_mim,
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