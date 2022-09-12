package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Process;
import java.io.File;
/* compiled from: PG */
/* renamed from: akm  reason: default package */
/* loaded from: classes.dex */
public final class akm {
    public static File a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        if (str == null) {
            return null;
        }
        return new File(str);
    }

    public static ColorStateList b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static int c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static Context e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    public static void f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static <T> T g(Context context, Class<T> cls) {
        String str;
        if (Build.VERSION.SDK_INT < 23) {
            if (Build.VERSION.SDK_INT >= 23) {
                str = context.getSystemServiceName(cls);
            } else {
                str = akk.a.get(cls);
            }
            if (str == null) {
                return null;
            }
            return (T) context.getSystemService(str);
        }
        return (T) context.getSystemService(cls);
    }

    public static File[] h(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static void i(Context context, Intent intent) {
        context.startActivity(intent, null);
    }

    public static int d(Context context, String str) {
        if (str == null) {
            throw new IllegalArgumentException("permission is null");
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
