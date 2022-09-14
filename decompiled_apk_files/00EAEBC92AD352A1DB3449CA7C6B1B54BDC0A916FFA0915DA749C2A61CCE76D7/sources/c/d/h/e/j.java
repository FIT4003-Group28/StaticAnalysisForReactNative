package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: e  reason: collision with root package name */
    final Matrix f3041e;

    /* renamed from: f  reason: collision with root package name */
    private int f3042f;

    /* renamed from: g  reason: collision with root package name */
    private int f3043g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f3044h;
    private final RectF i;

    public j(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f3044h = new Matrix();
        this.i = new RectF();
        this.f3041e = new Matrix();
        this.f3042f = i - (i % 90);
        this.f3043g = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    @Override // c.d.h.e.h, c.d.h.e.t
    public void a(Matrix matrix) {
        b(matrix);
        if (!this.f3041e.isIdentity()) {
            matrix.preConcat(this.f3041e);
        }
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f3042f <= 0 && ((i = this.f3043g) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f3041e);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.f3043g;
        return (i == 5 || i == 7 || this.f3042f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f3043g;
        return (i == 5 || i == 7 || this.f3042f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        if (this.f3042f <= 0 && ((i = this.f3043g) == 0 || i == 1)) {
            current.setBounds(rect);
            return;
        }
        int i2 = this.f3043g;
        if (i2 == 2) {
            this.f3041e.setScale(-1.0f, 1.0f);
        } else if (i2 == 7) {
            this.f3041e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f3041e.postScale(-1.0f, 1.0f);
        } else if (i2 == 4) {
            this.f3041e.setScale(1.0f, -1.0f);
        } else if (i2 != 5) {
            this.f3041e.setRotate(this.f3042f, rect.centerX(), rect.centerY());
        } else {
            this.f3041e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f3041e.postScale(1.0f, -1.0f);
        }
        this.f3044h.reset();
        this.f3041e.invert(this.f3044h);
        this.i.set(rect);
        this.f3044h.mapRect(this.i);
        RectF rectF = this.i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
