package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eph  reason: default package */
/* loaded from: classes6.dex */
final class eph implements dxis {
    final /* synthetic */ ftt a;

    public eph(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aptb aptbVar = (aptb) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aptbVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aptbVar.aI = tr;
        aptbVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aptbVar.aK = sU;
        aptbVar.aL = new cpv();
        aptbVar.aM = dxjc.c(this.a.eW.ie());
        aptbVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aptbVar.a = this.a.wq();
        aptbVar.b = new bvts(this.a.am(), this.a.y(), this.a.ad(), this.a.af());
    }
}
