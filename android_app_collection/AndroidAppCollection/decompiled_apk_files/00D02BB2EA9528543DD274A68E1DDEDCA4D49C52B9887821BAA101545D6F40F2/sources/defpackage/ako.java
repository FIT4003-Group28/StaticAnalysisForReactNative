package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: ako  reason: default package */
/* loaded from: classes2.dex */
public final class ako {
    @Deprecated
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 30 || Build.VERSION.CODENAME.equals("R");
    }
}
