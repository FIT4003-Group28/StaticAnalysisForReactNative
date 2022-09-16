package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: um  reason: default package */
/* loaded from: classes4.dex */
public final class um extends ui {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public um(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void b() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (!this.f && !this.g) {
                return;
            }
            Drawable l = iy.l(drawable.mutate());
            this.c = l;
            if (this.f) {
                l.setTintList(this.d);
            }
            if (this.g) {
                this.c.setTintMode(this.e);
            }
            if (!this.c.isStateful()) {
                return;
            }
            this.c.setState(this.b.getDrawableState());
        }
    }

    @Override // defpackage.ui
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        aad l = aad.l(this.b.getContext(), attributeSet, pm.g, i, 0);
        SeekBar seekBar = this.b;
        lj.L(seekBar, seekBar.getContext(), pm.g, attributeSet, l.b, i, 0);
        Drawable i2 = l.i(0);
        if (i2 != null) {
            this.b.setThumb(i2);
        }
        Drawable h = l.h(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = h;
        if (h != null) {
            h.setCallback(this.b);
            iy.n(h, lj.e(this.b));
            if (h.isStateful()) {
                h.setState(this.b.getDrawableState());
            }
            b();
        }
        this.b.invalidate();
        if (l.q(3)) {
            this.e = vs.a(l.c(3, -1), this.e);
            this.g = true;
        }
        if (l.q(2)) {
            this.d = l.g(2);
            this.f = true;
        }
        l.o();
        b();
    }
}
