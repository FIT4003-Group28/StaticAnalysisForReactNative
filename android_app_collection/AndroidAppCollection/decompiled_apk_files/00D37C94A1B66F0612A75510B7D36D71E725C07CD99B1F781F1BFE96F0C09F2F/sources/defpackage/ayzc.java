package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: ayzc  reason: default package */
/* loaded from: classes2.dex */
final class ayzc implements ayoa, aypg {
    final ayot a;
    bamf b;
    boolean c;
    Object d;

    public ayzc(ayot ayotVar) {
        this.a = ayotVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.c) {
            azqc.d(th);
            return;
        }
        this.c = true;
        this.b = azof.a;
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.c) {
            return;
        }
        if (this.d == null) {
            this.d = obj;
            return;
        }
        this.c = true;
        this.b.si();
        this.b = azof.a;
        this.a.b(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b == azof.a;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.a.sj(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.b.si();
        this.b = azof.a;
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b = azof.a;
        Object obj = this.d;
        this.d = null;
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            this.a.sh(obj);
        } else {
            this.a.b(new NoSuchElementException());
        }
    }
}
