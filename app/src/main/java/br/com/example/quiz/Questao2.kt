package br.com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Questao2 : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_questao2)
	}

	fun errou2(view: View) {
		startActivity(Intent(applicationContext, ActivityTriste::class.java))
	}

	fun terceiraQuestao(view: View) {
		startActivity(Intent(applicationContext, Questao3::class.java))
	}

	override fun onBackPressed() {
		// não chame o super desse método
	}
}