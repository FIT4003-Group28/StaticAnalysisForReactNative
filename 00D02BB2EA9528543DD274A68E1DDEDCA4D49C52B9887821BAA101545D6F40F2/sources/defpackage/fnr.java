package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fnr  reason: default package */
/* loaded from: classes6.dex */
final class fnr implements dxis {
    final /* synthetic */ ftt a;

    public fnr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bpbr bpbrVar = (bpbr) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bpbrVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bpbrVar.aI = tr;
        bpbrVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bpbrVar.aK = sU;
        bpbrVar.aL = new cpv();
        bpbrVar.aM = dxjc.c(this.a.eW.ie());
        bpbrVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bpbrVar.f = dxjc.c(this.a.cz());
        dxjg.e(this.a.eW.a.rD());
    }
}
