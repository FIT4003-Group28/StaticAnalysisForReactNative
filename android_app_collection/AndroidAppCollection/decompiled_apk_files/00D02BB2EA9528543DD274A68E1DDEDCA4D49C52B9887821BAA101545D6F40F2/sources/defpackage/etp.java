package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: etp  reason: default package */
/* loaded from: classes6.dex */
final class etp implements dxis {
    final /* synthetic */ ftt a;

    public etp(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aobw aobwVar = (aobw) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aobwVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aobwVar.aI = tr;
        aobwVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aobwVar.aK = sU;
        aobwVar.aL = new cpv();
        aobwVar.aM = dxjc.c(this.a.eW.ie());
        aobwVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aobwVar.a = this.a.eW.rw();
        aobwVar.b = this.a.eW.ho();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        aobwVar.c = rD;
        aobwVar.d = this.a.wq();
        ftt fttVar = this.a;
        rb rbVar = fttVar.a;
        iuk kj = fttVar.kj();
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        dxjg.e(this.a.eW.a.th());
        dehq tg = this.a.eW.a.tg();
        dxjg.e(tg);
        bvjj rB = this.a.eW.a.rB();
        dxjg.e(rB);
        Application a = this.a.eW.a.a();
        dxjg.e(a);
        cjqy tr3 = this.a.eW.a.tr();
        dxjg.e(tr3);
        aobwVar.e = new ansy(rbVar, kj, tr2, tg, rB, new answ(new ansu(a, tr3)), this.a.kk());
    }
}
