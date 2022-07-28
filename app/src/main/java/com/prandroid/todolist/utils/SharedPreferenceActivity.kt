package com.prandroid.todolist.utils

import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.prandroid.todolist.R


class SharedPreferenceActivity :AppCompatActivity() {
    val MyPREFERENCES = "MyPrefs"
    val Name = "nameKey"
    val Phone = "phoneKey"
    val Email = "emailKey"
    var sharedpreferences: SharedPreferences?=null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_sharedpreferenceactivity)

       /* val editText:EditText=findViewById(R.id.editText)
        val editText:EditText=findViewById(R.id.editText)
        val editText:EditText=findViewById(R.id.editText)*/

        val button:Button=findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
           /* val n: String = ed1.getText().toString()
            val ph: String = ed2.getText().toString()
            val e: String = ed3.getText().toString()*/

            //val editor: SharedPreferences.Editor = sharedpreferences?.edit() ?:

           /* editor.putString(Name, n)
            editor.putString(Phone, ph)
            editor.putString(Email, e)
            editor.commit()
            Toast.makeText(this, "Thanks", Toast.LENGTH_LONG).show()*/
        })
    }
}