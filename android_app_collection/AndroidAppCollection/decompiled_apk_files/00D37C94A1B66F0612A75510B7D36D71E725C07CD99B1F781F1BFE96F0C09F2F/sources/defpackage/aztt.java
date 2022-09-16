package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: PG */
/* renamed from: aztt  reason: default package */
/* loaded from: classes2.dex */
public final class aztt {
    @Deprecated
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(aztt.class, "b");
    public volatile long b;

    public aztt(long j) {
        this.b = j;
    }

    public final long a(long j) {
        int i = aztv.a;
        return a.addAndGet(this, j);
    }

    public final boolean b(long j, long j2) {
        int i = aztv.a;
        return a.compareAndSet(this, j, j2);
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
