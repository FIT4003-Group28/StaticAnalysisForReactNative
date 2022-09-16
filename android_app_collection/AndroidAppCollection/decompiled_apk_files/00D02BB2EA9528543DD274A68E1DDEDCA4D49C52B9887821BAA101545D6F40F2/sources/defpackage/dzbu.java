package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzbu  reason: default package */
/* loaded from: classes6.dex */
public final class dzbu<T> extends AtomicReference<dzak> implements dzab, dzak {
    private static final long serialVersionUID = -7012088219455310787L;
    final dzaz<? super T> a;
    final dzaz<? super Throwable> b;

    public dzbu(dzaz<? super T> dzazVar, dzaz<? super Throwable> dzazVar2) {
        this.a = dzazVar;
        this.b = dzazVar2;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this);
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
        dzbd.b(this, dzakVar);
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        lazySet(dzbd.a);
        try {
            this.b.SR(th);
        } catch (Throwable th2) {
            dzas.a(th2);
            dzfy.a(new dzar(th, th2));
        }
    }

    @Override // defpackage.dzab
    public final void c(T t) {
        lazySet(dzbd.a);
        try {
            this.a.SR(t);
        } catch (Throwable th) {
            dzas.a(th);
            dzfy.a(th);
        }
    }
}
