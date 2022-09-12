package defpackage;
/* compiled from: PG */
/* renamed from: bxc  reason: default package */
/* loaded from: classes4.dex */
final class bxc<Z> implements bxd, cjv {
    private static final my<bxc<?>> a = cjx.a(20, new bxb());
    private final cjz b = cjz.c();
    private bxd<Z> c;
    private boolean d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> bxc<Z> e(bxd<Z> bxdVar) {
        bxc<Z> bxcVar = (bxc<Z>) a.a();
        cjn.b(bxcVar);
        ((bxc) bxcVar).e = false;
        ((bxc) bxcVar).d = true;
        ((bxc) bxcVar).c = bxdVar;
        return bxcVar;
    }

    @Override // defpackage.cjv
    public final cjz Nk() {
        return this.b;
    }

    @Override // defpackage.bxd
    public final Class<Z> a() {
        return this.c.a();
    }

    @Override // defpackage.bxd
    public final Z b() {
        return this.c.b();
    }

    @Override // defpackage.bxd
    public final int c() {
        return this.c.c();
    }

    @Override // defpackage.bxd
    public final synchronized void d() {
        this.b.a();
        this.e = true;
        if (!this.d) {
            this.c.d();
            this.c = null;
            a.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        this.b.a();
        if (this.d) {
            this.d = false;
            if (!this.e) {
                return;
            }
            d();
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }
}
