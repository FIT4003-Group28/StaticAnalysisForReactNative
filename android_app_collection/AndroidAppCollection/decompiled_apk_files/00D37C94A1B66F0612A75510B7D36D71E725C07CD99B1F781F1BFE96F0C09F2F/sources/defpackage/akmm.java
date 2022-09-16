package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akmm  reason: default package */
/* loaded from: classes.dex */
final class akmm implements ajgw {
    final /* synthetic */ apzg a;
    final /* synthetic */ Map b;
    final /* synthetic */ akmo c;

    public akmm(akmo akmoVar, apzg apzgVar, Map map) {
        this.c = akmoVar;
        this.a = apzgVar;
        this.b = map;
    }

    @Override // defpackage.ajgw
    public final void a() {
    }

    @Override // defpackage.ajgw
    public final void b() {
        akmo akmoVar = this.c;
        apzg apzgVar = this.a;
        Map map = this.b;
        zag.q(akmoVar.a, R.string.publishing_private_video_progress, 0);
        SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint) apzgVar.qm(SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.sharePrivateVideoEndpoint);
        aopa createBuilder = arxl.a.createBuilder();
        String str = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.b;
        createBuilder.copyOnWrite();
        arxl arxlVar = (arxl) createBuilder.instance;
        str.getClass();
        arxlVar.b |= 2;
        arxlVar.e = str;
        aopa createBuilder2 = arxb.a.createBuilder();
        createBuilder2.copyOnWrite();
        arxb arxbVar = (arxb) createBuilder2.instance;
        arxbVar.c = 2;
        arxbVar.b |= 1;
        createBuilder.copyOnWrite();
        arxl arxlVar2 = (arxl) createBuilder.instance;
        arxb arxbVar2 = (arxb) createBuilder2.mo39build();
        arxbVar2.getClass();
        arxlVar2.h = arxbVar2;
        arxlVar2.b |= 32;
        akmoVar.b.b(createBuilder, new akmn(akmoVar, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, map), apzgVar.c.I());
    }

    @Override // defpackage.ajgw
    public final void c(boolean z) {
    }
}
