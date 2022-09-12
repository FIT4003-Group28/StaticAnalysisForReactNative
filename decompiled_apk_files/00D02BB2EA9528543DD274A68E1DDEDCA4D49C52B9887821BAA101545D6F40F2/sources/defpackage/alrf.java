package defpackage;
/* compiled from: PG */
/* renamed from: alrf  reason: default package */
/* loaded from: classes.dex */
public final class alrf implements akpq {
    private final dxio<bnsn> a;

    public alrf(dxio<bnsn> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.akpq
    public final synchronized void a(Runnable runnable) {
        this.a.a().d(runnable);
    }

    @Override // defpackage.akpq
    public final synchronized void b(Runnable runnable) {
        this.a.a().e(runnable);
    }

    @Override // defpackage.akpq
    public final synchronized void c(Runnable runnable) {
        this.a.a().f(runnable);
    }

    @Override // defpackage.akpq
    public final void d() {
        this.a.a().q();
    }

    @Override // defpackage.akpq
    public final void e(Runnable runnable) {
        this.a.a().c(runnable);
    }

    public final synchronized void f() {
        this.a.a().g();
    }
}
