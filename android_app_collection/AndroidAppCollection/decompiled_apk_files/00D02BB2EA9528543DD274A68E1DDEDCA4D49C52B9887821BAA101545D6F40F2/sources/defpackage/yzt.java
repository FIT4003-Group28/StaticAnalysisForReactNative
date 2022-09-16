package defpackage;
/* compiled from: PG */
/* renamed from: yzt  reason: default package */
/* loaded from: classes7.dex */
public final class yzt implements yzs {
    private final btvo a;
    private final bvjj b;
    private final vwv c;
    private final dbsg<ymn> d;

    public yzt(btvo btvoVar, bvjj bvjjVar, vwv vwvVar, dbsg<ymn> dbsgVar) {
        this.a = btvoVar;
        this.b = bvjjVar;
        this.c = vwvVar;
        this.d = dbsgVar;
    }

    @Override // defpackage.yzs
    public final dwbh a() {
        boolean b;
        if (this.c.a()) {
            b = this.c.c();
        } else {
            b = this.c.b();
        }
        if (b) {
            yis yisVar = ((ymn) ((dbsu) this.d).a).a().b;
            if (yisVar == null) {
                yisVar = yis.b;
            }
            return c(yisVar);
        }
        return c(null);
    }

    @Override // defpackage.yzs
    public final dwbh b(yis yisVar) {
        return c(yisVar);
    }

    public final dwbh c(@dzsi yis yisVar) {
        boolean z = vxd.CAR.a() && this.a.getDirectionsPageParameters().m && !this.b.m(bvjk.bg, false);
        boolean z2 = vxd.RICKSHAW.a() && this.a.getDirectionsPageParameters().t && !this.b.m(bvjk.bh, false);
        boolean z3 = vxd.RIDESHARE.a() && this.a.getMultimodalDirectionsParameters().b && !this.b.m(bvjk.bj, false);
        boolean z4 = vxd.TWO_WHEELER.a() && this.a.getMultimodalDirectionsParameters().a && !this.b.m(bvjk.bi, false);
        boolean z5 = vxd.BICYCLE.a() && this.a.getMultimodalDirectionsParameters().c && !this.b.m(bvjk.bk, false);
        dwbf bZ = dwbg.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwbg dwbgVar = (dwbg) bZ.b;
        int i = dwbgVar.a | 1;
        dwbgVar.a = i;
        dwbgVar.b = z;
        int i2 = i | 2;
        dwbgVar.a = i2;
        dwbgVar.c = z2;
        int i3 = i2 | 4;
        dwbgVar.a = i3;
        dwbgVar.d = z4;
        int i4 = i3 | 8;
        dwbgVar.a = i4;
        dwbgVar.e = z3;
        dwbgVar.a = i4 | 16;
        dwbgVar.f = z5;
        dwbg bK = bZ.bK();
        if (yisVar != null) {
            dcep<drsm> f = ynf.f(yisVar);
            if (f.contains(drsm.BICYCLE)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwbg dwbgVar2 = (dwbg) bZ.b;
                dwbgVar2.a |= 16;
                dwbgVar2.f = false;
            }
            if (f.contains(drsm.DRIVE)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwbg dwbgVar3 = (dwbg) bZ.b;
                dwbgVar3.a |= 1;
                dwbgVar3.b = false;
            }
            if (f.contains(drsm.OFFLINE_TAXI)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwbg dwbgVar4 = (dwbg) bZ.b;
                dwbgVar4.a |= 2;
                dwbgVar4.c = false;
            }
            if (f.contains(drsm.ONLINE_TAXI)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwbg dwbgVar5 = (dwbg) bZ.b;
                dwbgVar5.a |= 8;
                dwbgVar5.e = false;
            }
            if (f.contains(drsm.TWO_WHEELER)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwbg dwbgVar6 = (dwbg) bZ.b;
                dwbgVar6.a |= 4;
                dwbgVar6.d = false;
            }
        }
        dwbg bK2 = bZ.bK();
        dwbe bZ2 = dwbh.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwbh dwbhVar = (dwbh) bZ2.b;
        bK.getClass();
        dwbhVar.b = bK;
        int i5 = dwbhVar.a | 1;
        dwbhVar.a = i5;
        bK2.getClass();
        dwbhVar.c = bK2;
        dwbhVar.a = i5 | 2;
        boolean z6 = this.a.getMultimodalDirectionsParameters().e;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwbh dwbhVar2 = (dwbh) bZ2.b;
        dwbhVar2.a |= 16;
        dwbhVar2.f = z6;
        return bZ2.bK();
    }
}
