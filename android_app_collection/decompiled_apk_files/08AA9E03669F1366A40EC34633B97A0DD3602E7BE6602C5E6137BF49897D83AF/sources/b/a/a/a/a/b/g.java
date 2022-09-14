package b.a.a.a.a.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: ApiKey.java */
/* loaded from: classes.dex */
public class g {
    protected String a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    public String a(Context context) {
        String c2 = c(context);
        if (TextUtils.isEmpty(c2)) {
            c2 = d(context);
        }
        if (TextUtils.isEmpty(c2)) {
            c2 = b(context);
        }
        if (TextUtils.isEmpty(c2)) {
            e(context);
        }
        return c2;
    }

    protected String b(Context context) {
        return new o().a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String c(Context context) {
        String str = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    b.a.a.a.c.h().a("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                b.a.a.a.c.h().a("Fabric", "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                e = e;
                str = string;
                b.a.a.a.l h = b.a.a.a.c.h();
                h.a("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e);
                return str;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String d(Context context) {
        int a2 = i.a(context, "io.fabric.ApiKey", "string");
        if (a2 == 0) {
            b.a.a.a.c.h().a("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a2 = i.a(context, "com.crashlytics.ApiKey", "string");
        }
        if (a2 != 0) {
            return context.getResources().getString(a2);
        }
        return null;
    }

    protected void e(Context context) {
        if (b.a.a.a.c.i() || i.i(context)) {
            throw new IllegalArgumentException(a());
        }
        b.a.a.a.c.h().e("Fabric", a());
    }
}
