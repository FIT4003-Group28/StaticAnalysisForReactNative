package defpackage;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture$PackageStatsCallback;
import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: uzd  reason: default package */
/* loaded from: classes4.dex */
public final class uzd {
    public static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture");
    static final uzc[] b = {new uzc("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new uzc("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new uzc("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageStats a(Context context) {
        uwp.e();
        if (Build.VERSION.SDK_INT < 26) {
            if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
                uzc[] uzcVarArr = b;
                if (!b()) {
                    ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 160, "PackageStatsCapture.java")).q("Callback implementation stripped by proguard.");
                    return null;
                }
                PackageStatsCapture$PackageStatsCallback packageStatsCapture$PackageStatsCallback = new PackageStatsCapture$PackageStatsCallback();
                try {
                    packageStatsCapture$PackageStatsCallback.a.acquire();
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    int myUid = Process.myUid();
                    for (int i = 0; i < 3; i++) {
                        if (uzcVarArr[i].a(packageManager, packageName, myUid, packageStatsCapture$PackageStatsCallback)) {
                            amzy amzyVar = a;
                            ((amzw) ((amzw) amzyVar.e()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 171, "PackageStatsCapture.java")).q("Success invoking PackageStats capture.");
                            if (packageStatsCapture$PackageStatsCallback.a.tryAcquire(15000L, TimeUnit.MILLISECONDS)) {
                                return packageStatsCapture$PackageStatsCallback.b;
                            }
                            ((amzw) ((amzw) amzyVar.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture$PackageStatsCallback", "waitForStats", 63, "PackageStatsCapture.java")).q("Timeout while waiting for PackageStats callback");
                            return null;
                        }
                    }
                    ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStatsUsingInternalAPI", 177, "PackageStatsCapture.java")).q("Couldn't capture PackageStats.");
                    return null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "getPackageStats", 208, "PackageStatsCapture.java")).s("%s required", "android.permission.GET_PACKAGE_SIZE");
            return null;
        }
        return uze.a(context);
    }

    private static boolean b() {
        try {
            return !Modifier.isAbstract(PackageStatsCapture$PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
        } catch (Error | Exception e) {
            ((amzw) ((amzw) ((amzw) a.c()).h(e)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCapture", "isCallbackPresent", (char) 150, "PackageStatsCapture.java")).q("failure");
            return false;
        }
    }
}
