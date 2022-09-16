package defpackage;

import android.util.Log;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: uew  reason: default package */
/* loaded from: classes4.dex */
public final class uew {
    public boolean a = false;

    public static String a(String str, String str2, Object[] objArr) {
        if (objArr.length != 0) {
            str2 = String.format(Locale.US, str2, objArr);
        }
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    public final boolean b(int i) {
        return this.a || Log.isLoggable("Notifications", i);
    }
}
