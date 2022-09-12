package defpackage;

import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: dbwd  reason: default package */
/* loaded from: classes5.dex */
class dbwd<K, V> implements dbwg<K, V> {
    final V a;

    public dbwd(V v) {
        this.a = v;
    }

    @Override // defpackage.dbwg
    public int a() {
        return 1;
    }

    @Override // defpackage.dbwg
    public final dbwv<K, V> b() {
        return null;
    }

    @Override // defpackage.dbwg
    public final dbwg<K, V> c(ReferenceQueue<V> referenceQueue, V v, dbwv<K, V> dbwvVar) {
        return this;
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
        return this.a;
    }

    @Override // defpackage.dbwg
    public final void g(V v) {
    }

    @Override // defpackage.dbwg
    public final V get() {
        return this.a;
    }
}
