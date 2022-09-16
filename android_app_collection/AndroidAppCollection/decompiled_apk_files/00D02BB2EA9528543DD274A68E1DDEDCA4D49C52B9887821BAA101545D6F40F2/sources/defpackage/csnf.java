package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
@Deprecated
/* renamed from: csnf  reason: default package */
/* loaded from: classes5.dex */
public final class csnf extends Drawable implements Animatable, csmr {
    public int a;
    public int b;
    public int c;
    public final AnimatorSet d;
    public final ObjectAnimator e;
    public float f;
    public Runnable h;
    private final int i;
    private final boolean j;
    private int k;
    private final Paint l;
    private final ObjectAnimator m;
    private final float n;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private final Rect u;
    private float o = 1.0f;
    public boolean g = isVisible();

    public csnf(int i, int i2, int i3, float f, boolean z, int i4) {
        this.a = i;
        this.k = i2;
        this.i = Math.round(f * 255.0f);
        this.j = z;
        this.c = i4;
        this.b = i3;
        float f2 = 1.0f;
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.1f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.8268492f);
        ofFloat2.setInterpolator(pq.a(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.8268492f, 0.1f);
        ofFloat3.setInterpolator(pq.a(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617L);
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", -522.6f, 199.6f);
        ofFloat4.setInterpolator(pq.a(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat4.setStartDelay(400L);
        ofFloat4.setDuration(1600L);
        animatorSet.play(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.1f, 0.55f);
        ofFloat5.setInterpolator(pq.a(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat5.setDuration(352L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.55f, 0.90995026f);
        ofFloat6.setInterpolator(pq.a(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat6.setDuration(532L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.90995026f, 0.1f);
        ofFloat7.setInterpolator(pq.a(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat7.setDuration(1116L);
        animatorSet.playSequentially(ofFloat5, ofFloat6, ofFloat7);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "rect2TranslationX", -208.0f, 132.0f);
        ofFloat8.setInterpolator(pq.a(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat8.setDuration(964L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "rect2TranslationX", 132.0f, 422.6f);
        ofFloat9.setInterpolator(pq.a(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat9.setDuration(1036L);
        animatorSet.playSequentially(ofFloat8, ofFloat9);
        animatorSet.addListener(new csnd());
        csni.a();
        csko.b(animatorSet);
        this.d = animatorSet;
        this.n = 1.0f;
        this.f = i4 != 2 ? 0.0f : f2;
        this.m = csnc.a(this);
        ObjectAnimator b = csnc.b(this);
        b.addListener(new csne(this));
        this.e = b;
        this.u = new Rect();
        d();
    }

    @Override // defpackage.csmr
    public final void a(Runnable runnable) {
        this.h = runnable;
        stop();
    }

    @Override // defpackage.csmr
    public final void b() {
        this.g = false;
        if (super.setVisible(false, false)) {
            this.m.cancel();
            this.e.cancel();
            this.d.cancel();
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.h = null;
    }

    public final void c(int i) {
        this.k = i;
        invalidateSelf();
    }

    public final void d() {
        this.m.cancel();
        this.e.cancel();
        this.d.cancel();
        this.p = 0.1f;
        this.q = -522.6f;
        this.r = 0.1f;
        this.s = -197.6f;
        this.t = this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(this.u)) {
            return;
        }
        canvas.save();
        float height = this.u.height();
        float f = this.a;
        if (height > f) {
            canvas.translate(0.0f, (height - f) / 2.0f);
        }
        canvas.scale(this.u.width() / 360.0f, this.a / 4.0f);
        canvas.translate(180.0f, 2.0f);
        canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
        if (this.t < 1.0f) {
            if (this.c == 0) {
                canvas.scale(1.0f, -1.0f);
            }
            canvas.translate(0.0f, (this.t - 1.0f) * 4.0f * 0.5f);
            canvas.scale(1.0f, this.t);
        }
        int i = this.b;
        if (i != -1) {
            this.l.setColor(i);
            this.l.setAlpha((int) (this.o * this.i));
        } else {
            this.l.setColor(this.k);
            this.l.setAlpha((int) (this.o * this.i));
        }
        canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.l);
        this.l.setColor(this.k);
        if (this.j) {
            canvas.scale(-1.0f, 1.0f);
        }
        this.l.setAlpha((int) (this.o * 255.0f));
        canvas.save();
        canvas.translate(this.q, 0.0f);
        canvas.scale(this.p, 1.0f);
        canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.l);
        canvas.restore();
        canvas.save();
        canvas.translate(this.s, 0.0f);
        canvas.scale(this.r, 1.0f);
        canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.l);
        canvas.restore();
        canvas.restore();
    }

    public float getGrowScale() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getRect1ScaleX() {
        return this.p;
    }

    public float getRect1TranslationX() {
        return this.q;
    }

    public float getRect2ScaleX() {
        return this.r;
    }

    public float getRect2TranslationX() {
        return this.s;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return isVisible();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.t = f;
        invalidateSelf();
    }

    public void setRect1ScaleX(float f) {
        this.p = f;
        invalidateSelf();
    }

    public void setRect1TranslationX(float f) {
        this.q = f;
        invalidateSelf();
    }

    public void setRect2ScaleX(float f) {
        this.r = f;
        invalidateSelf();
    }

    public void setRect2TranslationX(float f) {
        this.s = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.g;
        if (z3 || z2) {
            this.g = z;
            if (z) {
                super.setVisible(true, z2);
                if (z2) {
                    d();
                }
                this.e.cancel();
                this.m.setFloatValues(this.n);
                this.m.start();
                if (!this.d.isStarted()) {
                    this.d.start();
                }
                this.h = null;
            } else if (z3) {
                this.m.cancel();
                this.e.setFloatValues(this.f);
                this.e.start();
            }
            return z3;
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisible(true, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisible(false, false);
    }
}
