package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eou  reason: default package */
/* loaded from: classes3.dex */
public final class eou implements aafl {
    private final Context a;
    private final aafo b;
    private final ajgz c;

    public eou(Context context, aafo aafoVar, ajgz ajgzVar) {
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        ajgzVar.getClass();
        this.c = ajgzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aoye aoyeVar = ((AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint) apzgVar.qm(AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint)).b;
        if (aoyeVar == null) {
            aoyeVar = aoye.a;
        }
        aqxq aqxqVar = aoyeVar.c;
        if (aqxqVar == null) {
            aqxqVar = aqxq.a;
        }
        ajhb.g(this.a, aqxqVar, this.b, this.c, zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
    }
}
