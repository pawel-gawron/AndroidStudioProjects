package com.example.klientrest

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.RequestFuture
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//    val clickMe = findViewById<Button>(R.id.button);
//
//
//    clickMe.setOnClickListener {
//        Toast.makeText(this, "Twoja stara", Toast.LENGTH_LONG).show();

    }
    fun getSet(view: View) {
        val textView = findViewById<EditText>(R.id.urlAdress);
        val url = textView.text.toString();

        val txtView = findViewById<TextView>(R.id.showText).apply {
            text=url
        }
//        val txtView = findViewById<TextView>(R.id.showText);

//        val editView = findViewById<TextView>(R.id.urlResponse).apply {
//            text = msg
//        };
        val editView = findViewById<TextView>(R.id.urlResponse);


            val queue = Volley.newRequestQueue(this);

//            val url = "https://www.google.com";
//        var string = "";

// Request a string response from the provided URL.
            val stringRequest = StringRequest(
                Request.Method.GET, url,
                Response.Listener<String> { response ->
                    editView.text = "Response is: ${JSONArray(response).getString(1)}";
//                    Log.d("TAG", (JSONArray(response).toString()));

                    val string = JSONArray(response).getString(1);
                },
                Response.ErrorListener { editView.text = "That didn't work!" });
            queue.add(stringRequest);
//        Log.d("TAG", string);

        }

// Add the request to the RequestQueue.

        }

