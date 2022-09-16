package defpackage;

import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gly  reason: default package */
/* loaded from: classes3.dex */
public final class gly implements aafl {
    private final airr a;
    private final aafo b;

    public gly(airr airrVar, aafo aafoVar) {
        this.a = airrVar;
        aafoVar.getClass();
        this.b = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ajbf n;
        avij avijVar = apzgVar.qn(avik.a) ? (avij) apzgVar.qm(avik.a) : null;
        if (avijVar == null || (avijVar.b & 1) == 0 || (n = this.a.n()) == null) {
            return;
        }
        aqyh aqyhVar = avijVar.c;
        if (aqyhVar == null) {
            aqyhVar = aqyh.a;
        }
        aopa createBuilder = aqyh.a.createBuilder(aqyhVar);
        long b = n.b();
        createBuilder.copyOnWrite();
        aqyh aqyhVar2 = (aqyh) createBuilder.instance;
        aqyhVar2.c = 7;
        aqyhVar2.d = Long.valueOf(b);
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(FeedbackEndpointOuterClass.feedbackEndpoint, (aqyh) createBuilder.mo39build());
        this.b.a((apzg) aopcVar.mo39build());
    }
}
