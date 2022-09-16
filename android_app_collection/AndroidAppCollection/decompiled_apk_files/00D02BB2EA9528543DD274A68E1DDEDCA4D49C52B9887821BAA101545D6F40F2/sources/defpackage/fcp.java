package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fcp  reason: default package */
/* loaded from: classes6.dex */
public final class fcp implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<awfk> b;

    public fcp(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        awfw awfwVar = (awfw) obj;
        awfwVar.aT = this.a.gK();
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        awfwVar.aU = rU;
        dxjg.e(this.a.eW.a.tr());
        awfwVar.aV = this.a.wq();
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        awfwVar.aW = tp;
        awfwVar.aY = this.a.lw();
        awfwVar.ad = this.a.gK();
        bvjj rB = this.a.eW.a.rB();
        dxjg.e(rB);
        awfwVar.ae = rB;
        awfwVar.af = this.a.eW.qP();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        awfwVar.ag = rp;
        awfwVar.ah = this.a.cp();
        this.a.aV();
        awfwVar.ai = dxjc.c(this.a.eW.p());
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        awfwVar.aj = tr;
        awfwVar.ak = this.a.kk();
        awfwVar.al = this.a.um();
        dzsj<awfk> dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fco<>(this);
            this.b = dzsjVar;
        }
        awfwVar.am = dzsjVar;
        awfwVar.an = this.a.eW.da();
        this.a.p();
        this.a.eW.qO();
        dehp tl = this.a.eW.a.tl();
        dxjg.e(tl);
        awfwVar.ao = tl;
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        awfwVar.ap = sU;
    }
}
