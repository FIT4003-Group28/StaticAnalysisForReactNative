package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gjz  reason: default package */
/* loaded from: classes3.dex */
public final class gjz extends ydx {
    private final amqo a;
    private final amqo b;

    public gjz(Context context, yel yelVar, aafo aafoVar, acti actiVar, epr eprVar) {
        super(context, yelVar, aafoVar, actiVar);
        this.a = aqxo.i(new gjy(this, eprVar, 1));
        this.b = aqxo.i(new gjy(this, eprVar));
    }

    @Override // defpackage.ydx, defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        avnr avnrVar = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apzgVar.qm(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b;
        if (avnrVar == null) {
            avnrVar = avnr.a;
        }
        int i = avnrVar.b;
        if (i == 127046814) {
            ((epq) this.a.get()).kD(apzgVar, map);
        } else if (i != 127387931) {
            super.kD(apzgVar, map);
        } else {
            ((epq) this.b.get()).kD(apzgVar, map);
        }
    }
}
