package com.google.android.apps.youtube.app.watchwhile;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class StartupSignalStream implements f {
    private final ogy a;

    public StartupSignalStream(yni yniVar, efz efzVar, efc efcVar, ohb ohbVar) {
        ogy ogyVar = new ogy(yniVar, efzVar, efcVar, ohbVar);
        this.a = ogyVar;
        ogyVar.d.b();
        ogw ogwVar = ogyVar.a;
        ogwVar.c.h(ogwVar, ogw.class);
        ogyVar.c.d(ogyVar.b.b().F(300L, TimeUnit.SECONDS).g(ogyVar.d.a(auzb.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED)).C().R(new ogx(ogyVar, 1)));
        ogyVar.c.d(ogyVar.a.b.R(new ogx(ogyVar)));
    }

    public final ayoi g() {
        return this.a.a();
    }

    public final void h(auzb auzbVar) {
        this.a.b(auzbVar);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        ogy ogyVar = this.a;
        ogyVar.c.c();
        ogyVar.d.d();
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
