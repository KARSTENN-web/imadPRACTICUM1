package vcmsa.ci.imadpracticumtest

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.ci.imadpracticumtest.R.*

class screen2<Intent> : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_screen2)

        val songTitle = findViewById<EditText>(id.songTitle)
        val artistName = findViewById<EditText>(id.artistName)
        val ratingText = findViewById<EditText>(id.ratingText)
        val commentsText = findViewById<EditText>(id.commentsText)

        val displayText = findViewById<TextView>(R.id.displayText)
        val displayButton = findViewById<Button>(R.id.main)
        val returnButton = findViewById<Button>(R.id.returnButton)

        returnButton.setOnClickListener {
          intent = overrideActivityTransition(intent)

        }
        }

    private fun overrideActivityTransition(intent: android.content.Intent?): android.content.Intent? {
        TODO("Not yet implemented")
    }

    private fun overrideActivityTransition(): android.content.Intent? {

        return TODO("Provide the return value")
    }
}
