package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvqx  reason: default package */
/* loaded from: classes.dex */
public final class bvqx<V> implements RunnableScheduledFuture<V> {
    public bvqy a;
    public bvqv<V> b;
    private final boolean c;

    public bvqx(bvqy bvqyVar, @dzsi V v, boolean z) {
        this.a = bvqyVar;
        this.c = z;
        this.b = new bvqv<>(bvqyVar, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bvqy bvqyVar) {
        this.a = bvqyVar;
        bvqv<V> bvqvVar = this.b;
        this.b = new bvqv<>(bvqyVar, null);
        if (bvqvVar.isDone()) {
            this.b.cancel(false);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.b.b();
        return this.b.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        return this.a.compareTo(delayed2 instanceof bvqy ? (bvqy) delayed2 : ((bvqx) delayed2).a);
    }

    @Override // java.util.concurrent.Future
    @dzsi
    public final V get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return this.c;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.b.run();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
