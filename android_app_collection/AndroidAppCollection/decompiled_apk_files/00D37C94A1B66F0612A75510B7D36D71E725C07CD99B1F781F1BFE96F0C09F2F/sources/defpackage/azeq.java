package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azeq  reason: default package */
/* loaded from: classes2.dex */
public final class azeq implements ayom, aypg {
    final ayom a;
    final long b;
    final TimeUnit c;
    final ayoq d;
    aypg e;

    public azeq(ayom ayomVar, long j, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = ayomVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.d.c(new azeo(this, th), 0L, this.c);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.d.c(new azep(this, obj), this.b, this.c);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
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

    @Override // defpackage.ayom
    public final void sm() {
        this.d.c(new azen(this), this.b, this.c);
    }
}
