package defpackage;
/* compiled from: PG */
/* renamed from: akqr  reason: default package */
/* loaded from: classes.dex */
public final class akqr {
    public double a = Double.POSITIVE_INFINITY;
    public double b = Double.NEGATIVE_INFINITY;
    public double c = Double.NaN;
    public double d = Double.NaN;

    public final boolean a() {
        return Double.isNaN(this.c);
    }

    public final akqs b() {
        dbsk.m(!a(), "No points included");
        return new akqs(new akqq(this.a, this.c), new akqq(this.b, this.d));
    }

    public final void c(double d, double d2) {
        this.a = Math.min(this.a, d);
        this.b = Math.max(this.b, d);
        if (a()) {
            this.c = d2;
            this.d = d2;
            return;
        }
        double d3 = this.c;
        double d4 = this.d;
        if (d3 <= d4) {
            if (d3 <= d2 && d2 <= d4) {
                return;
            }
        } else if (d3 <= d2 || d2 <= d4) {
            return;
        }
        if (((d3 - d2) + 360.0d) % 360.0d < ((d2 - d4) + 360.0d) % 360.0d) {
            this.c = d2;
        } else {
            this.d = d2;
        }
    }

    public final void d(akqq akqqVar) {
        c(akqqVar.a, akqqVar.b);
    }
}
