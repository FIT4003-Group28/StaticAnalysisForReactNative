package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: anca  reason: default package */
/* loaded from: classes2.dex */
public final class anca extends andr {
    public dxio<boxa> a;
    @dzsi
    private bvxh aP = null;
    @dzsi
    private dvxz aQ;
    private ilo aR;
    private dnqe aS;

    @Override // defpackage.andr, defpackage.ges
    public final void Nv() {
        ((ancb) btsx.b(ancb.class, this)).bX(this);
    }

    @Override // defpackage.andr, defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        Rb((dwhf) dssjVar, (dwhj) dssjVar2);
    }

    @Override // defpackage.andr
    protected final String g() {
        return "";
    }

    @Override // defpackage.andr
    public final void i(dwhf dwhfVar, @dzsi dwhj dwhjVar) {
        super.Rb(dwhfVar, dwhjVar);
        if (dwhjVar == null || (dwhjVar.a & 4) == 0) {
            return;
        }
        dvyw dvywVar = dwhjVar.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        if ((dvywVar.a & 8192) == 0) {
            return;
        }
        this.aQ = bomm.a(dwhjVar);
    }

    @Override // defpackage.andr, defpackage.ancv, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.aC = new anbz(this, (anee) this.o.getSerializable("args"));
        this.g = this.aC;
        this.aS = (dnqe) bvrs.g(this.o, "clientState", (dssr) dnqe.i.cu(7), dnqe.i);
        this.aR = (ilo) this.o.getSerializable("placemarkForFaa");
    }

    @Override // defpackage.andr, defpackage.ancv, defpackage.ges
    public final ddho p() {
        return dtxp.al;
    }

    @Override // defpackage.andr
    public final void q() {
        dqnv dqnvVar;
        dvxz dvxzVar = this.aQ;
        if (dvxzVar != null) {
            dqnu bZ = dqnv.f.bZ();
            if ((dvxzVar.a & 32) != 0) {
                String str = dvxzVar.g;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqnv dqnvVar2 = (dqnv) bZ.b;
                str.getClass();
                dqnvVar2.a |= 1;
                dqnvVar2.b = str;
            }
            if ((dvxzVar.a & 16) != 0) {
                String str2 = dvxzVar.f;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqnv dqnvVar3 = (dqnv) bZ.b;
                str2.getClass();
                dqnvVar3.a |= 16;
                dqnvVar3.d = str2;
            }
            if ((dvxzVar.a & 4) != 0) {
                String str3 = dvxzVar.d;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqnv dqnvVar4 = (dqnv) bZ.b;
                str3.getClass();
                dqnvVar4.a |= 4;
                dqnvVar4.c = str3;
            }
            if ((dvxzVar.a & 8) != 0) {
                String str4 = dvxzVar.e;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqnv dqnvVar5 = (dqnv) bZ.b;
                str4.getClass();
                dqnvVar5.a |= 32;
                dqnvVar5.e = str4;
            }
            dqnvVar = bZ.bK();
        } else {
            dqnvVar = null;
        }
        if (this.au != null) {
            ily g = this.aR.g();
            akqq akqqVar = this.au;
            dbsk.s(akqqVar);
            g.q(akqqVar);
            this.aR = g.d();
        }
        aU();
        if (this.aP == null) {
            this.a.a().j(bwrs.a(this.aR), this.aS);
            return;
        }
        bvxh bvxhVar = this.aP;
        dbsk.s(bvxhVar);
        akqq akqqVar2 = this.au;
        dbsk.s(akqqVar2);
        this.a.a().q(bvxhVar, akqqVar2, dqnvVar);
    }

    @Override // defpackage.andr, defpackage.ancv, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bv(false);
        this.aP = this.a.a().p(bwrs.a(this.aR), this.aS);
    }
}
