package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1386d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1387e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1388f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1389g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1390h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(SeekBar seekBar) {
        super(seekBar);
        this.f1388f = null;
        this.f1389g = null;
        this.f1390h = false;
        this.i = false;
        this.f1386d = seekBar;
    }

    private void d() {
        if (this.f1387e != null) {
            if (!this.f1390h && !this.i) {
                return;
            }
            this.f1387e = androidx.core.graphics.drawable.a.i(this.f1387e.mutate());
            if (this.f1390h) {
                androidx.core.graphics.drawable.a.a(this.f1387e, this.f1388f);
            }
            if (this.i) {
                androidx.core.graphics.drawable.a.a(this.f1387e, this.f1389g);
            }
            if (!this.f1387e.isStateful()) {
                return;
            }
            this.f1387e.setState(this.f1386d.getDrawableState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Canvas canvas) {
        if (this.f1387e != null) {
            int max = this.f1386d.getMax();
            int i = 1;
            if (max <= 1) {
                return;
            }
            int intrinsicWidth = this.f1387e.getIntrinsicWidth();
            int intrinsicHeight = this.f1387e.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i = intrinsicHeight / 2;
            }
            this.f1387e.setBounds(-i2, -i, i2, i);
            float width = ((this.f1386d.getWidth() - this.f1386d.getPaddingLeft()) - this.f1386d.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.f1386d.getPaddingLeft(), this.f1386d.getHeight() / 2);
            for (int i3 = 0; i3 <= max; i3++) {
                this.f1387e.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    void a(Drawable drawable) {
        Drawable drawable2 = this.f1387e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1387e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1386d);
            androidx.core.graphics.drawable.a.a(drawable, a.g.m.v.p(this.f1386d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1386d.getDrawableState());
            }
            d();
        }
        this.f1386d.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.r
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        x0 a2 = x0.a(this.f1386d.getContext(), attributeSet, a.a.j.AppCompatSeekBar, i, 0);
        Drawable c2 = a2.c(a.a.j.AppCompatSeekBar_android_thumb);
        if (c2 != null) {
            this.f1386d.setThumb(c2);
        }
        a(a2.b(a.a.j.AppCompatSeekBar_tickMark));
        if (a2.g(a.a.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1389g = e0.a(a2.d(a.a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1389g);
            this.i = true;
        }
        if (a2.g(a.a.j.AppCompatSeekBar_tickMarkTint)) {
            this.f1388f = a2.a(a.a.j.AppCompatSeekBar_tickMarkTint);
            this.f1390h = true;
        }
        a2.a();
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f1387e;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(this.f1386d.getDrawableState())) {
            return;
        }
        this.f1386d.invalidateDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f1387e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
