package br.com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	fun segundaQuestao(view: View) {
		startActivity(Intent(applicationContext, Questao2::class.java))
	}

	fun errou(view: View) {
		startActivity(Intent(applicationContext, ActivityTriste::class.java))
	}

	override fun onBackPressed() {
		// não chame o super desse método
	}
}