package com.google.android.apps.gmm.notification.log;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationLoggingActivity extends affl {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class NoTaskAffinityNotificationLoggingActivity extends NotificationLoggingActivity {
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT < 29;
    }

    @Override // android.app.Activity
    protected final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Intent intent2 = new Intent(intent);
            intent2.setClass(this, NotificationLoggingReceiver.class);
            sendBroadcast(intent2);
            setIntent(null);
            if (!a()) {
                return;
            }
            finish();
            return;
        }
        setIntent(null);
        finish();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        if (!a()) {
            finish();
        }
    }
}
