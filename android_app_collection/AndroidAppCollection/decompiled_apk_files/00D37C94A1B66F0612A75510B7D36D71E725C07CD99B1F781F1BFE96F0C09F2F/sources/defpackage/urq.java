package defpackage;

import android.util.Log;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: urq  reason: default package */
/* loaded from: classes4.dex */
public final class urq {
    public static final void a(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        uqa a = uqc.a();
        a.b(str);
        map.put(str, a);
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? "MENAGERIE" : "MDI";
    }

    public static String c(String str, String str2, Object[] objArr) {
        if (objArr.length != 0) {
            str2 = String.format(null, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    public static void d(String str, Throwable th, String str2, Object... objArr) {
        if (e(6)) {
            Log.e("GnpSdk", c(str, str2, objArr), th);
        }
    }

    public static boolean e(int i) {
        return Log.isLoggable("GnpSdk", i);
    }
}
