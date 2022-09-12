package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dbwn  reason: default package */
/* loaded from: classes5.dex */
final class dbwn<K, V> extends dbvy<K, V> {
    final int b;

    public dbwn(ReferenceQueue<V> referenceQueue, V v, dbwv<K, V> dbwvVar, int i) {
        super(referenceQueue, v, dbwvVar);
        this.b = i;
    }

    @Override // defpackage.dbvy, defpackage.dbwg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dbvy, defpackage.dbwg
    public final dbwg<K, V> c(ReferenceQueue<V> referenceQueue, V v, dbwv<K, V> dbwvVar) {
        return new dbwn(referenceQueue, v, dbwvVar, this.b);
    }
}
