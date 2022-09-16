package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: exd  reason: default package */
/* loaded from: classes6.dex */
public final class exd implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<aymh> b;

    public exd(ftt fttVar) {
        this.a = fttVar;
    }

    private final dzsj<aymh> b() {
        dzsj<aymh> dzsjVar = this.b;
        if (dzsjVar == null) {
            exc excVar = new exc(this);
            this.b = excVar;
            return excVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ayze ayzeVar = (ayze) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ayzeVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ayzeVar.aI = tr;
        ayzeVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ayzeVar.aK = sU;
        ayzeVar.aL = new cpv();
        ayzeVar.aM = dxjc.c(this.a.eW.ie());
        ayzeVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ayzeVar.a = new cpv();
        ayzeVar.b = this.a.wk();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        ayzeVar.c = rD;
        ayzeVar.d = this.a.wq();
        ayzeVar.e = this.a.wl();
        new azbh(this.a.ad(), this.a.eW.V(), this.a.eW.di(), b(), this.a.eW.el());
        ayzeVar.f = new azbk(this.a.ad(), this.a.eW.V(), this.a.eW.di(), b(), this.a.eW.el());
        ayzeVar.g = this.a.wd();
    }
}
