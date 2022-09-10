package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eok  reason: default package */
/* loaded from: classes6.dex */
final class eok<T> implements dzsj<T> {
    final /* synthetic */ eol a;
    private final int b;

    public eok(eol eolVar, int i) {
        this.a = eolVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v57, types: [T, bvso] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                eol eolVar = this.a;
                return (T) new ivg(eolVar.i.fN(), eolVar.i.eW.kb(), eolVar.i.eW.o(), eolVar.i.eW.K());
            case 1:
                eol eolVar2 = this.a;
                btvo rp = eolVar2.i.eW.a.rp();
                dxjg.e(rp);
                cqat rR = eolVar2.i.eW.a.rR();
                dxjg.e(rR);
                bvsl sA = eolVar2.i.eW.sA();
                vsf g = eolVar2.i.eW.g();
                zrl zrlVar = new zrl(eolVar2.i.eW.fr(), dxjh.c(eolVar2.i.da()), eolVar2.i.eW.V());
                btpc sz = eolVar2.i.eW.a.sz();
                dxjg.e(sz);
                byaf byafVar = eolVar2.a;
                if (byafVar == null) {
                    dxjg.e(eolVar2.i.eW.a.rB());
                    btvo rp2 = eolVar2.i.eW.a.rp();
                    dxjg.e(rp2);
                    byafVar = new byaf(rp2);
                    eolVar2.a = byafVar;
                }
                byaf byafVar2 = byafVar;
                zse b = eolVar2.b();
                buti rF = eolVar2.i.eW.rF();
                zlr zlrVar = new zlr(eolVar2.i.eW.ds(), eolVar2.i.ad());
                dzsj<vpd> ds = eolVar2.i.eW.ds();
                dzsj<gga> ad = eolVar2.i.ad();
                dzsj dzsjVar = eolVar2.e;
                if (dzsjVar == null) {
                    dzsjVar = new eok(eolVar2, 2);
                    eolVar2.e = dzsjVar;
                }
                zgs zgsVar = new zgs(ds, ad, dzsjVar);
                zqg iN = eolVar2.i.iN();
                zrt jV = eolVar2.i.jV();
                Executor sU = eolVar2.i.eW.a.sU();
                dxjg.e(sU);
                return (T) new zpy(rp, rR, sA, g, zrlVar, sz, byafVar2, b, rF, zlrVar, zgsVar, iN, jV, sU);
            case 2:
                eol eolVar3 = this.a;
                gga wk = eolVar3.i.wk();
                cqkj wl = eolVar3.i.wl();
                dzsj<vxo> dx = eolVar3.i.eW.dx();
                ftt fttVar = eolVar3.i;
                dzsj<rb> dzsjVar2 = fttVar.eV;
                dzsj<vpd> ds2 = fttVar.eW.ds();
                dzsj<cklf> fe = eolVar3.i.fe();
                dzsj dzsjVar3 = eolVar3.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new eok(eolVar3, 3);
                    eolVar3.b = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = eolVar3.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new eok(eolVar3, 4);
                    eolVar3.c = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = eolVar3.d;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new eok(eolVar3, 5);
                    eolVar3.d = dzsjVar7;
                }
                return (T) new ziq(wk, wl, new zrj(dx, dzsjVar2, ds2, fe, dzsjVar4, dzsjVar6, dzsjVar7));
            case 3:
                return (T) new vrk(this.a.i.eV);
            case 4:
                return (T) new vre(this.a.i.eV);
            case 5:
                return (T) new vrr(this.a.i.eV);
            case 6:
                eol eolVar4 = this.a;
                ftt fttVar2 = eolVar4.i;
                dzsj<rb> dzsjVar8 = fttVar2.eV;
                dzsj<cqhn> il = fttVar2.eW.il();
                dzsj<vsf> jm = eolVar4.i.eW.jm();
                dzsj c = dxjh.c(eolVar4.i.H());
                dzsj c2 = dxjh.c(eolVar4.i.bT());
                dzsj dzsjVar9 = eolVar4.g;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new eok(eolVar4, 7);
                    eolVar4.g = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj<isd> jn = eolVar4.i.jn();
                dzsj c3 = dxjh.c(eolVar4.i.eW.bP());
                dzsj<cklf> fe2 = eolVar4.i.fe();
                dzsj dzsjVar11 = eolVar4.h;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new eok(eolVar4, 8);
                    eolVar4.h = dzsjVar11;
                }
                return (T) rev.b(dzsjVar8, il, jm, c, c2, dzsjVar10, jn, c3, fe2, dzsjVar11, eolVar4.i.eW.ny(), eolVar4.i.eW.V(), eolVar4.i.eW.ds());
            case 7:
                eol eolVar5 = this.a;
                T t = (T) eolVar5.f;
                if (t != null) {
                    return t;
                }
                ftt fttVar3 = eolVar5.i;
                rb rbVar = fttVar3.a;
                cqat rR2 = fttVar3.eW.a.rR();
                dxjg.e(rR2);
                ?? r2 = (T) new bvso(rbVar, rR2);
                eolVar5.f = r2;
                return r2;
            default:
                return (T) this.a.b();
        }
    }
}
