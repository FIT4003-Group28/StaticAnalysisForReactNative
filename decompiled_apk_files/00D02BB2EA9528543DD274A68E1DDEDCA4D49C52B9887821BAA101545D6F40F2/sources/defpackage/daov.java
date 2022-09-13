package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: daov  reason: default package */
/* loaded from: classes5.dex */
public final class daov {
    public final String a;
    public final int b;
    public final Resources c;

    public daov(String str, int i, Resources resources) {
        this.a = str;
        this.b = i;
        this.c = resources;
    }

    public static daov a(Context context, Bundle bundle) {
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
                return new daov(string, i, resourcesForApplication);
            } catch (PackageManager.NameNotFoundException unused) {
                Bundle bundle2 = bundle.getBundle("fallbackConfig");
                if (bundle2 != null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 38 + String.valueOf(string2).length());
                    sb.append(string);
                    sb.append(" not found, ");
                    sb.append(string2);
                    sb.append(" fallback to default value");
                    sb.toString();
                    return a(context, bundle2);
                }
            }
        }
        return null;
    }
}