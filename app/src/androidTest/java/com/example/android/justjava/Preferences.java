package com.example.android.justjava;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by kapil on 24/09/15.
 */
public class Preferences extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
