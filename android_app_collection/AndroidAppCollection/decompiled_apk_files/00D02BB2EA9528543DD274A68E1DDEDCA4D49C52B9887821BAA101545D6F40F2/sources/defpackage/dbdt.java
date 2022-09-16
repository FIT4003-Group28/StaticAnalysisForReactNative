package defpackage;
/* compiled from: PG */
/* renamed from: dbdt  reason: default package */
/* loaded from: classes5.dex */
public final class dbdt {
    private final dbeb a;
    private final dbeb b;

    public dbdt(dbeb dbebVar, dbeb dbebVar2) {
        dbeb dbebVar3 = new dbeb();
        this.a = dbebVar3;
        dbeb dbebVar4 = new dbeb();
        this.b = dbebVar4;
        dbebVar3.a(dbebVar);
        dbjb.d(dbebVar2, "Parameter \"normal\" was null.");
        dbebVar4.a(dbebVar2.e());
    }

    public final boolean a(dbdu dbduVar, dbdv dbdvVar) {
        dbeb b = dbduVar.b();
        dbeb a = dbduVar.a();
        float i = dbeb.i(this.b, b);
        if (Math.abs(i) > 1.0E-6d) {
            float i2 = dbeb.i(dbeb.h(this.a, a), this.b) / i;
            if (i2 < 0.0f) {
                return false;
            }
            dbdvVar.b = i2;
            dbdvVar.a(dbduVar.c(i2));
            return true;
        }
        return false;
    }
}
