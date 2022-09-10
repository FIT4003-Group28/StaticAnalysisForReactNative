package com.google.android.apps.gmm.traffic.notification.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DismissTrafficToPlaceNotificationReceiver extends BroadcastReceiver {
    private static final dcqe d = dcqe.c("com.google.android.apps.gmm.traffic.notification.service.DismissTrafficToPlaceNotificationReceiver");
    public byqh a;
    public akfa b;
    public bvrb c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        if ("com.google.android.apps.gmm.traffic.notification.service.DismissTrafficToPlaceNotificationReceiver.NOTIFICATION_DISMISSED".equals(intent.getAction())) {
            if (intent.hasExtra("NotificationTag")) {
                this.c.b(new byru(this, intent, goAsync()), bvrj.BACKGROUND_THREADPOOL);
                return;
            }
            bvoo.h("No session id on dismiss tag", new Object[0]);
        }
    }
}
