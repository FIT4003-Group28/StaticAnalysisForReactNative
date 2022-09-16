package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: epa  reason: default package */
/* loaded from: classes3.dex */
public final class epa implements aafl {
    private final wxc a;
    private final enc b;
    private final Activity c;
    private final wkl d;
    private final fyy e;
    private final epb f;
    private final axxb g;
    private final yjk h;

    public epa(epb epbVar, wxc wxcVar, enc encVar, Activity activity, wkl wklVar, axxb axxbVar, yjk yjkVar, fyy fyyVar) {
        this.f = epbVar;
        wxcVar.getClass();
        this.a = wxcVar;
        encVar.getClass();
        this.b = encVar;
        this.c = activity;
        wklVar.getClass();
        this.d = wklVar;
        axxbVar.getClass();
        this.g = axxbVar;
        this.h = yjkVar;
        this.e = fyyVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.a.c(zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), apel.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL);
        apht aphtVar = (apht) apzgVar.qm(AppStoreEndpointOuterClass.appStoreEndpoint);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
        this.b.a(ena.a, aphtVar.h, hashMap);
        this.e.h(5);
        Activity activity = this.c;
        String str = aphtVar.b;
        String str2 = aphtVar.c;
        String str3 = aphtVar.d;
        String str4 = aphtVar.e;
        boolean z = aphtVar.f;
        boolean k = this.d.k();
        this.g.a();
        boolean booleanValue = ((Boolean) this.g.a().aw()).booleanValue();
        List f = this.d.f();
        yjk yjkVar = this.h;
        epb epbVar = this.f;
        apzgVar.getClass();
        aafo aafoVar = (aafo) epbVar.a.get();
        aafoVar.getClass();
        fqd fqdVar = (fqd) epbVar.b.get();
        fqdVar.getClass();
        fyy fyyVar = (fyy) epbVar.c.get();
        fyyVar.getClass();
        yja.i(activity, str, str2, str3, str4, z, k, booleanValue, f, yjkVar, new eoz(apzgVar, aafoVar, fqdVar, fyyVar));
    }
}
