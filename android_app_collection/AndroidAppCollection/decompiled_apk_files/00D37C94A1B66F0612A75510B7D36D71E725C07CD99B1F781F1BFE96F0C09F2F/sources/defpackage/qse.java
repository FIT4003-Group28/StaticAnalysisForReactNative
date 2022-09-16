package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: qse  reason: default package */
/* loaded from: classes4.dex */
public final class qse {
    static boolean a = false;
    public static final /* synthetic */ int c = 0;
    private static boolean d = false;
    static final AtomicBoolean b = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qse.b(android.content.Context, int):int");
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static void d(Context context, int i) {
        int h = qrr.d.h(context, i);
        if (h != 0) {
            Intent i2 = qrr.d.i(context, h, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(h);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (i2 == null) {
                throw new qsc(h);
            }
            throw new qsd(h, "Google Play Services not available", i2);
        }
    }

    public static boolean e(Context context) {
        try {
            if (!a) {
                PackageInfo d2 = qyr.b(context).d("com.google.android.gms", 64);
                qsf.b(context);
                if (d2 == null || qsf.g(d2, false) || !qsf.g(d2, true)) {
                    d = false;
                } else {
                    d = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            a = true;
        }
        return d || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean f(Context context, int i) {
        if (i == 1) {
            return i(context);
        }
        return false;
    }

    @Deprecated
    public static boolean g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean h(Context context, int i, String str) {
        return tzc.w(context, i, str);
    }

    public static boolean i(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    @Deprecated
    public static String j() {
        return ConnectionResult.a(13);
    }
}
