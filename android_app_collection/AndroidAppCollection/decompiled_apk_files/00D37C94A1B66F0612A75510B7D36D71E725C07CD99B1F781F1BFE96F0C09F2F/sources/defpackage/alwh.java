package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
/* compiled from: PG */
/* renamed from: alwh  reason: default package */
/* loaded from: classes.dex */
public final class alwh {
    private static final String c = "alwh";
    public final int a;
    public final Resources b;

    public alwh(int i, Resources resources) {
        this.a = i;
        this.b = resources;
    }

    public static alwh a(Context context, Bundle bundle) {
        Resources resourcesForApplication;
        if (bundle.containsKey("packageName") && bundle.containsKey("resourceName") && bundle.containsKey("resourceId")) {
            String string = bundle.getString("packageName");
            String string2 = bundle.getString("resourceName");
            int i = bundle.getInt("resourceId");
            try {
                PackageManager packageManager = context.getPackageManager();
                if (Build.VERSION.SDK_INT >= 24) {
                    resourcesForApplication = packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512));
                } else {
                    resourcesForApplication = packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512));
                }
                return new alwh(i, resourcesForApplication);
            } catch (PackageManager.NameNotFoundException unused) {
                Bundle bundle2 = bundle.getBundle("fallbackConfig");
                if (bundle2 != null) {
                    String str = c;
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 38 + String.valueOf(string2).length());
                    sb.append(string);
                    sb.append(" not found, ");
                    sb.append(string2);
                    sb.append(" fallback to default value");
                    Log.w(str, sb.toString());
                    return a(context, bundle2);
                }
            }
        }
        return null;
    }
}
