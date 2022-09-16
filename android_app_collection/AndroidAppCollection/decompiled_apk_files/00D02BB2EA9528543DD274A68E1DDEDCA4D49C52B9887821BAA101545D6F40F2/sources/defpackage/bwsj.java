package defpackage;
/* compiled from: PG */
/* renamed from: bwsj  reason: default package */
/* loaded from: classes4.dex */
final class bwsj implements btzi<dwyz, dwzd> {
    final /* synthetic */ double a;
    final /* synthetic */ dpsn b;
    final /* synthetic */ bwrs c;
    final /* synthetic */ bwsm d;

    public bwsj(bwsm bwsmVar, double d, dpsn dpsnVar, bwrs bwrsVar) {
        this.d = bwsmVar;
        this.a = d;
        this.b = dpsnVar;
        this.c = bwrsVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwyz> btzrVar, btzy btzyVar) {
        Throwable th = btzyVar.r;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwyz> btzrVar, dwzd dwzdVar) {
        akqq aj;
        dwzd dwzdVar2 = dwzdVar;
        double d = 3.0d;
        if (dwzdVar2.b.size() > 1) {
            double d2 = this.a - dwzdVar2.b.d(1);
            if (d2 < 8.0d) {
                d = d2;
            }
        }
        bwsm bwsmVar = this.d;
        dpsn dpsnVar = this.b;
        bwrs bwrsVar = this.c;
        double d3 = dwzdVar2.b.d(0) + d;
        ilo iloVar = (ilo) bwrsVar.c();
        if (iloVar == null || (aj = iloVar.aj()) == null) {
            return;
        }
        bwvi bwviVar = bwsmVar.a.get(dpsnVar);
        if (bwviVar == null) {
            dhjy bZ = dhjz.e.bZ();
            double d4 = aj.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            int i = dhjzVar.a | 2;
            dhjzVar.a = i;
            dhjzVar.c = d4;
            double d5 = aj.b;
            int i2 = i | 1;
            dhjzVar.a = i2;
            dhjzVar.b = d5;
            dhjzVar.a = i2 | 4;
            dhjzVar.d = d3;
            dhjz bK = bZ.bK();
            bwviVar = new bwvi(bwsmVar.b, bwrsVar, bK, bwsmVar.c.getImageryViewerParameters().f, bwsmVar.g, false);
            bwviVar.e = bwzj.d(bwsmVar.h, dtyb.dX, bwsmVar.n, iloVar.ai());
            bwviVar.f = dtyb.dX;
            bwsmVar.a.put(dpsnVar, bwviVar);
            dhjz dhjzVar2 = bwsmVar.l;
            if (dhjzVar2 != null) {
                bwviVar.a(bwsm.a(dhjzVar2, bK));
            }
        }
        bwsmVar.e(bwviVar);
        bwzj bwzjVar = bwsmVar.e;
        cjql cjqlVar = bwviVar.e;
        dbsk.s(cjqlVar);
        deaf deafVar = deaf.AUTOMATED;
        ddho ddhoVar = bwviVar.f;
        dbsk.s(ddhoVar);
        bwzjVar.a(cjqlVar, deafVar, ddhoVar, bwsmVar.n, iloVar.ai());
    }
}
