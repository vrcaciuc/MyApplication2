package ua.edu.myapplication2.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by vcaciuc on 5/22/2014.
 */
public class Splash extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openStartingPoint = new Intent("ua.edu.myapplication2.app.MAINACTIVITY");
                    startActivity(openStartingPoint);
                }
            }
        };
        timer.start();
    }
}
