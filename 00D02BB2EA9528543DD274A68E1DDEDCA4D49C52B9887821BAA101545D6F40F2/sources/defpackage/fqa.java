package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqa  reason: default package */
/* loaded from: classes6.dex */
public final class fqa implements dxis {
    public volatile dzsj<shu> a;
    public volatile dzsj<sdz> b;
    public volatile dzsj<qsm> c;
    public volatile dzsj<vox> d;
    public volatile dzsj<sgc> e;
    public volatile Object f = new dxjf();
    public volatile Object g = new dxjf();
    public volatile dzsj<rln> h;
    final /* synthetic */ ftt i;
    private volatile dzsj<shc> j;

    public fqa(ftt fttVar) {
        this.i = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        roj rojVar = (roj) obj;
        cjqq tp = this.i.eW.a.tp();
        dxjg.e(tp);
        rojVar.aH = tp;
        cjqy tr = this.i.eW.a.tr();
        dxjg.e(tr);
        rojVar.aI = tr;
        rojVar.aJ = dbsg.i(this.i.ap());
        Executor sU = this.i.eW.a.sU();
        dxjg.e(sU);
        rojVar.aK = sU;
        rojVar.aL = new cpv();
        rojVar.aM = dxjc.c(this.i.eW.ie());
        rojVar.aN = dxjc.c(this.i.eW.iU());
        dxjc.c(this.i.lx());
        rojVar.a = this.i.wq();
        rojVar.b = this.i.wl();
        dzsj<cqhn> il = this.i.eW.il();
        dzsj dzsjVar = this.j;
        if (dzsjVar == null) {
            dzsjVar = new fpz(this, 0);
            this.j = dzsjVar;
        }
        rojVar.g = new sgr(il, dzsjVar);
    }
}
