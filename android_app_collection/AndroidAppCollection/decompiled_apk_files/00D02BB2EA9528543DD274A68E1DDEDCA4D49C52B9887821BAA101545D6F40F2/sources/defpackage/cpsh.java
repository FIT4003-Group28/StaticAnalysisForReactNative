package defpackage;
/* compiled from: PG */
/* renamed from: cpsh  reason: default package */
/* loaded from: classes5.dex */
public final class cpsh {
    public cpsf<Double> a;
    public double b;
    public double c;
    public double d;
    public double e;
    public final cpsf<Double> f;
    public float g;

    public cpsh() {
        Double valueOf = Double.valueOf((double) dcyn.a);
        this.f = new cpsf<>(valueOf, valueOf);
    }

    public final boolean a(Double d) {
        boolean z = false;
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue < this.b) {
                this.b = doubleValue;
                z = true;
            }
            if (doubleValue > this.c) {
                this.c = doubleValue;
                return true;
            }
        }
        return z;
    }

    public final void b() {
        double d;
        double d2;
        cpsf<Double> cpsfVar = this.a;
        if (cpsfVar != null) {
            d = cpsfVar.a.doubleValue();
            d2 = this.a.b.doubleValue();
        } else {
            d = this.b;
            if (d >= Double.MAX_VALUE) {
                d = dcyn.a;
            }
            d2 = this.c;
            if (d2 <= -1.7976931348623157E308d) {
                d2 = 1.0d;
            }
        }
        this.g = (float) (d2 - d);
        this.f.b(Double.valueOf(d), Double.valueOf(d2));
    }

    public cpsh(cpsh cpshVar) {
        Double valueOf = Double.valueOf((double) dcyn.a);
        this.f = new cpsf<>(valueOf, valueOf);
        cpsf<Double> cpsfVar = cpshVar.a;
        if (cpsfVar != null) {
            this.a = cpsfVar.a();
        }
        this.b = cpshVar.b;
        this.c = cpshVar.c;
        this.d = cpshVar.d;
        this.e = cpshVar.e;
    }
}
