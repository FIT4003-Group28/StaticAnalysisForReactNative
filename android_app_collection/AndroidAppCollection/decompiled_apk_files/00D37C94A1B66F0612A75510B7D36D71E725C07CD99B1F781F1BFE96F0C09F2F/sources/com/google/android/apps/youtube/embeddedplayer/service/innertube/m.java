package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m implements aimx {
    final Map a = new l();
    private final aadd b;

    public m(aadd aaddVar) {
        this.b = aaddVar;
    }

    public final void b(String str, boolean z) {
        this.a.put(str, Boolean.valueOf(z));
    }

    public final boolean c(String str) {
        return (str == null || this.a.get(str) == null || !((Boolean) this.a.get(str)).booleanValue()) ? false : true;
    }

    @Override // defpackage.aimx
    public final void rj(aina ainaVar) {
        aqtp h = pce.h(this.b);
        if (h == null || !h.i) {
            return;
        }
        final boolean c = c(ainaVar.K);
        ainaVar.a.add(new aimu() { // from class: com.google.android.apps.youtube.embeddedplayer.service.innertube.j
            @Override // defpackage.aimu
            public final void a(aopa aopaVar) {
                boolean z = c;
                aopaVar.copyOnWrite();
                atyg atygVar = (atyg) aopaVar.instance;
                atyg atygVar2 = atyg.a;
                atygVar.b |= 8192;
                atygVar.n = z;
            }
        });
        ainaVar.t(new aimz() { // from class: com.google.android.apps.youtube.embeddedplayer.service.innertube.k
            @Override // defpackage.aimz
            public final void a(afrt afrtVar) {
                afrtVar.d("mutedAutoplay", c);
            }
        });
    }
}
