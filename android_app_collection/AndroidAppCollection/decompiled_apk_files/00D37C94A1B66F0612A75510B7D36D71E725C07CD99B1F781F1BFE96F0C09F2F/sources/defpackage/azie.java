package defpackage;
/* compiled from: PG */
/* renamed from: azie  reason: default package */
/* loaded from: classes2.dex */
final class azie implements ayom, aypg {
    final ayom a;
    final aypx b;
    Object c;
    aypg d;
    boolean e;

    public azie(ayom ayomVar, aypx aypxVar, Object obj) {
        this.a = ayomVar;
        this.b = aypxVar;
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
            Object a = this.b.a(this.c, obj);
            ayrd.b(a, "The accumulator returned a null value");
            this.c = a;
            this.a.c(a);
        } catch (Throwable th) {
            bapv.j(th);
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
            this.a.c(this.c);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.sm();
    }
}
