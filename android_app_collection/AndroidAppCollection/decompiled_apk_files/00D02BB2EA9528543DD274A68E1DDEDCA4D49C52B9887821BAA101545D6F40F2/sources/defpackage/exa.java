package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: exa  reason: default package */
/* loaded from: classes6.dex */
public final class exa implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<aymh> b;

    public exa(ftt fttVar) {
        this.a = fttVar;
    }

    private final dzsj<aymh> b() {
        dzsj<aymh> dzsjVar = this.b;
        if (dzsjVar == null) {
            ewz ewzVar = new ewz(this);
            this.b = ewzVar;
            return ewzVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ayyz ayyzVar = (ayyz) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ayyzVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ayyzVar.aI = tr;
        ayyzVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ayyzVar.aK = sU;
        ayyzVar.aL = new cpv();
        ayyzVar.aM = dxjc.c(this.a.eW.ie());
        ayyzVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ayyzVar.a = new cpv();
        ayyzVar.b = this.a.wk();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        ayyzVar.c = rD;
        ayyzVar.d = this.a.wq();
        ayyzVar.e = this.a.wl();
        ayyzVar.f = new azbh(this.a.ad(), this.a.eW.V(), this.a.eW.di(), b(), this.a.eW.el());
        new azbk(this.a.ad(), this.a.eW.V(), this.a.eW.di(), b(), this.a.eW.el());
        ayyzVar.g = this.a.wd();
    }
}
