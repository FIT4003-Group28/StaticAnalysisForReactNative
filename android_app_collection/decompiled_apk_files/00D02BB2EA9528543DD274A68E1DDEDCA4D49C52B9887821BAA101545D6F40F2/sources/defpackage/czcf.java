package defpackage;
/* compiled from: PG */
/* renamed from: czcf  reason: default package */
/* loaded from: classes5.dex */
final class czcf implements degu<dsim> {
    final /* synthetic */ dbtp a;
    final /* synthetic */ czch b;

    public czcf(czch czchVar, dbtp dbtpVar) {
        this.b = czchVar;
        this.a = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.d(this.b.e, 2, 0L, cyor.a);
        cypg.e(this.b.e, 2, cypj.a(th), 0L, null, cyor.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dsim dsimVar) {
        cypg.d(this.b.e, 2, 0L, cyor.a);
        cypg.e(this.b.e, 2, 2, 0L, this.a, cyor.a);
    }
}
