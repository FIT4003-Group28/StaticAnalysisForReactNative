package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class BuildInfo {
    private static String m = "";
    public final String a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;

    public BuildInfo() {
        try {
            Context context = babj.c;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            long a = a(packageInfo);
            this.b = a;
            this.c = packageName;
            this.d = a;
            this.e = b(packageInfo.versionName);
            this.a = b(packageManager.getApplicationLabel(packageInfo.applicationInfo));
            this.f = b(packageManager.getInstallerPackageName(packageName));
            PackageInfo packageInfo2 = null;
            try {
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException unused) {
                Object[] objArr = new Object[0];
                Throwable c = bacc.c(objArr);
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                String name = bacc.class.getName();
                int i = 0;
                while (true) {
                    if (i >= stackTrace.length) {
                        break;
                    } else if (stackTrace[i].getClassName().equals(name)) {
                        i += 3;
                        break;
                    } else {
                        i++;
                    }
                }
                stackTrace[i].getFileName();
                stackTrace[i].getLineNumber();
                bacc.a("GMS package is not found.", c, objArr);
                if (c != null) {
                    bacc.b("BuildInfo");
                } else {
                    bacc.b("BuildInfo");
                }
            }
            this.g = packageInfo2 != null ? String.valueOf(a(packageInfo2)) : "gms versionCode not available.";
            String str = "true";
            try {
                packageManager.getPackageInfo("projekt.substratum", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "false";
            }
            this.j = str;
            this.k = "Not Enabled";
            this.h = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            this.i = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                z = true;
            }
            this.l = z;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static long a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return packageInfo.versionCode;
    }

    private static String b(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    private static String[] getAll() {
        BuildInfo buildInfo = babt.a;
        String packageName = babj.c.getPackageName();
        String[] strArr = new String[25];
        boolean z = false;
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(Build.VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(buildInfo.b);
        strArr[10] = buildInfo.a;
        strArr[11] = buildInfo.c;
        strArr[12] = String.valueOf(buildInfo.d);
        strArr[13] = buildInfo.e;
        strArr[14] = buildInfo.i;
        strArr[15] = buildInfo.g;
        strArr[16] = buildInfo.f;
        strArr[17] = buildInfo.h;
        strArr[18] = m;
        strArr[19] = buildInfo.j;
        strArr[20] = buildInfo.k;
        strArr[21] = String.valueOf(babj.c.getApplicationInfo().targetSdkVersion);
        if ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            z = true;
        }
        String str = "0";
        strArr[22] = true != z ? str : "1";
        if (true == buildInfo.l) {
            str = "1";
        }
        strArr[23] = str;
        strArr[24] = Build.VERSION.INCREMENTAL;
        return strArr;
    }
}
