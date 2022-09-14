package c.d.h.e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class a extends Drawable implements Drawable.Callback, t, s {

    /* renamed from: b  reason: collision with root package name */
    private t f3016b;

    /* renamed from: d  reason: collision with root package name */
    private final Drawable[] f3018d;

    /* renamed from: e  reason: collision with root package name */
    private final d[] f3019e;

    /* renamed from: c  reason: collision with root package name */
    private final e f3017c = new e();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f3020f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private boolean f3021g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3022h = false;
    private boolean i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.d.h.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0078a implements d {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3023b;

        C0078a(int i) {
            this.f3023b = i;
        }

        @Override // c.d.h.e.d
        public Drawable a() {
            return a.this.a(this.f3023b);
        }

        @Override // c.d.h.e.d
        public Drawable a(Drawable drawable) {
            return a.this.a(this.f3023b, drawable);
        }
    }

    public a(Drawable[] drawableArr) {
        int i = 0;
        c.d.d.d.i.a(drawableArr);
        this.f3018d = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f3018d;
            if (i >= drawableArr2.length) {
                this.f3019e = new d[drawableArr2.length];
                return;
            } else {
                f.a(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    private d c(int i) {
        return new C0078a(i);
    }

    public int a() {
        return this.f3018d.length;
    }

    public Drawable a(int i) {
        boolean z = true;
        c.d.d.d.i.a(i >= 0);
        if (i >= this.f3018d.length) {
            z = false;
        }
        c.d.d.d.i.a(z);
        return this.f3018d[i];
    }

    public Drawable a(int i, Drawable drawable) {
        boolean z = true;
        c.d.d.d.i.a(i >= 0);
        if (i >= this.f3018d.length) {
            z = false;
        }
        c.d.d.d.i.a(z);
        Drawable drawable2 = this.f3018d[i];
        if (drawable != drawable2) {
            if (drawable != null && this.i) {
                drawable.mutate();
            }
            f.a(this.f3018d[i], null, null);
            f.a(drawable, null, null);
            f.a(drawable, this.f3017c);
            f.a(drawable, this);
            f.a(drawable, this, this);
            this.f3022h = false;
            this.f3018d[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // c.d.h.e.t
    public void a(Matrix matrix) {
        t tVar = this.f3016b;
        if (tVar != null) {
            tVar.a(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // c.d.h.e.t
    public void a(RectF rectF) {
        t tVar = this.f3016b;
        if (tVar != null) {
            tVar.a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // c.d.h.e.s
    public void a(t tVar) {
        this.f3016b = tVar;
    }

    public d b(int i) {
        boolean z = true;
        c.d.d.d.i.a(i >= 0);
        if (i >= this.f3019e.length) {
            z = false;
        }
        c.d.d.d.i.a(z);
        d[] dVarArr = this.f3019e;
        if (dVarArr[i] == null) {
            dVarArr[i] = c(i);
        }
        return this.f3019e[i];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f3018d.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f3020f;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.getPadding(rect2);
                    rect.left = Math.max(rect.left, rect2.left);
                    rect.top = Math.max(rect.top, rect2.top);
                    rect.right = Math.max(rect.right, rect2.right);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f3022h) {
            this.f3021g = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f3018d;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f3021g;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f3021g = z2 | z;
                i++;
            }
            this.f3022h = true;
        }
        return this.f3021g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i >= drawableArr.length) {
                this.i = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.setLevel(i)) {
                    z = true;
                }
                i2++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null && drawable.setState(iArr)) {
                    z = true;
                }
                i++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3017c.a(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3017c.a(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f3017c.a(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f3017c.b(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f2, float f3) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f2, f3);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f3018d;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setVisible(z, z2);
                }
                i++;
            } else {
                return visible;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
