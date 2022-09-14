package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvpy  reason: default package */
/* loaded from: classes.dex */
public final class bvpy {
    public final dehq a;
    public final cqat b;
    public final Runnable c;
    public final long d;
    @dzsi
    public dehu e;
    private long f = -1;
    private long g = -1;
    private final Runnable h = new bvpx(this);

    public bvpy(cqat cqatVar, dehq dehqVar, Runnable runnable, long j) {
        this.a = dehqVar;
        this.b = cqatVar;
        this.c = runnable;
        this.d = j;
    }

    public final synchronized void a(long j) {
        long e = this.b.e();
        long j2 = this.g;
        if (j2 == -1) {
            d(e);
            dehu d = this.a.d(this.h, j, TimeUnit.MILLISECONDS);
            this.e = d;
            bvqd.a(d, this.a);
        } else if (e + j < j2) {
            dehu dehuVar = this.e;
            if (dehuVar != null) {
                dehuVar.cancel(false);
            }
            dehu d2 = this.a.d(this.h, j, TimeUnit.MILLISECONDS);
            this.e = d2;
            bvqd.a(d2, this.a);
        }
        this.g = e + j;
    }

    public final synchronized void b() {
        dehu dehuVar = this.e;
        if (dehuVar != null) {
            dehuVar.cancel(false);
            this.e = null;
        }
        this.g = -1L;
    }

    public final synchronized long c() {
        return this.f;
    }

    public final synchronized void d(long j) {
        this.f = j;
    }

    public final synchronized long e() {
        return this.g;
    }
}
