package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: bvlf  reason: default package */
/* loaded from: classes.dex */
public final class bvlf {
    public static Bitmap a(Picture picture, int i, int i2, Bitmap.Config config) {
        return b(picture, 0.0f, 0.0f, i, i2, i, i2, config);
    }

    public static Bitmap b(Picture picture, float f, float f2, float f3, float f4, int i, int i2, Bitmap.Config config) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        new Canvas(createBitmap).drawPicture(picture, new RectF(f, f2, f3, f4));
        return createBitmap;
    }

    public static Bitmap c(Drawable drawable, int i, int i2, Bitmap.Config config) {
        boolean z = true;
        dbsk.a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        dbsk.a(z);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap d(Drawable drawable, int i, int i2, Bitmap.Config config) {
        int width;
        int height;
        boolean z = true;
        dbsk.a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        dbsk.a(z);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, i, i2);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
        } else {
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            float min = Math.min(rect.width() / f, rect.height() / f2);
            int round = Math.round(f * min);
            int round2 = Math.round(f2 * min);
            int round3 = Math.round((width - round) * 0.5f);
            int round4 = Math.round((height - round2) * 0.5f);
            drawable.setBounds(round3, round4, round + round3, round2 + round4);
        }
        drawable.draw(canvas);
        return createBitmap;
    }
}
