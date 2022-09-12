package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: hv  reason: default package */
/* loaded from: classes.dex */
public final class hv {
    public static Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent == null) {
            String c = c(activity);
            if (c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, c);
            try {
                if (d(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                String str = "getParentActivityIntent: bad parentActivityName '" + c + "' in manifest";
                return null;
            }
        }
        return parentActivityIntent;
    }

    public static Intent b(Context context, ComponentName componentName) {
        String d = d(context, componentName);
        if (d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), d);
        if (d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity) {
        try {
            return d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String d(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = Build.VERSION.SDK_INT >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str == null) {
            if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
                return null;
            }
            if (string.charAt(0) != '.') {
                return string;
            }
            return context.getPackageName() + string;
        }
        return str;
    }
}
