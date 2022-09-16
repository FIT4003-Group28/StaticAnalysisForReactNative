package b.a.a.a.a.b;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: FirebaseInfo.java */
/* loaded from: classes.dex */
public class o {
    /* JADX INFO: Access modifiers changed from: protected */
    public String a(Context context) {
        int a2 = i.a(context, "google_app_id", "string");
        if (a2 != 0) {
            b.a.a.a.c.h().a("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
            return a(context.getResources().getString(a2));
        }
        return null;
    }

    protected String a(String str) {
        return i.b(str).substring(0, 40);
    }

    public boolean b(Context context) {
        if (i.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        return (i.a(context, "google_app_id", "string") != 0) && !(!TextUtils.isEmpty(new g().c(context)) || !TextUtils.isEmpty(new g().d(context)));
    }
}
