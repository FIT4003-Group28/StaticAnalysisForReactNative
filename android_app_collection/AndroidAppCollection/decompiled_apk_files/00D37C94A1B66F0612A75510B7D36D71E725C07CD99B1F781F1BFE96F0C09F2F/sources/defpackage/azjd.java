package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azjd  reason: default package */
/* loaded from: classes2.dex */
final class azjd implements ayom, aypg {
    final ayom a;
    final TimeUnit b;
    long c;
    aypg d;

    public azjd(ayom ayomVar, TimeUnit timeUnit) {
        this.a = ayomVar;
        this.b = timeUnit;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        long e = ayor.e(this.b);
        long j = this.c;
        this.c = e;
        this.a.c(new azpk(obj, e - j, this.b));
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
            this.c = ayor.e(this.b);
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }
}
