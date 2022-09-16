package defpackage;
/* compiled from: PG */
/* renamed from: dbeb  reason: default package */
/* loaded from: classes5.dex */
public final class dbeb {
    public float a;
    public float b;
    public float c;

    public dbeb() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public dbeb(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public dbeb(dbeb dbebVar) {
        dbjb.d(dbebVar, "Parameter \"v\" was null.");
        a(dbebVar);
    }

    public static dbeb g(dbeb dbebVar, dbeb dbebVar2) {
        return new dbeb(dbebVar.a + dbebVar2.a, dbebVar.b + dbebVar2.b, dbebVar.c + dbebVar2.c);
    }

    public static dbeb h(dbeb dbebVar, dbeb dbebVar2) {
        return new dbeb(dbebVar.a - dbebVar2.a, dbebVar.b - dbebVar2.b, dbebVar.c - dbebVar2.c);
    }

    public static float i(dbeb dbebVar, dbeb dbebVar2) {
        return (dbebVar.a * dbebVar2.a) + (dbebVar.b * dbebVar2.b) + (dbebVar.c * dbebVar2.c);
    }

    public static dbeb j(dbeb dbebVar, dbeb dbebVar2) {
        float f = dbebVar.a;
        float f2 = dbebVar.b;
        float f3 = dbebVar.c;
        float f4 = dbebVar2.a;
        float f5 = dbebVar2.b;
        float f6 = dbebVar2.c;
        return new dbeb((f2 * f6) - (f3 * f5), (f3 * f4) - (f6 * f), (f * f5) - (f2 * f4));
    }

    public static boolean k(dbeb dbebVar, dbeb dbebVar2) {
        dbjb.d(dbebVar, "Parameter \"lhs\" was null.");
        dbjb.d(dbebVar2, "Parameter \"rhs\" was null.");
        return dbdy.a(dbebVar.c, dbebVar2.c) & dbdy.a(dbebVar.a, dbebVar2.a) & dbdy.a(dbebVar.b, dbebVar2.b);
    }

    public static dbeb l() {
        return new dbeb();
    }

    public static dbeb m() {
        dbeb dbebVar = new dbeb();
        dbebVar.b(1.0f, 1.0f, 1.0f);
        return dbebVar;
    }

    public static dbeb n() {
        dbeb dbebVar = new dbeb();
        dbebVar.b(0.0f, 0.0f, -1.0f);
        return dbebVar;
    }

    public static dbeb o() {
        dbeb dbebVar = new dbeb();
        dbebVar.b(0.0f, 0.0f, 1.0f);
        return dbebVar;
    }

    public static dbeb p() {
        dbeb dbebVar = new dbeb();
        dbebVar.b(0.0f, 1.0f, 0.0f);
        return dbebVar;
    }

    public static dbeb q() {
        dbeb dbebVar = new dbeb();
        dbebVar.b(1.0f, 0.0f, 0.0f);
        return dbebVar;
    }

    public final void a(dbeb dbebVar) {
        dbjb.d(dbebVar, "Parameter \"v\" was null.");
        this.a = dbebVar.a;
        this.b = dbebVar.b;
        this.c = dbebVar.c;
    }

    public final void b(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float c() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        return (f * f) + (f2 * f2) + (f3 * f3);
    }

    public final float d() {
        return (float) Math.sqrt(c());
    }

    public final dbeb e() {
        dbeb dbebVar = new dbeb(this);
        float i = i(this, this);
        if (dbdy.a(i, 0.0f)) {
            dbebVar.b(0.0f, 0.0f, 0.0f);
        } else if (i != 1.0f) {
            dbebVar.a(f((float) (1.0d / Math.sqrt(i))));
        }
        return dbebVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbeb)) {
            return false;
        }
        if (this != obj) {
            return k(this, (dbeb) obj);
        }
        return true;
    }

    public final dbeb f(float f) {
        return new dbeb(this.a * f, this.b * f, this.c * f);
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) + 31) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sb = new StringBuilder(57);
        sb.append("[x=");
        sb.append(f);
        sb.append(", y=");
        sb.append(f2);
        sb.append(", z=");
        sb.append(f3);
        sb.append("]");
        return sb.toString();
    }
}
