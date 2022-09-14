package com.facebook.f.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.f.e.o;
/* compiled from: ScaleTypeDrawable.java */
/* loaded from: classes.dex */
public class n extends g {

    /* renamed from: a  reason: collision with root package name */
    o.b f2448a;

    /* renamed from: c  reason: collision with root package name */
    Object f2449c;

    /* renamed from: d  reason: collision with root package name */
    PointF f2450d;
    int e;
    int f;
    Matrix g;
    private Matrix h;

    public n(Drawable drawable, o.b bVar) {
        super((Drawable) com.facebook.common.d.i.a(drawable));
        this.f2450d = null;
        this.e = 0;
        this.f = 0;
        this.h = new Matrix();
        this.f2448a = bVar;
    }

    @Override // com.facebook.f.e.g
    public Drawable b(Drawable drawable) {
        Drawable b2 = super.b(drawable);
        c();
        return b2;
    }

    public o.b b() {
        return this.f2448a;
    }

    public void a(o.b bVar) {
        if (com.facebook.common.d.h.a(this.f2448a, bVar)) {
            return;
        }
        this.f2448a = bVar;
        this.f2449c = null;
        c();
        invalidateSelf();
    }

    public void a(PointF pointF) {
        if (com.facebook.common.d.h.a(this.f2450d, pointF)) {
            return;
        }
        if (this.f2450d == null) {
            this.f2450d = new PointF();
        }
        this.f2450d.set(pointF);
        c();
        invalidateSelf();
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        d();
        if (this.g != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.g);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        c();
    }

    private void d() {
        boolean z;
        boolean z2 = true;
        if (this.f2448a instanceof o.k) {
            Object a2 = ((o.k) this.f2448a).a();
            z = a2 == null || !a2.equals(this.f2449c);
            this.f2449c = a2;
        } else {
            z = false;
        }
        if (this.e == getCurrent().getIntrinsicWidth() && this.f == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            c();
        }
    }

    void c() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.e = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.g = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.g = null;
        } else if (this.f2448a == o.b.f2451a) {
            current.setBounds(bounds);
            this.g = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f2448a.a(this.h, bounds, intrinsicWidth, intrinsicHeight, this.f2450d != null ? this.f2450d.x : 0.5f, this.f2450d != null ? this.f2450d.y : 0.5f);
            this.g = this.h;
        }
    }

    @Override // com.facebook.f.e.g, com.facebook.f.e.q
    public void a(Matrix matrix) {
        b(matrix);
        d();
        if (this.g != null) {
            matrix.preConcat(this.g);
        }
    }
}
