package defpackage;
/* compiled from: PG */
/* renamed from: azhc  reason: default package */
/* loaded from: classes2.dex */
final class azhc implements ayom, aypg {
    final ayom a;
    final ayqe b;
    aypg c;
    private final /* synthetic */ int d;

    public azhc(ayom ayomVar, ayqe ayqeVar) {
        this.a = ayomVar;
        this.b = ayqeVar;
    }

    public azhc(ayom ayomVar, ayqe ayqeVar, int i) {
        this.d = i;
        this.a = ayomVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.d == 0) {
            this.a.c(obj);
        } else if (this.c != ayqi.a) {
            try {
                ayom ayomVar = this.a;
                for (Object obj2 : (Iterable) this.b.a(obj)) {
                    try {
                        try {
                            ayrd.b(obj2, "The iterator returned a null value");
                            ayomVar.c(obj2);
                        } catch (Throwable th) {
                            bapv.j(th);
                            this.c.qr();
                            b(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        bapv.j(th2);
                        this.c.qr();
                        b(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                bapv.j(th3);
                this.c.qr();
                b(th3);
            }
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        if (this.d == 0) {
            return this.c.e();
        }
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.d == 0) {
            this.c.qr();
            return;
        }
        this.c.qr();
        this.c = ayqi.a;
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.d == 0) {
            this.a.sm();
        } else if (this.c == ayqi.a) {
        } else {
            this.c = ayqi.a;
            this.a.sm();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (this.d == 0) {
            if (!ayqi.h(this.c, aypgVar)) {
                return;
            }
            this.c = aypgVar;
            this.a.sj(this);
        } else if (!ayqi.h(this.c, aypgVar)) {
        } else {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.d == 0) {
            try {
                Object a = this.b.a(th);
                if (a == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.a.b(nullPointerException);
                    return;
                }
                this.a.c(a);
                this.a.sm();
            } catch (Throwable th2) {
                bapv.j(th2);
                this.a.b(new aypo(th, th2));
            }
        } else if (this.c == ayqi.a) {
            azqc.d(th);
        } else {
            this.c = ayqi.a;
            this.a.b(th);
        }
    }
}
