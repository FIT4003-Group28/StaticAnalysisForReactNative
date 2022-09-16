package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: akg  reason: default package */
/* loaded from: classes.dex */
public final class akg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, int i) {
        return context.getColor(i);
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            return !"REL".equals(str) && str.compareTo("S") >= 0;
        }
        return true;
    }
}
