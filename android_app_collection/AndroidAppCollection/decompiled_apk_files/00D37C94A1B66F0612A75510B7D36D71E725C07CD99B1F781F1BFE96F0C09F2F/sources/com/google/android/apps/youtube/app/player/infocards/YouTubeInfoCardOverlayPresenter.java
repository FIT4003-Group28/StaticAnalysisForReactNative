package com.google.android.apps.youtube.app.player.infocards;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeInfoCardOverlayPresenter extends aaal implements kls, f {
    public boolean a;
    private final yni j;

    public YouTubeInfoCardOverlayPresenter(aaai aaaiVar, yzm yzmVar, aaar aaarVar, aaan aaanVar, xgp xgpVar, ahvu ahvuVar, yni yniVar) {
        super(aaaiVar, yzmVar, aaarVar, aaanVar, xgpVar, ahvuVar);
        yniVar.getClass();
        this.j = yniVar;
    }

    @Override // defpackage.kls
    public final void e(int i, boolean z) {
        boolean z2 = i != 0;
        this.a = z2;
        if (z2) {
            g(false);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.j.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.j.h(this, aaal.class);
    }
}
