package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fqk  reason: default package */
/* loaded from: classes6.dex */
final class fqk<T> implements dzsj<T> {
    final /* synthetic */ fql a;
    private final int b;

    public fqk(fql fqlVar, int i) {
        this.a = fqlVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        spk spkVar;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                fql fqlVar = this.a;
                return (T) new gun(fqlVar.d.eW.di(), fqlVar.d.eW.al(), fqlVar.d.eW.hN(), fqlVar.d.T(), fqlVar.d.eb(), fqlVar.d.eW.aI());
            } else if (i == 2) {
                return (T) this.a.b();
            } else {
                if (i != 3) {
                    ftt fttVar = this.a.d;
                    return (T) new sox(fttVar.a, dxjc.c(fttVar.r()));
                }
                fql fqlVar2 = this.a;
                dzsj dzsjVar = fqlVar2.c;
                if (dzsjVar == null) {
                    dzsjVar = new fqk(fqlVar2, 4);
                    fqlVar2.c = dzsjVar;
                }
                return (T) new soy(dxjc.c(dzsjVar));
            }
        }
        fql fqlVar3 = this.a;
        bxrr tf = fqlVar3.d.tf();
        akfa rK = fqlVar3.d.eW.a.rK();
        dxjg.e(rK);
        ania qq = fqlVar3.d.eW.qq();
        Executor sU = fqlVar3.d.eW.a.sU();
        dxjg.e(sU);
        btpc sz = fqlVar3.d.eW.a.sz();
        dxjg.e(sz);
        bvjj rB = fqlVar3.d.eW.a.rB();
        dxjg.e(rB);
        acwu lz = fqlVar3.d.lz();
        ftt fttVar2 = fqlVar3.d;
        bxse bxseVar = new bxse(fttVar2.eV, fttVar2.dh());
        dzsj<gga> ad = fqlVar3.d.ad();
        dzsj<akdv> P = fqlVar3.d.P();
        dzsj dzsjVar2 = fqlVar3.a;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fqk(fqlVar3, 1);
            fqlVar3.a = dzsjVar2;
        }
        snu snuVar = new snu(ad, P, dzsjVar2);
        ftt fttVar3 = fqlVar3.d;
        sql sqlVar = new sql(fttVar3.eV, dxjh.c(fttVar3.H()), dxjh.c(fqlVar3.d.eW.ii()), fqlVar3.d.eW.di(), fqlVar3.d.ix(), fqlVar3.d.eW.cx(), fqlVar3.d.iv(), fqlVar3.d.jW(), fqlVar3.d.eW.il(), fqlVar3.d.ad(), fqlVar3.d.eW.bk(), fqlVar3.d.eW.aw());
        ftt fttVar4 = fqlVar3.d;
        spt sptVar = new spt(sqlVar, new sqf(fttVar4.eV, fttVar4.eW.K(), dxjh.c(fqlVar3.d.H()), dxjh.c(fqlVar3.d.bT()), fqlVar3.d.eW.jm()), fqlVar3.d.eW.wf(), fqlVar3.d.eW.g());
        wcw ih = fqlVar3.d.eW.ih();
        whb lF = fqlVar3.d.eW.lF();
        btvo rp = fqlVar3.d.eW.a.rp();
        dxjg.e(rp);
        dxio c = dxjc.c(fqlVar3.d.eW.p());
        Application a = fqlVar3.d.eW.a.a();
        dxjg.e(a);
        spk spkVar2 = new spk(rp, c, new srb(a), fqlVar3.d.eW.qq());
        dxio c2 = dxjc.c(fqlVar3.d.H());
        awwq u = fqlVar3.d.u();
        ftt fttVar5 = fqlVar3.d;
        rb rbVar = fttVar5.a;
        dzsj<gga> ad2 = fttVar5.ad();
        dzsj c3 = dxjh.c(fqlVar3.d.H());
        dzsj<wcw> ii = fqlVar3.d.eW.ii();
        dzsj<String> ig = fqlVar3.d.eW.ig();
        dzsj<Executor> di = fqlVar3.d.eW.di();
        dzsj<Executor> o = fqlVar3.d.eW.o();
        dzsj<cqhn> il = fqlVar3.d.eW.il();
        dzsj<ahjq> k = fqlVar3.d.eW.k();
        dzsj dzsjVar3 = fqlVar3.b;
        if (dzsjVar3 == null) {
            spkVar = spkVar2;
            dzsjVar3 = new fqk(fqlVar3, 2);
            fqlVar3.b = dzsjVar3;
        } else {
            spkVar = spkVar2;
        }
        squ squVar = new squ(ad2, c3, ii, ig, di, o, il, k, dzsjVar3, fqlVar3.d.tb(), fqlVar3.d.eW.bk());
        sqz sqzVar = new sqz(fqlVar3.d.ad(), dxjh.c(fqlVar3.d.H()));
        btvo rp2 = fqlVar3.d.eW.a.rp();
        dxjg.e(rp2);
        sqn sqnVar = new sqn(rbVar, squVar, sqzVar, rp2);
        axbv dQ = fqlVar3.d.eW.dQ();
        ahjq wf = fqlVar3.d.eW.wf();
        Executor sU2 = fqlVar3.d.eW.a.sU();
        dxjg.e(sU2);
        spz spzVar = new spz(dQ, wf, sU2);
        ivg ivgVar = new ivg(fqlVar3.d.fN(), fqlVar3.d.eW.kb(), fqlVar3.d.eW.o(), fqlVar3.d.eW.K());
        ahjq wf2 = fqlVar3.d.eW.wf();
        btvo rp3 = fqlVar3.d.eW.a.rp();
        dxjg.e(rp3);
        btrm rz = fqlVar3.d.eW.a.rz();
        dxjg.e(rz);
        six c4 = fqlVar3.c();
        bzmh cH = fqlVar3.d.eW.cH();
        Context gK = fqlVar3.d.gK();
        cpv cpvVar = new cpv();
        ckcw rU = fqlVar3.d.eW.a.rU();
        dxjg.e(rU);
        cjqy tr = fqlVar3.d.eW.a.tr();
        dxjg.e(tr);
        return (T) new sos(tf, rK, qq, sU, sz, rB, lz, bxseVar, snuVar, sptVar, ih, lF, spkVar, c2, u, sqnVar, spzVar, ivgVar, wf2, rp3, rz, c4, cH, gK, cpvVar, rU, new spb(tr), (siv) fqlVar3.d.eW.nB());
    }
}
