package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqd  reason: default package */
/* loaded from: classes6.dex */
public final class eqd implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<cbqd> b;

    public eqd(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cbaj cbajVar = (cbaj) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cbajVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cbajVar.aI = tr;
        cbajVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cbajVar.aK = sU;
        cbajVar.aL = new cpv();
        cbajVar.aM = dxjc.c(this.a.eW.ie());
        cbajVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cbajVar.a = this.a.wl();
        dzsj<cbbc> vC = this.a.vC();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<gga> ad = this.a.ad();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new eqc(this);
            this.b = dzsjVar;
        }
        cbajVar.b = new cbas(vC, il, ad, dzsjVar);
        cbajVar.c = this.a.eW.jh();
    }
}
