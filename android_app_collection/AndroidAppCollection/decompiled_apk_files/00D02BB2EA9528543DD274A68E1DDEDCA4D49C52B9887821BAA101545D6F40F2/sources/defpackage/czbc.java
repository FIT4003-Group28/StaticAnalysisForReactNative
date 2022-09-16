package defpackage;
/* compiled from: PG */
/* renamed from: czbc  reason: default package */
/* loaded from: classes5.dex */
final class czbc implements degu<cykt> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ czbd b;

    public czbc(czbd czbdVar, dbtp dbtpVar) {
        this.b = czbdVar;
        this.a = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.d(this.b.f, 8, 0L, cyor.a);
        cypg.e(this.b.f, 8, cypj.a(th), 0L, null, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cykt cyktVar) {
        cykt cyktVar2 = cyktVar;
        cyes a = this.b.a(cyktVar2);
        cypg.d(this.b.f, 8, czbd.c(cyktVar2), cyor.a);
        cypg.e(this.b.f, 8, cyfa.b(a), czbd.d(cyktVar2), this.a, cyor.a);
    }
}
