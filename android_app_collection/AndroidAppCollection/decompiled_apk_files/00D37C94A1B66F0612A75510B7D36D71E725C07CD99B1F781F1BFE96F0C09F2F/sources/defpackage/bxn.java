package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bxn  reason: default package */
/* loaded from: classes2.dex */
public final class bxn extends Drawable implements Drawable.Callback, Animatable {
    public bwx a;
    public final cdb b;
    public float c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public bzp g;
    public String h;
    public bzo i;
    public boolean j;
    public cbe k;
    public boolean l;
    private final Matrix m = new Matrix();
    private final ValueAnimator.AnimatorUpdateListener n;
    private int o;
    private boolean p;

    public bxn() {
        cdb cdbVar = new cdb();
        this.b = cdbVar;
        this.c = 1.0f;
        this.d = true;
        this.e = false;
        this.f = new ArrayList();
        bxk bxkVar = new bxk(this);
        this.n = bxkVar;
        this.o = PrivateKeyType.INVALID;
        this.l = true;
        this.p = false;
        cdbVar.addUpdateListener(bxkVar);
    }

    private final boolean t() {
        return this.d || this.e;
    }

    private static final float u(Rect rect) {
        return rect.width() / rect.height();
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        this.p = false;
        bwx bwxVar = this.a;
        int i = -1;
        if (bwxVar == null || getBounds().isEmpty() || u(getBounds()) == u(bwxVar.g)) {
            if (this.k != null) {
                float f3 = this.c;
                float min = Math.min(canvas.getWidth() / this.a.g.width(), canvas.getHeight() / this.a.g.height());
                if (f3 > min) {
                    f = this.c / min;
                } else {
                    min = f3;
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width = this.a.g.width() / 2.0f;
                    float height = this.a.g.height() / 2.0f;
                    float f4 = width * min;
                    float f5 = height * min;
                    float f6 = this.c;
                    canvas.translate((width * f6) - f4, (f6 * height) - f5);
                    canvas.scale(f, f, f4, f5);
                }
                this.m.reset();
                this.m.preScale(min, min);
                this.k.b(canvas, this.m, this.o);
                if (i > 0) {
                    canvas.restoreToCount(i);
                }
            }
        } else if (this.k != null) {
            Rect bounds = getBounds();
            float width2 = bounds.width() / this.a.g.width();
            float height2 = bounds.height() / this.a.g.height();
            if (this.l) {
                float min2 = Math.min(width2, height2);
                if (min2 < 1.0f) {
                    f2 = 1.0f / min2;
                    width2 /= f2;
                    height2 /= f2;
                } else {
                    f2 = 1.0f;
                }
                if (f2 > 1.0f) {
                    i = canvas.save();
                    float width3 = bounds.width() / 2.0f;
                    float height3 = bounds.height() / 2.0f;
                    float f7 = width3 * min2;
                    float f8 = min2 * height3;
                    canvas.translate(width3 - f7, height3 - f8);
                    canvas.scale(f2, f2, f7, f8);
                }
            }
            this.m.reset();
            this.m.preScale(width2, height2);
            this.k.b(canvas, this.m, this.o);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
        bwr.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final void f(bzu bzuVar, Object obj, cdj cdjVar) {
        List list;
        if (this.k == null) {
            this.f.add(new bxj(this, bzuVar, obj, cdjVar));
            return;
        }
        if (bzuVar == bzu.a) {
            this.k.a(obj, cdjVar);
        } else {
            bzv bzvVar = bzuVar.b;
            if (bzvVar == null) {
                if (this.k == null) {
                    cda.a("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.k.e(bzuVar, 0, arrayList, new bzu(new String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((bzu) list.get(i)).b.a(obj, cdjVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            } else {
                bzvVar.a(obj, cdjVar);
            }
        }
        invalidateSelf();
        if (obj != bxs.C) {
            return;
        }
        o(c());
    }

    public final void g() {
        cbg a = ccg.a(this.a);
        bwx bwxVar = this.a;
        this.k = new cbe(this, a, bwxVar.f, bwxVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        bwx bwxVar = this.a;
        if (bwxVar == null) {
            return -1;
        }
        return (int) (bwxVar.g.height() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        bwx bwxVar = this.a;
        if (bwxVar == null) {
            return -1;
        }
        return (int) (bwxVar.g.width() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        cdb cdbVar = this.b;
        if (cdbVar.i) {
            cdbVar.cancel();
        }
        this.a = null;
        this.k = null;
        this.g = null;
        cdb cdbVar2 = this.b;
        cdbVar2.h = null;
        cdbVar2.f = -2.14748365E9f;
        cdbVar2.g = 2.14748365E9f;
        invalidateSelf();
    }

    public final void i() {
        this.f.clear();
        this.b.h();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.p) {
            return;
        }
        this.p = true;
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return q();
    }

    public final void j() {
        if (this.k == null) {
            this.f.add(new bxl(this, 1));
            return;
        }
        if (t() || e() == 0) {
            cdb cdbVar = this.b;
            cdbVar.i = true;
            boolean m = cdbVar.m();
            for (Animator.AnimatorListener animatorListener : cdbVar.a) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(cdbVar, m);
                } else {
                    animatorListener.onAnimationStart(cdbVar);
                }
            }
            cdbVar.k((int) (cdbVar.m() ? cdbVar.d() : cdbVar.e()));
            cdbVar.c = 0L;
            cdbVar.e = 0;
            cdbVar.g();
        }
        if (t()) {
            return;
        }
        l((int) (d() < 0.0f ? b() : a()));
        this.b.f();
    }

    public final void k() {
        float e;
        if (this.k == null) {
            this.f.add(new bxl(this));
            return;
        }
        if (t() || e() == 0) {
            cdb cdbVar = this.b;
            cdbVar.i = true;
            cdbVar.g();
            cdbVar.c = 0L;
            if (cdbVar.m() && cdbVar.d == cdbVar.e()) {
                e = cdbVar.d();
            } else if (!cdbVar.m() && cdbVar.d == cdbVar.d()) {
                e = cdbVar.e();
            }
            cdbVar.d = e;
        }
        if (t()) {
            return;
        }
        l((int) (d() < 0.0f ? b() : a()));
        this.b.f();
    }

    public final void l(int i) {
        if (this.a == null) {
            this.f.add(new bxh(this, i));
        } else {
            this.b.k(i);
        }
    }

    public final void m(int i, int i2) {
        if (this.a == null) {
            this.f.add(new bxf(this, i, i2));
        } else {
            this.b.l(i, i2 + 0.99f);
        }
    }

    public final void n(float f, float f2) {
        bwx bwxVar = this.a;
        if (bwxVar == null) {
            this.f.add(new bxg(this, f, f2));
            return;
        }
        float c = cdc.c(bwxVar.h, bwxVar.i, f);
        bwx bwxVar2 = this.a;
        m((int) c, (int) cdc.c(bwxVar2.h, bwxVar2.i, f2));
    }

    public final void o(float f) {
        bwx bwxVar = this.a;
        if (bwxVar == null) {
            this.f.add(new bxi(this, f));
            return;
        }
        this.b.k(cdc.c(bwxVar.h, bwxVar.i, f));
        bwr.a();
    }

    public final void p(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean q() {
        cdb cdbVar = this.b;
        if (cdbVar == null) {
            return false;
        }
        return cdbVar.i;
    }

    public final boolean r(bwx bwxVar) {
        float f;
        float f2;
        if (this.a == bwxVar) {
            return false;
        }
        this.p = false;
        h();
        this.a = bwxVar;
        g();
        cdb cdbVar = this.b;
        bwx bwxVar2 = cdbVar.h;
        cdbVar.h = bwxVar;
        if (bwxVar2 == null) {
            f = (int) Math.max(cdbVar.f, bwxVar.h);
            f2 = Math.min(cdbVar.g, bwxVar.i);
        } else {
            f = (int) bwxVar.h;
            f2 = bwxVar.i;
        }
        cdbVar.l(f, (int) f2);
        float f3 = cdbVar.d;
        cdbVar.d = 0.0f;
        cdbVar.k((int) f3);
        cdbVar.b();
        o(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f).iterator();
        while (it.hasNext()) {
            bxm bxmVar = (bxm) it.next();
            if (bxmVar != null) {
                bxmVar.a();
            }
            it.remove();
        }
        this.f.clear();
        aej aejVar = bwxVar.m;
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public final boolean s() {
        return this.a.d.c() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        cda.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        this.b.f();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
