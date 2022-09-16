package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: cvpg  reason: default package */
/* loaded from: classes5.dex */
public final class cvpg {
    public static boolean a(int i) {
        return Log.isLoggable("GnpSdk", i);
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a(6)) {
            c(str, str2, objArr);
        }
    }

    public static void c(String str, String str2, Object[] objArr) {
        if (objArr.length != 0) {
            str2 = String.format(null, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        sb.toString();
    }
}
