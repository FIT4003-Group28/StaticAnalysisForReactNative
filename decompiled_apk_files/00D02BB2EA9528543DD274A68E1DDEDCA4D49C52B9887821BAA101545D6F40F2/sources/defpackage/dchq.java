package defpackage;

import defpackage.dchv;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dchq  reason: default package */
/* loaded from: classes.dex */
abstract class dchq<K, V, E extends dchv<K, V, E>> extends WeakReference<K> implements dchv<K, V, E> {
    final int a;
    final E b;

    public dchq(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
        super(k, referenceQueue);
        this.a = i;
        this.b = e;
    }

    @Override // defpackage.dchv
    public final K a() {
        return (K) get();
    }

    @Override // defpackage.dchv
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dchv
    public final E c() {
        return this.b;
    }
}
