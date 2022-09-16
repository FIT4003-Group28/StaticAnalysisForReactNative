package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dcip  reason: default package */
/* loaded from: classes5.dex */
final class dcip<K, V> extends dchq<K, V, dcip<K, V>> implements dcir<K, V, dcip<K, V>> {
    public volatile dcis<K, V, dcip<K, V>> c;

    public dcip(ReferenceQueue<K> referenceQueue, K k, int i, dcip<K, V> dcipVar) {
        super(referenceQueue, k, i, dcipVar);
        this.c = (dcis<K, V, dcip<K, V>>) dciv.g;
    }

    @Override // defpackage.dchv
    public final V d() {
        return this.c.get();
    }

    @Override // defpackage.dcir
    public final dcis<K, V, dcip<K, V>> e() {
        return this.c;
    }
}
