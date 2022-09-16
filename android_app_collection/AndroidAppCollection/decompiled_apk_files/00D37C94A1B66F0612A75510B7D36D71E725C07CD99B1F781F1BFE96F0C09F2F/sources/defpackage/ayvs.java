package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: ayvs  reason: default package */
/* loaded from: classes2.dex */
final class ayvs implements ayoa, aypg {
    final ayot a;
    final Object b;
    bamf c;
    long d;
    boolean e;

    public ayvs(ayot ayotVar, Object obj) {
        this.a = ayotVar;
        this.b = obj;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        this.e = true;
        this.c = azof.a;
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.e = true;
        this.c.si();
        this.c = azof.a;
        this.a.sh(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c == azof.a;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.c = bamfVar;
            this.a.sj(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.si();
        this.c = azof.a;
    }

    @Override // defpackage.bame
    public final void sm() {
        this.c = azof.a;
        if (!this.e) {
            this.e = true;
            Object obj = this.b;
            if (obj != null) {
                this.a.sh(obj);
            } else {
                this.a.b(new NoSuchElementException());
            }
        }
    }
}
