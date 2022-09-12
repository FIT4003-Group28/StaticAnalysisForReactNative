package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: csmy  reason: default package */
/* loaded from: classes5.dex */
public final class csmy extends Drawable implements Animatable, csmr {
    private static final LinearInterpolator l = new LinearInterpolator();
    private long A;
    private long B;
    public final AnimatorSet a;
    public final ValueAnimator b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int[] g;
    public Runnable i;
    private final ValueAnimator m;
    private final ValueAnimator n;
    private final ValueAnimator o;
    private final ValueAnimator p;
    private final ValueAnimator q;
    private final ArrayList<ValueAnimator> r;
    private float s;
    private float t;
    private float u;
    private final Paint v;
    private int w;
    private final int x;
    private final int y;
    private final RectF j = new RectF();
    private final Rect k = new Rect();
    private final float z = -1.0f;
    public boolean h = false;

    public csmy(int i, int i2, int[] iArr) {
        this.x = i;
        this.y = i2;
        this.g = iArr;
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        this.r = arrayList;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", 0.0f, 1.0f);
        ofFloat.setDuration(1332L);
        LinearInterpolator linearInterpolator = l;
        ofFloat.setInterpolator(linearInterpolator);
        this.m = ofFloat;
        arrayList.add(ofFloat);
        int[] iArr2 = this.g;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "currentColor", iArr2[this.e], iArr2[e()]);
        ofInt.setEvaluator(cskl.a);
        ofInt.setStartDelay(999L);
        ofInt.setDuration(333L);
        ofInt.setInterpolator(linearInterpolator);
        this.f = this.g[this.e];
        this.b = ofInt;
        arrayList.add(ofInt);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "headFraction", 0.0f, 1.0f);
        ofFloat2.setDuration(666L);
        ofFloat2.setInterpolator(csku.c);
        this.n = ofFloat2;
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "tailFraction", 0.0f, 1.0f);
        ofFloat3.setStartDelay(666L);
        ofFloat3.setDuration(666L);
        ofFloat3.setInterpolator(csku.c);
        this.o = ofFloat3;
        arrayList.add(ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        ofFloat4.addListener(new csmw(this));
        ofFloat4.setDuration(750L);
        ofFloat4.setInterpolator(linearInterpolator);
        this.p = ofFloat4;
        arrayList.add(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        ofFloat5.addListener(new csmx(this));
        ofFloat5.setDuration(750L);
        ofFloat5.setInterpolator(linearInterpolator);
        this.q = ofFloat5;
        arrayList.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofInt);
        csni.a();
        csko.c(animatorSet, new Runnable(this) { // from class: csmv
            private final csmy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                csmy csmyVar = this.a;
                csmyVar.g();
                csmyVar.d = 0.0f;
                csmyVar.c = (csmyVar.c + 216.0f) % 360.0f;
                int e = csmyVar.e();
                csmyVar.e = e;
                int[] iArr3 = csmyVar.g;
                int i3 = iArr3[e];
                csmyVar.f = i3;
                csmyVar.b.setIntValues(i3, iArr3[csmyVar.e()]);
            }
        });
        this.a = animatorSet;
        Paint paint = new Paint();
        this.v = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.w = 255;
        setVisible(false, false);
        f();
    }

    @Override // defpackage.csmr
    public final void a(Runnable runnable) {
        this.i = runnable;
        stop();
    }

    @Override // defpackage.csmr
    public final void b() {
        stop();
        f();
    }

    public final void c(int[] iArr) {
        int[] iArr2 = this.g;
        int i = this.e;
        int i2 = iArr2[i];
        this.g = iArr;
        int length = i % iArr.length;
        this.e = length;
        this.f = iArr[length];
        this.b.setIntValues(i2, iArr[length]);
        invalidateSelf();
    }

    public final void d(boolean z) {
        setVisible(z, true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        float f;
        if (!getBounds().isEmpty()) {
            if (!isVisible() && !this.q.isRunning()) {
                return;
            }
            if (this.z != -1.0f) {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.k.left = centerX - (getIntrinsicWidth() / 2);
                this.k.right = centerX + (getIntrinsicWidth() / 2);
                this.k.top = centerY - (getIntrinsicHeight() / 2);
                this.k.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.k;
            } else {
                rect = getBounds();
            }
            int i = this.x;
            float f2 = this.u;
            float f3 = i * f2;
            int i2 = this.w;
            float f4 = (this.y + i) - (f3 / 2.0f);
            this.v.setColor(this.f);
            this.v.setAlpha((int) (i2 * f2));
            this.v.setStrokeWidth(f3);
            this.j.set(rect);
            this.j.inset(f4, f4);
            float width = this.j.width();
            float abs = Math.abs((this.t * 290.0f) - (this.d * 290.0f));
            double d = (width / 2.0f) - f3;
            Double.isNaN(d);
            double d2 = f3 * 180.0f;
            Double.isNaN(d2);
            float max = Math.max(abs, (float) ((d * 3.141592653589793d) / d2));
            float f5 = this.s;
            canvas.drawArc(this.j, (f + (this.c + (f5 * 286.0f))) - 90.0f, max, false, this.v);
        }
    }

    public final int e() {
        return (this.e + 1) % this.g.length;
    }

    public final void f() {
        super.setVisible(this.h, false);
        if (this.a.isStarted()) {
            this.a.cancel();
        }
        ArrayList<ValueAnimator> arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ValueAnimator valueAnimator = arrayList.get(i);
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
        }
        g();
        this.t = 0.0f;
        this.d = 0.0f;
        this.s = 0.0f;
        this.c = 0.0f;
        this.e = 0;
        int[] iArr = this.g;
        int i2 = iArr[0];
        this.f = i2;
        this.b.setIntValues(i2, iArr[e()]);
        this.u = 0.0f;
        invalidateSelf();
    }

    public final void g() {
        this.b.setStartDelay(999L);
        this.o.setStartDelay(666L);
    }

    public float getAlphaFraction() {
        return this.u;
    }

    public int getCurrentColor() {
        return this.f;
    }

    public float getDetentFraction() {
        return this.s;
    }

    public float getHeadFraction() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.z;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.z;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getTailFraction() {
        return this.d;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.a.isRunning() || this.p.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.w) {
            this.w = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.u = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCurrentColor(int i) {
        this.f = i;
        invalidateSelf();
    }

    public void setDetentFraction(float f) {
        this.s = f;
        invalidateSelf();
    }

    public void setHeadFraction(float f) {
        this.t = f;
        invalidateSelf();
    }

    public void setTailFraction(float f) {
        this.d = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.h;
        if (z3 || z2) {
            this.h = z;
            if (z) {
                super.setVisible(true, z2);
                if (this.q.isRunning()) {
                    this.p.setCurrentPlayTime(750 - this.q.getCurrentPlayTime());
                    this.q.cancel();
                }
                if (z2) {
                    f();
                    this.p.setStartDelay(0L);
                    this.p.start();
                    this.A = 0L;
                } else {
                    long max = Math.max(0L, this.A - (SystemClock.elapsedRealtime() - this.B));
                    this.A = max;
                    this.p.setStartDelay(max);
                    this.p.start();
                }
                this.B = SystemClock.elapsedRealtime();
                this.i = null;
            } else if (z3) {
                if (this.p.isRunning()) {
                    this.q.setCurrentPlayTime(750 - this.p.getCurrentPlayTime());
                    this.p.cancel();
                }
                this.q.start();
            } else {
                f();
            }
            return z3;
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false);
    }
}
