package defpackage;
/* compiled from: PG */
/* renamed from: axfm  reason: default package */
/* loaded from: classes3.dex */
public final class axfm {
    public final axif a;
    public final axjm b;
    public final String c;
    public final dzaj g = new dzaj();
    public final z<axfk> d = new z<>(axfk.c());
    public final z<axfk> e = new z<>(axfk.c());
    public final z<axfk> f = new z<>(axfk.c());

    public axfm(axif axifVar, axjm axjmVar, String str) {
        this.a = axifVar;
        this.b = axjmVar;
        this.c = str;
    }

    private static void g(final z<axfk> zVar) {
        axfk h = zVar.h();
        dbsk.s(h);
        if (h.b() == 1) {
            bvor.a(h.a(), new mw(zVar) { // from class: axfi
                private final z a;

                {
                    this.a = zVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.f(axfk.d(((Integer) obj).intValue() + 1));
                }
            });
        }
    }

    private static void h(final z<axfk> zVar) {
        axfk h = zVar.h();
        dbsk.s(h);
        if (h.b() == 1) {
            bvor.a(h.a(), new mw(zVar) { // from class: axfj
                private final z a;

                {
                    this.a = zVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.f(axfk.d(Math.max(((Integer) obj).intValue() - 1, 0)));
                }
            });
        }
    }

    public final void a(dqah dqahVar) {
        axfk h = this.d.h();
        dbsk.s(h);
        boolean z = true;
        dbsk.l(h.b() != 2);
        axfk h2 = this.e.h();
        dbsk.s(h2);
        dbsk.l(h2.b() != 2);
        axfk h3 = this.f.h();
        dbsk.s(h3);
        if (h3.b() == 2) {
            z = false;
        }
        dbsk.l(z);
        this.d.g(axfk.d(dqahVar.b));
        if ((dqahVar.a & 2) == 0) {
            this.e.g(axfk.c());
        } else {
            this.e.g(axfk.d(dqahVar.c));
        }
        if ((dqahVar.a & 4) == 0) {
            this.f.g(axfk.c());
        } else {
            this.f.g(axfk.d(dqahVar.d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        g(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        g(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        h(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        h(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        h(this.f);
    }
}
