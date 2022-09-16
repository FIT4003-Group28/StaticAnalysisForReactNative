package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ake  reason: default package */
/* loaded from: classes.dex */
public final class ake {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    static File[] b(Context context, String str) {
        return context.getExternalFilesDirs(null);
    }

    public static int c(Context context, String str) {
        hy.q(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int d(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return akg.a(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static Context e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return akh.a(context);
        }
        return null;
    }

    public static ColorStateList f(Context context, int i) {
        return gw.b(context.getResources(), i, context.getTheme());
    }

    public static File g(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return akh.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str == null) {
            return null;
        }
        return new File(str);
    }

    public static Executor h(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return akj.a(context);
        }
        return new adk(new Handler(context.getMainLooper()), 1);
    }

    public static void i(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof ajm) {
                ajm ajmVar = (ajm) activity;
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof ajl) {
            new Handler(Looper.getMainLooper()).post(new ajj(strArr, activity, i));
        }
    }

    public static boolean j(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static File[] k(Context context) {
        return b(context, null);
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FINISHED" : "ENCODE" : "SOURCE" : "DATA_CACHE" : "RESOURCE_CACHE" : "INITIALIZE";
    }
}
