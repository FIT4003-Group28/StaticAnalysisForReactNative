package defpackage;
/* compiled from: PG */
/* renamed from: ser  reason: default package */
/* loaded from: classes4.dex */
public final class ser {
    public final double a;
    public final int b;

    private ser(int i, double d) {
        this.b = i;
        this.a = d;
    }

    public static ser a() {
        return new ser(1, 0.0d);
    }

    public static ser b() {
        return c(1);
    }

    public static ser c(int i) {
        return new ser(5, sfc.e(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ser serVar = (ser) obj;
        return Double.compare(serVar.a, this.a) == 0 && this.b == serVar.b;
    }

    public final int hashCode() {
        int i = this.b;
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }
}
