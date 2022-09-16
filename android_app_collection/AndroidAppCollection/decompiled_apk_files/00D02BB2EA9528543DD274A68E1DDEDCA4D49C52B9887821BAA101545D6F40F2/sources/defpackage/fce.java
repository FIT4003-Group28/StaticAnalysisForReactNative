package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fce  reason: default package */
/* loaded from: classes6.dex */
public final class fce implements dxis {
    public final avvz a;
    public volatile avuk b;
    final /* synthetic */ ftt c;
    private volatile dzsj<avxz> d;

    public fce(ftt fttVar, avvz avvzVar) {
        this.c = fttVar;
        this.a = avvzVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        avvz avvzVar = (avvz) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        avvzVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        avvzVar.aI = tr;
        avvzVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        avvzVar.aK = sU;
        avvzVar.aL = new cpv();
        avvzVar.aM = dxjc.c(this.c.eW.ie());
        avvzVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        avvzVar.b = this.c.h();
        avvzVar.c = this.c.wl();
        avvzVar.d = this.c.wq();
        dzsj<avxz> dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new fcd<>(this);
            this.d = dzsjVar;
        }
        avvzVar.e = dzsjVar;
        avvzVar.f = this.c.wk();
    }
}
