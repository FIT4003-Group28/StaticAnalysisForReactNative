package com.google.android.apps.gmm.majorevents.notification.dismissreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DismissEventNotificationBroadcastReceiver extends BroadcastReceiver {
    public ckcw a;
    public gdo b;
    public bvrv c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        this.b.b();
        this.a.f(ckhc.NOTIFICATION_LOGGING_SERVICE);
        ((ckco) this.a.a(ckht.T)).a(intent.getIntExtra("event_notification_id_key", 0));
        this.a.g(ckhc.NOTIFICATION_LOGGING_SERVICE);
        this.b.e();
        this.c.a();
    }
}
