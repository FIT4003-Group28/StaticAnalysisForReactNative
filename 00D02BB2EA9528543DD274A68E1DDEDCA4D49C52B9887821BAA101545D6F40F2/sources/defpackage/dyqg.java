package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyqg  reason: default package */
/* loaded from: classes6.dex */
public final class dyqg {
    public final ScheduledExecutorService a;
    public final dbtp b;
    public ScheduledFuture<?> c;
    public ScheduledFuture<?> d;
    public final Runnable e;
    public final Runnable f;
    public final long g;
    public final long h;
    public int i;
    public final dyqf j;

    static {
        TimeUnit.SECONDS.toNanos(10L);
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public dyqg(dyqf dyqfVar, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        dbtp a = dbtp.a();
        this.i = 1;
        this.e = new dyqh(new dyqc(this));
        this.f = new dyqh(new dyqd(this));
        this.j = dyqfVar;
        dbsk.t(scheduledExecutorService, "scheduler");
        this.a = scheduledExecutorService;
        this.b = a;
        this.g = j;
        this.h = j2;
        a.e();
        a.f();
    }

    public final synchronized void a() {
    }

    public final synchronized void b() {
        dbtp dbtpVar = this.b;
        dbtpVar.e();
        dbtpVar.f();
        int i = this.i;
        if (i == 2) {
            this.i = 3;
        } else if (i != 4 && i != 5) {
        } else {
            ScheduledFuture<?> scheduledFuture = this.c;
            boolean z = false;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.i == 5) {
                this.i = 1;
                return;
            }
            this.i = 2;
            if (this.d == null) {
                z = true;
            }
            dbsk.m(z, "There should be no outstanding pingFuture");
            this.d = this.a.schedule(this.f, this.g, TimeUnit.NANOSECONDS);
        }
    }

    public final synchronized void c() {
        int i = this.i;
        if (i == 1) {
            this.i = 2;
            if (this.d == null) {
                this.d = this.a.schedule(this.f, this.g - this.b.d(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i == 5) {
            this.i = 4;
        }
    }

    public final synchronized void d() {
        int i = this.i;
        if (i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            this.i = 5;
            return;
        }
        this.i = 1;
    }

    public final synchronized void e() {
        if (this.i != 6) {
            this.i = 6;
            ScheduledFuture<?> scheduledFuture = this.c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.d = null;
            }
        }
    }
}
