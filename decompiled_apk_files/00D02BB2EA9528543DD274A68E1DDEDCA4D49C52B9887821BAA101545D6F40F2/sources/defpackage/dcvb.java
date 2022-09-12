package defpackage;
/* compiled from: PG */
/* renamed from: dcvb  reason: default package */
/* loaded from: classes5.dex */
public final class dcvb {
    public final double a;
    public final int b;

    public dcvb(int i, double d) {
        this.a = d;
        this.b = i;
    }

    public final int a(double d) {
        if (d <= dcyn.a) {
            return 30;
        }
        return Math.max(0, Math.min(30, Math.getExponent(this.a / d) >> (this.b - 1)));
    }
}
