package defpackage;
/* compiled from: PG */
/* renamed from: kcx  reason: default package */
/* loaded from: classes7.dex */
public final class kcx {
    public boolean a;
    private final kcv b;
    private final bvjj c;
    private boolean d;
    private boolean e;

    public kcx(kcv kcvVar, bvjj bvjjVar) {
        this.b = kcvVar;
        dbsk.s(bvjjVar);
        this.c = bvjjVar;
    }

    public final void a() {
        boolean m = this.c.m(bvjk.gk, false);
        if (!this.d ? this.a : this.e) {
            this.b.d();
        } else if (m) {
            this.b.d();
        } else {
            this.b.b();
        }
    }

    public final void b(boolean z) {
        this.d = true;
        this.e = z;
        a();
    }

    public final void c() {
        this.d = false;
        a();
    }
}
