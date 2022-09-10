package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cnnl  reason: default package */
/* loaded from: classes.dex */
public class cnnl {
    private static boolean a = false;
    @Deprecated
    public static final int b = 204612000;
    static boolean c = false;
    static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:
        if (r6.signatures[0].equals(r7.signatures[0]) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnnl.c(android.content.Context, int):int");
    }

    @Deprecated
    public static void d(Context context, int i) {
        int j = cnmr.d.j(context, i);
        if (j != 0) {
            Intent k = cnmr.d.k(context, j, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(j);
            sb.toString();
            if (k == null) {
                throw new cnni();
            }
            throw new cnnj(j, "Google Play Services not available", k);
        }
    }

    public static boolean e(Context context) {
        if (!c) {
            try {
                PackageInfo b2 = cnyb.b(context).b("com.google.android.gms", 64);
                cnnm.a(context);
                if (b2 == null || cnnm.g(b2, false) || !cnnm.g(b2, true)) {
                    a = false;
                } else {
                    a = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                c = true;
            }
        }
        return a || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static void f(Context context) {
        if (d.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                return;
            }
            notificationManager.cancel(10436);
        } catch (SecurityException unused) {
        }
    }

    @Deprecated
    public static boolean g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static Context h(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    public static boolean j(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        return k(context, "com.google.android.gms");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled) {
            Object systemService = context.getSystemService("user");
            cnwc.a(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static String l() {
        return ConnectionResult.d(13);
    }
}
