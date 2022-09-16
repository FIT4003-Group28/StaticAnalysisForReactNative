package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fgr  reason: default package */
/* loaded from: classes6.dex */
final class fgr implements dxis {
    final /* synthetic */ ftt a;

    public fgr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdnr cdnrVar = (cdnr) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cdnrVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cdnrVar.aI = tr;
        cdnrVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cdnrVar.aK = sU;
        cdnrVar.aL = new cpv();
        cdnrVar.aM = dxjc.c(this.a.eW.ie());
        cdnrVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cdnrVar.a = this.a.eW.jc();
    }
}
