package com.example.studyimpact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Maths extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        webView = findViewById(R.id.MathView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://drive.google.com/drive/folders/1aLnK4o2qt8PWme2Zs_UmFV1EgENiT2Uf?usp=sharing");

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