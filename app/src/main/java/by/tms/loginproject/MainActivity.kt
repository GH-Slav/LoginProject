package by.tms.loginproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        containedButton.setOnClickListener { MaterialAlertDialogBuilder(this)
            .setTitle("Title")
            .setMessage("Message")
            .setPositiveButton("Ok", null)

            .show(); }

       login.addTextChangedListener(object: TextWatcher)


    }
}
