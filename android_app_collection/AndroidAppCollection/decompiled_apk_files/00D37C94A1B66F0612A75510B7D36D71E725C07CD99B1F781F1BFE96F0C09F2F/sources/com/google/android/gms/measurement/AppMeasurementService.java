package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements ror {
    private ros a;

    private final ros d() {
        if (this.a == null) {
            this.a = new ros(this);
        }
        return this.a;
    }

    @Override // defpackage.ror
    public final void a(Intent intent) {
        AppMeasurementReceiver.a(intent);
    }

    @Override // defpackage.ror
    public final boolean b(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.ror
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ros d = d();
        if (intent == null) {
            d.a().c.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new rki(rpn.q(d.a));
        }
        d.a().f.b("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().b();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().c();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().d(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final ros d = d();
        rlx j = rlx.j(d.a);
        final rks aG = j.aG();
        if (intent == null) {
            aG.f.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        rjm rjmVar = j.f;
        aG.k.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        d.e(new Runnable() { // from class: roo
            @Override // java.lang.Runnable
            public final void run() {
                ros rosVar = ros.this;
                int i3 = i2;
                rks rksVar = aG;
                Intent intent2 = intent;
                if (((ror) rosVar.a).b(i3)) {
                    rksVar.k.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i3));
                    rosVar.a().k.a("Completed wakeful intent.");
                    ((ror) rosVar.a).a(intent2);
                }
            }
        });
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().f(intent);
        return true;
    }
}
