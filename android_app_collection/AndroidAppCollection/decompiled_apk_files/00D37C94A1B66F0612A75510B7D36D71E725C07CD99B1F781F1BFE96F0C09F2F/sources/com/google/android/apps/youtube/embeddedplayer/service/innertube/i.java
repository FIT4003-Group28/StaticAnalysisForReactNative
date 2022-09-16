package com.google.android.apps.youtube.embeddedplayer.service.innertube;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements aimu {
    public boolean a;
    private final aadd b;

    public i(aadd aaddVar) {
        this.b = aaddVar;
    }

    @Override // defpackage.aimu
    public final void a(aopa aopaVar) {
        aqtp h = pce.h(this.b);
        if (h == null || !h.i) {
            boolean z = this.a;
            aopaVar.copyOnWrite();
            atyg atygVar = (atyg) aopaVar.instance;
            atyg atygVar2 = atyg.a;
            atygVar.b |= 8192;
            atygVar.n = z;
        }
    }
}
