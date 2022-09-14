package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
/* loaded from: classes.dex */
public class n extends h implements k {

    /* renamed from: e  reason: collision with root package name */
    b f3052e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f3053f;

    /* renamed from: g  reason: collision with root package name */
    private RectF f3054g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f3055h;
    private final float[] i;
    final float[] j;
    final Paint k;
    private boolean l;
    private float m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private boolean r;
    private final Path s;
    private final Path t;
    private final RectF u;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3056a = new int[b.values().length];

        static {
            try {
                f3056a[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3056a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Drawable drawable) {
        super(drawable);
        c.d.d.d.i.a(drawable);
        this.f3052e = b.OVERLAY_COLOR;
        this.f3053f = new RectF();
        this.i = new float[8];
        this.j = new float[8];
        this.k = new Paint(1);
        this.l = false;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0.0f;
        this.q = false;
        this.r = false;
        this.s = new Path();
        this.t = new Path();
        this.u = new RectF();
    }

    private void c() {
        float[] fArr;
        this.s.reset();
        this.t.reset();
        this.u.set(getBounds());
        RectF rectF = this.u;
        float f2 = this.p;
        rectF.inset(f2, f2);
        this.s.addRect(this.u, Path.Direction.CW);
        if (this.l) {
            this.s.addCircle(this.u.centerX(), this.u.centerY(), Math.min(this.u.width(), this.u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.s.addRoundRect(this.u, this.i, Path.Direction.CW);
        }
        RectF rectF2 = this.u;
        float f3 = this.p;
        rectF2.inset(-f3, -f3);
        RectF rectF3 = this.u;
        float f4 = this.m;
        rectF3.inset(f4 / 2.0f, f4 / 2.0f);
        if (this.l) {
            this.t.addCircle(this.u.centerX(), this.u.centerY(), Math.min(this.u.width(), this.u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.j;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.i[i] + this.p) - (this.m / 2.0f);
                i++;
            }
            this.t.addRoundRect(this.u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.u;
        float f5 = this.m;
        rectF4.inset((-f5) / 2.0f, (-f5) / 2.0f);
    }

    @Override // c.d.h.e.k
    public void a(float f2) {
        this.p = f2;
        c();
        invalidateSelf();
    }

    public void a(int i) {
        this.o = i;
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void a(int i, float f2) {
        this.n = i;
        this.m = f2;
        c();
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void a(boolean z) {
        this.l = z;
        c();
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.i, 0.0f);
        } else {
            c.d.d.d.i.a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.i, 0, 8);
        }
        c();
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void b(float f2) {
        Arrays.fill(this.i, f2);
        c();
        invalidateSelf();
    }

    @Override // c.d.h.e.k
    public void b(boolean z) {
        if (this.r != z) {
            this.r = z;
            invalidateSelf();
        }
    }

    public boolean b() {
        return this.r;
    }

    @Override // c.d.h.e.k
    public void c(boolean z) {
        this.q = z;
        c();
        invalidateSelf();
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3053f.set(getBounds());
        int i = a.f3056a[this.f3052e.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.s);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.q) {
                RectF rectF = this.f3054g;
                if (rectF == null) {
                    this.f3054g = new RectF(this.f3053f);
                    this.f3055h = new Matrix();
                } else {
                    rectF.set(this.f3053f);
                }
                RectF rectF2 = this.f3054g;
                float f2 = this.m;
                rectF2.inset(f2, f2);
                this.f3055h.setRectToRect(this.f3053f, this.f3054g, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f3053f);
                canvas.concat(this.f3055h);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.k.setStyle(Paint.Style.FILL);
            this.k.setColor(this.o);
            this.k.setStrokeWidth(0.0f);
            this.k.setFilterBitmap(b());
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.s, this.k);
            if (this.l) {
                float width = ((this.f3053f.width() - this.f3053f.height()) + this.m) / 2.0f;
                float height = ((this.f3053f.height() - this.f3053f.width()) + this.m) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f3053f;
                    float f3 = rectF3.left;
                    canvas.drawRect(f3, rectF3.top, f3 + width, rectF3.bottom, this.k);
                    RectF rectF4 = this.f3053f;
                    float f4 = rectF4.right;
                    canvas.drawRect(f4 - width, rectF4.top, f4, rectF4.bottom, this.k);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f3053f;
                    float f5 = rectF5.left;
                    float f6 = rectF5.top;
                    canvas.drawRect(f5, f6, rectF5.right, f6 + height, this.k);
                    RectF rectF6 = this.f3053f;
                    float f7 = rectF6.left;
                    float f8 = rectF6.bottom;
                    canvas.drawRect(f7, f8 - height, rectF6.right, f8, this.k);
                }
            }
        }
        if (this.n != 0) {
            this.k.setStyle(Paint.Style.STROKE);
            this.k.setColor(this.n);
            this.k.setStrokeWidth(this.m);
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.t, this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c();
    }
}
