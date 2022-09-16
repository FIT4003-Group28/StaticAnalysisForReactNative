package defpackage;
/* compiled from: PG */
/* renamed from: sem  reason: default package */
/* loaded from: classes4.dex */
final class sem {
    public double a;
    public double b;
    public double c;
    public double d;
    public final sek e;
    public float f;
    private sek g;

    public sem() {
        Double valueOf = Double.valueOf(0.0d);
        this.e = new sek(valueOf, valueOf);
    }

    public final void a() {
        double d;
        double d2;
        sek sekVar = this.g;
        if (sekVar != null) {
            d = ((Double) sekVar.a).doubleValue();
            d2 = ((Double) this.g.b).doubleValue();
        } else {
            d = this.a;
            if (d >= Double.MAX_VALUE) {
                d = 0.0d;
            }
            d2 = this.b;
            if (d2 <= -1.7976931348623157E308d) {
                d2 = 1.0d;
            }
        }
        this.f = (float) (d2 - d);
        this.e.b(Double.valueOf(d), Double.valueOf(d2));
    }

    public final boolean b(Double d) {
        boolean z = false;
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue < this.a) {
                this.a = doubleValue;
                z = true;
            }
            if (doubleValue > this.b) {
                this.b = doubleValue;
                return true;
            }
        }
        return z;
    }

    public sem(sem semVar) {
        Double valueOf = Double.valueOf(0.0d);
        this.e = new sek(valueOf, valueOf);
        sek sekVar = semVar.g;
        if (sekVar != null) {
            this.g = sekVar.a();
        }
        this.a = semVar.a;
        this.b = semVar.b;
        this.c = semVar.c;
        this.d = semVar.d;
    }
}
