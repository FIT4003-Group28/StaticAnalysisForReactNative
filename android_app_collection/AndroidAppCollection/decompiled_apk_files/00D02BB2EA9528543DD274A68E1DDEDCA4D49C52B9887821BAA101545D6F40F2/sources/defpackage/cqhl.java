package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqhl  reason: default package */
/* loaded from: classes5.dex */
public final class cqhl {
    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean b(Context context) {
        return !a(context);
    }

    public static boolean c(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static boolean d(Context context) {
        return !c(context);
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp <= 320;
    }
}
