package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.z8;
/* loaded from: classes.dex */
public final class v8<T extends Context & z8> {

    /* renamed from: a  reason: collision with root package name */
    private final T f7743a;

    public v8(T t) {
        com.google.android.gms.common.internal.s.a(t);
        this.f7743a = t;
    }

    private final void a(Runnable runnable) {
        r9 a2 = r9.a(this.f7743a);
        a2.a().a(new a9(this, a2, runnable));
    }

    private final z3 c() {
        return d5.a(this.f7743a, null, null).c();
    }

    public final int a(final Intent intent, int i, final int i2) {
        d5 a2 = d5.a(this.f7743a, null, null);
        final z3 c2 = a2.c();
        if (intent == null) {
            c2.v().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a2.w();
        c2.B().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            a(new Runnable(this, i2, c2, intent) { // from class: com.google.android.gms.measurement.internal.y8

                /* renamed from: b  reason: collision with root package name */
                private final v8 f7811b;

                /* renamed from: c  reason: collision with root package name */
                private final int f7812c;

                /* renamed from: d  reason: collision with root package name */
                private final z3 f7813d;

                /* renamed from: e  reason: collision with root package name */
                private final Intent f7814e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f7811b = this;
                    this.f7812c = i2;
                    this.f7813d = c2;
                    this.f7814e = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7811b.a(this.f7812c, this.f7813d, this.f7814e);
                }
            });
        }
        return 2;
    }

    public final IBinder a(Intent intent) {
        if (intent == null) {
            c().s().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new j5(r9.a(this.f7743a));
        }
        c().v().a("onBind received unknown action", action);
        return null;
    }

    public final void a() {
        d5 a2 = d5.a(this.f7743a, null, null);
        z3 c2 = a2.c();
        a2.w();
        c2.B().a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, z3 z3Var, Intent intent) {
        if (this.f7743a.a(i)) {
            z3Var.B().a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            c().B().a("Completed wakeful intent.");
            this.f7743a.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(z3 z3Var, JobParameters jobParameters) {
        z3Var.B().a("AppMeasurementJobService processed last upload request.");
        this.f7743a.a(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean a(final JobParameters jobParameters) {
        d5 a2 = d5.a(this.f7743a, null, null);
        final z3 c2 = a2.c();
        String string = jobParameters.getExtras().getString("action");
        a2.w();
        c2.B().a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a(new Runnable(this, c2, jobParameters) { // from class: com.google.android.gms.measurement.internal.x8

                /* renamed from: b  reason: collision with root package name */
                private final v8 f7789b;

                /* renamed from: c  reason: collision with root package name */
                private final z3 f7790c;

                /* renamed from: d  reason: collision with root package name */
                private final JobParameters f7791d;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f7789b = this;
                    this.f7790c = c2;
                    this.f7791d = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7789b.a(this.f7790c, this.f7791d);
                }
            });
            return true;
        }
        return true;
    }

    public final void b() {
        d5 a2 = d5.a(this.f7743a, null, null);
        z3 c2 = a2.c();
        a2.w();
        c2.B().a("Local AppMeasurementService is shutting down");
    }

    public final boolean b(Intent intent) {
        if (intent == null) {
            c().s().a("onUnbind called with null intent");
            return true;
        }
        c().B().a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void c(Intent intent) {
        if (intent == null) {
            c().s().a("onRebind called with null intent");
            return;
        }
        c().B().a("onRebind called. action", intent.getAction());
    }
}
