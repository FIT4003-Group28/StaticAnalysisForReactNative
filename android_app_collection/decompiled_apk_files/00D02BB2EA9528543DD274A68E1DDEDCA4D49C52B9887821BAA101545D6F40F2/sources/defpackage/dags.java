package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: dags  reason: default package */
/* loaded from: classes5.dex */
public final class dags extends dadr {
    public final RectF a;
    private final Paint b;
    private int c;

    dags() {
        this(null);
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f == this.a.left && f2 == this.a.top && f3 == this.a.right && f4 == this.a.bottom) {
            return;
        }
        this.a.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            this.c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }
        super.draw(canvas);
        canvas.drawRect(this.a, this.b);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.c);
        }
    }

    public dags(dadx dadxVar) {
        super(dadxVar == null ? new dadx() : dadxVar);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.a = new RectF();
    }
}
