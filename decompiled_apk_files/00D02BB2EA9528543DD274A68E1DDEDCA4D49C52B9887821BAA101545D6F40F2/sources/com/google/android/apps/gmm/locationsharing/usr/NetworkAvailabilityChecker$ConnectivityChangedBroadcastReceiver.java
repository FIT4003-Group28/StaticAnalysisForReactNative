package com.google.android.apps.gmm.locationsharing.usr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NetworkAvailabilityChecker$ConnectivityChangedBroadcastReceiver extends BroadcastReceiver {
    public dxio<ajzz> a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        dxiq.c(this, context);
        this.a.a().b();
    }
}
