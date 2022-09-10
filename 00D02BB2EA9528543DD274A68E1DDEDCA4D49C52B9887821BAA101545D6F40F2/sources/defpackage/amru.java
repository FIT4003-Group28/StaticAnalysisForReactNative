package defpackage;
/* compiled from: PG */
/* renamed from: amru  reason: default package */
/* loaded from: classes2.dex */
abstract class amru implements amri {
    protected final amsa b;
    private final amkz a = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
    private final akse c = new akse();
    private final float[] d = new float[8];

    public amru(amsa amsaVar) {
        this.b = amsaVar;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        akra d = d(amrkVar);
        if (d == null || !akyx.p(amrkVar.e, d, this.c, this.d)) {
            return 0.5f;
        }
        amsa amsaVar = this.b;
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, this.a)) {
            return c(this.a, this.c);
        }
        return 0.5f;
    }

    protected abstract float c(amkz amkzVar, akse akseVar);

    @dzsi
    protected abstract akra d(amrk amrkVar);
}
