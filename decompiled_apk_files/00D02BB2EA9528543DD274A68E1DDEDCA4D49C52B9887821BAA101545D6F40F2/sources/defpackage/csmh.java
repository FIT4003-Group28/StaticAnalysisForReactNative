package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: csmh  reason: default package */
/* loaded from: classes5.dex */
public final class csmh extends Drawable {
    public final int a;
    public final int b;
    public final int c;
    public float d;
    public float e;
    public float f;
    public csmk g;
    private final Paint h;
    private final Paint i;
    private float j;
    private float k;
    private float l;
    private int m;
    private int n;

    public csmh(Context context) {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        this.j = 1.0f;
        this.g = csmk.PULSE_WITH_INNER_CIRCLE;
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_inner_radius);
        this.b = resources.getDimensionPixelOffset(R.dimen.libraries_material_featurehighlight_inner_padding);
        this.c = resources.getDimensionPixelOffset(R.dimen.libraries_material_featurehighlight_inner_margin);
        this.n = resources.getInteger(R.integer.libraries_material_featurehighlight_pulse_base_alpha);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        a(-1);
        b(kc.f(-1, this.n));
    }

    public final void a(int i) {
        this.h.setColor(i);
        this.m = this.h.getAlpha();
        invalidateSelf();
    }

    public final void b(int i) {
        this.i.setColor(i);
        this.n = this.i.getAlpha();
        invalidateSelf();
    }

    public final Animator c(float f) {
        ObjectAnimator ofPropertyValuesHolder;
        csmk csmkVar = csmk.PULSE_WITH_INNER_CIRCLE;
        int ordinal = this.g.ordinal();
        if (ordinal == 0) {
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", f, 1.0f), PropertyValuesHolder.ofInt("alpha", (int) (255.0f * f), 255));
        } else if (ordinal == 1) {
            ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofInt("alpha", 0));
        } else {
            String valueOf = String.valueOf(this.g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unsupported animation type ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        ofPropertyValuesHolder.setInterpolator(csku.a);
        return ofPropertyValuesHolder.setDuration(f == 0.0f ? 350L : 150L);
    }

    public final Animator d() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", getScale(), 0.0f), PropertyValuesHolder.ofInt("alpha", getAlpha(), 0), PropertyValuesHolder.ofFloat("pulseScale", getPulseScale(), 0.0f), PropertyValuesHolder.ofFloat("pulseAlpha", getPulseAlpha(), 0.0f));
        ofPropertyValuesHolder.setInterpolator(csku.b);
        return ofPropertyValuesHolder.setDuration(200L);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.d;
        float f2 = this.j * f;
        float f3 = this.l;
        if (f3 > 0.0f) {
            float f4 = (f * this.k) - f2;
            this.i.setAlpha((int) (this.n * f3));
            this.i.setStrokeWidth(f4);
            canvas.drawCircle(this.e, this.f, (f4 * 0.5f) + f2, this.i);
        }
        canvas.drawCircle(this.e, this.f, f2, this.h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getPulseAlpha() {
        return this.l;
    }

    public float getPulseScale() {
        return this.k;
    }

    public float getScale() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.h.setAlpha((int) (this.m * (i / 255.0f)));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setPulseAlpha(float f) {
        this.l = f;
        invalidateSelf();
    }

    public void setPulseScale(float f) {
        this.k = f;
        invalidateSelf();
    }

    public void setScale(float f) {
        this.j = f;
        invalidateSelf();
    }
}
