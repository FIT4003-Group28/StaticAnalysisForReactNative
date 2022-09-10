package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ivf  reason: default package */
/* loaded from: classes6.dex */
public final class ivf {
    public final izy a;
    public final eeu b;
    private final dehq c;
    private final Executor d;
    private final cqat e;
    @dzsi
    private bvpk f;
    private long g = 0;
    private final Runnable h = new ive(this);

    public ivf(eeu eeuVar, dehq dehqVar, Executor executor, cqat cqatVar, izy izyVar) {
        this.a = izyVar;
        this.b = eeuVar;
        this.c = dehqVar;
        this.d = executor;
        this.e = cqatVar;
    }

    private final long f() {
        return this.e.e();
    }

    public final void a() {
        b(d());
    }

    public final void b(long j) {
        c();
        bvpk a = bvpk.a(this.h);
        this.f = a;
        bvqd.a(this.c.d(a, j, TimeUnit.MILLISECONDS), this.d);
    }

    public final void c() {
        bvpk bvpkVar = this.f;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.f = null;
        }
    }

    public final long d() {
        long j = this.g;
        if (j == 0) {
            return 0L;
        }
        long e = j + this.a.e();
        long f = f();
        if (e >= f) {
            return e - f;
        }
        return 0L;
    }

    public final void e() {
        this.g = f();
    }
}
