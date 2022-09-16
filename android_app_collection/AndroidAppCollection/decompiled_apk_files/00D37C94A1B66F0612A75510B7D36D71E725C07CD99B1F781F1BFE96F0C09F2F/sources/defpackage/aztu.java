package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: PG */
/* renamed from: aztu  reason: default package */
/* loaded from: classes2.dex */
public final class aztu {
    @Deprecated
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(aztu.class, Object.class, "a");
    public volatile Object a;

    public aztu(Object obj) {
        this.a = obj;
    }

    public final Object a(Object obj) {
        int i = aztv.a;
        return b.getAndSet(this, obj);
    }

    public final void b(Object obj) {
        int i = aztv.a;
        b.lazySet(this, obj);
    }

    public final boolean c(Object obj, Object obj2) {
        int i = aztv.a;
        return b.compareAndSet(this, obj, obj2);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
