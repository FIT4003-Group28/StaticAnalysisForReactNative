package defpackage;
/* compiled from: PG */
/* renamed from: czbv  reason: default package */
/* loaded from: classes5.dex */
final class czbv implements degu<cyit> {
    final /* synthetic */ cyor a;
    final /* synthetic */ dbtp b;
    final /* synthetic */ czbw c;
    final /* synthetic */ int d;

    public czbv(czbw czbwVar, int i, cyor cyorVar, dbtp dbtpVar) {
        this.c = czbwVar;
        this.d = i;
        this.a = cyorVar;
        this.b = dbtpVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.d(this.c.d, this.d, 0L, this.a);
        cypg.e(this.c.d, this.d, cypj.a(th), 0L, null, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyit cyitVar) {
        cyit cyitVar2 = cyitVar;
        cypg.d(this.c.d, this.d, czbw.e(cyitVar2), this.a);
        cypg.e(this.c.d, this.d, 2, czbw.f(cyitVar2), this.b, this.a);
    }
}
