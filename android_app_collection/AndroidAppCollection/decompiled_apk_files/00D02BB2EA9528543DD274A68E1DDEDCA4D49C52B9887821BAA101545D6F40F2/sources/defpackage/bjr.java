package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
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
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjr  reason: default package */
/* loaded from: classes3.dex */
public final class bjr extends Drawable implements Drawable.Callback, Animatable {
    public bis a;
    public final bpp b;
    public float c;
    public boolean d;
    public final ArrayList<bjq> e;
    public ImageView.ScaleType f;
    public blt g;
    public String h;
    public bil i;
    public bls j;
    public bik k;
    public bkf l;
    public boolean m;
    public bnm n;
    public boolean o;
    public boolean p;
    public boolean q;
    private final Matrix r = new Matrix();
    private final ValueAnimator.AnimatorUpdateListener s;
    private int t;
    private final boolean u;

    public bjr() {
        bpp bppVar = new bpp();
        this.b = bppVar;
        this.c = 1.0f;
        this.d = true;
        new HashSet();
        this.e = new ArrayList<>();
        bjh bjhVar = new bjh(this);
        this.s = bjhVar;
        this.t = 255;
        this.u = true;
        this.q = false;
        bppVar.addUpdateListener(bjhVar);
    }

    public final blt A() {
        if (getCallback() == null) {
            return null;
        }
        blt bltVar = this.g;
        if (bltVar != null) {
            Drawable.Callback callback = getCallback();
            Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
            if ((context != null || bltVar.a != null) && !bltVar.a.equals(context)) {
                this.g = null;
            }
        }
        if (this.g == null) {
            this.g = new blt(getCallback(), this.h, this.i, this.a.c);
        }
        return this.g;
    }

    public final void a() {
        bno a = bop.a(this.a);
        bis bisVar = this.a;
        this.n = new bnm(this, a, bisVar.h, bisVar);
    }

    public final void b() {
        bpp bppVar = this.b;
        if (bppVar.i) {
            bppVar.cancel();
        }
        this.a = null;
        this.n = null;
        this.g = null;
        bpp bppVar2 = this.b;
        bppVar2.h = null;
        bppVar2.f = -2.14748365E9f;
        bppVar2.g = 2.14748365E9f;
        invalidateSelf();
    }

    public final void c() {
        if (this.n == null) {
            this.e.add(new bji(this));
            return;
        }
        if (this.d || t() == 0) {
            bpp bppVar = this.b;
            bppVar.i = true;
            boolean h = bppVar.h();
            for (Animator.AnimatorListener animatorListener : bppVar.a) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(bppVar, h);
                } else {
                    animatorListener.onAnimationStart(bppVar);
                }
            }
            bppVar.d((int) (bppVar.h() ? bppVar.j() : bppVar.i()));
            bppVar.c = 0L;
            bppVar.e = 0;
            bppVar.k();
        }
        if (this.d) {
            return;
        }
        q((int) (p() < 0.0f ? f() : i()));
        this.b.g();
    }

    public final void d() {
        float i;
        if (this.n == null) {
            this.e.add(new bjj(this));
            return;
        }
        if (this.d || t() == 0) {
            bpp bppVar = this.b;
            bppVar.i = true;
            bppVar.k();
            bppVar.c = 0L;
            if (bppVar.h() && bppVar.d == bppVar.i()) {
                i = bppVar.j();
            } else if (!bppVar.h() && bppVar.d == bppVar.j()) {
                i = bppVar.i();
            }
            bppVar.d = i;
        }
        if (this.d) {
            return;
        }
        q((int) (p() < 0.0f ? f() : i()));
        this.b.g();
    }

    public final void e(int i) {
        if (this.a == null) {
            this.e.add(new bjk(this, i));
            return;
        }
        bpp bppVar = this.b;
        bppVar.e(i, (int) bppVar.g);
    }

    public final float f() {
        return this.b.i();
    }

    public final void g(float f) {
        bis bisVar = this.a;
        if (bisVar == null) {
            this.e.add(new bjl(this, f));
        } else {
            e((int) bpr.c(bisVar.j, bisVar.k, f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        bis bisVar = this.a;
        if (bisVar == null) {
            return -1;
        }
        return (int) (bisVar.i.height() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        bis bisVar = this.a;
        if (bisVar == null) {
            return -1;
        }
        return (int) (bisVar.i.width() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(int i) {
        if (this.a == null) {
            this.e.add(new bjm(this, i));
            return;
        }
        bpp bppVar = this.b;
        bppVar.e(bppVar.f, i + 0.99f);
    }

    public final float i() {
        return this.b.j();
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
        if (this.q) {
            return;
        }
        this.q = true;
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return u();
    }

    public final void j(float f) {
        bis bisVar = this.a;
        if (bisVar == null) {
            this.e.add(new bjn(this, f));
        } else {
            h((int) bpr.c(bisVar.j, bisVar.k, f));
        }
    }

    public final void k(String str) {
        bis bisVar = this.a;
        if (bisVar == null) {
            this.e.add(new bjo(this, str));
            return;
        }
        bmb f = bisVar.f(str);
        if (f == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        e((int) f.b);
    }

    public final void l(String str) {
        bis bisVar = this.a;
        if (bisVar == null) {
            this.e.add(new bjp(this, str));
            return;
        }
        bmb f = bisVar.f(str);
        if (f == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        h((int) (f.b + f.c));
    }

    public final void m(String str) {
        bis bisVar = this.a;
        if (bisVar == null) {
            this.e.add(new bjb(this, str));
            return;
        }
        bmb f = bisVar.f(str);
        if (f != null) {
            int i = (int) f.b;
            n(i, ((int) f.c) + i);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void n(int i, int i2) {
        if (this.a == null) {
            this.e.add(new bjc(this, i, i2));
        } else {
            this.b.e(i, i2 + 0.99f);
        }
    }

    public final void o(float f, float f2) {
        bis bisVar = this.a;
        if (bisVar == null) {
            this.e.add(new bjd(this, f, f2));
            return;
        }
        float c = bpr.c(bisVar.j, bisVar.k, f);
        bis bisVar2 = this.a;
        n((int) c, (int) bpr.c(bisVar2.j, bisVar2.k, f2));
    }

    public final float p() {
        return this.b.b;
    }

    public final void q(int i) {
        if (this.a == null) {
            this.e.add(new bje(this, i));
        } else {
            this.b.d(i);
        }
    }

    public final void r(float f) {
        bis bisVar = this.a;
        if (bisVar == null) {
            this.e.add(new bjf(this, f));
            return;
        }
        this.b.d(bpr.c(bisVar.j, bisVar.k, f));
        bim.a();
    }

    public final void s(int i) {
        this.b.setRepeatCount(i);
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
        this.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        bpo.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        c();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.clear();
        this.b.g();
    }

    public final int t() {
        return this.b.getRepeatCount();
    }

    public final boolean u() {
        bpp bppVar = this.b;
        if (bppVar == null) {
            return false;
        }
        return bppVar.i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(float f) {
        this.c = f;
        x();
    }

    public final boolean w() {
        return this.l == null && this.a.f.f() > 0;
    }

    public final void x() {
        bis bisVar = this.a;
        if (bisVar == null) {
            return;
        }
        float f = this.c;
        setBounds(0, 0, (int) (bisVar.i.width() * f), (int) (this.a.i.height() * f));
    }

    public final float y() {
        return this.b.c();
    }

    public final <T> void z(bly blyVar, T t, bpv<T> bpvVar) {
        List list;
        if (this.n == null) {
            this.e.add(new bjg(this, blyVar, t, bpvVar));
            return;
        }
        if (blyVar == bly.a) {
            this.n.f(t, bpvVar);
        } else {
            blz blzVar = blyVar.b;
            if (blzVar == null) {
                if (this.n == null) {
                    bpo.a("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.n.e(blyVar, 0, arrayList, new bly(new String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((bly) list.get(i)).b.f(t, bpvVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            } else {
                blzVar.f(t, bpvVar);
            }
        }
        invalidateSelf();
        if (t != bjv.A) {
            return;
        }
        r(y());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        this.q = false;
        int i = -1;
        if (ImageView.ScaleType.FIT_XY == this.f) {
            if (this.n != null) {
                Rect bounds = getBounds();
                float width = bounds.width() / this.a.i.width();
                float height = bounds.height() / this.a.i.height();
                if (this.u) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f2 = 1.0f / min;
                        width /= f2;
                        height /= f2;
                    } else {
                        f2 = 1.0f;
                    }
                    if (f2 > 1.0f) {
                        i = canvas.save();
                        float width2 = bounds.width() / 2.0f;
                        float height2 = bounds.height() / 2.0f;
                        float f3 = width2 * min;
                        float f4 = min * height2;
                        canvas.translate(width2 - f3, height2 - f4);
                        canvas.scale(f2, f2, f3, f4);
                    }
                }
                this.r.reset();
                this.r.preScale(width, height);
                this.n.c(canvas, this.r, this.t);
                if (i > 0) {
                    canvas.restoreToCount(i);
                }
            }
        } else if (this.n != null) {
            float f5 = this.c;
            float min2 = Math.min(canvas.getWidth() / this.a.i.width(), canvas.getHeight() / this.a.i.height());
            if (f5 > min2) {
                f = this.c / min2;
            } else {
                min2 = f5;
                f = 1.0f;
            }
            if (f > 1.0f) {
                i = canvas.save();
                float width3 = this.a.i.width() / 2.0f;
                float height3 = this.a.i.height() / 2.0f;
                float f6 = width3 * min2;
                float f7 = height3 * min2;
                float f8 = this.c;
                canvas.translate((width3 * f8) - f6, (f8 * height3) - f7);
                canvas.scale(f, f, f6, f7);
            }
            this.r.reset();
            this.r.preScale(min2, min2);
            this.n.c(canvas, this.r, this.t);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
        bim.a();
    }
}
