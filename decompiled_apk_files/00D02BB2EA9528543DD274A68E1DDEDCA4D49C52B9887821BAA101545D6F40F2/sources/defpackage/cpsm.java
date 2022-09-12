package defpackage;
/* compiled from: PG */
/* renamed from: cpsm  reason: default package */
/* loaded from: classes5.dex */
public final class cpsm {
    public final double a;
    public final int b;

    private cpsm(int i, double d) {
        this.b = i;
        this.a = d;
    }

    public static cpsm a() {
        return new cpsm(1, dcyn.a);
    }

    public static cpsm b() {
        return c(1);
    }

    public static cpsm c(int i) {
        return new cpsm(5, cpqg.a.a(i));
    }

    public static cpsm d(int i) {
        return new cpsm(6, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cpsm cpsmVar = (cpsm) obj;
        return Double.compare(cpsmVar.a, this.a) == 0 && this.b == cpsmVar.b;
    }

    public final int hashCode() {
        int i = this.b;
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }
}
