package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
/* compiled from: PG */
/* renamed from: trz  reason: default package */
/* loaded from: classes4.dex */
public final class trz {
    public static Boolean a;
    public static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public trz() {
    }

    public trz(Context context) {
        context.getPackageName();
        AccountManager.get(context);
    }

    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return c.booleanValue();
    }

    public static boolean e(Context context) {
        if (d(context)) {
            if (Build.VERSION.SDK_INT < 24) {
                return true;
            }
            if (d == null) {
                d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (d.booleanValue() && !twx.g()) {
                return true;
            }
        }
        return false;
    }

    public static void f(Context context) {
        try {
            qnm.b(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Integer g(String str) {
        char c2;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            return 0;
        }
        if (c2 == 1) {
            return 1;
        }
        if (c2 == 2) {
            return 2;
        }
        return c2 != 3 ? null : 3;
    }
}
