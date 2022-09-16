package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: fqn  reason: default package */
/* loaded from: classes3.dex */
public final class fqn extends Drawable implements Drawable.Callback, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    private static final TimeInterpolator e;
    public final ValueAnimator a;
    public fqm b;
    public fqm c;
    public fqm d;
    private final HashSet f;

    static {
        new ColorDrawable(0);
        e = new fqy();
    }

    public fqn(fqm fqmVar, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
        this.a = ofInt;
        ofInt.setIntValues(PrivateKeyType.INVALID, 0);
        ofInt.setDuration(i);
        ofInt.setStartDelay(1L);
        ofInt.setInterpolator(e);
        ofInt.addUpdateListener(this);
        ofInt.addListener(this);
        this.f = new HashSet();
        ylr.c();
        if (ofInt.isStarted()) {
            ofInt.end();
        }
        i(null);
        h(fqmVar);
        e(null);
        c();
        c();
    }

    private final void h(fqm fqmVar) {
        fqmVar.getClass();
        this.b = fqmVar;
        fqmVar.a.setCallback(this);
        fqmVar.a.setBounds(getBounds());
        fqmVar.a.setAlpha(PrivateKeyType.INVALID);
    }

    private final void i(fqm fqmVar) {
        this.c = fqmVar;
        if (fqmVar != null) {
            fqmVar.a.setCallback(this);
            fqmVar.a.setBounds(getBounds());
            fqmVar.a.setAlpha(PrivateKeyType.INVALID);
        }
    }

    private final boolean j() {
        return (this.c == null || this.b == null || this.d != null) ? false : true;
    }

    private final boolean k() {
        return this.c == null && this.b != null && this.d == null;
    }

    private static final void l(fql fqlVar) {
        if (fqlVar != null) {
            fqlVar.a();
        }
    }

    public final fqm a() {
        fqm fqmVar = this.d;
        return fqmVar != null ? fqmVar : this.b;
    }

    public final void b(fql fqlVar) {
        this.f.add(fqlVar);
    }

    public final void c() {
        boolean z = true;
        aqxo.z(this.c == null, "previousDrawableHolder must be null in static state.");
        aqxo.z(this.b != null, "currentDrawableHolder must not be null in static state.");
        if (this.d != null) {
            z = false;
        }
        aqxo.z(z, "nextDrawableHolder must be null in static state.");
        aqxo.y(k());
        boolean f = f();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("All drawables must be unique. Previous ");
        sb.append(valueOf);
        sb.append(", current ");
        sb.append(valueOf2);
        sb.append(", next ");
        sb.append(valueOf3);
        aqxo.z(f, sb.toString());
    }

    public final void d(fqm fqmVar, fql fqlVar) {
        String.valueOf(String.valueOf(fqmVar)).length();
        if (k()) {
            l(fqlVar);
            e(null);
        } else if (g()) {
            this.a.cancel();
            l(fqlVar);
        } else if (j()) {
            b(fqlVar);
        } else {
            throw new RuntimeException("In a bad state.");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.b.a.draw(canvas);
        fqm fqmVar = this.c;
        if (fqmVar != null) {
            fqmVar.a.draw(canvas);
        }
    }

    public final void e(fqm fqmVar) {
        this.d = fqmVar;
        if (fqmVar != null) {
            fqmVar.a.setCallback(this);
            fqmVar.a.setBounds(getBounds());
            fqmVar.a.setAlpha(PrivateKeyType.INVALID);
        }
    }

    public final boolean f() {
        fqm fqmVar = this.c;
        Drawable drawable = null;
        Drawable drawable2 = fqmVar != null ? fqmVar.a : null;
        fqm fqmVar2 = this.b;
        Drawable drawable3 = fqmVar2 != null ? fqmVar2.a : null;
        fqm fqmVar3 = this.d;
        if (fqmVar3 != null) {
            drawable = fqmVar3.a;
        }
        if (drawable2 == null || drawable3 == null || drawable2 != drawable3) {
            if (drawable2 != null && drawable != null && drawable2 == drawable) {
                return false;
            }
            return drawable3 == null || drawable == null || drawable3 != drawable;
        }
        return false;
    }

    public final boolean g() {
        return (this.c != null || this.b == null || this.d == null) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return a().a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return a().a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRect(getBounds());
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        h(this.c);
        i(null);
        e(null);
        c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i(null);
        e(null);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            l((fql) it.next());
        }
        this.f.clear();
        c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        throw new UnsupportedOperationException("crossFadeAnimator should never repeat.");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        i(this.b);
        h(this.d);
        e(null);
        boolean z = true;
        aqxo.z(this.c != null, "previousDrawableHolder must not be null in static state.");
        aqxo.z(this.b != null, "currentDrawableHolder must not be null in static state.");
        if (this.d != null) {
            z = false;
        }
        aqxo.z(z, "nextDrawableHolder must be null in static state.");
        aqxo.y(j());
        boolean f = f();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("All drawables must be unique. Previous ");
        sb.append(valueOf);
        sb.append(", current ");
        sb.append(valueOf2);
        sb.append(", next ");
        sb.append(valueOf3);
        aqxo.z(f, sb.toString());
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        fqm fqmVar = this.c;
        if (fqmVar != null) {
            fqmVar.a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            invalidateSelf();
        }
        fqm a = a();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        fqm fqmVar2 = this.c;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            fql fqlVar = (fql) it.next();
            if (fqlVar != null) {
                fqlVar.b(animatedFraction, fqmVar2, a);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.b.a.setBounds(rect);
        fqm fqmVar = this.c;
        if (fqmVar != null) {
            fqmVar.a.setBounds(rect);
        }
        fqm fqmVar2 = this.d;
        if (fqmVar2 != null) {
            fqmVar2.a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Set alpha on the inner drawables instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Set color filter on the inner drawables instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!k() || !this.b.a.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
