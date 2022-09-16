package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: btzu  reason: default package */
/* loaded from: classes4.dex */
public final class btzu {
    static final long a = TimeUnit.SECONDS.toMillis(2);
    public static final /* synthetic */ int m = 0;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long j;
    public final AtomicLong f = new AtomicLong();
    public final AtomicLong g = new AtomicLong();
    public final AtomicLong h = new AtomicLong();
    public final AtomicLong i = new AtomicLong();
    public final deig<btzv> k = deig.d();
    public int l = 1;

    public final void a() {
        if (!this.k.isDone()) {
            this.k.j(btzv.y(this));
        }
    }

    public final void b(long j) {
        this.h.set(j);
        this.l = 22;
    }

    public final void c(long j) {
        this.f.set(j);
        this.l = 20;
    }

    public final void d(long j) {
        this.i.set(j);
        this.l = 23;
    }

    public final void e(long j) {
        this.g.set(j);
        this.l = 21;
    }
}
