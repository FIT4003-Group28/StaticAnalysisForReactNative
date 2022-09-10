package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: esd  reason: default package */
/* loaded from: classes6.dex */
final class esd implements dxis {
    final /* synthetic */ ese a;

    public esd(ese eseVar) {
        this.a = eseVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        uig uigVar = (uig) obj;
        cjqq tp = this.a.y.eW.a.tp();
        dxjg.e(tp);
        uigVar.aH = tp;
        cjqy tr = this.a.y.eW.a.tr();
        dxjg.e(tr);
        uigVar.aI = tr;
        uigVar.aJ = dbsg.i(this.a.y.ap());
        Executor sU = this.a.y.eW.a.sU();
        dxjg.e(sU);
        uigVar.aK = sU;
        uigVar.aL = new cpv();
        uigVar.aM = dxjc.c(this.a.y.eW.ie());
        uigVar.aN = dxjc.c(this.a.y.eW.iU());
        dxjc.c(this.a.y.lx());
        Executor sU2 = this.a.y.eW.a.sU();
        dxjg.e(sU2);
        uigVar.a = sU2;
        uigVar.b = this.a.y.wq();
        uigVar.c = this.a.y.wl();
        uigVar.d = this.a.j();
        uigVar.e = this.a.z();
        uigVar.f = new uil(this.a.y.a, this.a.z());
    }
}
