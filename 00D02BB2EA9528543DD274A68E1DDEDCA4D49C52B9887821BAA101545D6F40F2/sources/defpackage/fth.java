package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fth  reason: default package */
/* loaded from: classes6.dex */
final class fth<T> implements dzsj<T> {
    final /* synthetic */ fti a;

    public fth(fti ftiVar) {
        this.a = ftiVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        fti ftiVar = this.a;
        cqhn cqhnVar = new cqhn();
        avij qO = ftiVar.a.eW.qO();
        akox ap = ftiVar.a.ap();
        ahjq wf = ftiVar.a.eW.wf();
        avzp il = ftiVar.a.il();
        ftt fttVar = ftiVar.a;
        rb rbVar = fttVar.a;
        Executor sU = fttVar.eW.a.sU();
        dxjg.e(sU);
        cztz m = ftiVar.a.eW.a.m();
        dxjg.e(m);
        ?? r0 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
        r0.h();
        return r0;
    }
}
