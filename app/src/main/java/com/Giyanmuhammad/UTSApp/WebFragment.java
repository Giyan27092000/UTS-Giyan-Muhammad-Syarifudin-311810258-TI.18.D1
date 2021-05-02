package com.Giyanmuhammad.UTSApp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebFragment extends Fragment {

    WebView webView;
    WebSettings webSetting;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_web, container, false);

        webView = view.findViewById(R.id.webView);
        webSetting = webView.getSettings();

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/");
        return view;
    }
}