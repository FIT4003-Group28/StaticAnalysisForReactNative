package defpackage;
/* compiled from: PG */
/* renamed from: azas  reason: default package */
/* loaded from: classes2.dex */
final class azas implements ayod, aypg {
    final ayod a;
    final aypw b;
    aypg c;

    public azas(ayod ayodVar, aypw aypwVar) {
        this.a = ayodVar;
        this.b = aypwVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        this.c = ayqi.a;
        try {
            this.b.a(null, th);
        } catch (Throwable th2) {
            bapv.j(th2);
            th = new aypo(th, th2);
        }
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
        this.c = ayqi.a;
        try {
            this.b.a(obj, null);
            this.a.sh(obj);
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
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
        this.c = ayqi.a;
        try {
            this.b.a(null, null);
            this.a.sm();
        } catch (Throwable th) {
            bapv.j(th);
            this.a.b(th);
        }
    }
}
