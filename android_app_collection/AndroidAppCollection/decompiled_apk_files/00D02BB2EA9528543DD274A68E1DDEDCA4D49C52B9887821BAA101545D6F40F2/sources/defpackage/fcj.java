package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fcj  reason: default package */
/* loaded from: classes6.dex */
public final class fcj implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<awbo> b;

    public fcj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        awbc awbcVar = (awbc) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        awbcVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        awbcVar.aI = tr;
        awbcVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        awbcVar.aK = sU;
        awbcVar.aL = new cpv();
        awbcVar.aM = dxjc.c(this.a.eW.ie());
        awbcVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        awbcVar.ae = new cjxo(this.a.a);
        awbcVar.af = dxjc.c(this.a.ec());
        awbcVar.ag = this.a.wq();
        awbcVar.a = this.a.wl();
        dzsj<awbo> dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fci<>(this);
            this.b = dzsjVar;
        }
        awbcVar.b = dzsjVar;
    }
}
