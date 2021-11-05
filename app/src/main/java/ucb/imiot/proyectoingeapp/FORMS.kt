package ucb.imiot.proyectoingeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FORMS : AppCompatActivity() {

    lateinit var fisicaBtn:Button
    lateinit var mateBtn:Button
    lateinit var calculoBtn:Button
    lateinit var cppBtn:Button
    lateinit var pythonBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        fisicaBtn = findViewById(R.id.fisica_button)
        fisicaBtn.setOnClickListener{startActivity(Intent(applicationContext,physicsForms::class.java))}

        mateBtn = findViewById(R.id.matematicas_button)
        mateBtn.setOnClickListener{startActivity(Intent(applicationContext,mathForms::class.java))}

        calculoBtn = findViewById(R.id.calculo_button)
        calculoBtn.setOnClickListener{startActivity(Intent(applicationContext,calculusForms::class.java))}

        cppBtn = findViewById(R.id.cpp_button)
        cppBtn.setOnClickListener{startActivity(Intent(applicationContext,cppForms::class.java))}

        pythonBtn = findViewById(R.id.python_button)
        pythonBtn.setOnClickListener{startActivity(Intent(applicationContext,pythonForms::class.java))}

    }
}