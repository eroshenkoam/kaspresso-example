package qa.guru.kaspresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var currentValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.increment).setOnClickListener(this::incrementAction)
        findViewById<Button>(R.id.decrement).setOnClickListener(this::decrementAction)
        findViewById<Button>(R.id.reset).setOnClickListener(this::resetAction)
    }

    private fun incrementAction(view: View) {
        updateCounterText(++currentValue)
    }

    private fun decrementAction(view: View) {
        updateCounterText(--currentValue)
    }

    private fun resetAction(view: View) {
        currentValue = 0
        updateCounterText(currentValue)
    }

    private fun updateCounterText(value: Int) {
        findViewById<TextView>(R.id.counter).text = String.format("Count: %d", value)
    }
}