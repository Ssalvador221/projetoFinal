package com.example.projetofinal;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class fourthFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}