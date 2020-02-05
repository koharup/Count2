package app.sano.picchi.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener {
            number+= 1
            textView2.text = number.toString()
        }

        minusButton.setOnClickListener {
            number-=1
            textView2.text = number.toString()
        }

        clearButton.setOnClickListener {
            number= 0
            textView2.text =number.toString()
        }
    }
}
