package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: abuv  reason: default package */
/* loaded from: classes.dex */
final class abuv extends BroadcastReceiver {
    final /* synthetic */ abux a;

    public abuv(abux abuxVar) {
        this.a = abuxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.DEVICE_STORAGE_LOW".equals(action) || "android.intent.action.DEVICE_STORAGE_OK".equals(action)) {
            abux abuxVar = this.a;
            abuxVar.c.post(abuxVar.h);
        } else if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
        } else {
            abux abuxVar2 = this.a;
            long nanoTime = System.nanoTime();
            if (nanoTime - abuxVar2.e <= abux.a) {
                return;
            }
            abuxVar2.e = nanoTime;
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 >= 0) {
                int i = (intExtra * 100) / intExtra2;
                if (i <= 10) {
                    abuxVar2.c.post(abuxVar2.j);
                } else {
                    abuxVar2.c.post(abuxVar2.k);
                }
                abuxVar2.f = i;
            } else {
                abuxVar2.f = -1;
            }
            abuxVar2.g = intent.getIntExtra("status", -1);
        }
    }
}
