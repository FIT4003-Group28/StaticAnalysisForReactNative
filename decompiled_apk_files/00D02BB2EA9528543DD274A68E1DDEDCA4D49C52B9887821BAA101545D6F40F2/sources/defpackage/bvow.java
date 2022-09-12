package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.List;
/* compiled from: PG */
/* renamed from: bvow  reason: default package */
/* loaded from: classes.dex */
public final class bvow {
    private static String b;
    public final Context a;

    public bvow(Context context) {
        this.a = context;
    }

    @dzsi
    public static List<ActivityManager.RunningAppProcessInfo> b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            return activityManager.getRunningAppProcesses();
        }
        return null;
    }

    public static synchronized String c(Context context) {
        String str;
        String str2;
        synchronized (bvow.class) {
            if (b == null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    str2 = Application.getProcessName();
                } else {
                    List<ActivityManager.RunningAppProcessInfo> b2 = b(context);
                    if (b2 != null) {
                        int myPid = Process.myPid();
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : b2) {
                            if (runningAppProcessInfo != null && runningAppProcessInfo.pid == myPid) {
                                str2 = runningAppProcessInfo.processName;
                                break;
                            }
                        }
                    }
                    str2 = "<?>";
                }
                b = str2;
            }
            str = b;
        }
        return str;
    }

    public static boolean d(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> b2 = b(context);
        if (b2 != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : b2) {
                if (runningAppProcessInfo.pid == i) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> b2 = b(context);
        if (b2 != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : b2) {
                int i = runningAppProcessInfo.pid;
                String str2 = runningAppProcessInfo.processName;
                if (runningAppProcessInfo.processName.contains(str)) {
                    Process.killProcess(i);
                    int i2 = 10;
                    while (d(context, i) && i2 > 0) {
                        i2--;
                        try {
                            Thread.sleep(50L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    return !d(context, i);
                }
            }
            return true;
        }
        throw new bvov("Processes not found in running list");
    }

    public final boolean a() {
        String packageName = this.a.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.contains(packageName)) {
                    return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
                }
            }
        }
        throw new bvov("Process not found in running list");
    }
}
