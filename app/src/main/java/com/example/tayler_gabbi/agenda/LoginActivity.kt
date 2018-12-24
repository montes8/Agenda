package com.example.tayler_gabbi.agenda

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {


    var handler : Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun configurarTextoRegistrate(){
        val string = getString(R.string.registrate)
        val spannableStringBuilder = SpannableStringBuilder(string)
        val boldSpan = StyleSpan(Typeface.BOLD)

        val clickableSpan = object: ClickableSpan() {

            override fun onClick(widget: View?) {
                startActivity<RegisterActivity>()
            }
        }
        spannableStringBuilder.setSpan(boldSpan, 13, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringBuilder.setSpan(clickableSpan, 13, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        tvRegistrate.text=spannableStringBuilder
        tvRegistrate.movementMethod = LinkMovementMethod.getInstance()

    }
}
