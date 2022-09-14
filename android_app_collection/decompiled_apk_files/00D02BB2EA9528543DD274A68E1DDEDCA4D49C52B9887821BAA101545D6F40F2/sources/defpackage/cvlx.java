package defpackage;

import android.util.Log;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cvlx  reason: default package */
/* loaded from: classes5.dex */
public final class cvlx {
    public boolean a = false;

    public static void b(String str, String str2, Object[] objArr) {
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        sb.toString();
    }

    public final boolean a(int i) {
        return this.a || Log.isLoggable("Notifications", i);
    }
}
