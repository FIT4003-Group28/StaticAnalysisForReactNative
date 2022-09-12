package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cjja  reason: default package */
/* loaded from: classes4.dex */
public final class cjja extends Drawable {
    private final Matrix a;
    private final Path b;
    private final Path c;
    private final Path d;
    private final Paint e;
    private final float f;

    public cjja(float f, float f2, float f3) {
        this.f = f3;
        Matrix matrix = new Matrix();
        float f4 = f / 2.0f;
        matrix.setRotate(f3, f4, f2 / 2.0f);
        this.a = matrix;
        Path path = new Path();
        PointF pointF = new PointF(0.4074875f * f, 0.0f);
        PointF pointF2 = new PointF(0.3735f * f, f2);
        PointF pointF3 = new PointF(f4, f2);
        PointF pointF4 = new PointF(f, 0.0f);
        path.cubicTo(pointF.x, pointF.y, pointF2.x, pointF2.y, pointF3.x, pointF3.y);
        path.cubicTo(pointF4.x - pointF2.x, pointF2.y, pointF4.x - pointF.x, pointF.y, pointF4.x, pointF4.y);
        path.lineTo(f4, -10.0f);
        path.close();
        path.transform(matrix);
        this.b = path;
        Path path2 = new Path();
        float f5 = 0.24f * f;
        float f6 = 0.12f * f2;
        float f7 = f2 - f6;
        PointF pointF5 = new PointF(f4 - f6, f7);
        PointF pointF6 = new PointF(f6 + f4, f7);
        path2.moveTo(f5, 0.0f);
        path2.lineTo(pointF5.x, pointF5.y);
        path2.lineTo(f4, f2);
        path2.lineTo(pointF6.x, pointF6.y);
        path2.lineTo(f - f5, 0.0f);
        path2.close();
        path2.transform(matrix);
        this.c = path2;
        this.d = Build.VERSION.SDK_INT < 29 ? path2 : path;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        this.e = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        dzvx.c(canvas, "canvas");
        canvas.drawPath(this.b, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        dzvx.c(outline, "outline");
        if (Build.VERSION.SDK_INT < 30) {
            outline.setConvexPath(this.d);
        } else {
            outline.setPath(this.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
        this.e.setColor(colorStateList != null ? colorStateList.getDefaultColor() : -1);
    }
}
