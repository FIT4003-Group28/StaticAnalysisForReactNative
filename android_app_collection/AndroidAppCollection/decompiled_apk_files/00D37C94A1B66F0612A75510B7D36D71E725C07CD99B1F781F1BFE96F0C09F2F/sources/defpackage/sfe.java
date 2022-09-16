package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
/* compiled from: PG */
/* renamed from: sfe  reason: default package */
/* loaded from: classes4.dex */
final class sfe extends View {
    private static final Typeface e;
    private static final Paint.Align f;
    private static final int j;
    public sgm a;
    public float b;
    public float c;
    public float d;
    private final TextPaint g;
    private final int h;
    private final Rect i;
    private final sgl k;

    static {
        Color.parseColor("#9E9E9E");
        e = Typeface.create("sans-serif-thin", 0);
        f = Paint.Align.CENTER;
        j = 2;
    }

    public sfe(Context context, int i) {
        super(context);
        this.k = new sgl();
        this.a = new sgm("");
        TextPaint textPaint = new TextPaint();
        this.g = textPaint;
        this.i = new Rect();
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1.0f;
        setLayoutParams(new sby(-1, -1, (byte) 2, 99));
        this.h = (int) scf.b(context, 72.0f);
        textPaint.setTypeface(e);
        textPaint.setColor(i);
        textPaint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.g;
        float f2 = this.d;
        if (f2 == -1.0f) {
            float f3 = this.b;
            if (f3 == -1.0f) {
                f3 = getWidth();
            }
            float f4 = this.c;
            if (f4 == -1.0f) {
                f4 = getHeight();
            }
            this.g.setTextSize(this.h);
            sgj b = this.k.b(this.a, this.g, f, j, 0.0f);
            float f5 = b.h;
            float f6 = 1.0f;
            if (f5 > f3) {
                f6 = Math.min(1.0f, f3 / f5);
            }
            float f7 = b.g;
            if (f7 > f4) {
                f6 = Math.min(f6, f4 / f7);
            }
            f2 = (int) (this.h * f6);
            this.d = f2;
        }
        textPaint.setTextSize(f2);
        int width = getWidth();
        int height = getHeight();
        this.i.set(0, 0, getWidth(), getHeight());
        this.k.a(this.a, canvas, width / 2, height / 2, this.i, this.g, f, j, 0.0f, false);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d = -1.0f;
    }
}
