package defpackage;

import com.google.protos.youtube.api.innertube.AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aihz  reason: default package */
/* loaded from: classes.dex */
public final class aihz implements aafl {
    private final aiii a;

    public aihz(aiii aiiiVar) {
        this.a = aiiiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint = (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint) apzgVar.qm(AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.acknowledgeYouthereEndpoint);
        if ((acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.b & 1) != 0) {
            aiii aiiiVar = this.a;
            awgw awgwVar = acknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.c;
            if (awgwVar == null) {
                awgwVar = awgw.a;
            }
            aiiiVar.d(awgwVar);
        }
    }
}
