package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.text.method.MovementMethod;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: veg  reason: default package */
/* loaded from: classes4.dex */
public final class veg {
    public static String a;
    public static Boolean b;
    private static String c;
    private static Boolean d;

    private veg() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r5) {
        /*
            java.lang.String r0 = defpackage.veg.c
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            java.lang.String r5 = android.app.Application.getProcessName()
            defpackage.veg.c = r5
            return r5
        L12:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "robolectric"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 != 0) goto L87
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class<veg> r2 = defpackage.veg.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L43
            r3 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L43
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L43
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L43
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r0 = r1
        L44:
            defpackage.veg.c = r0
            if (r0 != 0) goto L86
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            java.lang.String r4 = "/proc/self/cmdline"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            r4 = 50
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L69
            r2.close()     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
            android.os.StrictMode.setThreadPolicy(r0)
            goto L7c
        L69:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L6d
        L6d:
            throw r3     // Catch: java.lang.Throwable -> L6e java.lang.Exception -> L70
        L6e:
            r5 = move-exception
            goto L82
        L70:
            r2 = move-exception
            java.lang.String r3 = "CurrentProcess"
            java.lang.String r4 = "Unable to read /proc/self/cmdline"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L6e
            android.os.StrictMode.setThreadPolicy(r0)
            r3 = r1
        L7c:
            defpackage.veg.c = r3
            if (r3 != 0) goto L81
            goto L87
        L81:
            return r3
        L82:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        L86:
            return r0
        L87:
            java.lang.String r0 = "activity"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            if (r5 == 0) goto Laf
            int r0 = android.os.Process.myPid()
            java.util.Iterator r5 = r5.iterator()
        L9d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r3 = r2.pid
            if (r3 != r0) goto L9d
            java.lang.String r1 = r2.processName
        Laf:
            defpackage.veg.c = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.veg.a(android.content.Context):java.lang.String");
    }

    public static boolean b() {
        if (d == null) {
            int myUid = Process.myUid();
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 24) {
                z = Process.isApplicationUid(myUid);
            } else {
                try {
                    z = ((Boolean) UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE).invoke(null, Integer.valueOf(myUid))).booleanValue();
                } catch (Exception unused) {
                }
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static void c(TextView textView, MovementMethod movementMethod) {
        boolean isClickable = textView.isClickable();
        boolean isLongClickable = textView.isLongClickable();
        textView.setMovementMethod(movementMethod);
        textView.setClickable(isClickable);
        textView.setLongClickable(isLongClickable);
    }

    public static int[] d() {
        return new int[]{1, 2, 3};
    }
}
