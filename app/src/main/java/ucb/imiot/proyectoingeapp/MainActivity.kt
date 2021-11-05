package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var firstButton : Button
    private lateinit var secondButton : Button
    private lateinit var thirdButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton = findViewById(R.id.forms_button)
        secondButton = findViewById(R.id.conversor_button)
        thirdButton = findViewById(R.id.controls_button)

        firstButton.setOnClickListener{startActivity(Intent(this,FORMS::class.java))}
        secondButton.setOnClickListener{startActivity(Intent(this,CONVERTER::class.java))}
        thirdButton.setOnClickListener{startActivity(Intent(this,BLUETOOTH_CONTROLS::class.java))}

    }



}