package defpackage;

import android.content.Intent;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xyo  reason: default package */
/* loaded from: classes4.dex */
public final class xyo implements aafl, xyl {
    private final xyn a;

    public xyo(xyn xynVar) {
        this.a = xynVar;
        xynVar.c(this);
    }

    @Override // defpackage.xyl
    public final void d(boolean z) {
    }

    @Override // defpackage.xym
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint = (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint) apzgVar.qm(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.unlimitedManageFamilyEndpoint);
        aoob aoobVar = null;
        if (unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint != null && (unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.b & 4) != 0) {
            aoobVar = unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.d;
        }
        xyn xynVar = this.a;
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2 = (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint) apzgVar.qm(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.unlimitedManageFamilyEndpoint);
        String str = !unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2.c.isEmpty() ? unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint2.c : (String) zew.K(map, "accountName", String.class);
        xynVar.f = aoobVar;
        String a = ((AccountIdentity) xynVar.a.c()).a();
        if (str == null) {
            str = "ytr";
        }
        raz razVar = new raz(a, str);
        qnm.l("youtube");
        razVar.b.putString("predefinedTheme", "youtube");
        Intent b = rax.b(razVar);
        if (xynVar.f != null) {
            acrr acrrVar = xynVar.d;
            xyq xyqVar = new xyq();
            xyqVar.a = xynVar.f;
            arrf a2 = arrh.a();
            awhj a3 = xyqVar.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).er(a3);
            acrrVar.c((arrh) a2.mo39build());
        }
        xynVar.g.a(b, 2001, xynVar);
    }
}
