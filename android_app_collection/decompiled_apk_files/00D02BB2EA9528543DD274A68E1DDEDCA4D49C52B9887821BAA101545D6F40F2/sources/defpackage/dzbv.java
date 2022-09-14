package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzbv  reason: default package */
/* loaded from: classes6.dex */
public final class dzbv<T> extends AtomicReference<dzak> implements dyzw, dzak {
    private static final long serialVersionUID = -7251123623727029452L;
    final dzaz<? super T> a;
    final dzaz<? super Throwable> b;
    final dzaz<? super dzak> c;

    public dzbv(dzaz<? super T> dzazVar, dzaz<? super Throwable> dzazVar2, dzaz<? super dzak> dzazVar3) {
        this.a = dzazVar;
        this.b = dzazVar2;
        this.c = dzazVar3;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this);
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        dzbd.b(this, dzakVar);
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        if (!f()) {
            try {
                this.a.SR(t);
            } catch (Throwable th) {
                dzas.a(th);
                get().SQ();
                d(th);
            }
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        if (!f()) {
            lazySet(dzbd.a);
            try {
                this.b.SR(th);
            } catch (Throwable th2) {
                dzas.a(th2);
                dzfy.a(new dzar(th, th2));
            }
        }
    }

    @Override // defpackage.dyzw
    public final void e() {
        if (!f()) {
            lazySet(dzbd.a);
        }
    }

    public final boolean f() {
        return get() == dzbd.a;
    }
}
