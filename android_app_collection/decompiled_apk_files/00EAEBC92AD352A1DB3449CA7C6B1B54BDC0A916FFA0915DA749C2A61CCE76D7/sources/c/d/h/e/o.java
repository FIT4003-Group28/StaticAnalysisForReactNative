package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class o extends Drawable implements k, s {
    private t D;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f3060b;
    float[] l;
    RectF q;
    Matrix w;
    Matrix x;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f3061c = false;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f3062d = false;

    /* renamed from: e  reason: collision with root package name */
    protected float f3063e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    protected final Path f3064f = new Path();

    /* renamed from: g  reason: collision with root package name */
    protected boolean f3065g = true;

    /* renamed from: h  reason: collision with root package name */
    protected int f3066h = 0;
    protected final Path i = new Path();
    private final float[] j = new float[8];
    final float[] k = new float[8];
    final RectF m = new RectF();
    final RectF n = new RectF();
    final RectF o = new RectF();
    final RectF p = new RectF();
    final Matrix r = new Matrix();
    final Matrix s = new Matrix();
    final Matrix t = new Matrix();
    final Matrix u = new Matrix();
    final Matrix v = new Matrix();
    final Matrix y = new Matrix();
    private float z = 0.0f;
    private boolean A = false;
    private boolean B = false;
    private boolean C = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Drawable drawable) {
        this.f3060b = drawable;
    }

    @Override // c.d.h.e.k
    public void a(float f2) {
        if (this.z != f2) {
            this.z = f2;
            this.C = true;
            invalidateSelf();
        }
    }

    @Override // c.d.h.e.k
    public void a(int i, float f2) {
        if (this.f3066h == i && this.f3063e == f2) {
            return;
        }
        this.f3066h = i;
        this.f3063e = f2;
        this.C = true;
        invalidateSelf();
    }

    @Override // c.d.h.e.s
    public void a(t tVar) {
        this.D = tVar;
    }

    @Override // c.d.h.e.k
    public void a(boolean z) {
        this.f3061c = z;
        this.C = true;
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.j, 0.0f);
            this.f3062d = false;
        } else {
            c.d.d.d.i.a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.j, 0, 8);
            this.f3062d = false;
            for (int i = 0; i < 8; i++) {
                this.f3062d |= fArr[i] > 0.0f;
            }
        }
        this.C = true;
        invalidateSelf();
    }

    public boolean a() {
        return this.B;
    }

    @Override // c.d.h.e.k
    public void b(float f2) {
        boolean z = false;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        c.d.d.d.i.b(i >= 0);
        Arrays.fill(this.j, f2);
        if (i != 0) {
            z = true;
        }
        this.f3062d = z;
        this.C = true;
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void b(boolean z) {
        if (this.B != z) {
            this.B = z;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f3061c || this.f3062d || this.f3063e > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        float[] fArr;
        if (this.C) {
            this.i.reset();
            RectF rectF = this.m;
            float f2 = this.f3063e;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.f3061c) {
                this.i.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.k;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.j[i] + this.z) - (this.f3063e / 2.0f);
                    i++;
                }
                this.i.addRoundRect(this.m, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.m;
            float f3 = this.f3063e;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.f3064f.reset();
            float f4 = this.z + (this.A ? this.f3063e : 0.0f);
            this.m.inset(f4, f4);
            if (this.f3061c) {
                this.f3064f.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
            } else if (this.A) {
                if (this.l == null) {
                    this.l = new float[8];
                }
                for (int i2 = 0; i2 < this.k.length; i2++) {
                    this.l[i2] = this.j[i2] - this.f3063e;
                }
                this.f3064f.addRoundRect(this.m, this.l, Path.Direction.CW);
            } else {
                this.f3064f.addRoundRect(this.m, this.j, Path.Direction.CW);
            }
            float f5 = -f4;
            this.m.inset(f5, f5);
            this.f3064f.setFillType(Path.FillType.WINDING);
            this.C = false;
        }
    }

    @Override // c.d.h.e.k
    public void c(boolean z) {
        if (this.A != z) {
            this.A = z;
            this.C = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f3060b.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        Matrix matrix;
        t tVar = this.D;
        if (tVar != null) {
            tVar.a(this.t);
            this.D.a(this.m);
        } else {
            this.t.reset();
            this.m.set(getBounds());
        }
        this.o.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.p.set(this.f3060b.getBounds());
        this.r.setRectToRect(this.o, this.p, Matrix.ScaleToFit.FILL);
        if (this.A) {
            RectF rectF = this.q;
            if (rectF == null) {
                this.q = new RectF(this.m);
            } else {
                rectF.set(this.m);
            }
            RectF rectF2 = this.q;
            float f2 = this.f3063e;
            rectF2.inset(f2, f2);
            if (this.w == null) {
                this.w = new Matrix();
            }
            this.w.setRectToRect(this.m, this.q, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.w;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.t.equals(this.u) || !this.r.equals(this.s) || ((matrix = this.w) != null && !matrix.equals(this.x))) {
            this.f3065g = true;
            this.t.invert(this.v);
            this.y.set(this.t);
            if (this.A) {
                this.y.postConcat(this.w);
            }
            this.y.preConcat(this.r);
            this.u.set(this.t);
            this.s.set(this.r);
            if (this.A) {
                Matrix matrix3 = this.x;
                if (matrix3 == null) {
                    this.x = new Matrix(this.w);
                } else {
                    matrix3.set(this.w);
                }
            } else {
                Matrix matrix4 = this.x;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.m.equals(this.n)) {
            this.C = true;
            this.n.set(this.m);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("RoundedDrawable#draw");
        }
        this.f3060b.draw(canvas);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3060b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f3060b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3060b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3060b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3060b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f3060b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3060b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f3060b.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3060b.setColorFilter(colorFilter);
    }
}
