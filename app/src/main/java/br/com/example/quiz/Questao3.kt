package br.com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Questao3 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_questao3)
	}

	fun errou3(view: View) {
		startActivity(Intent(applicationContext, ActivityTriste::class.java))
	}

	fun quartaQuestao(view: View) {
		startActivity(Intent(applicationContext, Questao4::class.java))
	}

	override fun onBackPressed() {
		// não chame o super desse método
	}
}