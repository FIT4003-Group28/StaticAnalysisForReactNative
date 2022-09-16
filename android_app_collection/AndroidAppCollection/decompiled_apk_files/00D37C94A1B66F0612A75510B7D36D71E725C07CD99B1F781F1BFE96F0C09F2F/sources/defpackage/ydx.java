package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ydx  reason: default package */
/* loaded from: classes4.dex */
public class ydx implements aafl {
    private final Context a;
    private final yel b;
    private final aafo c;
    private final acti d;

    public ydx(Context context, yel yelVar, aafo aafoVar, acti actiVar) {
        this.a = context;
        this.b = yelVar;
        this.c = aafoVar;
        this.d = actiVar;
    }

    @Override // defpackage.aafl
    public void kD(apzg apzgVar, Map map) {
        asku askuVar;
        UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint = (UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apzgVar.qm(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint);
        avnr avnrVar = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
        if (avnrVar == null) {
            avnrVar = avnr.a;
        }
        aqft aqftVar = null;
        if (avnrVar.b == 86135402) {
            avnr avnrVar2 = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
            if (avnrVar2 == null) {
                avnrVar2 = avnr.a;
            }
            if (avnrVar2.b == 86135402) {
                askuVar = (asku) avnrVar2.c;
            } else {
                askuVar = asku.a;
            }
        } else {
            askuVar = null;
        }
        if (askuVar == null) {
            avnr avnrVar3 = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
            if (avnrVar3 == null) {
                avnrVar3 = avnr.a;
            }
            if (avnrVar3.b == 64099105) {
                avnr avnrVar4 = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
                if (avnrVar4 == null) {
                    avnrVar4 = avnr.a;
                }
                if (avnrVar4.b == 64099105) {
                    aqftVar = (aqft) avnrVar4.c;
                } else {
                    aqftVar = aqft.a;
                }
            }
            aqft aqftVar2 = aqftVar;
            if (aqftVar2 == null) {
                return;
            }
            ajgx.c(this.a, aqftVar2, this.c, this.d, (ajgw) zew.K(map, "confirmDialogControllerListener", ajgw.class), null);
            return;
        }
        this.b.e(askuVar);
    }
}
