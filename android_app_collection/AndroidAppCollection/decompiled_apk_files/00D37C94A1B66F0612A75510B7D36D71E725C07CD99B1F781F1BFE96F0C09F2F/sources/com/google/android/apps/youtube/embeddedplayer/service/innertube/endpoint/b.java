package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements aafo {
    private final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.aafo
    public final void a(apzg apzgVar) {
        if (apzgVar == null || !apzgVar.qn(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)) {
            return;
        }
        aoye aoyeVar = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint) apzgVar.qm(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b;
        if (aoyeVar == null) {
            aoyeVar = aoye.a;
        }
        if ((aoyeVar.b & 1) == 0) {
            return;
        }
        a aVar = this.a;
        aoye aoyeVar2 = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint) apzgVar.qm(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b;
        if (aoyeVar2 == null) {
            aoyeVar2 = aoye.a;
        }
        aqxq aqxqVar = aoyeVar2.c;
        if (aqxqVar == null) {
            aqxqVar = aqxq.a;
        }
        aVar.a(aqxqVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        a(apzgVar);
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
