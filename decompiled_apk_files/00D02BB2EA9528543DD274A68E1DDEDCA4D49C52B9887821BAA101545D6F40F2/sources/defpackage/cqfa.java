package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqfa  reason: default package */
/* loaded from: classes5.dex */
public final class cqfa {
    public static int a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context) {
        return a(context, R.attr.colorOnSurface);
    }
}
