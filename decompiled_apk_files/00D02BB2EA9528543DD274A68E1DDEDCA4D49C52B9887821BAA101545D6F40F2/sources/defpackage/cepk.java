package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.shapes.Shape;
/* compiled from: PG */
/* renamed from: cepk  reason: default package */
/* loaded from: classes4.dex */
final class cepk extends Shape {
    private final Path a = new Path();

    @Override // android.graphics.drawable.shapes.Shape
    public final void draw(Canvas canvas, Paint paint) {
        canvas.drawPath(this.a, paint);
    }

    @Override // android.graphics.drawable.shapes.Shape
    protected final void onResize(float f, float f2) {
        this.a.reset();
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.a.moveTo(0.0f, 0.0f);
        this.a.lineTo(f, 0.0f);
        this.a.lineTo(f / 2.0f, f2);
        this.a.close();
    }
}
