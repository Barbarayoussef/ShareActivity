package edu.temple.funwithintents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This view contains the text to share
        val editText = findViewById<EditText>(R.id.editTextText)

        // When the user clicks this button, share the text if not empty
        findViewById<ImageButton>(R.id.shareImageButton).setOnClickListener {
               val sharing= Intent(Intent.ACTION_VIEW).apply{
                    type="text/plain"
                   action=Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT,editText.text)

                }
            startActivity(Intent.createChooser(sharing,"Share"))
        }
    }
}