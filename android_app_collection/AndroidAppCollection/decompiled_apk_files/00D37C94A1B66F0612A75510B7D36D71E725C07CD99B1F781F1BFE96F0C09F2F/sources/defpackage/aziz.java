package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aziz  reason: default package */
/* loaded from: classes2.dex */
final class aziz extends AtomicReference implements Runnable, ayom, aypg {
    private static final long serialVersionUID = 786994795061867455L;
    final ayom a;
    final long b = 300;
    final TimeUnit c;
    final ayoq d;
    aypg e;
    volatile boolean f;
    boolean g;

    public aziz(ayom ayomVar, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = ayomVar;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.g) {
            azqc.d(th);
            return;
        }
        this.g = true;
        this.a.b(th);
        this.d.qr();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.f || this.g) {
            return;
        }
        this.f = true;
        this.a.c(obj);
        aypg aypgVar = (aypg) get();
        if (aypgVar != null) {
            aypgVar.qr();
        }
        ayqi.i(this, this.d.c(this, this.b, this.c));
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

    @Override // java.lang.Runnable
    public final void run() {
        this.f = false;
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
        if (!this.g) {
            this.g = true;
            this.a.sm();
            this.d.qr();
        }
    }
}
