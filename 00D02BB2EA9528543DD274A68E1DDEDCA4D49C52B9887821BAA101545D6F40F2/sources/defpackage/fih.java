package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fih  reason: default package */
/* loaded from: classes6.dex */
public final class fih implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bptc> b;

    public fih(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bpdi bpdiVar = (bpdi) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bpdiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bpdiVar.aI = tr;
        bpdiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bpdiVar.aK = sU;
        bpdiVar.aL = new cpv();
        bpdiVar.aM = dxjc.c(this.a.eW.ie());
        bpdiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bpdiVar.f = dxjc.c(this.a.cz());
        bpdiVar.a = this.a.wl();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<cztz> dd = this.a.eW.dd();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fig(this);
            this.b = dzsjVar;
        }
        bpdiVar.b = new bpdl(il, dd, dzsjVar);
    }
}
