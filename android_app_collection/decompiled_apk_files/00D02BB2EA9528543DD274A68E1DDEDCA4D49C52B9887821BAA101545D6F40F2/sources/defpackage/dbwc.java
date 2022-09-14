package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbwc  reason: default package */
/* loaded from: classes5.dex */
public class dbwc<K, V> extends dbuz<K, V> {
    final K g;
    final int h;
    final dbwv<K, V> i;
    volatile dbwg<K, V> j = (dbwg<K, V>) dbwu.t;

    public dbwc(K k, int i, dbwv<K, V> dbwvVar) {
        this.g = k;
        this.h = i;
        this.i = dbwvVar;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final dbwg<K, V> a() {
        return this.j;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final void b(dbwg<K, V> dbwgVar) {
        this.j = dbwgVar;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final dbwv<K, V> c() {
        return this.i;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final int d() {
        return this.h;
    }

    @Override // defpackage.dbuz, defpackage.dbwv
    public final K e() {
        return this.g;
    }
}
