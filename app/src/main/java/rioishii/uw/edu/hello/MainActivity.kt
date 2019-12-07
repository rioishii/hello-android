package rioishii.uw.edu.hello

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Toast

import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val messages = this@MainActivity.resources.getStringArray(R.array.greetings)
            val text = messages[Random().nextInt(messages.size)]
            val context = applicationContext
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(context, text, duration)
            toast.show()
        }
    }

}
