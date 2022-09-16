package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* renamed from: ign  reason: default package */
/* loaded from: classes3.dex */
public final class ign implements aidy {
    private final afmt a;

    public ign(afmt afmtVar) {
        this.a = afmtVar;
    }

    @Override // defpackage.aidy
    public final ampq a(atzb atzbVar) {
        return ampq.j(this.a.b());
    }

    @Override // defpackage.aidy
    public final atzb b(apzg apzgVar) {
        if (apzgVar != null && apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            awem awemVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t;
            if (awemVar == null) {
                awemVar = awem.a;
            }
            if ((awemVar.b & 1) != 0) {
                atzb atzbVar = awemVar.c;
                return atzbVar == null ? atzb.a : atzbVar;
            }
        }
        return null;
    }

    @Override // defpackage.aidy
    public final atzc c(apzg apzgVar) {
        if (apzgVar != null && apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            awem awemVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).t;
            if (awemVar == null) {
                awemVar = awem.a;
            }
            if ((awemVar.b & 8) != 0) {
                atzc atzcVar = awemVar.e;
                return atzcVar == null ? atzc.a : atzcVar;
            }
        }
        return null;
    }
}
