package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ContactMenuEndpointOuterClass$ContactMenuEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: epi  reason: default package */
/* loaded from: classes3.dex */
public final class epi implements aafl {
    public final yzj a;
    private final dt b;
    private final aaun c;

    public epi(dt dtVar, aaun aaunVar, yzj yzjVar) {
        this.b = dtVar;
        this.c = aaunVar;
        this.a = yzjVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String str;
        akmb akmbVar = (akmb) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", akmb.class);
        Object I = zew.I(map, "contact_menu_source_model");
        ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint = (ContactMenuEndpointOuterClass$ContactMenuEndpoint) apzgVar.qm(ContactMenuEndpointOuterClass$ContactMenuEndpoint.contactMenuEndpoint);
        if ((contactMenuEndpointOuterClass$ContactMenuEndpoint.b & 2) != 0) {
            aqkk aqkkVar = contactMenuEndpointOuterClass$ContactMenuEndpoint.d;
            if (aqkkVar == null) {
                aqkkVar = aqkk.a;
            }
            str = aqkkVar.b;
        } else {
            str = null;
        }
        akmx akmxVar = new akmx();
        Bundle bundle = new Bundle();
        bundle.putString("CONTACT_PATH_KEY", str);
        akmxVar.ae(bundle);
        akmxVar.ak = I;
        akmxVar.aF(this.b);
        if (!contactMenuEndpointOuterClass$ContactMenuEndpoint.c.isEmpty()) {
            String str2 = contactMenuEndpointOuterClass$ContactMenuEndpoint.c;
            aaun aaunVar = this.c;
            eph ephVar = new eph(this, akmxVar);
            aaup aaupVar = new aaup(aaunVar.e, aaunVar.a.c());
            aaupVar.a = aaup.g(str2);
            aaunVar.c(arop.a, aaunVar.b, aass.q, aauh.g).e(aaupVar, ephVar);
        }
    }
}
