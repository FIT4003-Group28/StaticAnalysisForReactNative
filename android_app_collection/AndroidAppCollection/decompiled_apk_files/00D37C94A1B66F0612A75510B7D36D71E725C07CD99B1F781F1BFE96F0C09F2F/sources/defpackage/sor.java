package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sor  reason: default package */
/* loaded from: classes4.dex */
public final class sor extends anie implements Runnable, ankv {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ sot f;

    public sor(sot sotVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = sotVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long f() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - this.f.a.d());
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return sot.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            if (this.c) {
                uwp.g(this, f());
            } else {
                uwp.g(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            e(th);
        }
    }
}
