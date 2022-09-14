package defpackage;
/* compiled from: PG */
/* renamed from: amyi  reason: default package */
/* loaded from: classes.dex */
public final class amyi {
    private final akrp e;
    private final akra f;
    private final akra g;
    public final float[] a = {1.0f, 1.0f, 1.0f};
    private final float[] h = new float[4];
    @dzsi
    private bnrs i = null;
    @dzsi
    public bnrs b = null;
    public final bnvr c = new bnvr();
    public final bnvr d = new bnvr();

    public amyi(alyh alyhVar) {
        this.e = alyhVar.g();
        this.f = alyhVar.d();
        this.g = alyhVar.e();
    }

    public static void b(alyh alyhVar, float f) {
        amyi amyiVar = new amyi(alyhVar);
        int h = alyhVar.h();
        int i = alyhVar.g;
        if (i > 0) {
            h >>= i;
        }
        float[] fArr = amyiVar.a;
        float f2 = h / f;
        fArr[0] = f2;
        fArr[1] = f2;
        fArr[2] = f2;
    }

    public final bnvr a(bnrr bnrrVar) {
        if (bnrrVar.f() != this.i) {
            bnvr bnvrVar = this.c;
            akzh akzhVar = (akzh) bnrrVar;
            amgp.c(akzhVar, this.f, this.g, this.e.m(), true, false, this.h);
            bnvrVar.g();
            float[] fArr = this.h;
            bnvrVar.h(fArr[0], fArr[1], fArr[2]);
            float f = this.h[3];
            float[] fArr2 = this.a;
            bnvrVar.e(f / fArr2[0], f / fArr2[1], f / fArr2[2]);
            this.i = bnrrVar.f();
        }
        return this.c;
    }
}
