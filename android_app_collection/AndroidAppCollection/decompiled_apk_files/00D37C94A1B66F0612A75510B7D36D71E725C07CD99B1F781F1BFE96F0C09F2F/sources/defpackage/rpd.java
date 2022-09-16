package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* compiled from: PG */
/* renamed from: rpd  reason: default package */
/* loaded from: classes4.dex */
public final class rpd extends rpf {
    public final AlarmManager a;
    private rjv b;
    private Integer c;

    public rpd(rpn rpnVar) {
        super(rpnVar);
        this.a = (AlarmManager) I().getSystemService("alarm");
    }

    private final void f() {
        JobScheduler jobScheduler = (JobScheduler) I().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(a());
        }
    }

    public final int a() {
        if (this.c == null) {
            String valueOf = String.valueOf(I().getPackageName());
            this.c = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.c.intValue();
    }

    @Override // defpackage.rpf
    protected final void b() {
        AlarmManager alarmManager = this.a;
        if (alarmManager != null) {
            alarmManager.cancel(c());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            f();
        }
    }

    public final PendingIntent c() {
        Context I = I();
        return rfi.b(I, 0, new Intent().setClassName(I, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), rfi.a);
    }

    public final rjv d() {
        if (this.b == null) {
            this.b = new rpc(this, this.j.i);
        }
        return this.b;
    }

    public final void e() {
        V();
        aG().k.a("Unscheduling upload");
        AlarmManager alarmManager = this.a;
        if (alarmManager != null) {
            alarmManager.cancel(c());
        }
        d().a();
        if (Build.VERSION.SDK_INT >= 24) {
            f();
        }
    }
}
