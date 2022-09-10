package defpackage;
/* compiled from: PG */
/* renamed from: awoz  reason: default package */
/* loaded from: classes3.dex */
public final class awoz implements awov {
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    private final awpf j;
    private float k;
    public final awpd a = new awpd();
    private final akqa g = new akqa(dcyn.a);
    private final akqa h = new akqa(dcyn.a);
    private final akra i = new akra();

    public awoz(awpf awpfVar) {
        dbsk.s(awpfVar);
        this.j = awpfVar;
    }

    @Override // defpackage.awov
    public final float b() {
        return this.b;
    }

    @Override // defpackage.awov
    public final float c() {
        return this.c;
    }

    @Override // defpackage.awov
    public final float d() {
        return this.d;
    }

    @Override // defpackage.awov
    public final float e() {
        return this.e;
    }

    public final boolean f(float f, float f2) {
        this.j.b(this.a);
        awpd awpdVar = this.a;
        if (awpdVar.a != null) {
            return true;
        }
        if (awpdVar.d == null) {
            return false;
        }
        float hypot = (float) Math.hypot(this.b, this.c);
        double atan2 = Math.atan2(this.c, this.b);
        double a = awpa.a(hypot, awpa.b(hypot, f2), f2, f);
        double d = (float) atan2;
        akra akraVar = this.i;
        double d2 = this.d;
        double cos = Math.cos(d);
        Double.isNaN(a);
        Double.isNaN(d2);
        akraVar.a = (int) Math.round(d2 + (cos * a));
        akra akraVar2 = this.i;
        double d3 = this.e;
        double sin = Math.sin(d);
        Double.isNaN(a);
        Double.isNaN(d3);
        akraVar2.b = (int) Math.round(d3 + (a * sin));
        this.j.e(this.a, this.i, true);
        return true;
    }

    @Override // defpackage.awov
    public final boolean a(float f, float f2, float f3) {
        float f4 = this.k + f;
        float f5 = this.f;
        float f6 = 1.0f;
        float a = f5 == 0.0f ? 1.0f : akn.a(f4 / f5, 0.0f, 1.0f);
        if (a >= 0.35f && this.f >= 0.45f && f(f2, f3)) {
            g(f3);
            f4 = this.k + f;
            float f7 = this.f;
            if (f7 != 0.0f) {
                f6 = akn.a(f4 / f7, 0.0f, 1.0f);
            }
            a = f6;
        }
        double d = a;
        this.b = ((float) this.g.f(d)) / this.f;
        this.c = ((float) this.h.f(d)) / this.f;
        this.d = (float) this.g.d(d);
        this.e = (float) this.h.d(d);
        this.k = f4;
        return f4 < this.f;
    }

    public final void g(float f) {
        float f2;
        float f3;
        float f4;
        this.k = 0.0f;
        float f5 = this.d;
        float f6 = this.e;
        awpd awpdVar = this.a;
        akra akraVar = awpdVar.a;
        if (akraVar != null) {
            f2 = akraVar.a;
            f3 = akraVar.b;
        } else {
            akrn akrnVar = awpdVar.d;
            if (akrnVar != null) {
                akra akraVar2 = akrnVar.a;
                float f7 = akraVar2.a;
                f3 = akraVar2.b;
                f2 = f7;
            } else {
                f2 = f5;
                f3 = f6;
            }
        }
        float f8 = this.b;
        float f9 = this.c;
        akqa akqaVar = this.g;
        akqa akqaVar2 = this.h;
        float max = Math.max(((float) Math.sqrt((f4 + f4) * ((float) Math.hypot(f2 - f5, f3 - f6)))) / (7.5f * f), awpa.b((float) Math.hypot(f8, f9), f));
        akqaVar.g(f5, f8 * max, f2, dcyn.a);
        akqaVar2.g(f6, f9 * max, f3, dcyn.a);
        this.f = max;
    }
}
