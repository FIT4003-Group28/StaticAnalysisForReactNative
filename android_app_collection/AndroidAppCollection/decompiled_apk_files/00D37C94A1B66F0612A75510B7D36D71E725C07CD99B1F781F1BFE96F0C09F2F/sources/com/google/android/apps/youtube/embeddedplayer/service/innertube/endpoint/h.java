package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import j$.util.Optional;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class h implements aafo {
    private static final amvn a = amvn.r(apff.class);
    private final aafo b;
    private final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f c;

    public h(aafo aafoVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar) {
        this.b = aafoVar;
        this.c = fVar;
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    @Deprecated
    public final void c(apzg apzgVar, Map map) {
        Object a2 = aafp.a(apzgVar);
        if (a2 != null && a.contains(a2.getClass()) && (apzgVar.b & 1) != 0) {
            com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar = this.c;
            aoob aoobVar = apzgVar.c;
            Optional b = fVar.b();
            if (!b.isPresent()) {
                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f.g(fVar.b);
            } else {
                com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.c cVar = ((com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.d) b.get()).i;
                if (cVar != null) {
                    cVar.a(new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.b(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.a.CLICK, aoobVar.I()), null);
                } else {
                    aqvb.l("Unable to log click: no active logger", new Object[0]);
                }
            }
        }
        this.b.c(apzgVar, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}
