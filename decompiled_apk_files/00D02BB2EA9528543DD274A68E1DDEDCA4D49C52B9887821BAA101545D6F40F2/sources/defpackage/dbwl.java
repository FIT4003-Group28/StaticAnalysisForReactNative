package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: dbwl  reason: default package */
/* loaded from: classes5.dex */
class dbwl<K, V> extends WeakReference<V> implements dbwg<K, V> {
    final dbwv<K, V> a;

    public dbwl(ReferenceQueue<V> referenceQueue, V v, dbwv<K, V> dbwvVar) {
        super(v, referenceQueue);
        this.a = dbwvVar;
    }

    @Override // defpackage.dbwg
    public int a() {
        return 1;
    }

    @Override // defpackage.dbwg
    public final dbwv<K, V> b() {
        return this.a;
    }

    @Override // defpackage.dbwg
    public dbwg<K, V> c(ReferenceQueue<V> referenceQueue, V v, dbwv<K, V> dbwvVar) {
        return new dbwl(referenceQueue, v, dbwvVar);
    }

    @Override // defpackage.dbwg
    public final boolean d() {
        return false;
    }

    @Override // defpackage.dbwg
    public final boolean e() {
        return true;
    }

    @Override // defpackage.dbwg
    public final V f() {
        return get();
    }

    @Override // defpackage.dbwg
    public final void g(V v) {
    }
}