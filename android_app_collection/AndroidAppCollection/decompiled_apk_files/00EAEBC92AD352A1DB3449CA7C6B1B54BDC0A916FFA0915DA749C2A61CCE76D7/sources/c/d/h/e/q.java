package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c.d.h.e.r;
/* loaded from: classes.dex */
public class q extends h {

    /* renamed from: e  reason: collision with root package name */
    r.b f3067e;

    /* renamed from: f  reason: collision with root package name */
    Object f3068f;

    /* renamed from: g  reason: collision with root package name */
    PointF f3069g;

    /* renamed from: h  reason: collision with root package name */
    int f3070h;
    int i;
    Matrix j;
    private Matrix k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Drawable drawable, r.b bVar) {
        super(drawable);
        c.d.d.d.i.a(drawable);
        this.f3069g = null;
        this.f3070h = 0;
        this.i = 0;
        this.k = new Matrix();
        this.f3067e = bVar;
    }

    private void d() {
        boolean z;
        r.b bVar = this.f3067e;
        boolean z2 = true;
        if (bVar instanceof r.l) {
            Object state = ((r.l) bVar).getState();
            z = state == null || !state.equals(this.f3068f);
            this.f3068f = state;
        } else {
            z = false;
        }
        if (this.f3070h == getCurrent().getIntrinsicWidth() && this.i == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            b();
        }
    }

    @Override // c.d.h.e.h, c.d.h.e.t
    public void a(Matrix matrix) {
        b(matrix);
        d();
        Matrix matrix2 = this.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public void a(PointF pointF) {
        if (c.d.d.d.h.a(this.f3069g, pointF)) {
            return;
        }
        if (this.f3069g == null) {
            this.f3069g = new PointF();
        }
        this.f3069g.set(pointF);
        b();
        invalidateSelf();
    }

    public void a(r.b bVar) {
        if (c.d.d.d.h.a(this.f3067e, bVar)) {
            return;
        }
        this.f3067e = bVar;
        this.f3068f = null;
        b();
        invalidateSelf();
    }

    @Override // c.d.h.e.h
    public Drawable b(Drawable drawable) {
        Drawable b2 = super.b(drawable);
        b();
        return b2;
    }

    void b() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f3070h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.j = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.j = null;
        } else if (this.f3067e == r.b.f3071a) {
            current.setBounds(bounds);
            this.j = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            r.b bVar = this.f3067e;
            Matrix matrix = this.k;
            PointF pointF = this.f3069g;
            float f2 = pointF != null ? pointF.x : 0.5f;
            PointF pointF2 = this.f3069g;
            bVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f2, pointF2 != null ? pointF2.y : 0.5f);
            this.j = this.k;
        }
    }

    public r.b c() {
        return this.f3067e;
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        d();
        if (this.j == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.j);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        b();
    }
}
