package academy.learn.piano;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.react.m;
/* loaded from: classes.dex */
public class MainActivity extends m {
    @Override // androidx.appcompat.app.d, androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Intent intent = new Intent("onConfigurationChanged");
        intent.putExtra("newConfig", configuration);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.m, androidx.appcompat.app.d, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putString("debug_http_host", "192.168.10.8:8081").apply();
    }

    @Override // com.facebook.react.m
    protected String p() {
        return "newApp";
    }
}
