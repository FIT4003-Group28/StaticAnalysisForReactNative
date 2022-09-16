package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eon  reason: default package */
/* loaded from: classes6.dex */
final class eon implements dxis {
    final /* synthetic */ ftt a;

    public eon(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bthd bthdVar = (bthd) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bthdVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bthdVar.aI = tr;
        bthdVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bthdVar.aK = sU;
        bthdVar.aL = new cpv();
        bthdVar.aM = dxjc.c(this.a.eW.ie());
        bthdVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bthdVar.f = dxjc.c(this.a.cz());
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        bthdVar.a = tr2;
        bthdVar.b = this.a.wl();
        bthdVar.c = new cqhn();
    }
}
