package com.taraba.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ContentViewActivity extends AppCompatActivity {


    //fdgsdfgdsfg ghfgjfgj ghjghujk

    //by Mayuri
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_view);

        webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);

        String displayString = getIntent().getExtras().getString("display");
        if(displayString != null)
            webView.loadData(displayString, "text/html", "utf-8");
    }
}
