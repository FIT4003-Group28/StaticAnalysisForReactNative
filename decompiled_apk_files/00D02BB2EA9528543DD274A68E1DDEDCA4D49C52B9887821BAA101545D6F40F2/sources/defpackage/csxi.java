package defpackage;
/* compiled from: PG */
/* renamed from: csxi  reason: default package */
/* loaded from: classes5.dex */
final class csxi implements degu<ctqi> {
    final /* synthetic */ ctyy a;
    final /* synthetic */ long b;
    final /* synthetic */ csxj c;

    public csxi(csxj csxjVar, ctyy ctyyVar, long j) {
        this.c = csxjVar;
        this.a = ctyyVar;
        this.b = j;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.f(this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(ctqi ctqiVar) {
        this.c.f(this.a);
        ctog ctogVar = this.c.e;
        ctxm r = ctxn.r();
        r.n(this.a.b().e());
        r.g(10105);
        ctxy d = ctxz.d();
        ctxq ctxqVar = (ctxq) d;
        ctxqVar.b = dbsg.i(Integer.valueOf(ctqiVar.b()));
        cstd.a();
        ctxqVar.c = dbsg.i(Long.valueOf(System.currentTimeMillis() - this.b));
        r.b(d.a());
        ctogVar.b(r.a());
    }
}
