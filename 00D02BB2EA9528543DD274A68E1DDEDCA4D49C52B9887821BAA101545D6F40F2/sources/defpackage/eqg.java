package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqg  reason: default package */
/* loaded from: classes6.dex */
public final class eqg implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<cbqd> b;

    public eqg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cbbi cbbiVar = (cbbi) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cbbiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cbbiVar.aI = tr;
        cbbiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cbbiVar.aK = sU;
        cbbiVar.aL = new cpv();
        cbbiVar.aM = dxjc.c(this.a.eW.ie());
        cbbiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cbbiVar.a = this.a.wl();
        dzsj<cbbc> vC = this.a.vC();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new eqf(this);
            this.b = dzsjVar;
        }
        cbbiVar.b = new cbbr(vC, il, dzsjVar, this.a.ad());
        cbbiVar.c = this.a.eW.jh();
    }
}
