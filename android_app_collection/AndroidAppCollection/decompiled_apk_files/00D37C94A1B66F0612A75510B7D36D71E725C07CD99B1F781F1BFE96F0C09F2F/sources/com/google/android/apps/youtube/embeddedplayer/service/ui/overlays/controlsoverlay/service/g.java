package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ j a;
    private final /* synthetic */ int b;

    public /* synthetic */ g(j jVar, int i) {
        this.b = i;
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            j jVar = this.a;
            apzg apzgVar = jVar.p;
            if (apzgVar == null) {
                aqvb.k("Title deeplink not available.", new Object[0]);
                return;
            }
            jVar.m.i(acuo.b(23851));
            aafn.a(jVar.c, apzgVar);
            return;
        }
        j jVar2 = this.a;
        apoj apojVar = jVar2.o;
        if (apojVar == null) {
            aqvb.k("Watch in YouTube button renderer not available.", new Object[0]);
            return;
        }
        jVar2.m.j(apojVar.t.I());
        aafo aafoVar = jVar2.c;
        apzg apzgVar2 = apojVar.o;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafn.a(aafoVar, apzgVar2);
    }
}
