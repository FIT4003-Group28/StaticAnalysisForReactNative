package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dcii  reason: default package */
/* loaded from: classes.dex */
final class dcii<K, V> extends dcia<K, V, dcih<K, V>, dcii<K, V>> {
    public final ReferenceQueue<V> h;

    public dcii(dciv<K, V, dcih<K, V>, dcii<K, V>> dcivVar, int i) {
        super(dcivVar, i);
        this.h = new ReferenceQueue<>();
    }

    @Override // defpackage.dcia
    public final void a() {
        g(this.h);
    }

    @Override // defpackage.dcia
    public final void b() {
        n(this.h);
    }
}
