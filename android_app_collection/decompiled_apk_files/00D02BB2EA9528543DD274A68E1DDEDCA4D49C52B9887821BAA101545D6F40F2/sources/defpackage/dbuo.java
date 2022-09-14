package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dbuo  reason: default package */
/* loaded from: classes.dex */
public final class dbuo<K, V> {
    static final dbty<? extends dbuk> a = dbud.b(new dbuk());
    static final dbug b;
    private static final Logger r;
    dbwz<? super K, ? super V> h;
    dbvz i;
    dbvz j;
    dbrl<Object> m;
    dbrl<Object> n;
    dbwx<? super K, ? super V> o;
    dbug p;
    boolean c = true;
    int d = -1;
    int e = -1;
    long f = -1;
    long g = -1;
    long k = -1;
    long l = -1;
    final dbty<? extends dbuk> q = a;

    static {
        new dbut();
        b = new dbul();
        r = Logger.getLogger(dbuo.class.getName());
    }

    private dbuo() {
    }

    public static dbuo<Object, Object> a() {
        return new dbuo<>();
    }

    private final void n() {
        boolean z = true;
        if (this.h == null) {
            if (this.g != -1) {
                z = false;
            }
            dbsk.m(z, "maximumWeight requires weigher");
        } else if (this.c) {
            if (this.g == -1) {
                z = false;
            }
            dbsk.m(z, "weigher requires maximumWeight");
        } else if (this.g != -1) {
        } else {
            r.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbvz b() {
        return (dbvz) dbsc.a(this.i, dbvz.STRONG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbvz c() {
        return (dbvz) dbsc.a(this.j, dbvz.STRONG);
    }

    public final <K1 extends K, V1 extends V> dbuv<K1, V1> d(dbus<? super K1, V1> dbusVar) {
        n();
        return new dbvs(this, dbusVar);
    }

    public final <K1 extends K, V1 extends V> dbuj<K1, V1> e() {
        n();
        dbsk.m(true, "refreshAfterWrite requires a LoadingCache");
        return new dbvu(new dbwu(this, null));
    }

    public final void f(int i) {
        int i2 = this.e;
        boolean z = true;
        dbsk.n(i2 == -1, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z = false;
        }
        dbsk.a(z);
        this.e = i;
    }

    public final void g(long j, TimeUnit timeUnit) {
        long j2 = this.l;
        boolean z = true;
        dbsk.o(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        dbsk.i(z, "duration cannot be negative: %s %s", j, timeUnit);
        this.l = timeUnit.toNanos(j);
    }

    public final void h(long j, TimeUnit timeUnit) {
        long j2 = this.k;
        boolean z = true;
        dbsk.o(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        dbsk.i(z, "duration cannot be negative: %s %s", j, timeUnit);
        this.k = timeUnit.toNanos(j);
    }

    public final void i(int i) {
        int i2 = this.d;
        dbsk.n(i2 == -1, "initial capacity was already set to %s", i2);
        dbsk.a(true);
        this.d = i;
    }

    public final void j(long j) {
        long j2 = this.f;
        boolean z = true;
        dbsk.o(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.g;
        dbsk.o(j3 == -1, "maximum weight was already set to %s", j3);
        dbsk.m(this.h == null, "maximum size can not be combined with weigher");
        if (j < 0) {
            z = false;
        }
        dbsk.b(z, "maximum size must not be negative");
        this.f = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K1 extends K, V1 extends V> void k(dbwx<? super K1, ? super V1> dbwxVar) {
        dbsk.l(this.o == null);
        dbsk.s(dbwxVar);
        this.o = dbwxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(dbvz dbvzVar) {
        dbvz dbvzVar2 = this.i;
        dbsk.p(dbvzVar2 == null, "Key strength was already set to %s", dbvzVar2);
        dbsk.s(dbvzVar);
        this.i = dbvzVar;
    }

    public final void m(dbug dbugVar) {
        dbsk.l(this.p == null);
        this.p = dbugVar;
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        int i = this.d;
        if (i != -1) {
            b2.f("initialCapacity", i);
        }
        int i2 = this.e;
        if (i2 != -1) {
            b2.f("concurrencyLevel", i2);
        }
        long j = this.f;
        if (j != -1) {
            b2.g("maximumSize", j);
        }
        long j2 = this.g;
        if (j2 != -1) {
            b2.g("maximumWeight", j2);
        }
        long j3 = this.k;
        if (j3 != -1) {
            StringBuilder sb = new StringBuilder(22);
            sb.append(j3);
            sb.append("ns");
            b2.b("expireAfterWrite", sb.toString());
        }
        long j4 = this.l;
        if (j4 != -1) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append(j4);
            sb2.append("ns");
            b2.b("expireAfterAccess", sb2.toString());
        }
        dbvz dbvzVar = this.i;
        if (dbvzVar != null) {
            b2.b("keyStrength", dbqa.a(dbvzVar.toString()));
        }
        dbvz dbvzVar2 = this.j;
        if (dbvzVar2 != null) {
            b2.b("valueStrength", dbqa.a(dbvzVar2.toString()));
        }
        if (this.m != null) {
            b2.a("keyEquivalence");
        }
        if (this.n != null) {
            b2.a("valueEquivalence");
        }
        if (this.o != null) {
            b2.a("removalListener");
        }
        return b2.toString();
    }
}
