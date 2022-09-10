package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fpg  reason: default package */
/* loaded from: classes6.dex */
public final class fpg implements dxis {
    public volatile dzsj<dbsg<afha>> a;
    public volatile dzsj<dbsg<aagc>> b;
    public volatile dzsj<dbsg<akgd>> c;
    final /* synthetic */ ftt d;
    private volatile dzsj<bynr> e;
    private volatile dzsj<bynx> f;

    public fpg(ftt fttVar) {
        this.d = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        byev byevVar = (byev) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        byevVar.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        byevVar.aI = tr;
        byevVar.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        byevVar.aK = sU;
        byevVar.aL = new cpv();
        byevVar.aM = dxjc.c(this.d.eW.ie());
        byevVar.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        byevVar.b = dxjc.c(this.d.cD());
        byevVar.d = this.d.wq();
        byevVar.e = this.d.wl();
        dzsj<rb> dzsjVar = this.d.eV;
        dzsj dzsjVar2 = this.e;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fpf(this, 0);
            this.e = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.f;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fpf(this, 4);
            this.f = dzsjVar4;
        }
        byevVar.f = new bykf(dzsjVar, dzsjVar3, dzsjVar4, this.d.as(), dxjh.c(this.d.av()), this.d.dF(), this.d.eW.al());
    }
}
