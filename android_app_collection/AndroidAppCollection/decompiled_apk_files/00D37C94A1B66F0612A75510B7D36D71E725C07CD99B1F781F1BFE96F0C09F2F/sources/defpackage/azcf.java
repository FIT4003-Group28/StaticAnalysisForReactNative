package defpackage;
/* compiled from: PG */
/* renamed from: azcf  reason: default package */
/* loaded from: classes2.dex */
final class azcf implements ayod, aypg {
    final ayod a;
    final azcg b;
    aypg c;

    public azcf(ayod ayodVar, azcg azcgVar) {
        this.a = ayodVar;
        this.b = azcgVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        if (this.c == ayqi.a) {
            azqc.d(th);
        } else {
            c(th);
        }
    }

    final void c(Throwable th) {
        try {
            this.b.c.a(th);
        } catch (Throwable th2) {
            bapv.j(th2);
            th = new aypo(th, th2);
        }
        this.c = ayqi.a;
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
        this.c = ayqi.a;
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        if (this.c == ayqi.a) {
            return;
        }
        try {
            this.b.b.a(obj);
            this.c = ayqi.a;
            this.a.sh(obj);
        } catch (Throwable th) {
            bapv.j(th);
            c(th);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        if (this.c == ayqi.a) {
            return;
        }
        try {
            this.b.d.a();
            this.c = ayqi.a;
            this.a.sm();
        } catch (Throwable th) {
            bapv.j(th);
            c(th);
        }
    }
}
