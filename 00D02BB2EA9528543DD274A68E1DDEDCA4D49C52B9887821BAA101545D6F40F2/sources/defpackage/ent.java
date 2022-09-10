package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ent  reason: default package */
/* loaded from: classes6.dex */
final class ent implements dxis {
    final /* synthetic */ ftt a;

    public ent(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rml rmlVar = (rml) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        rmlVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        rmlVar.aI = tr;
        rmlVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        rmlVar.aK = sU;
        rmlVar.aL = new cpv();
        rmlVar.aM = dxjc.c(this.a.eW.ie());
        rmlVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        rmlVar.f = dxjc.c(this.a.cz());
        ftt fttVar = this.a;
        rmlVar.a = fttVar.a;
        rmlVar.b = fttVar.wl();
    }
}
