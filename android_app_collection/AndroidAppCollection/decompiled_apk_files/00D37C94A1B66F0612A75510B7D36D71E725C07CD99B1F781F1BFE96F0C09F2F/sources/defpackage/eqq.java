package defpackage;

import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqq  reason: default package */
/* loaded from: classes3.dex */
public final class eqq implements aafl {
    private final yni a;
    private final aafo b;

    public eqq(yni yniVar, aafo aafoVar) {
        yniVar.getClass();
        this.a = yniVar;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint = (MuteAdEndpointOuterClass$MuteAdEndpoint) apzgVar.qm(MuteAdEndpointOuterClass$MuteAdEndpoint.muteAdEndpoint);
        this.a.d(new xgc(muteAdEndpointOuterClass$MuteAdEndpoint, I));
        this.b.e(muteAdEndpointOuterClass$MuteAdEndpoint.c, I);
    }
}
