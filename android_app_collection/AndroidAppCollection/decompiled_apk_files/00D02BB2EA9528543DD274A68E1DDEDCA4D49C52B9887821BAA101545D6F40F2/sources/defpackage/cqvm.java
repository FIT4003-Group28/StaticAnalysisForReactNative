package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
/* compiled from: PG */
/* renamed from: cqvm  reason: default package */
/* loaded from: classes.dex */
public final class cqvm {
    private static UserManager a;
    private static volatile boolean b = !a();

    private cqvm() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(android.content.Context r7) {
        /*
            boolean r0 = defpackage.cqvm.b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<cqvm> r0 = defpackage.cqvm.class
            monitor-enter(r0)
            boolean r2 = defpackage.cqvm.b     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        Lf:
            r2 = 1
        L10:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L40
            android.os.UserManager r3 = defpackage.cqvm.a     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L23
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L4a
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L4a
            defpackage.cqvm.a = r3     // Catch: java.lang.Throwable -> L4a
        L23:
            android.os.UserManager r3 = defpackage.cqvm.a     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L29
            r5 = 1
            goto L44
        L29:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L4a
            if (r6 != 0) goto L39
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L4a
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L3b java.lang.Throwable -> L4a
            if (r7 != 0) goto L40
        L39:
            r5 = 1
            goto L40
        L3b:
            defpackage.cqvm.a = r4     // Catch: java.lang.Throwable -> L4a
            int r2 = r2 + 1
            goto L10
        L40:
            if (r5 == 0) goto L44
            defpackage.cqvm.a = r4     // Catch: java.lang.Throwable -> L4a
        L44:
            if (r5 == 0) goto L48
            defpackage.cqvm.b = r1     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r5
        L4a:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4d:
            throw r7
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqvm.d(android.content.Context):boolean");
    }
}
