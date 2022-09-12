package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
/* compiled from: PG */
/* renamed from: cwja  reason: default package */
/* loaded from: classes5.dex */
public final class cwja {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = sl.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a;
    }
}
