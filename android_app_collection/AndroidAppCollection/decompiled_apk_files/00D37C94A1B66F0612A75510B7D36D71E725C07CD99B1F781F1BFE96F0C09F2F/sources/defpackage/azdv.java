package defpackage;
/* compiled from: PG */
/* renamed from: azdv  reason: default package */
/* loaded from: classes2.dex */
final class azdv implements ayom, aypg {
    final ayom a;
    final aypw b;
    final Object c;
    aypg d;
    boolean e;

    public azdv(ayom ayomVar, Object obj, aypw aypwVar) {
        this.a = ayomVar;
        this.b = aypwVar;
        this.c = obj;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        this.e = true;
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        try {
            this.b.a(this.c, obj);
        } catch (Throwable th) {
            this.d.qr();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.d.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.d, aypgVar)) {
            this.d = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c(this.c);
        this.a.sm();
    }
}
