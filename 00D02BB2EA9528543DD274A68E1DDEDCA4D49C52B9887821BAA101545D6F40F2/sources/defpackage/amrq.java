package defpackage;
/* compiled from: PG */
/* renamed from: amrq  reason: default package */
/* loaded from: classes2.dex */
public final class amrq implements amri {
    private final amsa a;
    private final amkz b;

    public amrq() {
        amsa amsaVar = new amsa();
        this.b = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.a = amsaVar;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        amsa amsaVar = this.a;
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, this.b)) {
            float f = 0.0f;
            for (amkz amkzVar : amrkVar.f.b) {
                f += amsa.b(this.b, amkzVar);
            }
            return Math.min(f, 1.0f);
        }
        return 0.5f;
    }
}
