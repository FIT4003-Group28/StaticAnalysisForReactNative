package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czzc  reason: default package */
/* loaded from: classes5.dex */
public final class czzc extends Drawable {
    public final Paint a;
    float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public dadx h;
    private int o;
    private ColorStateList p;
    private final dadz i = dady.a;
    private final Path j = new Path();
    private final Rect k = new Rect();
    private final RectF l = new RectF();
    private final RectF m = new RectF();
    private final czzb n = new czzb(this);
    public boolean g = true;

    public czzc(dadx dadxVar) {
        this.h = dadxVar;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.o = colorStateList.getColorForState(getState(), this.o);
        }
        this.p = colorStateList;
        this.g = true;
        invalidateSelf();
    }

    protected final RectF b() {
        this.m.set(getBounds());
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g) {
            Paint paint = this.a;
            Rect rect = this.k;
            copyBounds(rect);
            float height = this.b / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{kc.a(this.c, this.o), kc.a(this.d, this.o), kc.a(kc.f(this.d, 0), this.o), kc.a(kc.f(this.f, 0), this.o), kc.a(this.f, this.o), kc.a(this.e, this.o)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.g = false;
        }
        float strokeWidth = this.a.getStrokeWidth() / 2.0f;
        copyBounds(this.k);
        this.l.set(this.k);
        float min = Math.min(this.h.f.a(b()), this.l.width() / 2.0f);
        if (this.h.g(b())) {
            this.l.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.l, min, min, this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.h.g(b())) {
            outline.setRoundRect(getBounds(), this.h.f.a(b()));
            return;
        }
        copyBounds(this.k);
        this.l.set(this.k);
        this.i.a(this.h, 1.0f, this.l, this.j);
        if (!this.j.isConvex()) {
            return;
        }
        outline.setConvexPath(this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (this.h.g(b())) {
            int round = Math.round(this.b);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.o)) != this.o) {
            this.g = true;
            this.o = colorForState;
        }
        if (this.g) {
            invalidateSelf();
        }
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
