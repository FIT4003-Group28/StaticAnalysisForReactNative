package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: xt  reason: default package */
/* loaded from: classes7.dex */
final class xt extends xp {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public xt(SeekBar seekBar) {
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
            Drawable b = ks.b(drawable.mutate());
            this.c = b;
            if (this.f) {
                b.setTintList(this.d);
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

    @Override // defpackage.xp
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        aeq b = aeq.b(this.b.getContext(), attributeSet, sj.g, i, 0);
        SeekBar seekBar = this.b;
        od.a(seekBar, seekBar.getContext(), sj.g, attributeSet, b.b, i, 0);
        Drawable e = b.e(0);
        if (e != null) {
            this.b.setThumb(e);
        }
        Drawable d = b.d(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = d;
        if (d != null) {
            d.setCallback(this.b);
            ks.d(d, od.s(this.b));
            if (d.isStateful()) {
                d.setState(this.b.getDrawableState());
            }
            b();
        }
        this.b.invalidate();
        if (b.p(3)) {
            this.e = ze.d(b.i(3, -1), this.e);
            this.g = true;
        }
        if (b.p(2)) {
            this.d = b.j(2);
            this.f = true;
        }
        b.q();
        b();
    }
}
