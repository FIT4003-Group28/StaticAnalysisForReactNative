package com.google.android.libraries.youtube.common.concurrent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class YouTubeFutures$LifecycleAwareFutureCallback implements ankb, f {
    private final apt a;
    private boolean b;
    private apu c;
    private zdt d;
    private zdt e;

    public YouTubeFutures$LifecycleAwareFutureCallback(apt aptVar, apu apuVar, zdt zdtVar, zdt zdtVar2) {
        aptVar.getClass();
        this.a = aptVar;
        apuVar.getClass();
        this.c = apuVar;
        this.d = zdtVar;
        this.e = zdtVar2;
        apuVar.c(this);
    }

    private final void g() {
        if (!this.b) {
            this.b = true;
            this.c.e(this);
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (!this.b) {
            this.e.a(th);
        }
        g();
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        if (!this.b) {
            this.d.a(obj);
        }
        g();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        if (!apyVar.getLifecycle().a().a(this.a)) {
            g();
        }
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (!apyVar.getLifecycle().a().a(this.a)) {
            g();
        }
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        if (!apyVar.getLifecycle().a().a(this.a)) {
            g();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
