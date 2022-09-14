package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqlt  reason: default package */
/* loaded from: classes5.dex */
public final class cqlt {
    private static final cqpz<cqls, Bitmap> a = cqpz.b();

    public static Bitmap a(Drawable drawable, int i, int i2, int i3, int i4, boolean z) {
        Bitmap bitmap;
        cqlp cqlpVar = new cqlp(drawable.getConstantState(), i, i2, i3, i4, z);
        Bitmap c = a.c(cqlpVar);
        if (c == null) {
            int[] iArr = new int[2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            dbsk.k(intrinsicWidth > 0 && intrinsicHeight > 0, "The original Drawable doesn't have an intrinsic size. Drawable: %s, Width: %s, Height:%s", drawable, Integer.valueOf(intrinsicWidth), Integer.valueOf(intrinsicHeight));
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            Paint paint = new Paint();
            paint.setMaskFilter(new BlurMaskFilter(i, BlurMaskFilter.Blur.NORMAL));
            try {
                bitmap = createBitmap.extractAlpha(paint, iArr);
            } catch (RuntimeException unused) {
                bitmap = createBitmap;
            }
            int width = createBitmap.getWidth();
            int height = createBitmap.getHeight();
            if (!z) {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                int abs = Math.abs(i2);
                width = width2 + abs + abs;
                int abs2 = Math.abs(i3);
                height = height2 + abs2 + abs2;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_ATOP));
            if (!z) {
                canvas2.translate(Math.abs(i2), Math.abs(i3));
            }
            canvas2.drawBitmap(bitmap, i2, i3, paint2);
            canvas2.translate(-iArr[0], -iArr[1]);
            drawable.draw(canvas2);
            a.d(cqlpVar, createBitmap2);
            return createBitmap2;
        }
        return c;
    }
}
