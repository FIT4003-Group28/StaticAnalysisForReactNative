package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sos  reason: default package */
/* loaded from: classes4.dex */
public final class sos extends anie implements Runnable, ankv {
    final /* synthetic */ sot a;
    private Callable b;
    private final long c;

    public sos(sot sotVar, Callable callable, long j) {
        this.a = sotVar;
        this.b = callable;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return sot.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.c - this.a.a.d(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            Callable callable = this.b;
            this.b = null;
            o(callable.call());
        } catch (Throwable th) {
            e(th);
            throw new RuntimeException(th);
        }
    }
}
