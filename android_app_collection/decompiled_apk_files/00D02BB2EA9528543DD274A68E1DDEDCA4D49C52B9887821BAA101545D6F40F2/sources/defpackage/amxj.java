package defpackage;
/* compiled from: PG */
/* renamed from: amxj  reason: default package */
/* loaded from: classes.dex */
public class amxj extends amxg {
    private static final bnvs a = new bnvs(0.0f, 0.0f, 1.0f);
    private final float[] A;
    private boolean B;
    private float C;
    private final float[] b;
    private float c;
    public final akra e;
    public final float[] f;
    public amgn g;
    protected final boolean h;

    public amxj(bnrw bnrwVar) {
        this(bntj.a, true, bnrwVar);
    }

    @Override // defpackage.bnsc, defpackage.bnsa
    public void b(@dzsi bnsa bnsaVar, @dzsi bnsa bnsaVar2, bnrr bnrrVar) {
        if (this.p || bnrrVar.f() != this.r) {
            if (this.B) {
                this.c = akyx.w((akzh) bnrrVar, bnrrVar.t(this.e, this.h));
            } else {
                float[] fArr = this.A;
                fArr[2] = 1.0f;
                fArr[1] = 1.0f;
                fArr[0] = 1.0f;
            }
            this.g.a((akzh) bnrrVar, this.e, this.c, this.b);
            this.o.g();
            bnvr bnvrVar = this.o;
            float[] fArr2 = this.b;
            bnvrVar.h(fArr2[0], fArr2[1], fArr2[2]);
            if (this.C != 0.0f) {
                this.o.c(a, this.C);
            }
            float f = this.b[3];
            bnvr bnvrVar2 = this.o;
            float[] fArr3 = this.A;
            bnvrVar2.e(fArr3[0] * f, fArr3[1] * f, fArr3[2] * f);
            bnvr bnvrVar3 = this.o;
            float[] fArr4 = this.f;
            bnvrVar3.i(fArr4[0], fArr4[1], fArr4[2]);
        }
        super.b(bnsaVar, bnsaVar2, bnrrVar);
    }

    public final void j(akra akraVar) {
        if (this.t) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        this.e.aa(akraVar);
        this.p = true;
    }

    public final void k(float f) {
        if (this.t) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        this.c = f;
        this.B = false;
        this.p = true;
    }

    public final void l(float f) {
        if (this.t) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        this.C = f;
        this.p = true;
    }

    public final void m(float f, float f2) {
        if (this.t) {
            bnuq bnuqVar = bnuq.INVALID;
        }
        float[] fArr = this.A;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = 1.0f;
        this.B = true;
        this.p = true;
    }

    public amxj(bnrz bnrzVar) {
        this(bnrzVar, true, new bnrw(bnrzVar.c(), 0L, 0L, 0L));
    }

    public amxj(bnrz bnrzVar, boolean z, bnrw bnrwVar) {
        super(bnrzVar, bnrwVar, 0);
        this.b = new float[4];
        this.e = new akra();
        this.A = new float[]{1.0f, 1.0f, 1.0f};
        this.f = new float[3];
        this.B = true;
        this.h = z;
        this.g = z ? amxh.a : amxi.a;
    }
}
