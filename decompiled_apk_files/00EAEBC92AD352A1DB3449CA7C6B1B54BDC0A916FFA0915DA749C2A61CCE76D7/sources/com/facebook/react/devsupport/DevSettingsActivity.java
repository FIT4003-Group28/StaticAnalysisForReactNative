package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.facebook.react.j;
import com.facebook.react.l;
/* loaded from: classes.dex */
public class DevSettingsActivity extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(j.catalyst_settings_title));
        addPreferencesFromResource(l.rn_dev_preferences);
    }
}
