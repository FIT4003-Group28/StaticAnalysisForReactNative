package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RoundedLinearLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final RectF e;
    private final Path f;
    private final Paint g;
    private float[] h;

    public RoundedLinearLayout(Context context) {
        this(context, null);
    }

    protected final float a() {
        return this.c;
    }

    protected final float b() {
        return this.b;
    }

    protected final float c() {
        return this.d;
    }

    protected final float d() {
        return this.a;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f);
        super.draw(canvas);
        Paint paint = this.g;
        if (paint != null) {
            canvas.drawPath(this.f, paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        int e = lj.e(this);
        int i5 = 0;
        int i6 = e == 0 ? 0 : 1;
        this.e.set(0.0f, 0.0f, i, i2);
        this.f.reset();
        if (this.h == null) {
            this.h = new float[8];
        }
        int i7 = i6 + i6;
        this.h[i7] = d();
        this.h[i7 + 1] = d();
        if (e == 0) {
            i5 = 1;
        }
        int i8 = i5 + i5;
        this.h[i8] = b();
        this.h[i8 + 1] = b();
        int i9 = 2;
        int i10 = e == 0 ? 2 : 3;
        int i11 = i10 + i10;
        this.h[i11] = a();
        this.h[i11 + 1] = a();
        if (e == 0) {
            i9 = 3;
        }
        int i12 = i9 + i9;
        this.h[i12] = c();
        this.h[i12 + 1] = c();
        this.f.addRoundRect(this.e, this.h, Path.Direction.CW);
        this.f.close();
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yzz.f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, zew.i(displayMetrics, 16));
        this.e = new RectF();
        this.f = new Path();
        this.a = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        this.b = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
        this.d = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        int color = obtainStyledAttributes.getColor(0, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (color == 0 || dimensionPixelSize2 <= 0) {
            this.g = null;
            return;
        }
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(color);
        paint.setStrokeWidth(dimensionPixelSize2);
        paint.setStyle(Paint.Style.STROKE);
    }
}
