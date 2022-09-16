package defpackage;
/* compiled from: PG */
/* renamed from: ktc  reason: default package */
/* loaded from: classes7.dex */
public final class ktc {
    public boolean a;
    public boolean b;
    public boolean c;
    private boolean d;
    private final ktb e;
    private final crzo<Boolean> f = new crzo<>(false);
    @dzsi
    private Runnable g;

    public ktc(ktb ktbVar) {
        this.e = ktbVar;
    }

    private final void j() {
        boolean z = this.c;
        boolean z2 = false;
        if (this.a && this.b && g()) {
            z2 = true;
        }
        this.c = z2;
        if (z == z2) {
            return;
        }
        if (z2) {
            this.e.a();
            Runnable runnable = this.g;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.g = null;
            return;
        }
        this.e.b();
    }

    public final void a() {
        dbsk.l(!this.a);
        this.a = true;
        j();
    }

    public final void b() {
        dbsk.l(this.a);
        this.a = false;
        this.g = null;
        j();
    }

    public final void c() {
        dbsk.l(this.a);
        dbsk.l(!this.b);
        this.b = true;
        j();
    }

    public final void d() {
        dbsk.l(this.b);
        this.b = false;
        j();
    }

    public final void e() {
        dbsk.l(!g());
        this.f.b(true);
        j();
        if (!this.d) {
            this.d = true;
        }
    }

    public final void f() {
        dbsk.l(g());
        this.f.b(false);
        j();
    }

    public final boolean g() {
        Boolean l = h().l();
        dbsk.s(l);
        return l.booleanValue();
    }

    public final crzm<Boolean> h() {
        return this.f.a;
    }

    public final void i(Runnable runnable) {
        dbsk.l(this.a);
        if (!this.c) {
            this.g = runnable;
            return;
        }
        runnable.run();
        this.g = null;
    }
}
