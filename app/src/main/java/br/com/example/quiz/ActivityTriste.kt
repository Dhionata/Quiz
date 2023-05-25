package br.com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityTriste : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_fullscreen_triste)
	}

	fun tryAgain(view: View) {
		startActivity(Intent(applicationContext, MainActivity::class.java))
		//Toast.makeText(applicationContext, "Bom, vamos conversar mais?", Toast.LENGTH_LONG).show()
	}

	override fun onBackPressed() {
		// não chame o super desse método
	}
}