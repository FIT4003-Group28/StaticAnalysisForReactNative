package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akmn  reason: default package */
/* loaded from: classes.dex */
final class akmn implements afzf {
    final /* synthetic */ SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a;
    final /* synthetic */ Map b;
    final /* synthetic */ akmo c;

    public akmn(akmo akmoVar, SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, Map map) {
        this.c = akmoVar;
        this.a = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
        this.b = map;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zag.q(this.c.a, R.string.error_publishing_private_video, 0);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arxm arxmVar = (arxm) obj;
        aafo aafoVar = this.c.c;
        apzg apzgVar = this.a.c;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, this.b);
    }
}
