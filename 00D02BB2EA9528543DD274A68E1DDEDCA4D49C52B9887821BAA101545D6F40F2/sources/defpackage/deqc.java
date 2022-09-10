package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* compiled from: PG */
/* renamed from: deqc  reason: default package */
/* loaded from: classes6.dex */
public final class deqc extends deps {
    private final cnof<cnnv> a;
    private final delh b;

    public deqc(cnof<cnnv> cnofVar, delh delhVar) {
        this.a = cnofVar;
        this.b = delhVar;
    }

    public static Uri createDynamicLink(Bundle bundle) {
        verifyDomainUriPrefix(bundle);
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (uri == null) {
            Uri.Builder builder = new Uri.Builder();
            Uri parse = Uri.parse(bundle.getString("domainUriPrefix"));
            builder.scheme(parse.getScheme());
            builder.authority(parse.getAuthority());
            builder.path(parse.getPath());
            Bundle bundle2 = bundle.getBundle("parameters");
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
            return builder.build();
        }
        return uri;
    }

    public static void verifyDomainUriPrefix(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (!TextUtils.isEmpty(bundle.getString("domainUriPrefix")) || uri != null) {
            return;
        }
        throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
    }

    @Override // defpackage.deps
    public final cpcq<dept> a(Intent intent) {
        cpcq d = this.a.d(new deqb(this.b, intent.getDataString()));
        DynamicLinkData dynamicLinkData = (DynamicLinkData) cnwo.c(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", DynamicLinkData.CREATOR);
        dept deptVar = dynamicLinkData != null ? new dept(dynamicLinkData) : null;
        return deptVar != null ? cpda.a(deptVar) : d;
    }
}
