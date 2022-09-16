package com.google.android.apps.gmm.locationsharing.usr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationAvailabilityChecker$LocationProvidersChangedBroadcastReceiver extends BroadcastReceiver {
    public dxio<ajzn> a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction()) || "android.location.MODE_CHANGED".equals(intent.getAction())) {
            dxiq.c(this, context);
            this.a.a().a();
        }
    }
}
