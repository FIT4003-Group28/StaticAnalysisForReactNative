package defpackage;
/* compiled from: PG */
/* renamed from: azax  reason: default package */
/* loaded from: classes2.dex */
final class azax implements ayot, aypg {
    final ayod a;
    final ayqf b;
    aypg c;

    public azax(ayod ayodVar, ayqf ayqfVar) {
        this.a = ayodVar;
        this.b = ayqfVar;
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        aypg aypgVar = this.c;
        this.c = ayqi.a;
        aypgVar.qr();
    }

    @Override // defpackage.ayot, defpackage.ayod
    public final void sh(Object obj) {
        try {
            if (this.b.a(obj)) {
                this.a.sh(obj);
            } else {
                this.a.sm();
            }
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayot, defpackage.ayns, defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }
}
