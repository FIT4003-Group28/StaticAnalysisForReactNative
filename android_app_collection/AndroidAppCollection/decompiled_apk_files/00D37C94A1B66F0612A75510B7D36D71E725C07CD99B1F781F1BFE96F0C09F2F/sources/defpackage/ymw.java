package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ymw  reason: default package */
/* loaded from: classes4.dex */
final class ymw extends WeakReference {
    private final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymw(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        obj.getClass();
        this.a = System.identityHashCode(obj);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ymw) && get() == ((ymw) obj).get());
    }

    public final int hashCode() {
        return this.a;
    }
}
