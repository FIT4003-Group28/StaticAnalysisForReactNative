package com.google.android.apps.gmm.notification.channels;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NotificationChannelBroadcastReceiver extends BroadcastReceiver {
    public aukk a;
    public bttf b;
    public bvrb c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!ako.a()) {
            return;
        }
        dxiq.c(this, context);
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if ((!action.equals("android.intent.action.BOOT_COMPLETED") && !action.equals("android.intent.action.LOCALE_CHANGED")) || !this.b.b()) {
            return;
        }
        this.c.b(new auke(this, goAsync()), bvrj.BACKGROUND_THREADPOOL);
    }
}
