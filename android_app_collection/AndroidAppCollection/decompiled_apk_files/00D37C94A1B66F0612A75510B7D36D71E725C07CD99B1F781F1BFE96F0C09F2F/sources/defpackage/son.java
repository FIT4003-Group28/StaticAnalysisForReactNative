package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: son  reason: default package */
/* loaded from: classes4.dex */
public final class son implements RunnableScheduledFuture {
    private final RunnableScheduledFuture a;

    public son(RunnableScheduledFuture runnableScheduledFuture) {
        this.a = runnableScheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (this == delayed2) {
            return 0;
        }
        if (delayed2 instanceof son) {
            return this.a.compareTo(((son) delayed2).a);
        }
        return almu.p(getDelay(TimeUnit.NANOSECONDS), delayed2.getDelay(TimeUnit.NANOSECONDS));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        long delay = this.a.getDelay(timeUnit);
        return TimeUnit.NANOSECONDS.convert(delay, timeUnit) > 2147483647999999999L ? timeUnit.convert(2147483647999999999L, TimeUnit.NANOSECONDS) : delay;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return this.a.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return soo.a(this.a, j, timeUnit);
    }
}
