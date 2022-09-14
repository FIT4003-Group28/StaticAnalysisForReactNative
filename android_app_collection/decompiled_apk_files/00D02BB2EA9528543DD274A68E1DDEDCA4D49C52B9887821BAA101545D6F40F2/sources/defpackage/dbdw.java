package defpackage;
/* compiled from: PG */
/* renamed from: dbdw  reason: default package */
/* loaded from: classes5.dex */
public final class dbdw extends dbdr {
    private final dbeb c = new dbeb();
    public float b = 1.0f;

    public dbdw() {
    }

    public final void a(dbeb dbebVar) {
        this.c.a(dbebVar);
        j();
    }

    public final dbeb b() {
        return new dbeb(this.c);
    }

    public final void c(float f) {
        this.b = f;
        j();
    }

    @Override // defpackage.dbdr
    public final boolean f(dbdu dbduVar, dbdv dbdvVar) {
        dbeb b = dbduVar.b();
        dbeb h = dbeb.h(dbduVar.a(), this.c);
        float i = dbeb.i(h, b);
        float f = i + i;
        float i2 = dbeb.i(h, h);
        float f2 = this.b;
        float f3 = (f * f) - ((i2 - (f2 * f2)) * 4.0f);
        if (f3 < 0.0f) {
            return false;
        }
        float sqrt = (float) Math.sqrt(f3);
        float f4 = -f;
        float f5 = (f4 - sqrt) / 2.0f;
        float f6 = (f4 + sqrt) / 2.0f;
        if (f5 < 0.0f && f6 < 0.0f) {
            return false;
        }
        if (f5 >= 0.0f || f6 <= 0.0f) {
            dbdvVar.b = f5;
        } else {
            dbdvVar.b = f6;
            f5 = f6;
        }
        dbdvVar.a(dbduVar.c(f5));
        return true;
    }

    @Override // defpackage.dbdr
    public final dbdr g(dbdx dbdxVar) {
        dbdw dbdwVar = new dbdw();
        h(dbdxVar, dbdwVar);
        return dbdwVar;
    }

    @Override // defpackage.dbdr
    public final void h(dbdx dbdxVar, dbdr dbdrVar) {
        if (!(dbdrVar instanceof dbdw)) {
            return;
        }
        dbdw dbdwVar = (dbdw) dbdrVar;
        dbdz w = dbdxVar.w();
        dbdwVar.a(w.i(this.c));
        dbeb dbebVar = new dbeb();
        w.c(dbebVar);
        dbdwVar.b = this.b * Math.max(Math.abs(Math.min(Math.min(dbebVar.a, dbebVar.b), dbebVar.c)), Math.max(Math.max(dbebVar.a, dbebVar.b), dbebVar.c));
    }

    @Override // defpackage.dbdr
    public final /* bridge */ /* synthetic */ dbdr i() {
        return new dbdw(this.b, b());
    }

    public dbdw(float f, dbeb dbebVar) {
        a(dbebVar);
        c(f);
    }
}
