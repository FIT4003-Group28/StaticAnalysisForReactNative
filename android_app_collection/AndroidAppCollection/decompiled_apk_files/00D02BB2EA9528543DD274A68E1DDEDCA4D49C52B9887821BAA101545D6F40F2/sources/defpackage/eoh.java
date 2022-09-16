package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eoh  reason: default package */
/* loaded from: classes6.dex */
public final class eoh<T> implements dzsj<T> {
    final /* synthetic */ eoi a;
    private final int b;

    public eoh(eoi eoiVar, int i) {
        this.a = eoiVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [T, bvso] */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        switch (this.b) {
            case 0:
                eoi eoiVar = this.a;
                fyu fyuVar = eoiVar.g.eW;
                if (fyuVar.eK == null) {
                    dxio c = dxjc.c(fyuVar.h());
                    bvrb tn = fyuVar.a.tn();
                    dxjg.e(tn);
                    fyuVar.eK = new buok(new buoj(c, tn));
                }
                dxjg.e(eoiVar.g.eW.a.sV());
                dxjg.e(eoiVar.g.eW.a.rp());
                return (T) new rcx();
            case 1:
                eoi eoiVar2 = this.a;
                Object obj2 = eoiVar2.c;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = eoiVar2.c;
                        if (obj instanceof dxjf) {
                            dzsj dzsjVar = eoiVar2.b;
                            if (dzsjVar == null) {
                                dzsjVar = new eoh(eoiVar2, 2);
                                eoiVar2.b = dzsjVar;
                            }
                            obj = (wbw) dxjc.c(dzsjVar).a();
                            dxjc.d(eoiVar2.c, obj);
                            eoiVar2.c = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (T) ((wbw) obj2);
            case 2:
                eoi eoiVar3 = this.a;
                Object tv = eoiVar3.g.tv();
                ftt fttVar = eoiVar3.g;
                rb rbVar = fttVar.a;
                btvo rp = fttVar.eW.a.rp();
                dxjg.e(rp);
                cqhn cqhnVar = new cqhn();
                rci rciVar = eoiVar3.a;
                bvjj rB = eoiVar3.g.eW.a.rB();
                dxjg.e(rB);
                Executor sU = eoiVar3.g.eW.a.sU();
                dxjg.e(sU);
                return (T) new wbu((wbl) tv, rbVar, rp, cqhnVar, rciVar, rB, sU);
            case 3:
                eoi eoiVar4 = this.a;
                return (T) new ivg(eoiVar4.g.fN(), eoiVar4.g.eW.kb(), eoiVar4.g.eW.o(), eoiVar4.g.eW.K());
            case 4:
                eoi eoiVar5 = this.a;
                ftt fttVar2 = eoiVar5.g;
                rb rbVar2 = fttVar2.a;
                bvjj rB2 = fttVar2.eW.a.rB();
                dxjg.e(rB2);
                dxio c2 = dxjc.c(eoiVar5.g.eW.p());
                cqat rR = eoiVar5.g.eW.a.rR();
                dxjg.e(rR);
                return (T) new yzi(rbVar2, new vma(rB2, c2, rR), dxjc.c(eoiVar5.g.m()));
            case 5:
                eoi eoiVar6 = this.a;
                return (T) new gun(eoiVar6.g.eW.di(), eoiVar6.g.eW.al(), eoiVar6.g.eW.hN(), eoiVar6.g.T(), eoiVar6.g.eb(), eoiVar6.g.eW.aI());
            case 6:
                eoi eoiVar7 = this.a;
                ftt fttVar3 = eoiVar7.g;
                dzsj<rb> dzsjVar2 = fttVar3.eV;
                dzsj<cqhn> il = fttVar3.eW.il();
                dzsj<vsf> jm = eoiVar7.g.eW.jm();
                dzsj c3 = dxjh.c(eoiVar7.g.H());
                dzsj c4 = dxjh.c(eoiVar7.g.bT());
                dzsj dzsjVar3 = eoiVar7.e;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new eoh(eoiVar7, 7);
                    eoiVar7.e = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj<isd> jn = eoiVar7.g.jn();
                dzsj c5 = dxjh.c(eoiVar7.g.eW.bP());
                dzsj<cklf> fe = eoiVar7.g.fe();
                dzsj dzsjVar5 = eoiVar7.f;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new eoh(eoiVar7, 8);
                    eoiVar7.f = dzsjVar5;
                }
                return (T) rev.b(dzsjVar2, il, jm, c3, c4, dzsjVar4, jn, c5, fe, dzsjVar5, eoiVar7.g.eW.ny(), eoiVar7.g.eW.V(), eoiVar7.g.eW.ds());
            case 7:
                eoi eoiVar8 = this.a;
                T t = (T) eoiVar8.d;
                if (t != null) {
                    return t;
                }
                ftt fttVar4 = eoiVar8.g;
                rb rbVar3 = fttVar4.a;
                cqat rR2 = fttVar4.eW.a.rR();
                dxjg.e(rR2);
                ?? r1 = (T) new bvso(rbVar3, rR2);
                eoiVar8.d = r1;
                return r1;
            case 8:
                eoi eoiVar9 = this.a;
                return (T) new zse(eoiVar9.g.eW.m(), eoiVar9.g.eW.hN());
            case 9:
                eoi eoiVar10 = this.a;
                return (T) new ziq(eoiVar10.g.wk(), eoiVar10.g.wl(), eoiVar10.b());
            case 10:
                return (T) new vrk(this.a.g.eV);
            case 11:
                return (T) new vre(this.a.g.eV);
            case 12:
                return (T) new vrr(this.a.g.eV);
            case 13:
                eoi eoiVar11 = this.a;
                return (T) new zni(eoiVar11.g.ez(), eoiVar11.g.eW.fr(), eoiVar11.g.y());
            case 14:
                eoi eoiVar12 = this.a;
                ftt fttVar5 = eoiVar12.g;
                return (T) new rfp(fttVar5.eV, fttVar5.eW.V(), eoiVar12.g.eW.hN(), dxjh.c(eoiVar12.g.m()));
            case 15:
                eoi eoiVar13 = this.a;
                return (T) new rem(eoiVar13.g.ad(), eoiVar13.g.eW.V(), eoiVar13.g.eW.hN());
            case 16:
                eoi eoiVar14 = this.a;
                Application a = eoiVar14.g.eW.a.a();
                dxjg.e(a);
                cqhn cqhnVar2 = new cqhn();
                btvo rp2 = eoiVar14.g.eW.a.rp();
                dxjg.e(rp2);
                bvjj rB3 = eoiVar14.g.eW.a.rB();
                dxjg.e(rB3);
                cqat rR3 = eoiVar14.g.eW.a.rR();
                dxjg.e(rR3);
                return (T) new qqz(a, cqhnVar2, rp2, rB3, rR3);
            case 17:
                eoi eoiVar15 = this.a;
                return (T) new qwx(eoiVar15.g.eW.il(), eoiVar15.g.y(), eoiVar15.g.eS(), eoiVar15.g.eW.m(), dxjh.c(eoiVar15.g.aV()));
            case 18:
                return (T) this.a.b();
            case 19:
                return (T) new rfr(dxjh.c(this.a.g.J()));
            case 20:
                return (T) new qqe();
            default:
                return (T) new qqy(this.a.g.eW.aw());
        }
    }
}
