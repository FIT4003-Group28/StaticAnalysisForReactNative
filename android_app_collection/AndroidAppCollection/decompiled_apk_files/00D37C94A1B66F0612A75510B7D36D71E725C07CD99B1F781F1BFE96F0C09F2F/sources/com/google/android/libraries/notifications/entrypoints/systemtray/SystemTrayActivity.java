package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemTrayActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        uem uemVar;
        final Context applicationContext = getApplicationContext();
        final Intent intent = getIntent();
        if (intent == null) {
            uev.b("SystemTrayActivity", "SystemTrayActivity received null intent", new Object[0]);
        } else {
            uev.d("SystemTrayActivity", "Intent received for action [%s] package [%s].", intent.getAction(), intent.getPackage());
            try {
                uemVar = uel.a(getApplicationContext());
            } catch (IllegalStateException e) {
                uev.f("SystemTrayActivity", e, "Chime component not initialized: Activity stopped.", new Object[0]);
                uemVar = null;
            }
            if (uemVar != null) {
                uemVar.jt();
                super.onCreate(bundle);
                if (!intent.getBooleanExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", false)) {
                    Intent intent2 = new Intent(intent);
                    intent2.setFlags(268435456);
                    uev.d("SystemTrayActivity", "Forwarding Intent from Activity to %s", SystemTrayBroadcastReceiver.class);
                    intent2.setClass(this, SystemTrayBroadcastReceiver.class);
                    sendBroadcast(intent2);
                } else {
                    uel.a(applicationContext).aD().b(new Runnable() { // from class: udu
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = applicationContext;
                            Intent intent3 = intent;
                            int threadPriority = Process.getThreadPriority(0);
                            try {
                                Process.setThreadPriority(10);
                                udj udjVar = (udj) uel.a(context).hF().get("systemtray");
                                if (udjVar != null) {
                                    udjVar.b(intent3, ubz.b(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
                                }
                            } finally {
                                Process.setThreadPriority(threadPriority);
                            }
                        }
                    });
                }
            }
        }
        finish();
    }
}
