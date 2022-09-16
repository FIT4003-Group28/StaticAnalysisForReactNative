package com.google.android.apps.youtube.app.player.overlay;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ControlsOverlayAlwaysShownController implements f {
    public final azqb a;
    public boolean b;
    private kbf c;
    private final admc d;
    private final kbe e;

    public ControlsOverlayAlwaysShownController(admc admcVar, azqb azqbVar, kbf kbfVar) {
        kbe kbeVar = new kbe(this);
        this.e = kbeVar;
        this.d = admcVar;
        this.a = azqbVar;
        this.c = kbfVar;
        admcVar.h.add(kbeVar);
        adlz adlzVar = admcVar.g;
        if (adlzVar != null) {
            adlzVar.b(kbeVar);
        }
    }

    public final void g() {
        ylr.c();
        boolean z = this.b;
        kbf kbfVar = this.c;
        if (kbfVar != null) {
            kbfVar.m(z);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        admc admcVar = this.d;
        kbe kbeVar = this.e;
        admcVar.h.remove(kbeVar);
        adlz adlzVar = admcVar.g;
        if (adlzVar != null) {
            adlzVar.i.remove(kbeVar);
        }
        this.c = null;
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
