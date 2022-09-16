package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fsx  reason: default package */
/* loaded from: classes6.dex */
public final class fsx implements dxis {
    public volatile dzsj<cjee> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<cjec> c;

    public fsx(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cjei cjeiVar = (cjei) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        cjeiVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        cjeiVar.aI = tr;
        cjeiVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        cjeiVar.aK = sU;
        cjeiVar.aL = new cpv();
        cjeiVar.aM = dxjc.c(this.b.eW.ie());
        cjeiVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        cjeiVar.a = this.b.wk();
        cjeiVar.b = this.b.wq();
        cjeiVar.c = dxjc.c(this.b.cV());
        cjeiVar.d = this.b.wl();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fsw(this, 0);
            this.c = dzsjVar;
        }
        cjeiVar.e = new cjeg(il, dzsjVar, this.b.eV);
    }
}
