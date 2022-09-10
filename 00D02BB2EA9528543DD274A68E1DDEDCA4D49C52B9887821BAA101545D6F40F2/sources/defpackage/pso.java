package defpackage;
/* compiled from: PG */
/* renamed from: pso  reason: default package */
/* loaded from: classes7.dex */
public final class pso {
    private final btrm a;
    private final cjqy b;
    private final ckcq c;
    private final ckcq d;
    private final ckcq e;
    private final ckcq f;

    public pso(cjqy cjqyVar, ckcw ckcwVar, btrm btrmVar) {
        this.d = ((ckcr) ckcwVar.a(ckeq.i)).a();
        this.c = ((ckcr) ckcwVar.a(ckeq.j)).a();
        this.e = ((ckcr) ckcwVar.a(ckeq.a)).a();
        this.f = ((ckcr) ckcwVar.a(ckeq.b)).a();
        this.b = cjqyVar;
        this.a = btrmVar;
    }

    public final void a() {
        this.d.a();
        this.c.a();
        this.e.a();
        this.f.a();
    }

    public final void b(brln brlnVar, boolean z) {
        if ((brlnVar.b().a & Integer.MIN_VALUE) != 0) {
            if (brlnVar.e.d() == 0) {
                this.c.b();
            } else if (z) {
                this.e.b();
            } else {
                this.f.b();
            }
        }
    }

    public final void c(brln brlnVar) {
        if ((brlnVar.b().a & Integer.MIN_VALUE) != 0) {
            this.d.b();
        }
    }

    public final cjqn d() {
        cjqy cjqyVar = this.b;
        cjsx i = cjsy.i();
        i.b(ddda.fh);
        return cjqyVar.k(i.a());
    }

    public final void e(brlu brluVar) {
        String N = brluVar.N();
        if (N != null) {
            btrm btrmVar = this.a;
            brluVar.v();
            btrmVar.b(new cjqs(N));
        }
    }
}
