package com.google.android.apps.gmm.notification.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CancelNotificationBroadcastReceiver extends BroadcastReceiver {
    public gdo a;
    public bvrv b;
    public auhi c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        this.a.b();
        if (intent.hasExtra("receiver_notification_id")) {
            this.c.n(intent.getStringExtra("receiver_notification_tag"), intent.getIntExtra("receiver_notification_id", 0));
        }
        this.a.e();
        this.b.a();
    }
}
