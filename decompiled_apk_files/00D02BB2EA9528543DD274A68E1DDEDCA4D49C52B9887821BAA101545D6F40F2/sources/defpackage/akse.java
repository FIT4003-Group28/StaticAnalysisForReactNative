package defpackage;
/* compiled from: PG */
/* renamed from: akse  reason: default package */
/* loaded from: classes.dex */
public final class akse {
    public static final akse a = new akse();
    public float b;
    public float c;

    public akse() {
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public akse(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public akse(akse akseVar) {
        this.b = akseVar.b;
        this.c = akseVar.c;
    }

    public static float b(akse akseVar, akse akseVar2, akse akseVar3) {
        float f = akseVar2.b;
        float f2 = akseVar.b;
        float f3 = akseVar2.c;
        float f4 = akseVar.c;
        return ((f - f2) * (akseVar3.c - f4)) - ((f3 - f4) * (akseVar3.b - f2));
    }

    public static float d(akse akseVar, akse akseVar2) {
        return (float) Math.hypot(akseVar.b - akseVar2.b, akseVar.c - akseVar2.c);
    }

    public static float e(akse akseVar, akse akseVar2) {
        float f = akseVar.b - akseVar2.b;
        float f2 = akseVar.c - akseVar2.c;
        return (f * f) + (f2 * f2);
    }

    public static void f(akse akseVar, akse akseVar2, float f, akse akseVar3) {
        float f2 = akseVar2.b;
        float f3 = akseVar.b;
        akseVar3.b = ((f2 - f3) * f) + f3;
        float f4 = akseVar2.c;
        float f5 = akseVar.c;
        akseVar3.c = (f * (f4 - f5)) + f5;
    }

    public static void g(akse akseVar, akse akseVar2, akse akseVar3) {
        float f = akseVar2.b;
        float f2 = akseVar2.c;
        float f3 = akseVar.b;
        float f4 = akseVar.c;
        akseVar3.b = (f3 * f) - (f4 * f2);
        akseVar3.c = (f3 * f2) + (f4 * f);
    }

    public static boolean h(akse akseVar, akse akseVar2, akse akseVar3, akse akseVar4, akse akseVar5) {
        float f = akseVar2.b;
        float f2 = akseVar.b;
        float f3 = f - f2;
        float f4 = akseVar2.c;
        float f5 = akseVar.c;
        float f6 = f4 - f5;
        float f7 = akseVar4.b;
        float f8 = akseVar3.b;
        float f9 = f7 - f8;
        float f10 = akseVar4.c;
        float f11 = akseVar3.c;
        float f12 = f10 - f11;
        float f13 = (f3 * f12) - (f6 * f9);
        if (f13 == 0.0f) {
            return false;
        }
        float f14 = (((f8 - f2) * f12) - (f9 * (f11 - f5))) / f13;
        if (f14 >= 0.0f && f14 <= 1.0f) {
            float f15 = (-(((f2 - f8) * f6) - ((f5 - f11) * f3))) / f13;
            if (f15 >= 0.0f && f15 <= 1.0f) {
                akseVar5.b = f2 + (f3 * f14);
                akseVar5.c = f5 + (f14 * f6);
                return true;
            }
        }
        return false;
    }

    public static void i(akse akseVar, akse akseVar2, akse akseVar3) {
        akseVar3.b = akseVar.b + akseVar2.b;
        akseVar3.c = akseVar.c + akseVar2.c;
    }

    public static void j(akse[] akseVarArr, float f, akse akseVar) {
        double d = f;
        akseVar.r((float) akqa.c(d, akseVarArr[0].b, akseVarArr[1].b, akseVarArr[2].b, akseVarArr[3].b), (float) akqa.c(d, akseVarArr[0].c, akseVarArr[1].c, akseVarArr[2].c, akseVarArr[3].c));
    }

    public static void k(akse[] akseVarArr, float f, akse akseVar) {
        double d = f;
        akseVar.r((float) akqa.e(d, akseVarArr[0].b, akseVarArr[1].b, akseVarArr[2].b, akseVarArr[3].b), (float) akqa.e(d, akseVarArr[0].c, akseVarArr[1].c, akseVarArr[2].c, akseVarArr[3].c));
    }

    public static void l(akse[] akseVarArr, akse[] akseVarArr2) {
        akseVarArr2[0].s(akseVarArr[0]);
        akseVarArr2[1].r((float) akqa.a(akseVarArr[0].b, akseVarArr[1].b, akseVarArr[2].b, akseVarArr[3].b), (float) akqa.a(akseVarArr[0].c, akseVarArr[1].c, akseVarArr[2].c, akseVarArr[3].c));
        akseVarArr2[2].r((float) akqa.b(akseVarArr[0].b, akseVarArr[1].b, akseVarArr[2].b, akseVarArr[3].b), (float) akqa.b(akseVarArr[0].c, akseVarArr[1].c, akseVarArr[2].c, akseVarArr[3].c));
        akseVarArr2[3].s(akseVarArr[3]);
    }

    public static void m(akse akseVar, float f, akse akseVar2) {
        akseVar2.b = akseVar.b * f;
        akseVar2.c = akseVar.c * f;
    }

    public static void n(akse akseVar, akse akseVar2) {
        akseVar2.b = -akseVar.b;
        akseVar2.c = -akseVar.c;
    }

    public static void o(akse akseVar, akse akseVar2) {
        float c = akseVar.c();
        if (c == 0.0f) {
            akseVar2.b = 0.0f;
            akseVar2.c = 0.0f;
            return;
        }
        akseVar2.b = akseVar.b / c;
        akseVar2.c = akseVar.c / c;
    }

    public static void p(akse akseVar, akse akseVar2) {
        float f = akseVar.b;
        akseVar2.b = -akseVar.c;
        akseVar2.c = f;
    }

    public static void t(akse akseVar, akse akseVar2, akse akseVar3) {
        akseVar3.b = akseVar.b - akseVar2.b;
        akseVar3.c = akseVar.c - akseVar2.c;
    }

    public final float a(akse akseVar) {
        return (this.b * akseVar.b) + (this.c * akseVar.c);
    }

    public final float c() {
        return (float) Math.hypot(this.b, this.c);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            akse akseVar = (akse) obj;
            if (this.b == akseVar.b && this.c == akseVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ Float.floatToIntBits(this.c);
    }

    public final void q(float f) {
        this.b *= f;
        this.c *= f;
    }

    public final void r(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final void s(akse akseVar) {
        this.b = akseVar.b;
        this.c = akseVar.c;
    }

    public final String toString() {
        float f = this.b;
        float f2 = this.c;
        StringBuilder sb = new StringBuilder(33);
        sb.append("(");
        sb.append(f);
        sb.append(",");
        sb.append(f2);
        sb.append(")");
        return sb.toString();
    }
}
