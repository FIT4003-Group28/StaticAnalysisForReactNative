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
/* renamed from: cxby  reason: default package */
/* loaded from: classes5.dex */
public final class cxby {
    static final cxbx[] a = {new cxbx("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new cxbx("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new cxbx("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageStats a(Context context) {
        czhz.c();
        if (Build.VERSION.SDK_INT < 26) {
            if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) != 0 && context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") != 0) {
                return null;
            }
            cxbx[] cxbxVarArr = a;
            if (!b()) {
                return null;
            }
            PackageStatsCapture$PackageStatsCallback packageStatsCapture$PackageStatsCallback = new PackageStatsCapture$PackageStatsCallback();
            try {
                packageStatsCapture$PackageStatsCallback.a.acquire();
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int myUid = Process.myUid();
                for (int i = 0; i < 3; i++) {
                    if (cxbxVarArr[i].a(packageManager, packageName, myUid, packageStatsCapture$PackageStatsCallback)) {
                        if (!packageStatsCapture$PackageStatsCallback.a.tryAcquire(15000L, TimeUnit.MILLISECONDS)) {
                            return null;
                        }
                        return packageStatsCapture$PackageStatsCallback.b;
                    }
                }
                return null;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return cxbz.a(context);
    }

    private static boolean b() {
        return !Modifier.isAbstract(PackageStatsCapture$PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
    }
}
