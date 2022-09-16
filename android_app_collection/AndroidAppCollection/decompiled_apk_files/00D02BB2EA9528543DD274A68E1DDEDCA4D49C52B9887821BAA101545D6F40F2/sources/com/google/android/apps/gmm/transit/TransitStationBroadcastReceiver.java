package com.google.android.apps.gmm.transit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TransitStationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            TransitStationService.p(context);
        } else if (!"com.google.android.gms.location.reporting.SETTINGS_CHANGED".equals(intent.getAction())) {
        } else {
            TransitStationService.r(context, 2);
        }
    }
}
