package defpackage;

import java.lang.ref.ReferenceQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbwi  reason: default package */
/* loaded from: classes5.dex */
public final class dbwi<K, V> extends dbwk<K, V> {
    volatile long a;
    dbwv<K, V> b;
    dbwv<K, V> c;

    public dbwi(ReferenceQueue<K> referenceQueue, K k, int i, dbwv<K, V> dbwvVar) {
        super(referenceQueue, k, i, dbwvVar);
        this.a = Long.MAX_VALUE;
        this.b = dbwu.i();
        this.c = dbwu.i();
    }

    @Override // defpackage.dbwk, defpackage.dbwv
    public final long f() {
        return this.a;
    }

    @Override // defpackage.dbwk, defpackage.dbwv
    public final void g(long j) {
        this.a = j;
    }

    @Override // defpackage.dbwk, defpackage.dbwv
    public final dbwv<K, V> h() {
        return this.b;
    }

    @Override // defpackage.dbwk, defpackage.dbwv
    public final void i(dbwv<K, V> dbwvVar) {
        this.b = dbwvVar;
    }

    @Override // defpackage.dbwk, defpackage.dbwv
    public final dbwv<K, V> j() {
        return this.c;
    }

    @Override // defpackage.dbwk, defpackage.dbwv
    public final void k(dbwv<K, V> dbwvVar) {
        this.c = dbwvVar;
    }
}
