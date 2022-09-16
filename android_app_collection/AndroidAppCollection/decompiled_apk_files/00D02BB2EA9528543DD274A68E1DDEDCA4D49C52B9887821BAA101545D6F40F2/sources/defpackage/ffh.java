package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ffh  reason: default package */
/* loaded from: classes6.dex */
final class ffh implements dxis {
    final /* synthetic */ ftt a;

    public ffh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdnc cdncVar = (cdnc) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cdncVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cdncVar.aI = tr;
        cdncVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cdncVar.aK = sU;
        cdncVar.aL = new cpv();
        cdncVar.aM = dxjc.c(this.a.eW.ie());
        cdncVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cdncVar.a = new cebd(this.a.eW.al(), this.a.uv());
        cdncVar.b = this.a.fq();
    }
}
