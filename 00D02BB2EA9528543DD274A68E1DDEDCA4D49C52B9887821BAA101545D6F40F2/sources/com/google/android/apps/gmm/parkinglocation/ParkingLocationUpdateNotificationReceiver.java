package com.google.android.apps.gmm.parkinglocation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ParkingLocationUpdateNotificationReceiver extends BroadcastReceiver {
    public gdo a;
    public awpu b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        this.a.b();
        awpu awpuVar = this.b;
        awpuVar.h.a(null);
        awtn e = awpu.e(intent);
        if (e != null) {
            awpuVar.g.a(e);
        }
        this.a.e();
    }
}
