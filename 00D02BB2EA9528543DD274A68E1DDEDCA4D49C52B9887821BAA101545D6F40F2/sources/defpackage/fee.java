package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fee  reason: default package */
/* loaded from: classes6.dex */
public final class fee<T> implements dzsj<T> {
    final /* synthetic */ fef a;
    private final int b;

    public fee(fef fefVar, int i) {
        this.a = fefVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        bcnw bcnwVar;
        switch (this.b) {
            case 0:
                return (T) this.a.e();
            case 1:
                return (T) this.a.f();
            case 2:
                return (T) new cknm();
            case 3:
                return (T) new cknb();
            case 4:
                fef fefVar = this.a;
                dzsj dzsjVar = fefVar.b;
                if (dzsjVar == null) {
                    dzsjVar = new fee(fefVar, 5);
                    fefVar.b = dzsjVar;
                }
                return (T) new bcmv(dzsjVar);
            case 5:
                fef fefVar2 = this.a;
                ftt fttVar = fefVar2.c;
                rb rbVar = fttVar.a;
                cjqy tr = fttVar.eW.a.tr();
                dxjg.e(tr);
                bvrb tn = fefVar2.c.eW.a.tn();
                dxjg.e(tn);
                buti rF = fefVar2.c.eW.rF();
                bbqx iZ = fefVar2.c.eW.iZ();
                akfa rK = fefVar2.c.eW.a.rK();
                dxjg.e(rK);
                Executor sV = fefVar2.c.eW.a.sV();
                dxjg.e(sV);
                Executor sU = fefVar2.c.eW.a.sU();
                dxjg.e(sU);
                buti rF2 = fefVar2.c.eW.rF();
                cqat rR = fefVar2.c.eW.a.rR();
                dxjg.e(rR);
                cknt ckntVar = new cknt(iZ, rK, sV, sU, rF2, rR);
                btvo rp = fefVar2.c.eW.a.rp();
                dxjg.e(rp);
                cqat rR2 = fefVar2.c.eW.a.rR();
                dxjg.e(rR2);
                bbut be = fefVar2.c.be();
                bckv b = fefVar2.b();
                bcbw c = fefVar2.c();
                bcnw bcnwVar2 = new bcnw(fefVar2.g());
                dzsj<bcnu> g = fefVar2.g();
                dzsj<btvo> V = fefVar2.c.eW.V();
                dzsj dzsjVar2 = fefVar2.a;
                if (dzsjVar2 == null) {
                    bcnwVar = bcnwVar2;
                    dzsjVar2 = new fee(fefVar2, 7);
                    fefVar2.a = dzsjVar2;
                } else {
                    bcnwVar = bcnwVar2;
                }
                return (T) new bcms(rbVar, tr, tn, rF, ckntVar, rp, rR2, be, b, c, bcnwVar, new bcnl(g, V, dzsjVar2), new bcod(fefVar2.g(), fefVar2.c.pw()), new bcnn(fefVar2.g(), fefVar2.c.aR(), dxjh.c(fefVar2.c.m())), new bcnq(fefVar2.g()), new apnq(), fefVar2.d(), fefVar2.f(), fefVar2.c.k(), dxjc.c(fefVar2.c.m()));
            case 6:
                fef fefVar3 = this.a;
                ftt fttVar2 = fefVar3.c;
                rb rbVar2 = fttVar2.a;
                bwsh cZ = fttVar2.cZ();
                ckcw rU = fefVar3.c.eW.a.rU();
                dxjg.e(rU);
                cjqy tr2 = fefVar3.c.eW.a.tr();
                dxjg.e(tr2);
                cjqq tp = fefVar3.c.eW.a.tp();
                dxjg.e(tp);
                ckmm r = fefVar3.c.eW.a.r();
                dxjg.e(r);
                bclf d = fefVar3.d();
                bckv b2 = fefVar3.b();
                Resources c2 = fefVar3.c.eW.a.c();
                dxjg.e(c2);
                return (T) new bcnu(rbVar2, cZ, rU, tr2, tp, r, d, b2, new bclo(c2));
            case 7:
                fef fefVar4 = this.a;
                return (T) new bdvd(fefVar4.c.eW.m(), fefVar4.c.eW.R(), fefVar4.c.eW.V(), fefVar4.c.eW.at(), fefVar4.c.eW.al());
            case 8:
                fef fefVar5 = this.a;
                return (T) new bcof(fefVar5.c.bf(), fefVar5.h());
            case 9:
                return (T) this.a.b();
            default:
                btvo rp2 = this.a.c.eW.a.rp();
                dxjg.e(rp2);
                return (T) new afxw(rp2);
        }
    }
}
