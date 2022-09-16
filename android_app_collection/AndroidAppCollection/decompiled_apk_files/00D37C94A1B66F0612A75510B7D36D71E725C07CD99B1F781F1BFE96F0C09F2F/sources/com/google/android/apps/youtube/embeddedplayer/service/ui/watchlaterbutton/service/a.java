package com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class a implements afzf {
    final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.i = false;
        afus.c(1, 4, "Edit playlist error.", cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asat asatVar = (asat) obj;
        this.a.i = false;
        if (asatVar.f.size() > 0) {
            this.a.a.b(asatVar.f);
        }
    }
}
