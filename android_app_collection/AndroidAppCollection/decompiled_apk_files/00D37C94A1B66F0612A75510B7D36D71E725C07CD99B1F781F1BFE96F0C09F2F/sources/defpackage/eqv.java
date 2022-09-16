package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eqv  reason: default package */
/* loaded from: classes3.dex */
public final class eqv implements aafl {
    private final ahcy a;

    public eqv(ahcy ahcyVar) {
        ahcyVar.getClass();
        this.a = ahcyVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint = (OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint) apzgVar.qm(OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.offlineVideoWithOfflineabilityEndpoint);
        int ag = akel.ag(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c);
        int i = 1;
        if (ag == 0) {
            ag = 1;
        }
        int i2 = ag - 1;
        if (i2 == 1) {
            aunb aunbVar = offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            attp attpVar = (attp) ajjh.l(aunbVar, OfflineabilityRendererOuterClass.offlineabilityRenderer);
            if (attpVar == null) {
                zep.b("Object is not an offlineable video");
                return;
            }
            this.a.o(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, attpVar, null, (acti) zew.K(map, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class), null);
        } else if (i2 != 2) {
            int ag2 = akel.ag(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.c);
            if (ag2 != 0) {
                i = ag2;
            }
            String ah = akel.ah(i);
            StringBuilder sb = new StringBuilder(String.valueOf(ah).length() + 34);
            sb.append("Unsupported Offline Video Action: ");
            sb.append(ah);
            zep.l(sb.toString());
        } else {
            this.a.d(offlineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.b, false);
        }
    }
}
