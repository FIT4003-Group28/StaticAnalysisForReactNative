package defpackage;

import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: for  reason: invalid class name and default package */
/* loaded from: classes3.dex */
public final class Cfor implements aafl {
    public final yzj a;
    public final aafo b;
    public final ajqa c;
    private final abdi d;

    public Cfor(yzj yzjVar, aafo aafoVar, abdi abdiVar, ajqa ajqaVar) {
        yzjVar.getClass();
        this.a = yzjVar;
        aafoVar.getClass();
        this.b = aafoVar;
        abdiVar.getClass();
        this.d = abdiVar;
        ajqaVar.getClass();
        this.c = ajqaVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        foo fooVar;
        fop fopVar = (fop) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", fop.class);
        if (fopVar != null && (fooVar = fopVar.b) != null) {
            fooVar.a();
        }
        abdj b = this.d.b();
        for (String str : ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apzgVar.qm(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).c) {
            b.t(str);
        }
        String str2 = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apzgVar.qm(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).e;
        if (!str2.isEmpty()) {
            b.b = str2;
        }
        if (apzgVar.qn(auqs.b)) {
            auqr auqrVar = (auqr) apzgVar.qm(auqs.b);
            if (!auqrVar.c.isEmpty()) {
                b.l(auqrVar.c);
            }
        }
        if ((((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apzgVar.qm(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).b & 1) != 0) {
            b.a = ((UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apzgVar.qm(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)).d;
        }
        b.j(apzgVar.c);
        ajlp ajlpVar = (ajlp) zew.K(map, "command_status_callback", ajlp.class);
        this.d.f(b, new foq(this, map, apzgVar, fopVar, (ajlpVar == null || ajlpVar.a()) ? null : ajlpVar.b()));
    }
}
