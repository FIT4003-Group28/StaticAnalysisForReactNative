package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqa  reason: default package */
/* loaded from: classes6.dex */
public final class eqa implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<cbqd> b;

    public eqa(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cazx cazxVar = (cazx) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cazxVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cazxVar.aI = tr;
        cazxVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cazxVar.aK = sU;
        cazxVar.aL = new cpv();
        cazxVar.aM = dxjc.c(this.a.eW.ie());
        cazxVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cazxVar.a = this.a.wl();
        dzsj<cbbc> vC = this.a.vC();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new epz(this);
            this.b = dzsjVar;
        }
        cazxVar.b = new cbae(vC, il, dzsjVar, this.a.ad());
        cazxVar.c = this.a.eW.jh();
    }
}
