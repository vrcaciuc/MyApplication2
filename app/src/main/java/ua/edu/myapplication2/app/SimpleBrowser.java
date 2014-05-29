package ua.edu.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by vcaciuc on 5/29/2014.
 */
public class SimpleBrowser extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplebrowser);

        WebView ourBrow = (WebView) findViewById(R.id.wvBrowser);
        ourBrow.loadUrl("http://www.google.com");
    }
}
