package defpackage;
/* compiled from: PG */
/* renamed from: amla  reason: default package */
/* loaded from: classes.dex */
public final class amla {
    public double c;
    public final akse a = new akse();
    public final akse b = new akse();
    public final akse d = new akse();
    public final akse e = new akse();
    public final akse f = new akse();
    public final akse g = new akse();
    public final akse h = new akse();
    public final akse i = new akse();
    public final amkz j = new amkz();

    private static boolean i(akse akseVar, akse akseVar2, amkz amkzVar) {
        float a = akseVar2.a(akseVar2);
        float abs = Math.abs(akseVar.a(akseVar2));
        return abs >= a && abs >= a + (Math.abs((amkzVar.b() / 2.0f) * akseVar2.b) + Math.abs((amkzVar.c() / 2.0f) * akseVar2.c));
    }

    public final void a(akse akseVar) {
        akse akseVar2 = this.b;
        akse.i(akseVar2, akseVar, akseVar2);
        akse akseVar3 = this.f;
        akse.i(akseVar3, akseVar, akseVar3);
        akse akseVar4 = this.g;
        akse.i(akseVar4, akseVar, akseVar4);
        akse akseVar5 = this.h;
        akse.i(akseVar5, akseVar, akseVar5);
        akse akseVar6 = this.i;
        akse.i(akseVar6, akseVar, akseVar6);
        amkz amkzVar = this.j;
        float f = akseVar.b;
        float f2 = akseVar.c;
        amkzVar.a += f;
        amkzVar.b += f2;
        amkzVar.c += f;
        amkzVar.d += f2;
        akse akseVar7 = amkzVar.e;
        akse.i(akseVar7, akseVar, akseVar7);
    }

    public final float b() {
        return this.d.c();
    }

    public final float c() {
        return this.e.c();
    }

    public final akse d(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.g;
            }
            if (i == 2) {
                return this.h;
            }
            if (i == 3) {
                return this.i;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f;
    }

    public final boolean e(akse akseVar) {
        double d = this.c;
        return (d <= -0.0010000000474974513d || d >= 0.0010000000474974513d) ? this.j.e(akseVar) && akse.b(this.i, this.f, akseVar) >= 0.0f && akse.b(this.f, this.g, akseVar) >= 0.0f && akse.b(this.g, this.h, akseVar) >= 0.0f && akse.b(this.h, this.i, akseVar) >= 0.0f : this.j.e(akseVar);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amla) {
            amla amlaVar = (amla) obj;
            if (this.b.equals(amlaVar.b) && this.d.equals(amlaVar.d) && this.e.equals(amlaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(akse akseVar, akse akseVar2) {
        float a = akseVar2.a(akseVar2);
        float abs = Math.abs(akseVar.a(akseVar2));
        return abs >= a && abs >= a + (Math.abs(this.d.a(akseVar2)) + Math.abs(this.e.a(akseVar2)));
    }

    public final boolean g(amkz amkzVar) {
        if (!amkzVar.d(this.j)) {
            return false;
        }
        double d = this.c;
        if (d > -0.0010000000474974513d && d < 0.0010000000474974513d) {
            return true;
        }
        akse akseVar = amkzVar.e;
        if (e(akseVar) || amkzVar.e(this.b)) {
            return true;
        }
        akse akseVar2 = this.a;
        akse.t(akseVar, this.b, akseVar2);
        return !i(akseVar2, this.e, amkzVar) && !i(akseVar2, this.d, amkzVar);
    }

    public final void h(float f, float f2, double d, float f3, float f4) {
        this.b.r(f, f2);
        this.c = d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f5 = f3 * cos;
        float f6 = f3 * sin;
        this.d.r(f5, f6);
        float f7 = (-sin) * f4;
        float f8 = f4 * cos;
        this.e.r(f7, f8);
        float f9 = f + f5;
        float f10 = f2 + f6;
        this.f.r(f9 + f7, f10 + f8);
        float f11 = f - f5;
        float f12 = f2 - f6;
        this.g.r(f11 + f7, f12 + f8);
        this.h.r(f11 - f7, f12 - f8);
        this.i.r(f9 - f7, f10 - f8);
        akse akseVar = this.f;
        float f13 = akseVar.b;
        float f14 = akseVar.c;
        akse akseVar2 = this.g;
        float f15 = akseVar2.b;
        if (f15 < f13) {
            f15 = f13;
            f13 = f15;
        } else if (f15 <= f13) {
            f15 = f13;
        }
        float f16 = akseVar2.c;
        if (f16 < f14) {
            f16 = f14;
            f14 = f16;
        } else if (f16 <= f14) {
            f16 = f14;
        }
        akse akseVar3 = this.h;
        float f17 = akseVar3.b;
        if (f17 < f13) {
            f13 = f17;
        } else if (f17 > f15) {
            f15 = f17;
        }
        float f18 = akseVar3.c;
        if (f18 < f14) {
            f14 = f18;
        } else if (f18 > f16) {
            f16 = f18;
        }
        akse akseVar4 = this.i;
        float f19 = akseVar4.b;
        if (f19 < f13) {
            f13 = f19;
        } else if (f19 > f15) {
            f15 = f19;
        }
        float f20 = akseVar4.c;
        if (f20 < f14) {
            f14 = f20;
        } else if (f20 > f16) {
            f16 = f20;
        }
        this.j.a(f13, f14, f15, f16);
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 31) * 31) ^ this.d.hashCode()) * 31) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        double d = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 66 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("OBB{center: ");
        sb.append(valueOf);
        sb.append(" angle ");
        sb.append(d);
        sb.append(" abscissa: ");
        sb.append(valueOf2);
        sb.append(" ordinate: ");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
