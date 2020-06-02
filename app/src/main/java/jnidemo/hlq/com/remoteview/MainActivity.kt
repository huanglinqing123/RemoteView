package jnidemo.hlq.com.remoteview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

/**
 * @author Huanglinqing
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startActivityTwo(v: View) {
        val intent = Intent(this@MainActivity, Main2Activity::class.java)
        startActivity(intent)
    }


}
