package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;
/* compiled from: PG */
/* renamed from: wje  reason: default package */
/* loaded from: classes4.dex */
final class wje implements View.OnClickListener {
    final /* synthetic */ wjg a;
    private final /* synthetic */ int b;

    public wje(wjg wjgVar) {
        this.a = wjgVar;
    }

    public wje(wjg wjgVar, int i) {
        this.b = i;
        this.a = wjgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            wjf wjfVar = this.a.b;
            if (wjfVar == null) {
                return;
            }
            wjfVar.a();
            return;
        }
        aqxo.p(wjg.o(this.a.a));
        wjg wjgVar = this.a;
        wjf wjfVar2 = wjgVar.b;
        if (wjfVar2 == null) {
            return;
        }
        atwp atwpVar = wjgVar.a.e;
        if (atwpVar == null) {
            atwpVar = atwp.a;
        }
        apoj apojVar = atwpVar.b;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        apzg apzgVar = apojVar.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        atwf atwfVar = ((PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint) apzgVar.qm(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.phoneVerificationContactNumberInputEndpoint)).b;
        if (atwfVar == null) {
            atwfVar = atwf.a;
        }
        atwh atwhVar = atwfVar.c;
        if (atwhVar == null) {
            atwhVar = atwh.a;
        }
        wjfVar2.aJ(atwhVar);
    }
}
