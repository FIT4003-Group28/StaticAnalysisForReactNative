package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fmn  reason: default package */
/* loaded from: classes6.dex */
final class fmn implements dxis {
    final /* synthetic */ ftt a;

    public fmn(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apew apewVar = (apew) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        apewVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        apewVar.aI = tr;
        apewVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        apewVar.aK = sU;
        apewVar.aL = new cpv();
        apewVar.aM = dxjc.c(this.a.eW.ie());
        apewVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        apewVar.f = dxjc.c(this.a.cz());
        apewVar.c = this.a.wl();
        apewVar.d = new apha(this.a.eW.fr(), this.a.ad());
        dxjg.e(this.a.eW.a.rD());
        apewVar.e = this.a.wk();
    }
}
