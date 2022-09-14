package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
/* loaded from: classes.dex */
public final class n9 extends o9 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f7531d;

    /* renamed from: e  reason: collision with root package name */
    private final h f7532e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f7533f;

    /* JADX INFO: Access modifiers changed from: protected */
    public n9(r9 r9Var) {
        super(r9Var);
        this.f7531d = (AlarmManager) d().getSystemService("alarm");
        this.f7532e = new m9(this, r9Var.s(), r9Var);
    }

    @TargetApi(24)
    private final void u() {
        ((JobScheduler) d().getSystemService("jobscheduler")).cancel(v());
    }

    private final int v() {
        if (this.f7533f == null) {
            String valueOf = String.valueOf(d().getPackageName());
            this.f7533f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f7533f.intValue();
    }

    private final PendingIntent x() {
        Context d2 = d();
        return PendingIntent.getBroadcast(d2, 0, new Intent().setClassName(d2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    public final void a(long j) {
        q();
        w();
        Context d2 = d();
        if (!w4.a(d2)) {
            c().A().a("Receiver not registered/enabled");
        }
        if (!z9.a(d2, false)) {
            c().A().a("Service not registered/enabled");
        }
        t();
        c().B().a("Scheduling upload, millis", Long.valueOf(j));
        long b2 = b().b() + j;
        if (j < Math.max(0L, r.x.a(null).longValue()) && !this.f7532e.b()) {
            this.f7532e.a(j);
        }
        w();
        if (Build.VERSION.SDK_INT < 24) {
            this.f7531d.setInexactRepeating(2, b2, Math.max(r.s.a(null).longValue(), j), x());
            return;
        }
        Context d3 = d();
        ComponentName componentName = new ComponentName(d3, "com.google.android.gms.measurement.AppMeasurementJobService");
        int v = v();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        c.e.a.b.d.g.o6.a(d3, new JobInfo.Builder(v, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean s() {
        this.f7531d.cancel(x());
        if (Build.VERSION.SDK_INT >= 24) {
            u();
            return false;
        }
        return false;
    }

    public final void t() {
        q();
        c().B().a("Unscheduling upload");
        this.f7531d.cancel(x());
        this.f7532e.c();
        if (Build.VERSION.SDK_INT >= 24) {
            u();
        }
    }
}
