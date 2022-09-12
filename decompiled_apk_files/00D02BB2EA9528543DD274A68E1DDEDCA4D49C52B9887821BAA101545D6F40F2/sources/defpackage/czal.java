package defpackage;
/* compiled from: PG */
/* renamed from: czal  reason: default package */
/* loaded from: classes5.dex */
final class czal implements degu<cyka> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ czam b;

    public czal(czam czamVar, dbtp dbtpVar) {
        this.b = czamVar;
        this.a = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.d(this.b.f, 10, 0L, cyor.a);
        cypg.e(this.b.f, 10, cypj.a(th), 0L, null, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyka cykaVar) {
        cyka cykaVar2 = cykaVar;
        cyes a = this.b.a(cykaVar2);
        cypg.d(this.b.f, 10, czam.c(cykaVar2), cyor.a);
        cypg.e(this.b.f, 10, cyfa.b(a), czam.d(cykaVar2), this.a, cyor.a);
    }
}
