package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzcr  reason: default package */
/* loaded from: classes6.dex */
final class dzcr<T> implements dyzt, dzak {
    final dzab<? super T> a;
    eavm b;
    boolean c;
    T d;

    public dzcr(dzab<? super T> dzabVar) {
        this.a = dzabVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.b.SS();
        this.b = dzfj.a;
    }

    @Override // defpackage.eavl
    public final void b(eavm eavmVar) {
        if (dzfj.b(this.b, eavmVar)) {
            this.b = eavmVar;
            this.a.a(this);
            eavmVar.a(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.eavl
    public final void c(T t) {
        if (this.c) {
            return;
        }
        if (this.d == null) {
            this.d = t;
            return;
        }
        this.c = true;
        this.b.SS();
        this.b = dzfj.a;
        this.a.b(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.eavl
    public final void d(Throwable th) {
        if (this.c) {
            dzfy.a(th);
            return;
        }
        this.c = true;
        this.b = dzfj.a;
        this.a.b(th);
    }

    @Override // defpackage.eavl
    public final void e() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b = dzfj.a;
        T t = this.d;
        this.d = null;
        if (t == null) {
            t = null;
        }
        if (t != null) {
            this.a.c(t);
        } else {
            this.a.b(new NoSuchElementException());
        }
    }
}
