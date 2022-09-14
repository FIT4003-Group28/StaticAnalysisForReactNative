package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbvr  reason: default package */
/* loaded from: classes5.dex */
public final class dbvr<K, V> implements dbwg<K, V> {
    volatile dbwg<K, V> a;
    final deig<V> b;
    final dbtp c;

    public dbvr() {
        this(dbwu.t);
    }

    @Override // defpackage.dbwg
    public final int a() {
        return this.a.a();
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
        return true;
    }

    @Override // defpackage.dbwg
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.dbwg
    public final V f() {
        return (V) deix.b(this.b);
    }

    @Override // defpackage.dbwg
    public final void g(V v) {
        if (v != null) {
            h(v);
        } else {
            this.a = (dbwg<K, V>) dbwu.t;
        }
    }

    @Override // defpackage.dbwg
    public final V get() {
        return this.a.get();
    }

    public final boolean h(V v) {
        return this.b.j(v);
    }

    public final boolean i(Throwable th) {
        return this.b.k(th);
    }

    public final dehn<V> j(K k, dbus<? super K, V> dbusVar) {
        try {
            this.c.f();
            if (this.a.get() != null) {
                dbsk.s(k);
                dehn a = deha.a(dbusVar.b(k));
                if (a == null) {
                    return deha.a(null);
                }
                return deew.h(a, new dbvq(this), dege.a);
            }
            V b = dbusVar.b(k);
            return h(b) ? this.b : deha.a(b);
        } catch (Throwable th) {
            dehn<V> b2 = i(th) ? this.b : deha.b(th);
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return b2;
        }
    }

    public final void k() {
        this.c.d(TimeUnit.NANOSECONDS);
    }

    public dbvr(dbwg<K, V> dbwgVar) {
        this.b = deig.d();
        this.c = dbtp.a();
        this.a = dbwgVar;
    }
}
