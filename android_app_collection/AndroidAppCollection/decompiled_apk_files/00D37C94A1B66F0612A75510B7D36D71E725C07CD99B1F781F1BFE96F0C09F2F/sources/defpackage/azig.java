package defpackage;
/* compiled from: PG */
/* renamed from: azig  reason: default package */
/* loaded from: classes2.dex */
final class azig implements ayom, aypg {
    final ayot a;
    final Object b;
    aypg c;
    Object d;
    boolean e;

    public azig(ayot ayotVar, Object obj) {
        this.a = ayotVar;
        this.b = obj;
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
        if (this.d == null) {
            this.d = obj;
            return;
        }
        this.e = true;
        this.c.qr();
        this.a.b(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.d;
        this.d = null;
        if (obj == null) {
            obj = this.b;
        }
        this.a.sh(obj);
    }
}
