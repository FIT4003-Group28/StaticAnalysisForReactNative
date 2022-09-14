package com.google.android.gms.measurement;

import a.m.a.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.z8;
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements z8 {

    /* renamed from: b  reason: collision with root package name */
    private v8<AppMeasurementService> f7145b;

    private final v8<AppMeasurementService> a() {
        if (this.f7145b == null) {
            this.f7145b = new v8<>(this);
        }
        return this.f7145b;
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final void a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final void a(Intent intent) {
        a.a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return a().a(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        a().c(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return a().a(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return a().b(intent);
    }
}
