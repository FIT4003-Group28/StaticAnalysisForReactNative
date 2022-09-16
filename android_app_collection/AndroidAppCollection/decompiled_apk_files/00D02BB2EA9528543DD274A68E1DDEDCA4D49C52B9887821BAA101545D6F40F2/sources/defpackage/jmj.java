package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: jmj  reason: default package */
/* loaded from: classes.dex */
public final class jmj {
    public static int a(Context context, int i) {
        return c(context.getResources(), i);
    }

    public static int b(Context context, float f) {
        return d(context.getResources(), f);
    }

    public static int c(Resources resources, int i) {
        return d(resources, i);
    }

    public static int d(Resources resources, float f) {
        return Math.round(f * resources.getDisplayMetrics().density);
    }

    public static int e(Context context, float f) {
        return Math.round(f / context.getResources().getDisplayMetrics().density);
    }
}
