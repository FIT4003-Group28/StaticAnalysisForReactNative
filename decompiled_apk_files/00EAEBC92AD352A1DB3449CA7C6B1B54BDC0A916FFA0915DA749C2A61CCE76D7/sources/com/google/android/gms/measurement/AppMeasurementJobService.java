package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.v8;
import com.google.android.gms.measurement.internal.z8;
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements z8 {

    /* renamed from: b  reason: collision with root package name */
    private v8<AppMeasurementJobService> f7143b;

    private final v8<AppMeasurementJobService> a() {
        if (this.f7143b == null) {
            this.f7143b = new v8<>(this);
        }
        return this.f7143b;
    }

    @Override // com.google.android.gms.measurement.internal.z8
    @TargetApi(24)
    public final void a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.z8
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return a().a(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return a().b(intent);
    }
}
