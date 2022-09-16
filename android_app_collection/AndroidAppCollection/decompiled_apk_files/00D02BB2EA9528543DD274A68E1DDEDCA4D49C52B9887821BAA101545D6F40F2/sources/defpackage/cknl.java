package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cknl  reason: default package */
/* loaded from: classes4.dex */
public final class cknl extends ckna {
    private final cknk m;
    private final boolean n;
    private final boolean o;
    private List<bvrt<dweu>> p;

    public cknl(@dzsi ilo iloVar, boolean z, boolean z2, int i, cknk cknkVar, boolean z3, List<drbz> list) {
        super(iloVar, z, dspd.b, false, true, z2, i, list);
        this.p = dcdc.e();
        this.m = cknkVar;
        this.n = z3 && z;
        this.o = false;
    }

    @Override // defpackage.ckna
    protected final void x(dwgl dwglVar) {
        dwgi dwgiVar = dwglVar.g;
        if (dwgiVar == null) {
            dwgiVar = dwgi.b;
        }
        dsrj<dweu> dsrjVar = dwgiVar.a;
        if (dsrjVar.isEmpty()) {
            return;
        }
        dccx F = dcdc.F();
        for (dweu dweuVar : dsrjVar) {
            F.g(bvrt.b(dweuVar));
        }
        this.p = F.f();
    }

    @Override // defpackage.ckna
    public final dwge y(@dzsi String str) {
        if (this.p.isEmpty()) {
            cknc ckncVar = this.f;
            akqi akqiVar = this.e;
            int i = this.c;
            int i2 = this.d;
            boolean z = this.n;
            dwfz bZ = dwgd.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwgd dwgdVar = (dwgd) bZ.b;
            dwgdVar.a |= 4;
            dwgdVar.d = true;
            dwgd dwgdVar2 = (dwgd) bZ.b;
            dwgdVar2.a |= 8;
            dwgdVar2.e = z;
            dwgd dwgdVar3 = (dwgd) bZ.b;
            dwgdVar3.b = 1;
            dwgdVar3.a |= 1;
            if (z) {
                dpls bZ2 = dplt.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dplt dpltVar = (dplt) bZ2.b;
                dpltVar.b = 1;
                dpltVar.a = 1 | dpltVar.a;
                bZ.a(bZ2);
            }
            dwge a = ckncVar.a(akqiVar, 20, str, i, i2);
            dsqp dsqpVar = (dsqp) a.cu(5);
            dsqpVar.bC(a);
            dwfy dwfyVar = (dwfy) dsqpVar;
            if (dwfyVar.c) {
                dwfyVar.bF();
                dwfyVar.c = false;
            }
            dwge dwgeVar = (dwge) dwfyVar.b;
            dwgd bK = bZ.bK();
            dwge dwgeVar2 = dwge.m;
            bK.getClass();
            dwgeVar.i = bK;
            dwgeVar.a |= 256;
            return dwfyVar.bK();
        } else if (this.m.equals(cknk.ENABLED)) {
            return this.f.c(this.e, this.p.get(0).e((dssr) dweu.m.cu(7), dweu.m).d, 20, str, this.c, this.d);
        } else {
            return this.f.a(this.e, 20, str, this.c, this.d);
        }
    }

    public final dcdc<dweu> z() {
        dccx F = dcdc.F();
        for (bvrt<dweu> bvrtVar : this.p) {
            F.g(bvrtVar.e((dssr) dweu.m.cu(7), dweu.m));
        }
        return F.f();
    }
}
