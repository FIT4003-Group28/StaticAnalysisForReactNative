package defpackage;
/* compiled from: PG */
/* renamed from: aytm  reason: default package */
/* loaded from: classes2.dex */
final class aytm implements ayns, aypg {
    final ayns a;
    aypg b;
    final /* synthetic */ aytn c;

    public aytm(aytn aytnVar, ayns aynsVar) {
        this.c = aytnVar;
        this.a = aynsVar;
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        if (this.b == ayqi.a) {
            azqc.d(th);
            return;
        }
        try {
            this.c.c.a(th);
        } catch (Throwable th2) {
            bapv.j(th2);
            th = new aypo(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        try {
            this.c.e.a();
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
        }
        this.b.qr();
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        try {
            this.c.b.a(aypgVar);
            if (!ayqi.h(this.b, aypgVar)) {
                return;
            }
            this.b = aypgVar;
            this.a.sj(this);
        } catch (Throwable th) {
            bapv.j(th);
            aypgVar.qr();
            this.b = ayqi.a;
            ayqj.g(th, this.a);
        }
    }

    @Override // defpackage.ayns, defpackage.ayod
    public final void sm() {
        if (this.b == ayqi.a) {
            return;
        }
        try {
            this.c.d.a();
            this.a.sm();
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
        }
    }
}
