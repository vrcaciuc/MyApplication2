package ua.edu.myapplication2.app;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by vcaciuc on 5/27/2014.
 */
public class Prefs extends PreferenceActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
