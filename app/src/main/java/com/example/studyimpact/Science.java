package com.example.studyimpact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Science extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        webView = findViewById(R.id.ScienceView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/drive/folders/1p6jgwRU4Oeq8Oe-FeVRn6Y4r2o5J7NHW?usp=sharing");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}