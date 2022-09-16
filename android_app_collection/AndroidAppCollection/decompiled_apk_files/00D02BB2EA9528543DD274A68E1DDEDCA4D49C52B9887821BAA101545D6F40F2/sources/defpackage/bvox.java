package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: bvox  reason: default package */
/* loaded from: classes.dex */
public final class bvox {
    public static boolean a(View view) {
        return b(view.getContext());
    }

    public static boolean b(Context context) {
        return c(context.getResources());
    }

    public static boolean c(Resources resources) {
        return d(resources.getConfiguration());
    }

    public static boolean d(Configuration configuration) {
        return (configuration.screenLayout & 192) == 128;
    }

    public static float e(boolean z) {
        return z ? -1.0f : 1.0f;
    }

    public static float f(boolean z, float f) {
        return e(z) * f;
    }
}
