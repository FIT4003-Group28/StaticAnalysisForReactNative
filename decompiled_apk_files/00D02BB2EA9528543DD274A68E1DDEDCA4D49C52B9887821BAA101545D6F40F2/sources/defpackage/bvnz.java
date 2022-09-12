package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bvnz  reason: default package */
/* loaded from: classes.dex */
public final class bvnz {
    public static String a(Context context) {
        try {
            String b = cpkc.b(context.getContentResolver(), "maps_client_id");
            return b == null ? "dev" : b;
        } catch (Exception unused) {
            return "dev";
        }
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        String replace = str.replace('-', '_');
        String replace2 = str2.replace('-', '_');
        String replace3 = str3.replace('-', '_');
        int length = String.valueOf(replace).length();
        StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(replace2).length() + String.valueOf(replace3).length());
        sb.append("android:");
        sb.append(replace);
        sb.append("-");
        sb.append(replace2);
        sb.append("-");
        sb.append(replace3);
        return sb.toString();
    }

    public static String c(String str) {
        return str.split("-")[0];
    }
}
