package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvqy  reason: default package */
/* loaded from: classes.dex */
public final class bvqy implements Runnable, Delayed {
    static final AtomicLong a = new AtomicLong();
    public final bvpk b;
    private final cqat c;
    private final long d;
    private final long e;

    public bvqy(Runnable runnable, cqat cqatVar, long j) {
        bvpk a2;
        this.c = cqatVar;
        this.d = j != 0 ? cqatVar.e() + j : 0L;
        if (runnable instanceof bvpk) {
            a2 = (bvpk) runnable;
        } else {
            a2 = bvpk.a(runnable);
        }
        this.b = a2;
        this.e = a.getAndIncrement();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(Delayed delayed) {
        bvqy bvqyVar;
        if (delayed instanceof bvqx) {
            bvqyVar = ((bvqx) delayed).a;
        } else {
            bvqyVar = (bvqy) delayed;
        }
        return dbzx.b.d(this.d, bvqyVar.d).d(this.e, bvqyVar.e).i();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        long j = this.d;
        if (j == 0) {
            return 0L;
        }
        return timeUnit.convert(j - this.c.e(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e();
        try {
            this.b.run();
            this.c.e();
        } catch (AbstractMethodError e) {
            String valueOf = String.valueOf(this.b.getClass().getName());
            throw new RuntimeException(valueOf.length() != 0 ? "AbstractMethodError while executing runnable of type ".concat(valueOf) : new String("AbstractMethodError while executing runnable of type "), e);
        }
    }
}
