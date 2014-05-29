package ua.edu.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by vcaciuc on 5/29/2014.
 */
public class SimpleBrowser extends Activity implements View.OnClickListener{

    EditText url;
    WebView ourBrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplebrowser);

        ourBrow = (WebView) findViewById(R.id.wvBrowser);

        //Enable Java script
        ourBrow.getSettings().setJavaScriptEnabled(true);

        ourBrow.getSettings().setLoadWithOverviewMode(true);
        ourBrow.getSettings().setUseWideViewPort(true);

        ourBrow.setWebViewClient(new ourViewClient());
        try {
            ourBrow.loadUrl("http://www.google.com");
        }catch(Exception e){
            e.printStackTrace();
        }
        Button go = (Button) findViewById(R.id.bGo);
        Button back = (Button) findViewById(R.id.bBack);
        Button forward = (Button) findViewById(R.id.bForward);
        Button refresh = (Button) findViewById(R.id.bRefresh);
        Button clearHistory = (Button) findViewById(R.id.bHistory);

        url = (EditText) findViewById(R.id.etURL);
        go.setOnClickListener(this);
        back.setOnClickListener(this);
        forward.setOnClickListener(this);
        refresh.setOnClickListener(this);
        clearHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        switch(arg0.getId()){
            case R.id.bGo:
                String web = url.getText().toString();
                ourBrow.loadUrl(web);
                break;
            case R.id.bBack:
                if(ourBrow.canGoBack())
                    ourBrow.goBack();
                break;
            case R.id.bForward:
                if(ourBrow.canGoForward())
                    ourBrow.goForward();
                break;
            case R.id.bRefresh:
                ourBrow.reload();
                break;
            case R.id.bHistory:
                ourBrow.clearHistory();
                break;
        }
    }
}
