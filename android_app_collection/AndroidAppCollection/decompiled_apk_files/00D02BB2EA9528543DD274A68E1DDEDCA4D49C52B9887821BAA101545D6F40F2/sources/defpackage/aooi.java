package defpackage;
/* compiled from: PG */
/* renamed from: aooi  reason: default package */
/* loaded from: classes2.dex */
final class aooi implements ango {
    private final ff a;
    private final gfv b;
    private final aoqb c;
    private final Runnable d;

    public aooi(ff ffVar, gfv gfvVar, final aoqb aoqbVar) {
        this.a = ffVar;
        this.b = gfvVar;
        this.c = aoqbVar;
        this.d = new Runnable(aoqbVar) { // from class: aooh
            private final aoqb a;

            {
                this.a = aoqbVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        };
    }

    private static boolean a(duyc duycVar) {
        return duycVar.b.size() != 0 && duycVar.b.get(0).a == 4;
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc<anhm> dcdcVar) {
        cqkx.p(this.c);
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        if (a(duycVar)) {
            this.c.o(false);
            if (!this.a.g().J()) {
                this.a.g().e();
            }
            this.b.Nw(anhf.b(dbpy.a));
        }
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        if (a(duycVar)) {
            this.c.o(false);
            this.a.runOnUiThread(this.d);
        }
    }
}
