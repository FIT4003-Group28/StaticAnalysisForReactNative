package com.google.android.libraries.onegoogle.accountmenu.features.obake;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class HighlightCircleDrawable extends Drawable implements Drawable.Callback {
    public boolean a;
    private final Drawable b;
    private final int c;
    private final RectF d;
    private final Paint e;
    private final dcdc<cwep> f;

    public HighlightCircleDrawable(Context context, Drawable drawable, int i) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.b = drawable;
        this.d = new RectF(drawable.getBounds());
        this.c = i;
        drawable.setCallback(this);
        cwiy cwiyVar = new cwiy(context);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.og_highlight_drawable_border_thickness));
        paint.setColor(cwiyVar.a(cwix.COLOR_HAIRLINE));
        dccx F = dcdc.F();
        F.g(new cwep(cwiyVar.a(cwix.COLOR_SECONDARY_VARIANT)));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, cwfd.a, R.attr.ogHighlightCircleDrawableStyle, 2132017751);
        try {
            F.g(new cwep(obtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.google_blue400))));
            obtainStyledAttributes.recycle();
            this.f = F.f();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void a(int i, int i2) {
        this.f.get(i).c = i2;
        b(this.f.get(i).b, this.d, this.f.get(i).c);
        this.b.invalidateSelf();
    }

    private static void b(RectF rectF, RectF rectF2, int i) {
        float f = i;
        rectF.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a) {
            return;
        }
        dcdc<cwep> dcdcVar = this.f;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cwep cwepVar = dcdcVar.get(i);
            canvas.drawOval(cwepVar.b, cwepVar.a);
        }
        this.b.draw(canvas);
        canvas.drawArc(this.d, 0.0f, 360.0f, false, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f.get(0).a.getAlpha();
    }

    public int getFirstPulseSize() {
        return this.f.get(0).c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    public int getSecondPulseSize() {
        return this.f.get(1).c;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int width = (getBounds().width() - this.c) / 2;
        int height = (getBounds().height() - this.c) / 2;
        this.b.setBounds(rect.left + width, rect.top + height, rect.right - width, rect.bottom - height);
        this.d.set(this.b.getBounds());
        dcdc<cwep> dcdcVar = this.f;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cwep cwepVar = dcdcVar.get(i);
            b(cwepVar.b, this.d, cwepVar.c);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f.get(0).a.setAlpha(i);
        this.f.get(1).a.setAlpha(i);
        this.e.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setFirstPulseSize(int i) {
        a(0, i);
    }

    public void setSecondPulseSize(int i) {
        a(1, i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
