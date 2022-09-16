package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
/* compiled from: PG */
/* renamed from: xrn  reason: default package */
/* loaded from: classes4.dex */
public final class xrn extends yzi {
    private final int a;
    private final int b;
    private final Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrn(int i, int i2, int i3) {
        super(new ColorDrawable(0));
        boolean z = false;
        aqxo.p(i > 0);
        aqxo.p(i2 > 0 ? true : z);
        this.a = i;
        this.b = i2;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(i3);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(i2);
    }

    @Override // defpackage.yzi, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float width;
        super.draw(canvas);
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        int max = Math.max(1, bounds.width() / this.a);
        if (max == 1) {
            width = bounds.width();
        } else {
            float f = max;
            width = (bounds.width() - (((-1.0f) + f) * this.b)) / f;
        }
        float f2 = bounds.left + width;
        float f3 = this.b / 2.0f;
        while (true) {
            f2 += f3;
            if (f2 >= bounds.width()) {
                break;
            }
            canvas.drawLine(f2, bounds.top, f2, bounds.bottom, this.c);
            f3 = this.b + width;
        }
        float f4 = bounds.top;
        float f5 = this.b / 2.0f;
        while (true) {
            f4 += f5;
            if (f4 >= bounds.height()) {
                return;
            }
            canvas.drawLine(bounds.left, f4, bounds.right, f4, this.c);
            f5 = this.b + width;
        }
    }

    @Override // defpackage.yzi, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.c.setAlpha(i);
    }
}
