package defpackage;
/* compiled from: PG */
/* renamed from: auam  reason: default package */
/* loaded from: classes2.dex */
public final class auam {
    private final cqkp a;
    private boolean b;
    private boolean c;

    public auam(cqkp cqkpVar) {
        dbsk.s(cqkpVar);
        this.a = cqkpVar;
    }

    private final void d() {
        cqkx.p(this.a);
    }

    public final void a() {
        dbsk.l(!this.b);
        this.b = true;
        this.c = false;
    }

    public final void b() {
        dbsk.l(this.b);
        this.b = false;
        if (this.c) {
            d();
        }
    }

    public final void c() {
        if (this.b) {
            this.c = true;
        } else {
            d();
        }
    }
}
