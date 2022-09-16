package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aywd  reason: default package */
/* loaded from: classes2.dex */
public final class aywd extends aznz implements ayoa {
    private static final long serialVersionUID = 8443155186132538303L;
    final bame a;
    final ayqe c;
    bamf f;
    volatile boolean g;
    final azoj b = new azoj();
    final aypf d = new aypf();
    final int e = Integer.MAX_VALUE;

    public aywd(bame bameVar, ayqe ayqeVar) {
        this.a = bameVar;
        this.c = ayqeVar;
        lazySet(1);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (azom.e(this.b, th)) {
            si();
            if (getAndSet(0) <= 0) {
                return;
            }
            this.a.b(azom.d(this.b));
            return;
        }
        azqc.d(th);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aynu, java.lang.Object] */
    @Override // defpackage.bame
    public final void c(Object obj) {
        try {
            ?? a = this.c.a(obj);
            getAndIncrement();
            aywc aywcVar = new aywc(this);
            if (this.g || !this.d.d(aywcVar)) {
                return;
            }
            a.U(aywcVar);
        } catch (Throwable th) {
            bapv.j(th);
            this.f.si();
            b(th);
        }
    }

    @Override // defpackage.ayrn
    public final void d() {
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.f, bamfVar)) {
            this.f = bamfVar;
            this.a.f(this);
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                bamfVar.sp(Long.MAX_VALUE);
            } else {
                bamfVar.sp(i);
            }
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bamf
    public final void si() {
        this.g = true;
        this.f.si();
        this.d.qr();
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 2;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return null;
    }

    @Override // defpackage.bame
    public final void sm() {
        if (decrementAndGet() != 0) {
            if (this.e == Integer.MAX_VALUE) {
                return;
            }
            this.f.sp(1L);
            return;
        }
        Throwable d = azom.d(this.b);
        if (d != null) {
            this.a.b(d);
        } else {
            this.a.sm();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
    }
}
