package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_converter.*

class CONVERTER : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        velocity_button.setOnClickListener{startActivity(Intent(applicationContext,velocityConverter::class.java))}

        longitude_button.setOnClickListener{startActivity(Intent(applicationContext,time_converter::class.java))}

        mass_button.setOnClickListener{startActivity(Intent(applicationContext,massConverter::class.java))}

        time_button.setOnClickListener{startActivity(Intent(applicationContext,timeConverter::class.java))}

        degrees_button.setOnClickListener{startActivity(Intent(applicationContext,degreesConverter::class.java))}

    }

    }
