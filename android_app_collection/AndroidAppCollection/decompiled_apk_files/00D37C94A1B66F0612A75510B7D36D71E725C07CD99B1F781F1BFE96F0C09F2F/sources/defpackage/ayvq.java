package defpackage;
/* compiled from: PG */
/* renamed from: ayvq  reason: default package */
/* loaded from: classes2.dex */
final class ayvq implements ayoa, aypg {
    final ayod a;
    bamf b;
    long c;
    boolean d;

    public ayvq(ayod ayodVar) {
        this.a = ayodVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.d) {
            azqc.d(th);
            return;
        }
        this.d = true;
        this.b = azof.a;
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        long j = this.c;
        if (j != 0) {
            this.c = j + 1;
            return;
        }
        this.d = true;
        this.b.si();
        this.b = azof.a;
        this.a.sh(obj);
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
        this.b = azof.a;
        if (!this.d) {
            this.d = true;
            this.a.sm();
        }
    }
}
