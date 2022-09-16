package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dcim  reason: default package */
/* loaded from: classes.dex */
final class dcim<K, V> extends dchq<K, V, dcim<K, V>> implements dchv<K, V, dcim<K, V>> {
    public volatile V c;

    public dcim(ReferenceQueue<K> referenceQueue, K k, int i, dcim<K, V> dcimVar) {
        super(referenceQueue, k, i, dcimVar);
        this.c = null;
    }

    @Override // defpackage.dchv
    public final V d() {
        return this.c;
    }
}
