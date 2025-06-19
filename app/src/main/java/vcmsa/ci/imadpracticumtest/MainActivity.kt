package vcmsa.ci.imadpracticumtest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    fun onCreate(savedInstanceState: Bundle?, java: Any, ViewListActivity: Class<*>) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val playlistButton = findViewById<Button>(R.id.playlistButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val exitButton = findViewById<Button>(R.id.exitButton)
        
        playlistButton.setOnClickListener { 
            val intent = Intent(this, AddItemActivity::class.java)
            startActivity(intent)
        }
        nextButton.setOnClickListener { 
            val intent = Intent(this,ViewListActivity::class.java)
            startActivity(intent)
        }
        exitButton.setOnClickListener {
            finish()
        }
        }

    class AddItemActivity {

    }
}

