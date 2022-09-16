package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: zai  reason: default package */
/* loaded from: classes4.dex */
public final class zai extends Drawable {
    private final Path a = new Path();
    private final Paint b;
    private Rect c;

    public zai(int i) {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(i);
    }

    public static int a(float f, int i) {
        double d = f + i + i;
        Double.isNaN(d);
        return (int) Math.ceil(d / 1.73d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.a, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (this.c != null) {
            if (iy.k(this) == 1) {
                rect.set(this.c.right, this.c.top, this.c.left, this.c.bottom);
            } else {
                rect.set(this.c);
            }
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        double d;
        super.onBoundsChange(rect);
        this.a.reset();
        Rect bounds = getBounds();
        int height = bounds.height();
        this.a.moveTo(bounds.left, bounds.top);
        this.a.lineTo(bounds.left, bounds.bottom);
        Path path = this.a;
        int i = bounds.right;
        Double.isNaN(height);
        path.lineTo(Math.max(i - ((int) (d / 1.73d)), 0), bounds.bottom);
        this.a.lineTo(bounds.right, bounds.top);
        this.a.close();
        if (iy.k(this) == 1) {
            Matrix matrix = new Matrix();
            matrix.setScale(-1.0f, 1.0f, bounds.width() / 2.0f, bounds.height() / 2.0f);
            this.a.transform(matrix);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public final void b(int i, int i2, int i3, int i4) {
        if ((i | i2 | i3 | i4) == 0) {
            this.c = null;
        } else {
            if (this.c == null) {
                this.c = new Rect();
            }
            this.c.set(i, i2, i3, i4);
        }
        invalidateSelf();
    }
}
