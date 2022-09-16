package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxyd  reason: default package */
/* loaded from: classes5.dex */
public final class cxyd implements degu<cyti> {
    final /* synthetic */ cytq a;
    final /* synthetic */ cxye b;

    public cxyd(cxye cxyeVar, cytq cytqVar) {
        this.b = cxyeVar;
        this.a = cytqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cxye cxyeVar = this.b;
        cytg m = cyth.m();
        m.g(this.a);
        m.h(dcdc.e());
        ((cytc) m).b = cydx.c(cyer.PEOPLE_API_TOP_N, cyes.FAILED_NOT_IMPLEMENTED);
        m.b(0);
        m.d(true);
        m.f(0);
        cxyeVar.a(m.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyti cytiVar) {
        cytiVar.a(this.a);
    }
}
