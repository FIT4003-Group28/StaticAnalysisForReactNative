package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: feh  reason: default package */
/* loaded from: classes6.dex */
public final class feh<T> implements dzsj<T> {
    final /* synthetic */ fei a;
    private final int b;

    public feh(fei feiVar, int i) {
        this.a = feiVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        bcnw bcnwVar;
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                return (T) new bcmv(this.a.h());
            case 2:
                fei feiVar = this.a;
                ftt fttVar = feiVar.b;
                rb rbVar = fttVar.a;
                cjqy tr = fttVar.eW.a.tr();
                dxjg.e(tr);
                bvrb tn = feiVar.b.eW.a.tn();
                dxjg.e(tn);
                buti rF = feiVar.b.eW.rF();
                bbqx iZ = feiVar.b.eW.iZ();
                akfa rK = feiVar.b.eW.a.rK();
                dxjg.e(rK);
                Executor sV = feiVar.b.eW.a.sV();
                dxjg.e(sV);
                Executor sU = feiVar.b.eW.a.sU();
                dxjg.e(sU);
                buti rF2 = feiVar.b.eW.rF();
                cqat rR = feiVar.b.eW.a.rR();
                dxjg.e(rR);
                cknt ckntVar = new cknt(iZ, rK, sV, sU, rF2, rR);
                btvo rp = feiVar.b.eW.a.rp();
                dxjg.e(rp);
                cqat rR2 = feiVar.b.eW.a.rR();
                dxjg.e(rR2);
                bbut be = feiVar.b.be();
                bckv b = feiVar.b();
                bcbw c = feiVar.c();
                bcnw bcnwVar2 = new bcnw(feiVar.e());
                dzsj<bcnu> e = feiVar.e();
                dzsj<btvo> V = feiVar.b.eW.V();
                dzsj dzsjVar = feiVar.a;
                if (dzsjVar == null) {
                    bcnwVar = bcnwVar2;
                    dzsjVar = new feh(feiVar, 4);
                    feiVar.a = dzsjVar;
                } else {
                    bcnwVar = bcnwVar2;
                }
                return (T) new bcms(rbVar, tr, tn, rF, ckntVar, rp, rR2, be, b, c, bcnwVar, new bcnl(e, V, dzsjVar), new bcod(feiVar.e(), feiVar.b.pw()), new bcnn(feiVar.e(), feiVar.b.aR(), dxjh.c(feiVar.b.m())), new bcnq(feiVar.e()), new apnq(), feiVar.d(), feiVar.g(), feiVar.b.k(), dxjc.c(feiVar.b.m()));
            case 3:
                fei feiVar2 = this.a;
                ftt fttVar2 = feiVar2.b;
                rb rbVar2 = fttVar2.a;
                bwsh cZ = fttVar2.cZ();
                ckcw rU = feiVar2.b.eW.a.rU();
                dxjg.e(rU);
                cjqy tr2 = feiVar2.b.eW.a.tr();
                dxjg.e(tr2);
                cjqq tp = feiVar2.b.eW.a.tp();
                dxjg.e(tp);
                ckmm r = feiVar2.b.eW.a.r();
                dxjg.e(r);
                bclf d = feiVar2.d();
                bckv b2 = feiVar2.b();
                Resources c2 = feiVar2.b.eW.a.c();
                dxjg.e(c2);
                return (T) new bcnu(rbVar2, cZ, rU, tr2, tp, r, d, b2, new bclo(c2));
            case 4:
                fei feiVar3 = this.a;
                return (T) new bdvd(feiVar3.b.eW.m(), feiVar3.b.eW.R(), feiVar3.b.eW.V(), feiVar3.b.eW.at(), feiVar3.b.eW.al());
            case 5:
                return (T) this.a.f();
            case 6:
                return (T) this.a.g();
            case 7:
                fei feiVar4 = this.a;
                return (T) new bcoi(feiVar4.h(), feiVar4.b.eV);
            case 8:
                fei feiVar5 = this.a;
                return (T) new bcol(feiVar5.h(), feiVar5.b.eV);
            case 9:
                fei feiVar6 = this.a;
                return (T) new bcot(feiVar6.h(), feiVar6.b.eV);
            default:
                fei feiVar7 = this.a;
                dzsj<bcms> h = feiVar7.h();
                ftt fttVar3 = feiVar7.b;
                return (T) new bcoq(h, fttVar3.eV, fttVar3.eW.p(), dxjh.c(feiVar7.b.m()));
        }
    }
}
