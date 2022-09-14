package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czxb  reason: default package */
/* loaded from: classes.dex */
public final class czxb {
    public static int a(Context context, int i, int i2) {
        TypedValue a = dacz.a(context, i);
        return a != null ? a.data : i2;
    }

    public static int b(int i, int i2, float f) {
        return kc.a(kc.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int c(int i, int i2) {
        return kc.f(i, (Color.alpha(i) * i2) / 255);
    }

    public static int d(Context context, String str) {
        return dacz.b(context, R.attr.colorSurface, str);
    }
}
