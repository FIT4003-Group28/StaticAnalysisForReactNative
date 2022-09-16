package com.google.android.apps.youtube.app.extensions.reel.watch.activity;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExternalApiLifecycleObserver implements f {
    private final edd a;
    private final hyl b;
    private final hzh c;
    private final udt d;

    public ExternalApiLifecycleObserver(edd eddVar, udt udtVar, hyl hylVar, hzh hzhVar, byte[] bArr) {
        this.a = eddVar;
        this.d = udtVar;
        this.b = hylVar;
        this.c = hzhVar;
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        this.d.c(this.c);
        this.a.b(this.b);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        this.d.b();
        this.a.b(null);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
