package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dcin  reason: default package */
/* loaded from: classes.dex */
final class dcin<K, V> extends dcia<K, V, dcim<K, V>, dcin<K, V>> {
    public final ReferenceQueue<K> h;

    public dcin(dciv<K, V, dcim<K, V>, dcin<K, V>> dcivVar, int i) {
        super(dcivVar, i);
        this.h = new ReferenceQueue<>();
    }

    @Override // defpackage.dcia
    public final void a() {
        f(this.h);
    }

    @Override // defpackage.dcia
    public final void b() {
        n(this.h);
    }
}
