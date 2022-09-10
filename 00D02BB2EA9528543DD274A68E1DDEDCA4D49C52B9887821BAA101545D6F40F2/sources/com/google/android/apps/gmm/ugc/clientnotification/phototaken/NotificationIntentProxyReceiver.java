package com.google.android.apps.gmm.ugc.clientnotification.phototaken;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationIntentProxyReceiver extends BroadcastReceiver {
    public static final String a = String.valueOf(NotificationIntentProxyReceiver.class.getCanonicalName()).concat(".ACTION_PHOTO_TAKEN_NOTIFICATION_INTERACTION_INTENT");
    public bztc b;
    public bvrb c;
    public ckcw d;
    public bvrv e;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        if (intent != null && a.equals(intent.getAction())) {
            this.c.b(new bzry(this, goAsync(), context, intent), bvrj.BACKGROUND_THREADPOOL);
            this.e.a();
        }
    }
}
