package defpackage;

import defpackage.dchv;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dcit  reason: default package */
/* loaded from: classes.dex */
final class dcit<K, V, E extends dchv<K, V, E>> extends WeakReference<V> implements dcis<K, V, E> {
    final E a;

    public dcit(ReferenceQueue<V> referenceQueue, V v, E e) {
        super(v, referenceQueue);
        this.a = e;
    }

    @Override // defpackage.dcis
    public final dcis<K, V, E> a(ReferenceQueue<V> referenceQueue, E e) {
        return new dcit(referenceQueue, get(), e);
    }

    @Override // defpackage.dcis
    public final E b() {
        return this.a;
    }
}
