package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdsWebsiteDeepLinkCommandOuterClass;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gmg  reason: default package */
/* loaded from: classes3.dex */
public final class gmg implements aafl {
    private final wxc a;
    private final enc b;
    private final Activity c;
    private final ajgr d;
    private final LoggingUrlsPingController e;
    private final acth f;

    public gmg(Activity activity, wxc wxcVar, enc encVar, LoggingUrlsPingController loggingUrlsPingController, ajgr ajgrVar, acth acthVar) {
        this.c = activity;
        this.a = wxcVar;
        this.b = encVar;
        this.d = ajgrVar;
        this.e = loggingUrlsPingController;
        this.f = acthVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
        if (r6.enabled != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.apzg r5, android.app.Activity r6, defpackage.apdt r7, boolean r8) {
        /*
            r4 = this;
            int r0 = r5.b
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lc9
            apdu r0 = r7.d
            if (r0 != 0) goto Lc
            apdu r0 = defpackage.apdu.a
        Lc:
            boolean r0 = r0.e
            if (r0 != 0) goto L1e
            apdu r0 = r7.d
            if (r0 != 0) goto L16
            apdu r0 = defpackage.apdu.a
        L16:
            boolean r0 = r0.d
            if (r0 == 0) goto L1b
            goto L1e
        L1b:
            r6 = 0
            goto Lb8
        L1e:
            asiv r0 = defpackage.asiv.a
            aopa r0 = r0.mo52toBuilder()
            apdu r2 = r7.d
            if (r2 != 0) goto L2a
            apdu r2 = defpackage.apdu.a
        L2a:
            boolean r2 = r2.e
            if (r2 == 0) goto L3c
            r0.copyOnWrite()
            aopi r2 = r0.instance
            asiv r2 = (defpackage.asiv) r2
            int r3 = r2.b
            r3 = r3 | r1
            r2.b = r3
            r2.c = r8
        L3c:
            apdu r8 = r7.d
            if (r8 != 0) goto L42
            apdu r8 = defpackage.apdu.a
        L42:
            boolean r8 = r8.d
            if (r8 == 0) goto L79
            apdu r8 = r7.d
            if (r8 != 0) goto L4c
            apdu r8 = defpackage.apdu.a
        L4c:
            int r8 = r8.b
            r8 = r8 & r1
            if (r8 == 0) goto L79
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r8 = 0
            apdu r7 = r7.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r7 != 0) goto L5c
            apdu r7 = defpackage.apdu.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
        L5c:
            java.lang.String r7 = r7.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r6 == 0) goto L69
            boolean r6 = r6.enabled
            if (r6 == 0) goto L69
            goto L6a
        L69:
            r1 = 0
        L6a:
            r0.copyOnWrite()
            aopi r6 = r0.instance
            asiv r6 = (defpackage.asiv) r6
            int r7 = r6.b
            r7 = r7 | 2
            r6.b = r7
            r6.d = r1
        L79:
            asjj r6 = defpackage.asjj.a
            aopa r6 = r6.createBuilder()
            asit r7 = defpackage.asit.a
            aopa r7 = r7.createBuilder()
            r7.copyOnWrite()
            aopi r8 = r7.instance
            asit r8 = (defpackage.asit) r8
            aopi r0 = r0.mo39build()
            asiv r0 = (defpackage.asiv) r0
            r0.getClass()
            r8.d = r0
            r0 = 7
            r8.c = r0
            r6.copyOnWrite()
            aopi r8 = r6.instance
            asjj r8 = (defpackage.asjj) r8
            aopi r7 = r7.mo39build()
            asit r7 = (defpackage.asit) r7
            r7.getClass()
            r8.t = r7
            int r7 = r8.c
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r8.c = r7
            aopi r6 = r6.mo39build()
            asjj r6 = (defpackage.asjj) r6
        Lb8:
            acth r7 = r4.f
            acti r7 = r7.oi()
            acte r8 = new acte
            aoob r5 = r5.c
            r8.<init>(r5)
            r5 = 3
            r7.H(r5, r8, r6)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmg.b(apzg, android.app.Activity, apdt, boolean):void");
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        wxc wxcVar = this.a;
        if (wxcVar != null) {
            wxcVar.c(zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), apel.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL);
        }
        apdt apdtVar = (apdt) apzgVar.qm(AdsWebsiteDeepLinkCommandOuterClass.adsWebsiteDeepLinkCommand);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
            enc encVar = this.b;
            ena enaVar = ena.a;
            apzg[] apzgVarArr = new apzg[1];
            apzg apzgVar2 = apdtVar.c;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            apzgVarArr[0] = apzgVar2;
            encVar.a(enaVar, Arrays.asList(apzgVarArr), hashMap);
        }
        Uri g = this.e.g(apdtVar.b, map);
        ajgr ajgrVar = this.d;
        if (ajgrVar == null || !ajgrVar.e(this.c, g)) {
            b(apzgVar, this.c, apdtVar, false);
            Intent intent = new Intent("android.intent.action.VIEW", g);
            if (this.c.getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
                zag.q(this.c, R.string.error_link_cannot_be_opened, 0);
                return;
            }
            ajgl.q(this.c, intent);
            yja.c(this.c, intent, g);
            this.c.startActivity(intent.setFlags(268435456));
            return;
        }
        b(apzgVar, this.c, apdtVar, true);
    }
}
