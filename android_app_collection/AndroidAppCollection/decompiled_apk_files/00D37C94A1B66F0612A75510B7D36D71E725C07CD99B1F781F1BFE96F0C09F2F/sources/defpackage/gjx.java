package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
/* compiled from: PG */
/* renamed from: gjx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gjx implements epp {
    private final /* synthetic */ int f;
    public static final /* synthetic */ gjx e = new gjx(6);
    public static final /* synthetic */ gjx d = new gjx(5);
    public static final /* synthetic */ gjx c = new gjx(4);
    public static final /* synthetic */ gjx b = new gjx(3);
    public static final /* synthetic */ gjx a = new gjx(2);

    public /* synthetic */ gjx() {
    }

    public /* synthetic */ gjx(int i) {
        this.f = i;
    }

    @Override // defpackage.epp
    public final dh a(apzg apzgVar) {
        avnt avntVar;
        avns avnsVar;
        int i = this.f;
        if (i == 0) {
            avnr avnrVar = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apzgVar.qm(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b;
            if (avnrVar == null) {
                avnrVar = avnr.a;
            }
            if (avnrVar.b == 127046814) {
                avntVar = (avnt) avnrVar.c;
            } else {
                avntVar = avnt.a;
            }
            avntVar.getClass();
            yex yexVar = new yex();
            Bundle bundle = new Bundle();
            bundle.putByteArray("UnlimitedFamilyProfileInterstitialRenderer", avntVar.toByteArray());
            yexVar.ae(bundle);
            return yexVar;
        } else if (i == 1) {
            avnr avnrVar2 = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apzgVar.qm(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b;
            if (avnrVar2 == null) {
                avnrVar2 = avnr.a;
            }
            if (avnrVar2.b == 127387931) {
                avnsVar = (avns) avnrVar2.c;
            } else {
                avnsVar = avns.a;
            }
            return yic.h(avnsVar);
        } else if (i == 2) {
            int i2 = llz.a;
            return new lmc();
        } else if (i == 3) {
            return new lmf();
        } else {
            if (i == 4) {
                return new yhw();
            }
            if (i == 5) {
                return akmu.aE(apzgVar);
            }
            aknd akndVar = new aknd();
            Bundle bundle2 = new Bundle();
            aphq.m(bundle2, "scan_code_endpoint", apzgVar);
            akndVar.ae(bundle2);
            return akndVar;
        }
    }
}
