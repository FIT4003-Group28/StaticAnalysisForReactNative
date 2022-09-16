package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbwb  reason: default package */
/* loaded from: classes5.dex */
public final class dbwb<K, V> extends dbwc<K, V> {
    volatile long a;
    dbwv<K, V> b;
    dbwv<K, V> c;
    volatile long d;
    dbwv<K, V> e;
    dbwv<K, V> f;

    public dbwb(K k, int i, dbwv<K, V> dbwvVar) {
        super(k, i, dbwvVar);
        this.a = Long.MAX_VALUE;
        this.b = dbwu.i();
        this.c = dbwu.i();
        this.d = Long.MAX_VALUE;
        this.e = dbwu.i();
        this.f = dbwu.i();
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final long f() {
        return this.a;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final void g(long j) {
        this.a = j;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final dbwv<K, V> h() {
        return this.b;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final void i(dbwv<K, V> dbwvVar) {
        this.b = dbwvVar;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final dbwv<K, V> j() {
        return this.c;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final void k(dbwv<K, V> dbwvVar) {
        this.c = dbwvVar;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final long l() {
        return this.d;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final void m(long j) {
        this.d = j;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final dbwv<K, V> n() {
        return this.e;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final void o(dbwv<K, V> dbwvVar) {
        this.e = dbwvVar;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final dbwv<K, V> p() {
        return this.f;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final void q(dbwv<K, V> dbwvVar) {
        this.f = dbwvVar;
    }
}
