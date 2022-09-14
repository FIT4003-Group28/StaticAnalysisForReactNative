package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a extends a.g.e.b {

    /* renamed from: c  reason: collision with root package name */
    private static c f1483c;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0046a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f1484b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f1485c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1486d;

        RunnableC0046a(String[] strArr, Activity activity, int i) {
            this.f1484b = strArr;
            this.f1485c = activity;
            this.f1486d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1484b.length];
            PackageManager packageManager = this.f1485c.getPackageManager();
            String packageName = this.f1485c.getPackageName();
            int length = this.f1484b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1484b[i], packageName);
            }
            ((b) this.f1485c).onRequestPermissionsResult(this.f1486d, this.f1484b, iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(Activity activity, String[] strArr, int i);

        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i);
    }

    public static c a() {
        return f1483c;
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void a(Activity activity, String[] strArr, int i) {
        c cVar = f1483c;
        if (cVar == null || !cVar.a(activity, strArr, i)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof b) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0046a(strArr, activity, i));
            }
        }
    }

    public static boolean a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && androidx.core.app.b.a(activity)) {
            return;
        }
        activity.recreate();
    }
}
