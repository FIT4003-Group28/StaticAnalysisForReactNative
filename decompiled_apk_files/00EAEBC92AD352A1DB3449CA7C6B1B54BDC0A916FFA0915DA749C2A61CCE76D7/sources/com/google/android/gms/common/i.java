package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.r0;
import com.google.android.gms.common.util.l;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class i {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f6959a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6960b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6961c = false;

    /* renamed from: d  reason: collision with root package name */
    static final AtomicBoolean f6962d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f6963e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int a(Context context, int i) {
        try {
            context.getResources().getString(k.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f6963e.get()) {
            int b2 = r0.b(context);
            if (b2 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            int i2 = f6959a;
            if (b2 != i2) {
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return a(context, !com.google.android.gms.common.util.i.c(context) && !com.google.android.gms.common.util.i.d(context), i);
    }

    private static int a(Context context, boolean z, int i) {
        String str;
        com.google.android.gms.common.internal.s.a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                str = "Google Play Store is missing.";
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            j.a(context);
            if (!j.a(packageInfo2, true)) {
                str = "Google Play services signature invalid.";
            } else if (!z || (j.a(packageInfo, true) && packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                if (com.google.android.gms.common.util.s.a(packageInfo2.versionCode) >= com.google.android.gms.common.util.s.a(i)) {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                str = "Google Play Store signature invalid.";
            }
            Log.w("GooglePlayServicesUtil", str);
            return 9;
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static String a(int i) {
        return b.a(i);
    }

    @TargetApi(19)
    @Deprecated
    public static boolean a(Context context, int i, String str) {
        return com.google.android.gms.common.util.o.a(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public static boolean a(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (l.g()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !e(context);
    }

    public static Context b(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static boolean b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        return a(context, "com.google.android.gms");
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        try {
            if (!f6961c) {
                try {
                    PackageInfo b2 = com.google.android.gms.common.n.c.a(context).b("com.google.android.gms", 64);
                    j.a(context);
                    if (b2 == null || j.a(b2, false) || !j.a(b2, true)) {
                        f6960b = false;
                    } else {
                        f6960b = true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                }
            }
            return f6960b || !com.google.android.gms.common.util.i.a();
        } finally {
            f6961c = true;
        }
    }

    @TargetApi(18)
    public static boolean e(Context context) {
        Bundle applicationRestrictions;
        return l.d() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }
}
