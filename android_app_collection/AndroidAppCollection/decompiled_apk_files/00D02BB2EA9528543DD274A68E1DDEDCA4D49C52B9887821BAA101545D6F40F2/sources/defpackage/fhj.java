package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fhj  reason: default package */
/* loaded from: classes6.dex */
public final class fhj implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<pja> b;

    public fhj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        pin pinVar = (pin) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        pinVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        pinVar.aI = tr;
        pinVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        pinVar.aK = sU;
        pinVar.aL = new cpv();
        pinVar.aM = dxjc.c(this.a.eW.ie());
        pinVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        pinVar.a = this.a.wq();
        pinVar.b = this.a.wl();
        dzsj<pja> dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fhi<>(this);
            this.b = dzsjVar;
        }
        pinVar.c = dzsjVar;
    }
}
