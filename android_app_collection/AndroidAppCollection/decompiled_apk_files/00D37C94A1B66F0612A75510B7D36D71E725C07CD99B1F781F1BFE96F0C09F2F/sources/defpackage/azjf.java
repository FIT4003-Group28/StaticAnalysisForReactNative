package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azjf  reason: default package */
/* loaded from: classes2.dex */
public final class azjf extends AtomicLong implements ayom, aypg {
    private static final long serialVersionUID = 3764492702657003550L;
    final ayom a;
    final long b;
    final TimeUnit c;
    final ayoq d;
    final ayqm e = new ayqm();
    final AtomicReference f = new AtomicReference();

    public azjf(ayom ayomVar, long j, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = ayomVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ayqi.c(this.e);
            this.a.b(th);
            this.d.qr();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (!compareAndSet(j, j2)) {
                return;
            }
            ((aypg) this.e.get()).qr();
            this.a.c(obj);
            f(j2);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) this.f.get());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(long j) {
        ayqi.i(this.e, this.d.c(new azjg(j, this), this.b, this.c));
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqi.c(this.f);
        this.d.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        ayqi.g(this.f, aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ayqi.c(this.e);
            this.a.sm();
            this.d.qr();
        }
    }
}
