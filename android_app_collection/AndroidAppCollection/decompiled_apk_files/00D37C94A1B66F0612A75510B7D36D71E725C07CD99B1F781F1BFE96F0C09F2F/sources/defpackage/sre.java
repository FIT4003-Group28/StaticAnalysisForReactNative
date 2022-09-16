package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.UserManager;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: sre  reason: default package */
/* loaded from: classes4.dex */
public final class sre {
    private static UserManager a;
    private static volatile boolean b = !f();
    private static boolean c = false;

    private sre() {
    }

    public static Context a(Context context) {
        return (!f() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
    }

    public static void b(Context context, Runnable runnable) {
        if (!e(context)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.USER_UNLOCKED");
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            srd srdVar = new srd(atomicBoolean, runnable);
            context.registerReceiver(srdVar, intentFilter);
            if (!e(context) || !atomicBoolean.compareAndSet(false, true)) {
                return;
            }
            context.unregisterReceiver(srdVar);
            runnable.run();
            return;
        }
        runnable.run();
    }

    public static synchronized void c() {
        synchronized (sre.class) {
            c = true;
        }
    }

    public static boolean d(Context context) {
        return f() && !g(context);
    }

    public static boolean e(Context context) {
        return !f() || g(context);
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[Catch: all -> 0x0079, TryCatch #1 {, blocks: (B:7:0x0009, B:9:0x000d, B:11:0x000f, B:13:0x0014, B:15:0x0030, B:37:0x0075, B:38:0x0077, B:21:0x003c, B:23:0x0040, B:24:0x004a, B:27:0x0050, B:29:0x0056, B:33:0x0063, B:35:0x0071), top: B:47:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean g(android.content.Context r8) {
        /*
            boolean r0 = defpackage.sre.b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<sre> r0 = defpackage.sre.class
            monitor-enter(r0)
            boolean r2 = defpackage.sre.b     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            return r1
        Lf:
            boolean r2 = defpackage.sre.c     // Catch: java.lang.Throwable -> L79
            r3 = 0
            if (r2 == 0) goto L37
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L79
            java.lang.Class<com.google.android.libraries.directboot.DirectBootHelperService> r4 = com.google.android.libraries.directboot.DirectBootHelperService.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L79
            android.content.Intent r2 = r2.setClassName(r8, r4)     // Catch: java.lang.Throwable -> L79
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L79
            r4 = 268435968(0x10000200, float:2.524509E-29)
            java.util.List r8 = r8.queryIntentServices(r2, r4)     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L73
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r8 != 0) goto L73
            goto L4e
        L37:
            r2 = 1
        L38:
            r4 = 2
            r5 = 0
            if (r2 > r4) goto L6f
            android.os.UserManager r4 = defpackage.sre.a     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L4a
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r8.getSystemService(r4)     // Catch: java.lang.Throwable -> L79
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L79
            defpackage.sre.a = r4     // Catch: java.lang.Throwable -> L79
        L4a:
            android.os.UserManager r4 = defpackage.sre.a     // Catch: java.lang.Throwable -> L79
            if (r4 != 0) goto L50
        L4e:
            r3 = 1
            goto L73
        L50:
            boolean r6 = r4.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L62 java.lang.Throwable -> L79
            if (r6 != 0) goto L60
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L62 java.lang.Throwable -> L79
            boolean r8 = r4.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L62 java.lang.Throwable -> L79
            if (r8 != 0) goto L6f
        L60:
            r3 = 1
            goto L6f
        L62:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch: java.lang.Throwable -> L79
            defpackage.sre.a = r5     // Catch: java.lang.Throwable -> L79
            int r2 = r2 + 1
            goto L38
        L6f:
            if (r3 == 0) goto L73
            defpackage.sre.a = r5     // Catch: java.lang.Throwable -> L79
        L73:
            if (r3 == 0) goto L77
            defpackage.sre.b = r1     // Catch: java.lang.Throwable -> L79
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            return r3
        L79:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            goto L7d
        L7c:
            throw r8
        L7d:
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sre.g(android.content.Context):boolean");
    }
}
