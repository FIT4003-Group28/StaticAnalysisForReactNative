package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
/* loaded from: classes.dex */
public class b extends h implements Runnable, c {

    /* renamed from: e  reason: collision with root package name */
    private int f3025e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3026f;

    /* renamed from: g  reason: collision with root package name */
    float f3027g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3028h;

    public b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Drawable drawable, int i, boolean z) {
        super(drawable);
        c.d.d.d.i.a(drawable);
        this.f3027g = 0.0f;
        this.f3028h = false;
        this.f3025e = i;
        this.f3026f = z;
    }

    private int b() {
        return (int) ((20.0f / this.f3025e) * 360.0f);
    }

    private void c() {
        if (!this.f3028h) {
            this.f3028h = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f2 = this.f3027g;
        if (!this.f3026f) {
            f2 = 360.0f - f2;
        }
        canvas.rotate(f2, bounds.left + (i / 2), bounds.top + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        c();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3028h = false;
        this.f3027g += b();
        invalidateSelf();
    }
}
