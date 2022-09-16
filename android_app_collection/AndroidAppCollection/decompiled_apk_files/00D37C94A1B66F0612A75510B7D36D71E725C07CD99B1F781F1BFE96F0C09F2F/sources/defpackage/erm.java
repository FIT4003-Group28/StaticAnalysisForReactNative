package defpackage;

import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erm  reason: default package */
/* loaded from: classes3.dex */
public final class erm implements aafl {
    private final yrj a;
    private final afvn b;
    private final agvq c;
    private final agrf d;
    private final /* synthetic */ int e;

    public erm(yrj yrjVar, agrf agrfVar, afvn afvnVar, agvq agvqVar) {
        this.a = yrjVar;
        this.d = agrfVar;
        this.b = afvnVar;
        this.c = agvqVar;
    }

    public erm(yrj yrjVar, agrf agrfVar, afvn afvnVar, agvq agvqVar, int i) {
        this.e = i;
        this.a = yrjVar;
        this.d = agrfVar;
        this.b = afvnVar;
        this.c = agvqVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.e == 0) {
            if (!this.a.o() || !this.b.t()) {
                return;
            }
            agwh m = this.d.a().m();
            OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) apzgVar.qm(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
            m.a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "", this.c.u(), agqn.OFFLINE_IMMEDIATELY, (byte[]) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", byte[].class), 0);
        } else if (!this.a.o() || !this.b.t()) {
        } else {
            this.d.a().i().B(((OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) apzgVar.qm(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)).c, this.c.u(), agqn.OFFLINE_IMMEDIATELY, (byte[]) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", byte[].class), 0, 4);
        }
    }
}
