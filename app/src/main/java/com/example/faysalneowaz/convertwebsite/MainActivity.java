package com.example.faysalneowaz.convertwebsite;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    WebView mwebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mwebview = findViewById(R.id.webview);


        mwebview.loadUrl("https://www.w3schools.com/" );
        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.setWebViewClient(new WebViewClient());


    }

    @Override
    public void onBackPressed() {

        if (mwebview.canGoBack()){
            mwebview.goBack();
        }else{

            super.onBackPressed();

        }


    }
}
