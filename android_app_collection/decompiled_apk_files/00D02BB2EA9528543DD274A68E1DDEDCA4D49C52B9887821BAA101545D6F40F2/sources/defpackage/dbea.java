package defpackage;
/* compiled from: PG */
/* renamed from: dbea  reason: default package */
/* loaded from: classes5.dex */
public final class dbea {
    public float a;
    public float b;
    public float c;
    public float d;

    public dbea() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 1.0f;
    }

    public dbea(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        f();
    }

    public static dbeb b(dbea dbeaVar, dbeb dbebVar) {
        dbeb dbebVar2 = new dbeb();
        float f = dbeaVar.d;
        float f2 = f * f;
        float f3 = dbeaVar.a;
        float f4 = f3 * f3;
        float f5 = dbeaVar.b;
        float f6 = f5 * f5;
        float f7 = dbeaVar.c;
        float f8 = f7 * f7;
        float f9 = f7 * f;
        float f10 = f3 * f5;
        float f11 = f3 * f7;
        float f12 = f5 * f;
        float f13 = f5 * f7;
        float f14 = f3 * f;
        float f15 = f13 + f13;
        float f16 = dbebVar.a;
        float f17 = dbebVar.b;
        float f18 = dbebVar.c;
        dbebVar2.a = ((((f2 + f4) - f8) - f6) * f16) + (((((-f9) + f10) - f9) + f10) * f17) + ((f12 + f11 + f11 + f12) * f18);
        dbebVar2.b = ((f10 + f9 + f9 + f10) * f16) + ((((f6 - f8) + f2) - f4) * f17) + (((f15 - f14) - f14) * f18);
        dbebVar2.c = ((((f11 - f12) + f11) - f12) * f16) + ((f15 + f14 + f14) * f17) + ((((f8 - f6) - f4) + f2) * f18);
        return dbebVar2;
    }

    public static dbea c(dbea dbeaVar, dbea dbeaVar2) {
        float f = dbeaVar.a;
        float f2 = dbeaVar.b;
        float f3 = dbeaVar.c;
        float f4 = dbeaVar.d;
        float f5 = dbeaVar2.a;
        float f6 = dbeaVar2.b;
        float f7 = dbeaVar2.c;
        float f8 = dbeaVar2.d;
        return new dbea((((f4 * f5) + (f * f8)) + (f2 * f7)) - (f3 * f6), ((f4 * f6) - (f * f7)) + (f2 * f8) + (f3 * f5), (((f4 * f7) + (f * f6)) - (f2 * f5)) + (f3 * f8), (((f4 * f8) - (f * f5)) - (f2 * f6)) - (f3 * f7));
    }

    static float d(dbea dbeaVar, dbea dbeaVar2) {
        dbjb.d(dbeaVar2, "Parameter \"rhs\" was null.");
        return (dbeaVar.a * dbeaVar2.a) + (dbeaVar.b * dbeaVar2.b) + (dbeaVar.c * dbeaVar2.c) + (dbeaVar.d * dbeaVar2.d);
    }

    public static dbea e(dbeb dbebVar, dbeb dbebVar2) {
        dbeb e = dbebVar.e();
        dbeb e2 = dbebVar2.e();
        float i = dbeb.i(e, e2);
        if (i < -0.999f) {
            dbeb j = dbeb.j(dbeb.o(), e);
            if (j.c() < 0.01f) {
                j = dbeb.j(dbeb.q(), e);
            }
            dbeb e3 = j.e();
            dbea dbeaVar = new dbea();
            double radians = Math.toRadians(180.0d) / 2.0d;
            double sin = Math.sin(radians);
            double d = e3.a;
            Double.isNaN(d);
            dbeaVar.a = (float) (d * sin);
            double d2 = e3.b;
            Double.isNaN(d2);
            dbeaVar.b = (float) (d2 * sin);
            double d3 = e3.c;
            Double.isNaN(d3);
            dbeaVar.c = (float) (d3 * sin);
            dbeaVar.d = (float) Math.cos(radians);
            dbeaVar.f();
            return dbeaVar;
        }
        dbeb j2 = dbeb.j(e, e2);
        double d4 = i;
        Double.isNaN(d4);
        double d5 = d4 + 1.0d;
        float sqrt = (float) Math.sqrt(d5 + d5);
        float f = 1.0f / sqrt;
        return new dbea(j2.a * f, j2.b * f, j2.c * f, sqrt * 0.5f);
    }

    public final void a(dbea dbeaVar) {
        this.a = dbeaVar.a;
        this.b = dbeaVar.b;
        this.c = dbeaVar.c;
        this.d = dbeaVar.d;
        f();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbea)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dbea dbeaVar = (dbea) obj;
        dbjb.d(dbeaVar, "Parameter \"rhs\" was null.");
        return dbdy.a(d(this, dbeaVar), 1.0f);
    }

    public final void f() {
        float d = d(this, this);
        if (dbdy.a(d, 0.0f)) {
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 1.0f;
        } else if (d == 1.0f) {
        } else {
            float sqrt = (float) (1.0d / Math.sqrt(d));
            this.a *= sqrt;
            this.b *= sqrt;
            this.c *= sqrt;
            this.d *= sqrt;
        }
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.d) + 31) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sb = new StringBuilder(76);
        sb.append("[x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        sb.append(f3);
        sb.append(", w=");
        sb.append(f4);
        sb.append("]");
        return sb.toString();
    }

    public dbea(dbea dbeaVar) {
        a(dbeaVar);
    }
}
