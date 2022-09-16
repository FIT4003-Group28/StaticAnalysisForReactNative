package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azic  reason: default package */
/* loaded from: classes2.dex */
public final class azic extends AtomicInteger implements Runnable, ayri {
    private static final long serialVersionUID = 3880992722410194083L;
    final ayom a;
    final Object b;

    public azic(ayom ayomVar, Object obj) {
        this.a = ayomVar;
        this.b = obj;
    }

    @Override // defpackage.ayrn
    public final void d() {
        lazySet(3);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == 3;
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return get() != 1;
    }

    @Override // defpackage.ayrn
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.aypg
    public final void qr() {
        set(3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != 0 || !compareAndSet(0, 2)) {
            return;
        }
        this.a.c(this.b);
        if (get() != 2) {
            return;
        }
        lazySet(3);
        this.a.sm();
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 1) != 0) {
            lazySet(1);
            return 1;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        if (get() == 1) {
            lazySet(3);
            return this.b;
        }
        return null;
    }
}
