package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: acpe  reason: default package */
/* loaded from: classes2.dex */
public final class acpe {
    public static int a(Context context, int i) {
        return b(context.getResources(), i);
    }

    public static int b(Resources resources, int i) {
        return c(resources, i);
    }

    public static int c(Resources resources, float f) {
        return Math.round(f * resources.getDisplayMetrics().density);
    }
}
