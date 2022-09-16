package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class i extends h {

    /* renamed from: e  reason: collision with root package name */
    private Matrix f3037e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f3038f;

    /* renamed from: g  reason: collision with root package name */
    private int f3039g;

    /* renamed from: h  reason: collision with root package name */
    private int f3040h;

    private void b() {
        Matrix matrix;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f3039g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f3040h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            matrix = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            matrix = this.f3037e;
        }
        this.f3038f = matrix;
    }

    private void c() {
        if (this.f3039g == getCurrent().getIntrinsicWidth() && this.f3040h == getCurrent().getIntrinsicHeight()) {
            return;
        }
        b();
    }

    @Override // c.d.h.e.h, c.d.h.e.t
    public void a(Matrix matrix) {
        super.a(matrix);
        Matrix matrix2 = this.f3038f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // c.d.h.e.h
    public Drawable b(Drawable drawable) {
        Drawable b2 = super.b(drawable);
        b();
        return b2;
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        c();
        if (this.f3038f == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f3038f);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }
}
