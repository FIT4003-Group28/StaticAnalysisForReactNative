package defpackage;
/* compiled from: PG */
/* renamed from: alfw  reason: default package */
/* loaded from: classes2.dex */
public final class alfw implements amri {
    private final dcdc<amuo> a;
    private final amuo b;
    private final amsa c;
    private final amkz d;
    private final akse e;
    private final float[] f;

    public alfw(dcdc<amuo> dcdcVar, amuo amuoVar) {
        amsa amsaVar = new amsa();
        this.d = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.e = new akse();
        this.f = new float[8];
        this.c = amsaVar;
        this.a = dcdcVar;
        this.b = amuoVar;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        amsa amsaVar = this.c;
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (!amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, this.d)) {
            return 0.5f;
        }
        dcdc<amuo> dcdcVar = this.a;
        int size = dcdcVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            amuo amuoVar = dcdcVar.get(i2);
            akra akraVar2 = amuoVar.c;
            if (!amuoVar.equals(this.b) && akyx.p(amrkVar.e, akraVar2, this.e, this.f) && ((amuoVar.d != dgau.MANEUVER_UNKNOWN || amuoVar.p.toString().trim().length() != 0) && this.d.e(this.e))) {
                i++;
            }
        }
        if (!this.a.isEmpty()) {
            return i / this.a.size();
        }
        return 0.0f;
    }
}
