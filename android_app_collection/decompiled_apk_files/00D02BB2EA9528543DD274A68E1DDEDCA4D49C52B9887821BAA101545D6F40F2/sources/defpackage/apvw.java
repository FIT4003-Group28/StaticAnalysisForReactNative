package defpackage;
/* compiled from: PG */
/* renamed from: apvw  reason: default package */
/* loaded from: classes2.dex */
final class apvw implements degu<Boolean> {
    final /* synthetic */ btlu a;
    final /* synthetic */ deig b;
    final /* synthetic */ apvx c;

    public apvw(apvx apvxVar, btlu btluVar, deig deigVar) {
        this.c = apvxVar;
        this.a = btluVar;
        this.b = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.k(th);
        this.c.b(this.a, 2);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        dbsg<apzp> a;
        aqwp aqwpVar = this.c.c;
        btlu btluVar = this.a;
        boolean equals = Boolean.TRUE.equals(bool);
        dbsg<apzp> b = aqwpVar.b(btluVar);
        if (!b.a()) {
            a = dbpy.a;
        } else {
            apzo b2 = b.b().b();
            b2.b(equals);
            a = aqwpVar.a(b2.a(), btluVar);
        }
        if (a.a()) {
            this.b.j(a.b());
            this.c.c(this.a, a);
            return;
        }
        this.b.k(new IllegalStateException("Empty consumer data"));
        this.c.b(this.a, 2);
    }
}
