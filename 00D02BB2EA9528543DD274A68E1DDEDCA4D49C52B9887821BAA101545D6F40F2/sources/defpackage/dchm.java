package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: dchm  reason: default package */
/* loaded from: classes.dex */
public final class dchm {
    boolean a;
    int b = -1;
    int c = -1;
    dcic d;
    dcic e;
    dbrl<Object> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcic c() {
        return (dcic) dbsc.a(this.d, dcic.STRONG);
    }

    final dcic d() {
        return (dcic) dbsc.a(this.e, dcic.STRONG);
    }

    public final <K, V> ConcurrentMap<K, V> e() {
        if (this.a) {
            if (c() != dcic.STRONG || d() != dcic.STRONG) {
                if (c() != dcic.STRONG || d() != dcic.WEAK) {
                    if (c() != dcic.WEAK || d() != dcic.STRONG) {
                        if (c() != dcic.WEAK || d() != dcic.WEAK) {
                            throw new AssertionError();
                        }
                        return new dciv(this, dcio.a);
                    }
                    return new dciv(this, dcil.a);
                }
                return new dciv(this, dcig.a);
            }
            return new dciv(this, dcid.a);
        }
        return new ConcurrentHashMap(a(), 0.75f, b());
    }

    public final void f(int i) {
        int i2 = this.c;
        boolean z = true;
        dbsk.n(i2 == -1, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z = false;
        }
        dbsk.a(z);
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(dcic dcicVar) {
        dcic dcicVar2 = this.d;
        dbsk.p(dcicVar2 == null, "Key strength was already set to %s", dcicVar2);
        dbsk.s(dcicVar);
        this.d = dcicVar;
        if (dcicVar != dcic.STRONG) {
            this.a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(dcic dcicVar) {
        dcic dcicVar2 = this.e;
        dbsk.p(dcicVar2 == null, "Value strength was already set to %s", dcicVar2);
        dbsk.s(dcicVar);
        this.e = dcicVar;
        if (dcicVar != dcic.STRONG) {
            this.a = true;
        }
    }

    public final void i() {
        g(dcic.WEAK);
    }

    public final void j() {
        h(dcic.WEAK);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        int i = this.b;
        if (i != -1) {
            b.f("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            b.f("concurrencyLevel", i2);
        }
        dcic dcicVar = this.d;
        if (dcicVar != null) {
            b.b("keyStrength", dbqa.a(dcicVar.toString()));
        }
        dcic dcicVar2 = this.e;
        if (dcicVar2 != null) {
            b.b("valueStrength", dbqa.a(dcicVar2.toString()));
        }
        if (this.f != null) {
            b.a("keyEquivalence");
        }
        return b.toString();
    }
}
