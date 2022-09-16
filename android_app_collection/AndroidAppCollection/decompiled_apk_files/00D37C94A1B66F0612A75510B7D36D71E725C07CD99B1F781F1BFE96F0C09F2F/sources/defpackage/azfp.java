package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azfp  reason: default package */
/* loaded from: classes2.dex */
public final class azfp extends ayrp implements ayom {
    private static final long serialVersionUID = 8443155186132538303L;
    final ayom a;
    final ayqe c;
    aypg e;
    volatile boolean f;
    final azoj b = new azoj();
    final aypf d = new aypf();

    public azfp(ayom ayomVar, ayqe ayqeVar) {
        this.a = ayomVar;
        this.c = ayqeVar;
        lazySet(1);
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (azom.e(this.b, th)) {
            qr();
            if (getAndSet(0) <= 0) {
                return;
            }
            this.a.b(azom.d(this.b));
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        try {
            aynu aynuVar = (aynu) this.c.a(obj);
            ayrd.b(aynuVar, "The mapper returned a null CompletableSource");
            getAndIncrement();
            azfo azfoVar = new azfo(this);
            if (this.f || !this.d.d(azfoVar)) {
                return;
            }
            aynuVar.U(azfoVar);
        } catch (Throwable th) {
            bapv.j(th);
            this.e.qr();
            b(th);
        }
    }

    @Override // defpackage.ayrn
    public final void d() {
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.f = true;
        this.e.qr();
        this.d.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.e, aypgVar)) {
            this.e = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return i & 2;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return null;
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (decrementAndGet() == 0) {
            Throwable d = azom.d(this.b);
            if (d != null) {
                this.a.b(d);
            } else {
                this.a.sm();
            }
        }
    }
}
