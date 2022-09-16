package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: PG */
/* renamed from: aztr  reason: default package */
/* loaded from: classes2.dex */
public final class aztr {
    @Deprecated
    private static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(aztr.class, "b");
    private volatile int b;

    public aztr(boolean z) {
        this.b = z ? 1 : 0;
    }

    public final boolean a() {
        return this.b != 0;
    }

    public final boolean b() {
        int i = aztv.a;
        return a.compareAndSet(this, 0, 1);
    }

    public final void c() {
        int i = aztv.a;
        this.b = 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
