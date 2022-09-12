package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcuy  reason: default package */
/* loaded from: classes.dex */
public final class dcuy implements Comparable<dcuy>, Serializable {
    public static final dcuy a = new dcuy(Double.POSITIVE_INFINITY);
    public final double b;

    static {
        new dcuy();
    }

    public dcuy() {
        this.b = dcyn.a;
    }

    private dcuy(double d) {
        this.b = d;
    }

    public static dcuy d(double d) {
        return new dcuy(d);
    }

    public static dcuy e(double d) {
        return new dcuy(d * 0.017453292519943295d);
    }

    public static dcuy f(int i) {
        double d = i;
        Double.isNaN(d);
        return e(d * 1.0E-6d);
    }

    public static dcuy g(int i) {
        double d = i;
        Double.isNaN(d);
        return e(d * 1.0E-7d);
    }

    @Deprecated
    public static dcuy h(double d) {
        return d(d / 6367000.0d);
    }

    public final double a() {
        return this.b * 57.29577951308232d;
    }

    public final int b() {
        return decl.a(Math.round(a() * 1000000.0d));
    }

    public final int c() {
        return decl.a(Math.round(a() * 1.0E7d));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dcuy dcuyVar) {
        double d = this.b;
        double d2 = dcuyVar.b;
        if (d < d2) {
            return -1;
        }
        return d <= d2 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dcuy) && this.b == ((dcuy) obj).b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Deprecated
    public final double i() {
        return this.b * 6367000.0d;
    }

    public final String toString() {
        double a2 = a();
        StringBuilder sb = new StringBuilder(25);
        sb.append(a2);
        sb.append("d");
        return sb.toString();
    }
}
