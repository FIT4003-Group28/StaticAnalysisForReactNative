package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwiz  reason: default package */
/* loaded from: classes.dex */
public final class cwiz {
    public static Drawable a(Context context, int i, int i2) {
        return b(sl.b(context, i), i2);
    }

    public static Drawable b(Drawable drawable, int i) {
        Drawable b = ks.b(drawable);
        b.mutate().setTint(i);
        return b;
    }

    public static Drawable c(Context context, int i) {
        dbsk.b(true, "An Activity Context is required to load Vector Drawables with SDK < LOLLIPOP");
        return sl.b(context, i);
    }

    public static int d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarItemBackground});
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
