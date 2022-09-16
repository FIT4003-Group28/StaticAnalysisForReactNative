package defpackage;

import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import java.util.List;
/* compiled from: PG */
/* renamed from: aafp  reason: default package */
/* loaded from: classes.dex */
public final class aafp {
    static final List a = amuk.s(atno.b, auqs.b);

    public static Object a(apzg apzgVar) {
        if (!apzgVar.qn(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint) || !apzgVar.qn(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint)) {
            amzt listIterator = ((amuk) a).listIterator();
            aopc aopcVar = null;
            while (listIterator.hasNext()) {
                aooq aooqVar = (aooq) listIterator.next();
                if (apzgVar.qn(aooqVar)) {
                    if (aopcVar == null) {
                        aopcVar = (aopc) apzgVar.mo52toBuilder();
                    }
                    aopcVar.d(aooqVar);
                }
            }
            apzg apzgVar2 = aopcVar != null ? (apzg) aopcVar.mo39build() : apzgVar;
            if (apzgVar2.equals(apzg.a)) {
                return null;
            }
            try {
                return apzgVar.qm(aoos.b().d(apzg.a, apdw.g(apzgVar2)));
            } catch (Exception unused) {
                return null;
            }
        }
        return apzgVar.qm(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint);
    }
}
