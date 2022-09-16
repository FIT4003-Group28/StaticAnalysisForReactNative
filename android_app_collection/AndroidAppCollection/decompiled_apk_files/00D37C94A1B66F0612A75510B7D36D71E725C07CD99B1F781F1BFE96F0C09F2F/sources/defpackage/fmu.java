package defpackage;

import com.google.protos.youtube.api.innertube.UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: fmu  reason: default package */
/* loaded from: classes3.dex */
public final class fmu implements aafl {
    private final frr a;

    public fmu(frr frrVar) {
        this.a = frrVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        frm a = this.a.a(((UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint) apzgVar.qm(UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.updatedMetadataEndpoint)).b);
        if (a.i) {
            return;
        }
        a.a.postDelayed(a, 30000L);
        a.i = true;
    }
}
