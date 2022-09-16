package defpackage;
/* compiled from: PG */
/* renamed from: baju  reason: default package */
/* loaded from: classes3.dex */
public final class baju {
    public final gga a;
    public final axwq b;
    private final akfc c;
    private final dxio<akfa> d;

    public baju(gga ggaVar, axwq axwqVar, akfc akfcVar, dxio<akfa> dxioVar) {
        this.a = ggaVar;
        this.b = axwqVar;
        this.c = akfcVar;
        this.d = dxioVar;
    }

    public final void a(bvqg<Boolean> bvqgVar) {
        deha.q(this.b.e(), new bajq(this, bvqgVar), dege.a);
    }

    public final void b(@dzsi akey akeyVar, bvqg<Boolean> bvqgVar) {
        if (btlu.i(this.d.a().j()) == btlt.GOOGLE) {
            btlu j = this.d.a().j();
            dbsk.s(j);
            if (j.u()) {
                if (akeyVar != null) {
                    akeyVar.a(false);
                }
                a(bvqgVar);
                return;
            }
        }
        this.c.k(new bajr(this, akeyVar, bvqgVar), null);
    }
}
