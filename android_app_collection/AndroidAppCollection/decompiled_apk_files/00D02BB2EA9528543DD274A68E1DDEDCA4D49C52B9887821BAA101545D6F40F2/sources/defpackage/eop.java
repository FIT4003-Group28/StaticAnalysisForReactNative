package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eop  reason: default package */
/* loaded from: classes6.dex */
final class eop implements dxis {
    final /* synthetic */ ftt a;

    public eop(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bpao bpaoVar = (bpao) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bpaoVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bpaoVar.aI = tr;
        bpaoVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bpaoVar.aK = sU;
        bpaoVar.aL = new cpv();
        bpaoVar.aM = dxjc.c(this.a.eW.ie());
        bpaoVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bpaoVar.f = dxjc.c(this.a.cz());
        dxjg.e(this.a.eW.a.rD());
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        bpaoVar.c = tr2;
    }
}
