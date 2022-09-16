package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jex  reason: default package */
/* loaded from: classes7.dex */
public final class jex {
    public static String a(Resources resources, float f) {
        if (Float.isNaN(f)) {
            return "";
        }
        return resources.getQuantityString(R.plurals.ACCESSIBILITY_DECIMAL_STARS, ((int) (10.0f * f)) % 10 == 0 ? (int) f : 3, Float.valueOf(f));
    }

    public static String b(Resources resources, int i) {
        return resources.getQuantityString(R.plurals.ACCESSIBILITY_STARS, i, Integer.valueOf(i));
    }
}
