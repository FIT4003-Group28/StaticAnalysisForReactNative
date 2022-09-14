package a.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
class h extends Drawable {
    private static final double q = Math.cos(Math.toRadians(45.0d));
    static a r;

    /* renamed from: a  reason: collision with root package name */
    private final int f113a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f114b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f115c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f116d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f117e;

    /* renamed from: f  reason: collision with root package name */
    private float f118f;

    /* renamed from: g  reason: collision with root package name */
    private Path f119g;

    /* renamed from: h  reason: collision with root package name */
    private float f120h;
    private float i;
    private float j;
    private ColorStateList k;
    private boolean l;
    private final int m;
    private final int n;
    private boolean o;
    private boolean p;

    /* loaded from: classes.dex */
    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f2, float f3, boolean z) {
        return z ? (float) (f2 + ((1.0d - q) * f3)) : f2;
    }

    private void a(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        } else if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        } else {
            float d2 = d(f2);
            float d3 = d(f3);
            if (d2 > d3) {
                if (!this.p) {
                    this.p = true;
                }
                d2 = d3;
            }
            if (this.j == d2 && this.f120h == d3) {
                return;
            }
            this.j = d2;
            this.f120h = d3;
            this.i = (int) ((d2 * 1.5f) + this.f113a + 0.5f);
            this.l = true;
            invalidateSelf();
        }
    }

    private void a(Canvas canvas) {
        float f2 = this.f118f;
        float f3 = (-f2) - this.i;
        float f4 = f2 + this.f113a + (this.j / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f117e.width() - f5 > 0.0f;
        boolean z2 = this.f117e.height() - f5 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f117e;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f119g, this.f115c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f117e.width() - f5, -this.f118f, this.f116d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f117e;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f119g, this.f115c);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f117e.width() - f5, (-this.f118f) + this.i, this.f116d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f117e;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f119g, this.f115c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f117e.height() - f5, -this.f118f, this.f116d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f117e;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f119g, this.f115c);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f117e.height() - f5, -this.f118f, this.f116d);
        }
        canvas.restoreToCount(save4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        return z ? (float) (f4 + ((1.0d - q) * f3)) : f4;
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.f114b.setColor(this.k.getColorForState(getState(), this.k.getDefaultColor()));
    }

    private void b(Rect rect) {
        float f2 = this.f120h;
        float f3 = 1.5f * f2;
        this.f117e.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        g();
    }

    private int d(float f2) {
        int i = (int) (f2 + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    private void g() {
        float f2 = this.f118f;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.i;
        rectF2.inset(-f3, -f3);
        Path path = this.f119g;
        if (path == null) {
            this.f119g = new Path();
        } else {
            path.reset();
        }
        this.f119g.setFillType(Path.FillType.EVEN_ODD);
        this.f119g.moveTo(-this.f118f, 0.0f);
        this.f119g.rLineTo(-this.i, 0.0f);
        this.f119g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f119g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f119g.close();
        float f4 = this.f118f;
        float f5 = this.i;
        Paint paint = this.f115c;
        float f6 = f4 + f5;
        int i = this.m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.n}, new float[]{0.0f, f4 / (f4 + f5), 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f116d;
        float f7 = this.f118f;
        float f8 = this.i;
        int i2 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i2, i2, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f116d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList a() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.f118f == f3) {
            return;
        }
        this.f118f = f3;
        this.l = true;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        b(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f118f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(float f2) {
        a(this.j, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f120h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float f2) {
        a(f2, this.f120h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        float f2 = this.f120h;
        return (Math.max(f2, this.f118f + this.f113a + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f120h * 1.5f) + this.f113a) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.l) {
            b(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        a(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        r.a(canvas, this.f117e, this.f118f, this.f114b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        float f2 = this.f120h;
        return (Math.max(f2, this.f118f + this.f113a + (f2 / 2.0f)) * 2.0f) + ((this.f120h + this.f113a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(b(this.f120h, this.f118f, this.o));
        int ceil2 = (int) Math.ceil(a(this.f120h, this.f118f, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f114b.getColor() == colorForState) {
            return false;
        }
        this.f114b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f114b.setAlpha(i);
        this.f115c.setAlpha(i);
        this.f116d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f114b.setColorFilter(colorFilter);
    }
}
