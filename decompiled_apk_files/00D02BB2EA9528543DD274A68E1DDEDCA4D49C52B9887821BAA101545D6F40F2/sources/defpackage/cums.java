package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cums  reason: default package */
/* loaded from: classes5.dex */
public final class cums {
    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        float width;
        float height;
        if (bitmap == null) {
            width = i;
            height = i2;
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        float max = Math.max(i / width, i2 / height);
        float f = width * max;
        float f2 = max * height;
        float f3 = i4;
        float min = Math.min(f3 / f2, Math.min(f3 / f, 1.0f));
        float f4 = f * min;
        float f5 = min * f2;
        float f6 = i3;
        float max2 = Math.max(Math.max(f6 / f4, 1.0f), f6 / f5);
        float f7 = f4 * max2;
        float f8 = max2 * f5;
        if (bitmap == null) {
            return Bitmap.createBitmap((int) Math.min(f7, f3), (int) Math.min(f8, f3), Bitmap.Config.ARGB_8888);
        }
        if (f7 > f3 || f8 > f3) {
            int max3 = (int) Math.max(f7 - f3, 0.0f);
            int max4 = (int) Math.max(f8 - f3, 0.0f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f7, (int) f8, true);
            return Bitmap.createBitmap(createScaledBitmap, max3 / 2, max4 / 2, createScaledBitmap.getWidth() - max3, createScaledBitmap.getHeight() - max4);
        }
        return Bitmap.createScaledBitmap(bitmap, (int) f7, (int) f8, true);
    }
}
