package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: erl  reason: default package */
/* loaded from: classes6.dex */
final class erl implements dxis {
    final /* synthetic */ ftt a;

    public erl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        pqk pqkVar = (pqk) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        pqkVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        pqkVar.aI = tr;
        pqkVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        pqkVar.aK = sU;
        pqkVar.aL = new cpv();
        pqkVar.aM = dxjc.c(this.a.eW.ie());
        pqkVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        pqkVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        pqkVar.a = rD;
        pqkVar.b = new pqd(this.a.wl(), this.a.a);
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        pqkVar.c = tr2;
    }
}
