package defpackage;
/* compiled from: PG */
/* renamed from: aajy  reason: default package */
/* loaded from: classes.dex */
public final class aajy extends azpx {
    public final azpq a;
    private final Runnable b;

    private aajy(azpq azpqVar, Runnable runnable) {
        this.a = azpqVar;
        this.b = runnable;
    }

    public static aajy e(Runnable runnable) {
        azpq e = azpq.e();
        runnable.getClass();
        return new aajy(e, runnable);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
        this.b.run();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        this.a.az(new aajx(ayomVar, this));
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        this.a.sj(aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
        this.b.run();
    }
}
