package com.google.android.libraries.youtube.common.concurrent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeFutures$LifecycleAwareFutureWrapper extends anie implements f, ampg {
    private final apt a;
    private boolean b;
    private apu c;
    private ampg d;
    private ankt e;

    public YouTubeFutures$LifecycleAwareFutureWrapper(apt aptVar, apu apuVar, ankt anktVar, ampg ampgVar) {
        ylr.c();
        this.a = aptVar;
        this.c = apuVar;
        this.d = ampgVar;
        this.e = anii.h(anktVar, this, ylx.a);
        apuVar.getClass();
        this.c = apuVar;
        apuVar.c(this);
        lV(this.e);
    }

    private final void g() {
        if (!this.b) {
            this.b = true;
            cancel(false);
            this.c.e(this);
            this.c = null;
            this.d = null;
        }
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b) {
            return null;
        }
        return this.d.apply(obj);
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
