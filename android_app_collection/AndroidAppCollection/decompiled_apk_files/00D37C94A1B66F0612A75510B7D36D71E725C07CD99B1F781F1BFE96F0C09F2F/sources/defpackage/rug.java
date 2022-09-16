package defpackage;

import android.os.Build;
import android.util.Log;
/* compiled from: PG */
/* renamed from: rug  reason: default package */
/* loaded from: classes4.dex */
public final class rug {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(String str, Throwable th) {
        String c = c();
        if (Log.isLoggable(c, 5)) {
            Log.w(c, str, th);
        }
    }

    public static String c() {
        return Build.VERSION.SDK_INT < 26 ? "PeopleClient".substring(0, Math.min(12, 23)) : "PeopleClient";
    }
}
