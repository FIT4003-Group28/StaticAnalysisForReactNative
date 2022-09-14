package defpackage;

import defpackage.dchv;
import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dcis  reason: default package */
/* loaded from: classes.dex */
interface dcis<K, V, E extends dchv<K, V, E>> {
    dcis<K, V, E> a(ReferenceQueue<V> referenceQueue, E e);

    E b();

    void clear();

    V get();
}
