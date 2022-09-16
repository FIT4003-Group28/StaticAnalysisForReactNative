package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fgi  reason: default package */
/* loaded from: classes6.dex */
public final class fgi implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bkdy> b;

    public fgi(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bkav bkavVar = (bkav) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bkavVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bkavVar.aI = tr;
        bkavVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bkavVar.aK = sU;
        bkavVar.aL = new cpv();
        bkavVar.aM = dxjc.c(this.a.eW.ie());
        bkavVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bkavVar.ar = new bgqo(this.a.eW.V());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bkavVar.a = rD;
        bkavVar.b = this.a.wl();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fgh(this);
            this.b = dzsjVar;
        }
        bkavVar.c = new bkec(dzsjVar);
    }
}
