package com.google.android.apps.gmm.traffic.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DismissAreaTrafficWarmUpNotificationBroadcastReceiver extends BroadcastReceiver {
    public byps a;
    public gdo b;
    public auhi c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        this.b.b();
        this.a.a();
        this.c.e(dpyv.AREA_TRAFFIC.dm, aufs.ENABLED);
        this.b.e();
    }
}
