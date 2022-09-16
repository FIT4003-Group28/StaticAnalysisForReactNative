package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements aafo {
    private final ooy a;

    public i(ooy ooyVar) {
        this.a = ooyVar;
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
    public final void c(apzg apzgVar, Map map) {
        if (apzgVar == null || !apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            return;
        }
        aijl d = PlaybackStartDescriptor.d();
        d.a = apzgVar;
        this.a.a(d.a());
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
