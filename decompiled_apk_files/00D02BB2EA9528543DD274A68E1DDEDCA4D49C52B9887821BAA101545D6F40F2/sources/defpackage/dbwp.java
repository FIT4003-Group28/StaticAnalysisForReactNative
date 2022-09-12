package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dbwp  reason: default package */
/* loaded from: classes5.dex */
final class dbwp<K, V> extends dbwl<K, V> {
    final int b;

    public dbwp(ReferenceQueue<V> referenceQueue, V v, dbwv<K, V> dbwvVar, int i) {
        super(referenceQueue, v, dbwvVar);
        this.b = i;
    }

    @Override // defpackage.dbwl, defpackage.dbwg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dbwl, defpackage.dbwg
    public final dbwg<K, V> c(ReferenceQueue<V> referenceQueue, V v, dbwv<K, V> dbwvVar) {
        return new dbwp(referenceQueue, v, dbwvVar, this.b);
    }
}
