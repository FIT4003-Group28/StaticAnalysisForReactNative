package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cxpq  reason: default package */
/* loaded from: classes5.dex */
public final class cxpq {
    public static int a(Context context, String str) {
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(R.array.light_monogram_colors);
        if (obtainTypedArray.length() == 0) {
            return -7829368;
        }
        if (!TextUtils.isEmpty(str)) {
            int color = obtainTypedArray.getColor(Math.abs(str.hashCode()) % obtainTypedArray.length(), -1);
            obtainTypedArray.recycle();
            return color;
        }
        int color2 = obtainTypedArray.getColor(0, -1);
        obtainTypedArray.recycle();
        return color2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(Context context, String str, int i) {
        Resources resources = context.getResources();
        float fraction = resources.getFraction(R.fraction.monogram_letter_to_size_ratio, 1, 1);
        float fraction2 = resources.getFraction(R.fraction.monogram_letter_to_size_ratio_two_chars, 1, 1);
        float fraction3 = resources.getFraction(R.fraction.monogram_letter_to_size_ratio_three_chars, 1, 1);
        if (str.length() == 3) {
            fraction = fraction3;
        } else if (str.length() == 2) {
            fraction = fraction2;
        }
        return fraction * i;
    }
}
