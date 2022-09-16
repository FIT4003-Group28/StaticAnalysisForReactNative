package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fgm  reason: default package */
/* loaded from: classes6.dex */
final class fgm implements dxis {
    final /* synthetic */ ftt a;

    public fgm(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdnq cdnqVar = (cdnq) obj;
        cdnqVar.a = this.a.wl();
        cqhn cqhnVar = new cqhn();
        ccgr fc = this.a.eW.fc();
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        caxo ff = this.a.ff();
        this.a.eW.jc();
        caxa caxaVar = caxa.REVIEW;
        dxjg.f(caxaVar);
        cdnqVar.b = cayk.b(cqhnVar, fc, sU, ff, caxaVar);
    }
}
