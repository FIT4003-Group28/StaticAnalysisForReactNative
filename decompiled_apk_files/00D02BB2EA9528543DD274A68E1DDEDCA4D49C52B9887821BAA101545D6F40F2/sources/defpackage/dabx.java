package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dabx  reason: default package */
/* loaded from: classes5.dex */
public abstract class dabx extends Drawable implements Animatable {
    private static final Property<dabx, Float> k = new dabw(Float.class);
    private ValueAnimator a;
    private ValueAnimator b;
    final Context c;
    final dabg d;
    public List<azu> f;
    public azu g;
    public int i;
    private float j;
    final Paint h = new Paint();
    public dabh e = new dabh();

    public dabx(Context context, dabg dabgVar) {
        this.c = context;
        this.d = dabgVar;
        setAlpha(255);
    }

    public boolean a(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (isVisible() || z) {
            if (this.a == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, k, 0.0f, 1.0f);
                this.a = ofFloat;
                ofFloat.setDuration(500L);
                this.a.setInterpolator(czum.b);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
                }
                this.a = valueAnimator;
                valueAnimator.addListener(new dabu(this));
            }
            if (this.b == null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, k, 1.0f, 0.0f);
                this.b = ofFloat2;
                ofFloat2.setDuration(500L);
                this.b.setInterpolator(czum.b);
                ValueAnimator valueAnimator2 = this.b;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
                }
                this.b = valueAnimator2;
                valueAnimator2.addListener(new dabv(this));
            }
            if (z3) {
                if ((z ? this.a : this.b).isRunning()) {
                    return false;
                }
            }
            ValueAnimator valueAnimator3 = z ? this.a : this.b;
            if (!z || super.setVisible(true, false)) {
                z4 = true;
            }
            if (!(z ? this.d.a() : this.d.b()) || !z3) {
                valueAnimator3.end();
                return z4;
            }
            if (z2 || !valueAnimator3.isPaused()) {
                valueAnimator3.start();
            } else {
                valueAnimator3.resume();
            }
            return z4;
        }
        return false;
    }

    public final void c(azu azuVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (!this.f.contains(azuVar)) {
            this.f.add(azuVar);
        }
    }

    public final boolean d() {
        ValueAnimator valueAnimator = this.a;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean e() {
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float f() {
        if (this.d.a() || this.d.b()) {
            return this.j;
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void i() {
        a(false, false, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return d() || e();
    }

    public final void j(azu azuVar) {
        List<azu> list = this.f;
        if (list == null || !list.contains(azuVar)) {
            return;
        }
        this.f.remove(azuVar);
        if (!this.f.isEmpty()) {
            return;
        }
        this.f = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return a(z, z2, dabh.a(this.c.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisible(true, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisible(false, true);
    }
}
