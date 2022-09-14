package defpackage;
/* compiled from: PG */
/* renamed from: bjma  reason: default package */
/* loaded from: classes3.dex */
final class bjma implements degu<btzx<djaa, djae>> {
    final /* synthetic */ bjfo a;
    final /* synthetic */ String b;
    final /* synthetic */ bjmi c;

    public bjma(bjmi bjmiVar, bjfo bjfoVar, String str) {
        this.c = bjmiVar;
        this.a = bjfoVar;
        this.b = str;
    }

    private final void c() {
        bjgh bjghVar = this.c.h;
        final bjfo bjfoVar = this.a;
        final String str = this.b;
        bjghVar.b(new Runnable(this, bjfoVar, str) { // from class: bjlz
            private final bjma a;
            private final bjfo b;
            private final String c;

            {
                this.a = this;
                this.b = bjfoVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjma bjmaVar = this.a;
                bjmaVar.c.c(this.b, this.c);
            }
        });
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<djaa, djae> btzxVar) {
        btzx<djaa, djae> btzxVar2 = btzxVar;
        if (btzxVar2 == null || this.c.b == null) {
            return;
        }
        int a = djad.a(btzxVar2.b().b);
        if (a == 0 || a != 2) {
            c();
            return;
        }
        this.c.b.b(new bjfg());
        this.c.b.b(new bjfa(2, 2));
        this.c.g();
    }
}
