package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbwk  reason: default package */
/* loaded from: classes5.dex */
public class dbwk<K, V> extends WeakReference<K> implements dbwv<K, V> {
    final int g;
    final dbwv<K, V> h;
    volatile dbwg<K, V> i;

    public dbwk(ReferenceQueue<K> referenceQueue, K k, int i, dbwv<K, V> dbwvVar) {
        super(k, referenceQueue);
        this.i = (dbwg<K, V>) dbwu.t;
        this.g = i;
        this.h = dbwvVar;
    }

    @Override // defpackage.dbwv
    public final dbwg<K, V> a() {
        return this.i;
    }

    @Override // defpackage.dbwv
    public final void b(dbwg<K, V> dbwgVar) {
        this.i = dbwgVar;
    }

    @Override // defpackage.dbwv
    public final dbwv<K, V> c() {
        return this.h;
    }

    @Override // defpackage.dbwv
    public final int d() {
        return this.g;
    }

    @Override // defpackage.dbwv
    public final K e() {
        return (K) get();
    }

    public long f() {
        throw new UnsupportedOperationException();
    }

    public void g(long j) {
        throw new UnsupportedOperationException();
    }

    public dbwv<K, V> h() {
        throw new UnsupportedOperationException();
    }

    public void i(dbwv<K, V> dbwvVar) {
        throw new UnsupportedOperationException();
    }

    public dbwv<K, V> j() {
        throw new UnsupportedOperationException();
    }

    public void k(dbwv<K, V> dbwvVar) {
        throw new UnsupportedOperationException();
    }

    public long l() {
        throw new UnsupportedOperationException();
    }

    public void m(long j) {
        throw new UnsupportedOperationException();
    }

    public dbwv<K, V> n() {
        throw new UnsupportedOperationException();
    }

    public void o(dbwv<K, V> dbwvVar) {
        throw new UnsupportedOperationException();
    }

    public dbwv<K, V> p() {
        throw new UnsupportedOperationException();
    }

    public void q(dbwv<K, V> dbwvVar) {
        throw new UnsupportedOperationException();
    }
}
