package com.google.android.apps.gmm.parkinglocation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.parkinglocation.ParkingLocationNotificationReceiver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ParkingLocationNotificationReceiver extends BroadcastReceiver {
    public awti a;
    public bvrb b;
    public awpz c;
    public awpu d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        Executor g = this.b.g(bvrj.BACKGROUND_THREADPOOL);
        String action = intent.getAction();
        if (g != null) {
            if (!"android.intent.action.BOOT_COMPLETED".equals(action) && !"android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
                return;
            }
            this.a.b().Pk(new Runnable(this) { // from class: awqa
                private final ParkingLocationNotificationReceiver a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j;
                    ParkingLocationNotificationReceiver parkingLocationNotificationReceiver = this.a;
                    awtn f = parkingLocationNotificationReceiver.a.f();
                    parkingLocationNotificationReceiver.c.a(f);
                    awpu awpuVar = parkingLocationNotificationReceiver.d;
                    if (f == null || !f.o()) {
                        awpuVar.a();
                        return;
                    }
                    awpuVar.g.b();
                    long b = f.b();
                    if (b > awpuVar.f.b()) {
                        awpuVar.b(f, awpuVar.c(b), "com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRES_SOON_NOTIFICATION");
                        j = awpuVar.d(b);
                    } else if (awpuVar.f.b() > b + awpu.b) {
                        return;
                    } else {
                        j = 0;
                    }
                    awpuVar.b(f, j, "com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRED_NOTIFICATION");
                }
            }, g);
        }
    }
}
