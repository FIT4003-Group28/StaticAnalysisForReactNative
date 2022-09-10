package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dciq  reason: default package */
/* loaded from: classes5.dex */
final class dciq<K, V> extends dcia<K, V, dcip<K, V>, dciq<K, V>> {
    public final ReferenceQueue<K> h;
    public final ReferenceQueue<V> i;

    public dciq(dciv<K, V, dcip<K, V>, dciq<K, V>> dcivVar, int i) {
        super(dcivVar, i);
        this.h = new ReferenceQueue<>();
        this.i = new ReferenceQueue<>();
    }

    @Override // defpackage.dcia
    public final void a() {
        f(this.h);
        g(this.i);
    }

    @Override // defpackage.dcia
    public final void b() {
        n(this.h);
    }
}
