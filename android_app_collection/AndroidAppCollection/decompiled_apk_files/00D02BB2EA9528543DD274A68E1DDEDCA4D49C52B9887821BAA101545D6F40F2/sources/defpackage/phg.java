package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: phg  reason: default package */
/* loaded from: classes7.dex */
final class phg<V> implements pfh, pfg {
    private final AtomicReference<pfg> a = new AtomicReference<>();
    private final mw<? super V> b;
    private final Runnable c;

    public phg(mw<? super V> mwVar, Runnable runnable) {
        this.b = mwVar;
        this.c = runnable;
    }

    @Override // defpackage.pfg
    public final void a() {
        this.a.get().a();
    }

    @Override // defpackage.pfg
    public final boolean b() {
        return this.a.get().b();
    }

    @Override // defpackage.pfh
    public final void c(pfg pfgVar) {
        this.a.set(pfgVar);
    }

    @Override // defpackage.pfh
    public final void d(V v) {
        if (!b()) {
            try {
                this.b.a(v);
            } catch (Throwable unused) {
                a();
            }
        }
    }

    @Override // defpackage.pfh
    public final void e() {
        if (!b()) {
            try {
                this.c.run();
            } catch (Throwable unused) {
                a();
            }
        }
    }
}
