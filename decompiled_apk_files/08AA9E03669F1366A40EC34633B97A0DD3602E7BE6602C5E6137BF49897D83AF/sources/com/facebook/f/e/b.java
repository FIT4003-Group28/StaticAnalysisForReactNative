package com.facebook.f.e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: AutoRotateDrawable.java */
/* loaded from: classes.dex */
public class b extends g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    float f2412a;

    /* renamed from: c  reason: collision with root package name */
    private int f2413c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2414d;
    private boolean e;

    public b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    public b(Drawable drawable, int i, boolean z) {
        super((Drawable) com.facebook.common.d.i.a(drawable));
        this.f2412a = BitmapDescriptorFactory.HUE_RED;
        this.e = false;
        this.f2413c = i;
        this.f2414d = z;
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f2412a;
        if (!this.f2414d) {
            f = 360.0f - this.f2412a;
        }
        canvas.rotate(f, bounds.left + (i / 2), bounds.top + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        b();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.e = false;
        this.f2412a += c();
        invalidateSelf();
    }

    private void b() {
        if (!this.e) {
            this.e = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    private int c() {
        return (int) ((20.0f / this.f2413c) * 360.0f);
    }
}
