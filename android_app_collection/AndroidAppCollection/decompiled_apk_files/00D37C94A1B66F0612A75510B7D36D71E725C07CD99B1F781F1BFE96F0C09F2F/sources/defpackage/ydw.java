package defpackage;

import android.content.Intent;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ydw  reason: default package */
/* loaded from: classes4.dex */
public final class ydw extends xyj {
    public final yel b;
    public final aafo c;
    private final xyn d;

    public ydw(xyn xynVar, yel yelVar, aafo aafoVar) {
        super(xynVar);
        this.d = xynVar;
        this.b = yelVar;
        this.c = aafoVar;
    }

    @Override // defpackage.xyj, defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.d.a(new ydv(this, apzgVar));
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) apzgVar.qm(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        String str = null;
        aoob aoobVar = (unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.b & 128) != 0 ? unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.h : null;
        xyn xynVar = this.a;
        String str2 = ((UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) apzgVar.qm(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint)).c;
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2 = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) apzgVar.qm(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        if (!unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2.g.isEmpty()) {
            str = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint2.g;
        }
        xynVar.e = aoobVar;
        String a = ((AccountIdentity) xynVar.a.c()).a();
        if (str == null) {
            str = "ytr";
        }
        raw rawVar = new raw(a, str);
        if (str2 != null && !str2.isEmpty()) {
            qnm.l(str2);
            rawVar.b.putString("referencePcid", str2);
        }
        qnm.l("youtube");
        rawVar.b.putString("predefinedTheme", "youtube");
        Intent a2 = rax.a(rawVar);
        if (aoobVar != null) {
            acrr acrrVar = xynVar.d;
            xyp xypVar = new xyp();
            xypVar.a = aoobVar;
            arrf a3 = arrh.a();
            awhi a4 = xypVar.a();
            a3.copyOnWrite();
            ((arrh) a3.instance).ep(a4);
            acrrVar.c((arrh) a3.mo39build());
        }
        xynVar.g.a(a2, 2000, xynVar);
    }
}
