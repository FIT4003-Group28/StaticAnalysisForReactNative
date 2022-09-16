package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: etk  reason: default package */
/* loaded from: classes6.dex */
final class etk<T> implements dzsj<T> {
    final /* synthetic */ etl a;

    public etk(etl etlVar) {
        this.a = etlVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        etl etlVar = this.a;
        cqhn cqhnVar = new cqhn();
        ccgr fc = etlVar.a.eW.fc();
        Executor sU = etlVar.a.eW.a.sU();
        dxjg.e(sU);
        caxo ff = etlVar.a.ff();
        caxa caxaVar = caxa.QA;
        dxjg.f(caxaVar);
        return (T) cayk.b(cqhnVar, fc, sU, ff, caxaVar);
    }
}
