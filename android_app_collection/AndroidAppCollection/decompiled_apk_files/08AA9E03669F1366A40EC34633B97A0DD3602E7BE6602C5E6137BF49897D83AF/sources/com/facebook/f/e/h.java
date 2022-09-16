package com.facebook.f.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: MatrixDrawable.java */
/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: a  reason: collision with root package name */
    private Matrix f2427a;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f2428c;

    /* renamed from: d  reason: collision with root package name */
    private int f2429d;
    private int e;

    public h(Drawable drawable, Matrix matrix) {
        super((Drawable) com.facebook.common.d.i.a(drawable));
        this.f2429d = 0;
        this.e = 0;
        this.f2427a = matrix;
    }

    @Override // com.facebook.f.e.g
    public Drawable b(Drawable drawable) {
        Drawable b2 = super.b(drawable);
        c();
        return b2;
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b();
        if (this.f2428c != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f2428c);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c();
    }

    private void b() {
        if (this.f2429d == getCurrent().getIntrinsicWidth() && this.e == getCurrent().getIntrinsicHeight()) {
            return;
        }
        c();
    }

    private void c() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f2429d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f2428c = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f2428c = this.f2427a;
    }

    @Override // com.facebook.f.e.g, com.facebook.f.e.q
    public void a(Matrix matrix) {
        super.a(matrix);
        if (this.f2428c != null) {
            matrix.preConcat(this.f2428c);
        }
    }
}
