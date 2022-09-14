package c.d.h.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
/* loaded from: classes.dex */
public class m extends Drawable implements k {

    /* renamed from: d  reason: collision with root package name */
    float[] f3047d;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f3045b = new float[8];

    /* renamed from: c  reason: collision with root package name */
    final float[] f3046c = new float[8];

    /* renamed from: e  reason: collision with root package name */
    final Paint f3048e = new Paint(1);

    /* renamed from: f  reason: collision with root package name */
    private boolean f3049f = false;

    /* renamed from: g  reason: collision with root package name */
    private float f3050g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f3051h = 0.0f;
    private int i = 0;
    private boolean j = false;
    private boolean k = false;
    final Path l = new Path();
    final Path m = new Path();
    private int n = 0;
    private final RectF o = new RectF();
    private int p = 255;

    public m(int i) {
        a(i);
    }

    @TargetApi(11)
    public static m a(ColorDrawable colorDrawable) {
        return new m(colorDrawable.getColor());
    }

    private void b() {
        float[] fArr;
        float[] fArr2;
        this.l.reset();
        this.m.reset();
        this.o.set(getBounds());
        RectF rectF = this.o;
        float f2 = this.f3050g;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i = 0;
        if (this.f3049f) {
            this.m.addCircle(this.o.centerX(), this.o.centerY(), Math.min(this.o.width(), this.o.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f3046c;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f3045b[i2] + this.f3051h) - (this.f3050g / 2.0f);
                i2++;
            }
            this.m.addRoundRect(this.o, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.o;
        float f3 = this.f3050g;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.f3051h + (this.j ? this.f3050g : 0.0f);
        this.o.inset(f4, f4);
        if (this.f3049f) {
            this.l.addCircle(this.o.centerX(), this.o.centerY(), Math.min(this.o.width(), this.o.height()) / 2.0f, Path.Direction.CW);
        } else if (this.j) {
            if (this.f3047d == null) {
                this.f3047d = new float[8];
            }
            while (true) {
                fArr2 = this.f3047d;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f3045b[i] - this.f3050g;
                i++;
            }
            this.l.addRoundRect(this.o, fArr2, Path.Direction.CW);
        } else {
            this.l.addRoundRect(this.o, this.f3045b, Path.Direction.CW);
        }
        float f5 = -f4;
        this.o.inset(f5, f5);
    }

    @Override // c.d.h.e.k
    public void a(float f2) {
        if (this.f3051h != f2) {
            this.f3051h = f2;
            b();
            invalidateSelf();
        }
    }

    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            invalidateSelf();
        }
    }

    @Override // c.d.h.e.k
    public void a(int i, float f2) {
        if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
        if (this.f3050g != f2) {
            this.f3050g = f2;
            b();
            invalidateSelf();
        }
    }

    @Override // c.d.h.e.k
    public void a(boolean z) {
        this.f3049f = z;
        b();
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f3045b, 0.0f);
        } else {
            c.d.d.d.i.a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f3045b, 0, 8);
        }
        b();
        invalidateSelf();
    }

    public boolean a() {
        return this.k;
    }

    @Override // c.d.h.e.k
    public void b(float f2) {
        c.d.d.d.i.a(f2 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f3045b, f2);
        b();
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void b(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidateSelf();
        }
    }

    @Override // c.d.h.e.k
    public void c(boolean z) {
        if (this.j != z) {
            this.j = z;
            b();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3048e.setColor(f.a(this.n, this.p));
        this.f3048e.setStyle(Paint.Style.FILL);
        this.f3048e.setFilterBitmap(a());
        canvas.drawPath(this.l, this.f3048e);
        if (this.f3050g != 0.0f) {
            this.f3048e.setColor(f.a(this.i, this.p));
            this.f3048e.setStyle(Paint.Style.STROKE);
            this.f3048e.setStrokeWidth(this.f3050g);
            canvas.drawPath(this.m, this.f3048e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return f.a(f.a(this.n, this.p));
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.p) {
            this.p = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
