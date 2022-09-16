package defpackage;
/* compiled from: PG */
/* renamed from: udd  reason: default package */
/* loaded from: classes7.dex */
final class udd implements degu<brln> {
    final /* synthetic */ deig a;
    final /* synthetic */ ude b;

    public udd(ude udeVar, deig deigVar) {
        this.b = udeVar;
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.j(ude.d());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(brln brlnVar) {
        final brln brlnVar2 = brlnVar;
        brlu brluVar = brlnVar2.e;
        final cjqn d = this.b.f.d();
        int d2 = brluVar.d();
        if (d2 == 0) {
            this.a.j(ude.d());
        } else if (d2 == 1) {
            deig deigVar = this.a;
            amsz b = this.b.c().b();
            dbsk.s(b);
            deigVar.j(udj.d(dbsg.i(Integer.valueOf(b.c)), dbsg.i(brluVar.A().d()), 2));
        } else {
            final ude udeVar = this.b;
            deig deigVar2 = this.a;
            udeVar.c.b(true);
            if (brlnVar2.e.d() < 2) {
                bvoo.h("Attempted to initialize the disambiguation UI for a single search result.", new Object[0]);
                deigVar2.j(ude.d());
                return;
            }
            udeVar.j.execute(new Runnable(udeVar, brlnVar2, d) { // from class: uda
                private final ude a;
                private final brln b;
                private final cjqn c;

                {
                    this.a = udeVar;
                    this.b = brlnVar2;
                    this.c = d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ude udeVar2 = this.a;
                    brln brlnVar3 = this.b;
                    cjqn cjqnVar = this.c;
                    bral g = bram.g(bwrs.a(brlnVar3), udeVar2.e);
                    g.b(false);
                    g.c(cjqnVar);
                    udeVar2.d.a().E(g.a());
                }
            });
            amsz b2 = udeVar.c().b();
            dbsk.s(b2);
            deigVar2.j(udj.d(dbsg.i(Integer.valueOf(b2.c)), dbpy.a, 3));
        }
    }
}
