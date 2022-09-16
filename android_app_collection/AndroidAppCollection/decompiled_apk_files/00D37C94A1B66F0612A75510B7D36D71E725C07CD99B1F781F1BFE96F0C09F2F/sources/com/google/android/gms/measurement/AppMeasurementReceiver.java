package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends gg {
    private rlj c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName startService;
        if (this.c == null) {
            this.c = new rlj(this);
        }
        rlj rljVar = this.c;
        rlx j = rlx.j(context);
        rks aG = j.aG();
        if (intent == null) {
            aG.f.a("Receiver called with null intent");
            return;
        }
        rjm rjmVar = j.f;
        String action = intent.getAction();
        aG.k.b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            aG.k.a("Starting wakeful intent.");
            AppMeasurementReceiver appMeasurementReceiver = rljVar.a;
            synchronized (gg.a) {
                int i = gg.b;
                gg.b++;
                if (gg.b <= 0) {
                    gg.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                className.putExtra("android.support.content.wakelockid", i);
                if (context.startService(className) == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                gg.a.put(i, newWakeLock);
            }
        } else if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
        } else {
            aG.f.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
