package defpackage;
/* compiled from: PG */
/* renamed from: azgj  reason: default package */
/* loaded from: classes2.dex */
final class azgj implements aynw, aypg {
    final ayom a;
    final aypx b;
    Object c;
    volatile boolean d;
    boolean e;
    boolean f;

    public azgj(ayom ayomVar, aypx aypxVar, Object obj) {
        this.a = ayomVar;
        this.b = aypxVar;
        this.c = obj;
    }

    @Override // defpackage.aynw
    public final void a(Object obj) {
        if (!this.e) {
            if (this.f) {
                c(new IllegalStateException("onNext already called in this generate turn"));
            } else if (obj == null) {
                c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f = true;
                this.a.c(obj);
            }
        }
    }

    public final void c(Throwable th) {
        if (this.e) {
            azqc.d(th);
            return;
        }
        this.e = true;
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.d = true;
    }
}
