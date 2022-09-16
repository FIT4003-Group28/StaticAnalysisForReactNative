package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: dada  reason: default package */
/* loaded from: classes.dex */
public final class dada {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = sl.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a;
    }

    public static ColorStateList b(Context context, aeq aeqVar, int i) {
        int o;
        ColorStateList a;
        return (!aeqVar.p(i) || (o = aeqVar.o(i, 0)) == 0 || (a = sl.a(context, o)) == null) ? aeqVar.j(i) : a;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = sl.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b;
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
