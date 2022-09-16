package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: PG */
/* renamed from: azts  reason: default package */
/* loaded from: classes2.dex */
public final class azts {
    @Deprecated
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(azts.class, "a");
    public volatile int a = 0;

    public final int a() {
        int i = aztv.a;
        return b.decrementAndGet(this);
    }

    public final int b() {
        int i = aztv.a;
        return b.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        int i3 = aztv.a;
        return b.compareAndSet(this, i, i2);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
