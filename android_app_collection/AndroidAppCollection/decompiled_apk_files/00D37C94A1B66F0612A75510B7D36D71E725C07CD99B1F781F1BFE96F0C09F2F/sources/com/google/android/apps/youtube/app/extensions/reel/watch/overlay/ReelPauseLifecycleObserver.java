package com.google.android.apps.youtube.app.extensions.reel.watch.overlay;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPauseLifecycleObserver implements f {
    private final iee a;
    private final iei b;
    private int c = 0;

    public ReelPauseLifecycleObserver(iee ieeVar, iei ieiVar) {
        this.a = ieeVar;
        this.b = ieiVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.c = this.a.b();
        if (this.b.aF() != null) {
            this.b.aF().d.a(false);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.a.c(this.c);
        this.c = 0;
        if (this.b.aF() != null) {
            this.b.aF().d.a(true);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
