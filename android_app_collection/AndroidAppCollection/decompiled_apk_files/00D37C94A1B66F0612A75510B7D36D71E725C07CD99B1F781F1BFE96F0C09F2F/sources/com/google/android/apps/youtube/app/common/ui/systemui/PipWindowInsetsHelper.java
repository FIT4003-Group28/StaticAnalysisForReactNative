package com.google.android.apps.youtube.app.common.ui.systemui;

import android.os.Build;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PipWindowInsetsHelper implements ezg, f {
    public boolean a;
    private final azqb b;

    public PipWindowInsetsHelper(azqb azqbVar) {
        this.b = azqbVar;
    }

    public static final boolean g() {
        return Build.VERSION.SDK_INT == 28;
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
        if (g()) {
            ((ezh) this.b.get()).j(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (g()) {
            ((ezh) this.b.get()).i(this);
        }
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar.e()) {
            this.a = true;
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
