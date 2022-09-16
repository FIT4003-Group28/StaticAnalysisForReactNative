package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g implements aafo {
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f a;
    private final ooy b;

    public g(ooy ooyVar, com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f fVar) {
        this.b = ooyVar;
        this.a = fVar;
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
        if (apzgVar == null || !apzgVar.qn(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint)) {
            return;
        }
        apzg apzgVar2 = ((arkh) apzgVar.qm(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint)).b;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        long j = 0;
        if (map != null) {
            Object obj = map.get("com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.starttime");
            if (obj instanceof Long) {
                j = ((Long) obj).longValue();
            }
        }
        if (apzgVar2 == null || !apzgVar2.qn(WatchEndpointOuterClass.watchEndpoint)) {
            return;
        }
        aopa mo52toBuilder = ((awel) apzgVar2.qm(WatchEndpointOuterClass.watchEndpoint)).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        awel awelVar = (awel) mo52toBuilder.instance;
        awelVar.b |= 128;
        awelVar.i = (float) j;
        aopc aopcVar = (aopc) apzgVar2.mo52toBuilder();
        aopcVar.e(WatchEndpointOuterClass.watchEndpoint, (awel) mo52toBuilder.mo39build());
        this.a.b(4);
        ooy ooyVar = this.b;
        aijl d = PlaybackStartDescriptor.d();
        d.a = (apzg) aopcVar.mo39build();
        ooyVar.a(d.a());
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
