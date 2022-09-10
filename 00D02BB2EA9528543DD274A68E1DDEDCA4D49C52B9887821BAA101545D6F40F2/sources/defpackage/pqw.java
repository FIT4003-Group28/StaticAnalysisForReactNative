package defpackage;
/* compiled from: PG */
/* renamed from: pqw  reason: default package */
/* loaded from: classes7.dex */
class pqw extends pqg {
    final /* synthetic */ pqx a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pqw(defpackage.pqx r2) {
        /*
            r1 = this;
            r1.a = r2
            dcdc<bqzb> r2 = r2.g
            defpackage.dbsk.s(r2)
            r0 = 1
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqw.<init>(pqx):void");
    }

    @Override // defpackage.pqe
    public cqkl c() {
        pqx pqxVar = this.a;
        if (pqxVar.aD) {
            pqxVar.aT();
            dxio<brba> dxioVar = this.a.b;
            dbsk.s(dxioVar);
            brba a = dxioVar.a();
            bwrs<brln> bwrsVar = this.a.ad;
            if (bwrsVar != null) {
                a.i(bwrsVar);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.pqe
    public cqkl d(cjqm cjqmVar) {
        pqx pqxVar = this.a;
        if (pqxVar.aD) {
            pqxVar.aT();
        }
        return cqkl.a;
    }

    @Override // defpackage.pqg
    public void e(int i) {
        pqx pqxVar = this.a;
        if (!pqxVar.aD) {
            return;
        }
        pqxVar.aT();
        dcdc<bqzb> dcdcVar = this.a.g;
        if (dcdcVar == null) {
            return;
        }
        bqzb bqzbVar = dcdcVar.get(i);
        broc brocVar = bqzbVar.a;
        akqi akqiVar = brocVar.b;
        if (akqiVar != null) {
            ily ilyVar = new ily();
            ilyVar.F(brocVar.a);
            ilyVar.j(akqiVar);
            ilyVar.f = false;
            ilyVar.D();
            ilo d = ilyVar.d();
            begj begjVar = new begj();
            begjVar.b(d);
            begjVar.k = bqzbVar.a();
            dxio<begg> dxioVar = this.a.c;
            dbsk.s(dxioVar);
            dxioVar.a().o(begjVar, false, null);
            return;
        }
        dnqg bZ = dnqh.p.bZ();
        ddxw bZ2 = ddxx.j.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ2.b;
        ddxxVar.a |= 8;
        ddxxVar.d = 5360;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        ddxx bK = bZ2.bK();
        bK.getClass();
        dnqhVar.f = bK;
        dnqhVar.a |= 16;
        dnqh bK2 = bZ.bK();
        dxio<brba> dxioVar2 = this.a.b;
        dbsk.s(dxioVar2);
        brba a = dxioVar2.a();
        dwim bZ3 = dwir.R.bZ();
        String str = brocVar.a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwir dwirVar = (dwir) bZ3.b;
        str.getClass();
        int i2 = dwirVar.a | 1;
        dwirVar.a = i2;
        dwirVar.c = str;
        bK2.getClass();
        dwirVar.s = bK2;
        dwirVar.a = 33554432 | i2;
        a.m(bZ3, null);
    }
}
