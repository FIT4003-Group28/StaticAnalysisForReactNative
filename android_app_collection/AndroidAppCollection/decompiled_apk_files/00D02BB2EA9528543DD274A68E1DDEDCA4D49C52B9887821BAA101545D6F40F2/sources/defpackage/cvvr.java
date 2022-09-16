package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cvvr  reason: default package */
/* loaded from: classes5.dex */
final class cvvr extends Drawable implements cvwi {
    private static final int[][] a = {new int[]{-279548, 155, 50}, new int[]{-1490379, 205, 105}, new int[]{-12417548, 310, 100}, new int[]{-13326253, 50, 105}};
    private final cvwb b;
    private final Paint c;
    private final RectF d = new RectF();

    public cvvr(cvwb cvwbVar) {
        this.b = cvwbVar;
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int[][] iArr = a;
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = iArr[i];
            this.c.setColor(iArr2[0]);
            canvas.drawArc(this.d, iArr2[1], iArr2[2], false, this.c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        dbsk.b(rect.width() == rect.height(), "Width and height for G1RingDrawable bounds must be equal.");
        int width = rect.width();
        int a2 = this.b.a(width);
        float f = (a2 + 1) / 2;
        float f2 = width - f;
        this.d.set(f, f, f2, f2);
        this.c.setStrokeWidth(a2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
