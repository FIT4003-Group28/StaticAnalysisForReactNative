package defpackage;

import com.google.protos.youtube.api.innertube.AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wkz  reason: default package */
/* loaded from: classes4.dex */
public final class wkz implements wla {
    public final Set a;
    public final xir b;

    public wkz(xir xirVar, Set set) {
        this.a = set;
        this.b = xirVar;
    }

    @Override // defpackage.wla
    public final void a(AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand) {
        int b = apdw.b(adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.b);
        if (b == 0) {
            b = 1;
        }
        boolean z = adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.d;
        this.b.d(apbz.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_RECEIVED, b, null, xcb.a);
        ArrayList<xdu> arrayList = new ArrayList();
        for (apan apanVar : adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.c) {
            apdh apdhVar = apanVar.c;
            if (apdhVar == null) {
                apdhVar = apdh.a;
            }
            apdg apdgVar = apdhVar.f;
            if (apdgVar == null) {
                apdgVar = apdg.a;
            }
            String str = apdgVar.c;
            apcd b2 = apcd.b(apdhVar.c);
            if (b2 == null) {
                b2 = apcd.SLOT_TYPE_UNSPECIFIED;
            }
            arrayList.add(xdu.i(str, b2, apdhVar.e, xac.b(new xal[0])));
        }
        this.b.d(apbz.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_PROCESSED, b, arrayList, xcb.a);
        if (arrayList.isEmpty()) {
            return;
        }
        for (xdu xduVar : arrayList) {
            amzs it = ((amyt) this.a).iterator();
            while (it.hasNext()) {
                ((wkw) it.next()).d(xduVar, z);
            }
            z = false;
        }
    }
}
