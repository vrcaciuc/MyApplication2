package ua.edu.myapplication2.app;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by vcaciuc on 5/29/2014.
 */
public class ourViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url){
        v.loadUrl(url);
        return true;
    }
}
