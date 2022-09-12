package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
/* compiled from: PG */
/* renamed from: dclz  reason: default package */
/* loaded from: classes5.dex */
public final class dclz<C extends Comparable> extends dcma implements Serializable, dbsl {
    public static final dclz<Comparable> a = new dclz<>(dcai.a, dcag.a);
    private static final long serialVersionUID = 0;
    public final dcak<C> b;
    public final dcak<C> c;

    private dclz(dcak<C> dcakVar, dcak<C> dcakVar2) {
        dbsk.s(dcakVar);
        this.b = dcakVar;
        dbsk.s(dcakVar2);
        this.c = dcakVar2;
        if (dcakVar.compareTo(dcakVar2) > 0 || dcakVar == dcag.a || dcakVar2 == dcai.a) {
            String valueOf = String.valueOf(u(dcakVar, dcakVar2));
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid range: ".concat(valueOf) : new String("Invalid range: "));
        }
    }

    public static <C extends Comparable<?>> dbrn<dclz<C>, dcak<C>> b() {
        return dclx.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable<?>> dclu<dclz<C>> c() {
        return (dclu<dclz<C>>) dcly.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <C extends Comparable<?>> dclz<C> d(dcak<C> dcakVar, dcak<C> dcakVar2) {
        return new dclz<>(dcakVar, dcakVar2);
    }

    public static <C extends Comparable<?>> dclz<C> e(C c, C c2) {
        return d(dcak.k(c), dcak.j(c2));
    }

    public static <C extends Comparable<?>> dclz<C> f(C c, C c2) {
        return d(dcak.j(c), dcak.k(c2));
    }

    public static <C extends Comparable<?>> dclz<C> g(C c, C c2) {
        return d(dcak.j(c), dcak.j(c2));
    }

    public static <C extends Comparable<?>> dclz<C> h(C c, dbyz dbyzVar, C c2, dbyz dbyzVar2) {
        dbsk.s(dbyzVar);
        dbsk.s(dbyzVar2);
        return d(dbyzVar == dbyz.OPEN ? dcak.k(c) : dcak.j(c), dbyzVar2 == dbyz.OPEN ? dcak.j(c2) : dcak.k(c2));
    }

    public static <C extends Comparable<?>> dclz<C> i(C c) {
        return d(dcai.a, dcak.j(c));
    }

    public static <C extends Comparable<?>> dclz<C> j(C c) {
        return d(dcai.a, dcak.k(c));
    }

    public static <C extends Comparable<?>> dclz<C> k(C c, dbyz dbyzVar) {
        dbyz dbyzVar2 = dbyz.OPEN;
        int ordinal = dbyzVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return j(c);
            }
            throw new AssertionError();
        }
        return i(c);
    }

    public static <C extends Comparable<?>> dclz<C> l(C c) {
        return d(dcak.j(c), dcag.a);
    }

    public static <C extends Comparable<?>> dclz<C> m(C c, dbyz dbyzVar) {
        dbyz dbyzVar2 = dbyz.OPEN;
        int ordinal = dbyzVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return l(c);
            }
            throw new AssertionError();
        }
        return d(dcak.k(c), dcag.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    private static String u(dcak<?> dcakVar, dcak<?> dcakVar2) {
        StringBuilder sb = new StringBuilder(16);
        dcakVar.e(sb);
        sb.append("..");
        dcakVar2.f(sb);
        return sb.toString();
    }

    @Override // defpackage.dbsl
    public final boolean equals(Object obj) {
        if (obj instanceof dclz) {
            dclz dclzVar = (dclz) obj;
            if (this.b.equals(dclzVar.b) && this.c.equals(dclzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final C n() {
        return this.b.a();
    }

    public final C o() {
        return this.c.a();
    }

    public final boolean p() {
        return this.b.equals(this.c);
    }

    @Override // defpackage.dbsl
    /* renamed from: q */
    public final boolean a(C c) {
        dbsk.s(c);
        return this.b.b(c) && !this.c.b(c);
    }

    public final boolean r(dclz<C> dclzVar) {
        return this.b.compareTo(dclzVar.c) <= 0 && dclzVar.b.compareTo(this.c) <= 0;
    }

    Object readResolve() {
        dclz<Comparable> dclzVar = a;
        return equals(dclzVar) ? dclzVar : this;
    }

    public final dclz<C> s(dclz<C> dclzVar) {
        dcak<C> dcakVar;
        int compareTo = this.b.compareTo(dclzVar.b);
        int compareTo2 = this.c.compareTo(dclzVar.c);
        if (compareTo < 0 || compareTo2 > 0) {
            if (compareTo <= 0 && compareTo2 >= 0) {
                return dclzVar;
            }
            dcak<C> dcakVar2 = compareTo >= 0 ? this.b : dclzVar.b;
            if (compareTo2 <= 0) {
                dcakVar = this.c;
            } else {
                dcakVar = dclzVar.c;
            }
            return d(dcakVar2, dcakVar);
        }
        return this;
    }

    public final String toString() {
        return u(this.b, this.c);
    }
}
