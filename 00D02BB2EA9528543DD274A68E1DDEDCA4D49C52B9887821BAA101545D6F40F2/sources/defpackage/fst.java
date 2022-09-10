package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fst  reason: default package */
/* loaded from: classes6.dex */
public final class fst<T> implements dzsj<T> {
    final /* synthetic */ fsu a;
    private final int b;

    public fst(fsu fsuVar, int i) {
        this.a = fsuVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, bvap, bvan] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fsu fsuVar = this.a;
                return (T) new bdfc(fsuVar.f.eW.fr(), fsuVar.b());
            case 1:
                return (T) bcqk.b(this.a.a);
            case 2:
                fsu fsuVar2 = this.a;
                T t = (T) fsuVar2.b;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(fsuVar2.f.eW.h());
                bvrb tn = fsuVar2.f.eW.a.tn();
                dxjg.e(tn);
                ?? r2 = (T) bvar.b(bvaq.b(c, tn));
                fsuVar2.b = r2;
                return r2;
            case 3:
                return (T) new bdfe(this.a.f.eW.il());
            case 4:
                fsu fsuVar3 = this.a;
                dzsj dzsjVar = fsuVar3.c;
                if (dzsjVar == null) {
                    dzsjVar = new fst(fsuVar3, 5);
                    fsuVar3.c = dzsjVar;
                }
                return (T) new bdcm(dzsjVar);
            case 5:
                return (T) this.a.c();
            case 6:
                return (T) new bdcj(this.a.f.ux());
            case 7:
                fsu fsuVar4 = this.a;
                return (T) new bddz(fsuVar4.f.eW.at(), fsuVar4.f.eW.hN(), fsuVar4.f.eW.lK(), fsuVar4.f.eW.m(), fsuVar4.f.da());
            case 8:
                fsu fsuVar5 = this.a;
                rb rbVar = fsuVar5.f.a;
                cqhn cqhnVar = new cqhn();
                apqe le = fsuVar5.f.le();
                cjqy tr = fsuVar5.f.eW.a.tr();
                dxjg.e(tr);
                return (T) new bddb(rbVar, cqhnVar, le, tr, fsuVar5.a, fsuVar5.c(), bcql.b(fsuVar5.a), bcqh.b(fsuVar5.a));
            case 9:
                fsu fsuVar6 = this.a;
                ftt fttVar = fsuVar6.f;
                return (T) bdcq.b(fttVar.a, fttVar.aQ(), dxjc.c(fsuVar6.f.m()), bcqg.b(fsuVar6.a));
            case 10:
                return (T) bcqe.b(this.a.a);
            case 11:
                return (T) bcqd.b(this.a.a);
            case 12:
                return (T) bcqi.b(this.a.a);
            case 13:
                return (T) bcqj.b(this.a.a);
            case 14:
                fsu fsuVar7 = this.a;
                dzsj<Application> m = fsuVar7.f.eW.m();
                dzsj<bvjj> aw = fsuVar7.f.eW.aw();
                dzsj c2 = dxjh.c(fsuVar7.f.eW.p());
                dzsj<bfgx> nu = fsuVar7.f.nu();
                dzsj<cqhn> il = fsuVar7.f.eW.il();
                dzsj<gga> ad = fsuVar7.f.ad();
                dzsj<ahjq> k = fsuVar7.f.eW.k();
                dzsj<bwqv> er = fsuVar7.f.eW.er();
                dzsj<brvm> sG = fsuVar7.f.sG();
                dzsj<aeqg> jA = fsuVar7.f.jA();
                dzsj<bmmq> sI = fsuVar7.f.sI();
                dzsj dzsjVar2 = fsuVar7.d;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fst(fsuVar7, 15);
                    fsuVar7.d = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj<akox> as = fsuVar7.f.as();
                dzsj<bdvy> fr = fsuVar7.f.fr();
                dzsj<bfhu> sR = fsuVar7.f.sR();
                dzsj<bnjv> pl = fsuVar7.f.pl();
                dzsj<begg> az = fsuVar7.f.az();
                dzsj<brwc> sU = fsuVar7.f.sU();
                dzsj dzsjVar4 = fsuVar7.e;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fst(fsuVar7, 16);
                    fsuVar7.e = dzsjVar4;
                }
                return (T) new bdcz(m, aw, c2, nu, il, ad, k, er, sG, jA, sI, dzsjVar3, as, fr, sR, pl, az, sU, dzsjVar4, fsuVar7.f.sY());
            case 15:
                fsu fsuVar8 = this.a;
                return (T) new bdct(fsuVar8.f.pl(), fsuVar8.f.J(), fsuVar8.f.bf(), fsuVar8.f.iW());
            default:
                fsu fsuVar9 = this.a;
                return (T) new aaaf(fsuVar9.f.uz(), fsuVar9.f.ui(), fsuVar9.f.az(), fsuVar9.f.eW.lY());
        }
    }
}
