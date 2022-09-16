package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azek  reason: default package */
/* loaded from: classes2.dex */
public final class azek implements ayom, aypg {
    final ayom a;
    final long b;
    final TimeUnit c;
    final ayoq d;
    aypg e;
    aypg f;
    volatile long g;
    boolean h;

    public azek(ayom ayomVar, long j, TimeUnit timeUnit, ayoq ayoqVar) {
        this.a = ayomVar;
        this.b = j;
        this.c = timeUnit;
        this.d = ayoqVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
            return;
        }
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        this.h = true;
        this.a.b(th);
        this.d.qr();
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        long j = this.g + 1;
        this.g = j;
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        azej azejVar = new azej(obj, j, this);
        this.f = azejVar;
        ayqi.i(azejVar, this.d.c(azejVar, this.b, this.c));
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
        if (this.h) {
            return;
        }
        this.h = true;
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        if (aypgVar != null) {
            ((azej) aypgVar).run();
        }
        this.a.sm();
        this.d.qr();
    }
}
