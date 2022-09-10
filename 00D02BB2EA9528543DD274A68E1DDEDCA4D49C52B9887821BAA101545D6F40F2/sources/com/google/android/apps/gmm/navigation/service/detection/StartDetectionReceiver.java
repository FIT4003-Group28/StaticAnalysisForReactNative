package com.google.android.apps.gmm.navigation.service.detection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class StartDetectionReceiver extends BroadcastReceiver {
    public auhi a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getPackageName();
        dxiq.c(this, context);
        this.a.s(dpyv.NAVIGATION_START_DRIVING_MODE.dm);
    }
}
