package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcuz  reason: default package */
/* loaded from: classes5.dex */
public final class dcuz implements Comparable<dcuz>, Serializable {
    public static final dcuz a = new dcuz(dcyn.a);
    public static final dcuz b;
    public static final dcuz c;
    public static final dcuz d;
    public final double e;

    static {
        new dcuz(2.0d);
        b = new dcuz(4.0d);
        c = new dcuz(Double.POSITIVE_INFINITY);
        d = new dcuz(-1.0d);
    }

    private dcuz(double d2) {
        this.e = d2;
        dbsk.a(e());
    }

    public static dcuz a(dcuy dcuyVar) {
        if (dcuyVar.b < dcyn.a) {
            return d;
        }
        if (dcuyVar.equals(dcuy.a)) {
            return c;
        }
        double sin = Math.sin(Math.min(3.141592653589793d, dcuyVar.b) * 0.5d);
        double d2 = sin + sin;
        return new dcuz(d2 * d2);
    }

    public static dcuz b(double d2) {
        return new dcuz(Math.min(4.0d, d2));
    }

    public static double g(dcuz dcuzVar) {
        dbsk.a(!(dcuzVar.c() || dcuzVar.d()));
        double d2 = dcuzVar.e;
        return Math.sqrt(d2 * (1.0d - (0.25d * d2)));
    }

    public final boolean c() {
        return this.e < dcyn.a;
    }

    public final boolean d() {
        return this.e == Double.POSITIVE_INFINITY;
    }

    public final boolean e() {
        double d2 = this.e;
        return (d2 >= dcyn.a && d2 <= 4.0d) || c() || d();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dcuz) && this.e == ((dcuz) obj).e;
    }

    public final dcuy f() {
        double d2;
        if (c()) {
            d2 = -1.0d;
        } else if (d()) {
            return dcuy.a;
        } else {
            double asin = Math.asin(Math.sqrt(this.e) * 0.5d);
            d2 = asin + asin;
        }
        return dcuy.d(d2);
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public final int compareTo(dcuz dcuzVar) {
        return Double.compare(this.e, dcuzVar.e);
    }

    public final int hashCode() {
        double d2 = this.e;
        if (d2 == dcyn.a) {
            return 0;
        }
        return decb.a(d2);
    }

    public final String toString() {
        return f().toString();
    }

    public dcuz(dcwa dcwaVar, dcwa dcwaVar2) {
        dbsk.a(dcvc.c(dcwaVar));
        dbsk.a(dcvc.c(dcwaVar2));
        this.e = Math.min(4.0d, dcwaVar.l(dcwaVar2));
        dbsk.a(e());
    }
}
