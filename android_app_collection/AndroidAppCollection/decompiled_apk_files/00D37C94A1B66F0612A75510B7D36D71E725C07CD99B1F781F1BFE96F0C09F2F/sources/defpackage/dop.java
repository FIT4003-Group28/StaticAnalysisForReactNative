package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: dop  reason: default package */
/* loaded from: classes3.dex */
public final class dop {
    public static final Object a;
    public static dol b;

    static {
        new HashMap();
        a = new Object();
        b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b(Context context) {
        return context.getSharedPreferences("google_conversion", 0).getLong("last_retry_time", 0L);
    }

    static String c(long j) {
        return String.format(Locale.US, "%d.%03d", Long.valueOf(j / 1000), Long.valueOf(j % 1000));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102 A[Catch: dor | dos | IOException | IllegalStateException -> 0x01f1, TRY_ENTER, TRY_LEAVE, TryCatch #5 {dor | dos | IOException | IllegalStateException -> 0x01f1, blocks: (B:3:0x000e, B:5:0x001a, B:6:0x001f, B:56:0x00e0, B:58:0x00f6, B:59:0x00fb, B:60:0x00fc, B:61:0x0101, B:53:0x00d2, B:54:0x00d7, B:55:0x00dc, B:62:0x0102, B:84:0x0183, B:102:0x01b4, B:103:0x01bb, B:11:0x003c, B:15:0x0050, B:17:0x0054, B:21:0x0061, B:22:0x0065, B:23:0x0069, B:29:0x0080, B:26:0x0074, B:30:0x0084, B:32:0x0088, B:34:0x00a0, B:35:0x00a4, B:40:0x00ad, B:43:0x00bd, B:104:0x01bc, B:105:0x01d5, B:106:0x01d6, B:107:0x01dd, B:14:0x004a, B:109:0x01df, B:110:0x01e4, B:113:0x01eb, B:114:0x01f0, B:111:0x01e5, B:112:0x01ea, B:64:0x0117, B:66:0x011b, B:76:0x013d, B:78:0x0156, B:83:0x017a, B:87:0x0189, B:88:0x018f, B:90:0x0191, B:91:0x0197, B:70:0x012b, B:72:0x0131, B:74:0x0135, B:75:0x0138, B:92:0x0198, B:93:0x019d, B:96:0x01a0, B:97:0x01a7, B:98:0x01a8, B:99:0x01af), top: B:181:0x000e, inners: #2, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.Context r16, defpackage.doo r17) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dop.d(android.content.Context, doo):java.lang.String");
    }

    public static void e(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, true);
        edit.commit();
    }

    public static void f(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("google_conversion", 0).edit();
        edit.putLong("last_retry_time", System.currentTimeMillis());
        edit.commit();
    }

    public static boolean g(Context context, String str, String str2, boolean z) {
        if (!z && context.getSharedPreferences(str, 0).getBoolean(str2, false)) {
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                "Already sent ping for conversion ".concat(valueOf);
            }
            return false;
        }
        return true;
    }

    public static boolean h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return true;
    }

    private static String i(doq doqVar) {
        if (doqVar == null) {
            return null;
        }
        return true != doqVar.b ? "0" : "1";
    }
}
