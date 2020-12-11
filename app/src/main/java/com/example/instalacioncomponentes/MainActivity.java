package com.example.instalacioncomponentes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://api.covid19api.com/summary
        /*
        String url = "http://my-json-feed";

    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
            (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

        @Override
        public void onResponse(JSONObject response) {
            textView.setText("Response: " + response.toString());
        }
    }, new Response.ErrorListener() {

        @Override
        public void onErrorResponse(VolleyError error) {
            // TODO: Handle error

        }
    });

    // Access the RequestQueue through your singleton class.
    MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
        * */
    }
}