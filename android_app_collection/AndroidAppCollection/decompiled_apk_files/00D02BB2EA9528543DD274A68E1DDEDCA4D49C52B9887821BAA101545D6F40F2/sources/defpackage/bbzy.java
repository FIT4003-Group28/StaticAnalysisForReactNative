package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* compiled from: PG */
/* renamed from: bbzy  reason: default package */
/* loaded from: classes3.dex */
final class bbzy extends View {
    private final Paint a;
    private final Paint b;
    private final float c;

    public bbzy(Context context) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density * 6.0f;
        this.c = f;
        Paint paint = new Paint();
        this.a = paint;
        paint.setStrokeWidth(f);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setAlpha(64);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = canvas.getWidth() / 2;
        float height = canvas.getHeight() / 2;
        float min = Math.min(width, height) - (this.c / 2.0f);
        canvas.drawCircle(width, height, min, this.b);
        canvas.drawCircle(width, height, min, this.a);
    }

    public void setFillAlpha(float f) {
        if (this.b.getAlpha() == f) {
            return;
        }
        this.b.setAlpha(Math.round(f * 255.0f));
        invalidate();
    }
}
