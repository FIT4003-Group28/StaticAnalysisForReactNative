package defpackage;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: iki  reason: default package */
/* loaded from: classes6.dex */
public final class iki extends FrameLayout {
    private String A;
    private String B;
    private String C;
    private boolean D;
    @dzsi
    private ikd E;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private final ijy i;
    private final ikp j;
    private final ikq k;
    private final iks l;
    private final int m;
    private int n;
    private int o;
    private final ijz p;
    private final ika q;
    private final ikb r;
    private final ikr s;
    private final ikt t;
    @dzsi
    private ikc u;
    private float v;
    private boolean w;
    private boolean x;
    @dzsi
    private ikl y;
    private String z;

    public iki(Context context) {
        this(context, null);
    }

    private static ValueAnimator a(int i, int i2, int i3, int i4, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(100L);
        valueAnimator.setValues(PropertyValuesHolder.ofInt("thumb_radius", i, i2), PropertyValuesHolder.ofInt("ripple_radius", i3, i4));
        valueAnimator.addUpdateListener(animatorUpdateListener);
        return valueAnimator;
    }

    private final void b(boolean z) {
        ikd ikdVar = this.E;
        if (ikdVar != null) {
            ikdVar.a(this.g, this.h, z);
        }
    }

    private final int c() {
        Paint.FontMetricsInt fontMetricsInt = ((iju) this.i).k.getFontMetricsInt();
        int i = fontMetricsInt.descent;
        int i2 = fontMetricsInt.ascent;
        iju ijuVar = (iju) this.i;
        int i3 = ijuVar.g;
        return (i - i2) + i3 + i3 + ijuVar.b;
    }

    private final void d() {
        ikc ikcVar;
        setPressed(true);
        this.w = true;
        ikd ikdVar = this.E;
        if (ikdVar != null && (ikcVar = this.u) != null) {
            ikdVar.b(ikcVar);
        }
        if (ikc.MIN.equals(this.u)) {
            a(this.c, ((ijw) this.k).c, this.a, ((ijv) this.j).b, new ValueAnimator.AnimatorUpdateListener(this) { // from class: ike
                private final iki a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    iki ikiVar = this.a;
                    ikiVar.c = ((Integer) valueAnimator.getAnimatedValue("thumb_radius")).intValue();
                    ikiVar.a = ((Integer) valueAnimator.getAnimatedValue("ripple_radius")).intValue();
                    ikiVar.invalidate();
                }
            }).start();
        } else if (!ikc.MAX.equals(this.u)) {
        } else {
            a(this.d, ((ijw) this.k).c, this.b, ((ijv) this.j).b, new ValueAnimator.AnimatorUpdateListener(this) { // from class: ikf
                private final iki a;

                {
                    this.a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    iki ikiVar = this.a;
                    ikiVar.d = ((Integer) valueAnimator.getAnimatedValue("thumb_radius")).intValue();
                    ikiVar.b = ((Integer) valueAnimator.getAnimatedValue("ripple_radius")).intValue();
                    ikiVar.invalidate();
                }
            }).start();
        }
    }

    private final void e() {
        a(this.c, ((ijw) this.k).b, this.a, ((ijv) this.j).a, new ValueAnimator.AnimatorUpdateListener(this) { // from class: ikg
            private final iki a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                iki ikiVar = this.a;
                ikiVar.c = ((Integer) valueAnimator.getAnimatedValue("thumb_radius")).intValue();
                ikiVar.a = ((Integer) valueAnimator.getAnimatedValue("ripple_radius")).intValue();
                ikiVar.invalidate();
            }
        }).start();
        a(this.d, ((ijw) this.k).b, this.b, ((ijv) this.j).a, new ValueAnimator.AnimatorUpdateListener(this) { // from class: ikh
            private final iki a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                iki ikiVar = this.a;
                ikiVar.d = ((Integer) valueAnimator.getAnimatedValue("thumb_radius")).intValue();
                ikiVar.b = ((Integer) valueAnimator.getAnimatedValue("ripple_radius")).intValue();
                ikiVar.invalidate();
            }
        }).start();
        this.w = false;
        setPressed(false);
    }

    private final void f(MotionEvent motionEvent) {
        float a;
        if (this.u == null) {
            return;
        }
        ijz ijzVar = this.p;
        int x = (int) motionEvent.getX();
        if (x <= ijzVar.b.a()) {
            a = 0.0f;
        } else {
            a = x >= ijzVar.b.b() ? 1.0f : (x - ijzVar.b.a()) / ijzVar.b.c();
        }
        if (bvox.a(ijzVar.a)) {
            a = 1.0f - a;
        }
        iki ikiVar = ijzVar.a;
        int i = (int) ((ikiVar.f - ikiVar.e) * a);
        if (ikc.MIN.equals(this.u)) {
            this.g = this.r.a(i, this.h, ikc.MIN);
        } else if (ikc.MAX.equals(this.u)) {
            this.h = this.r.a(this.g, i, ikc.MAX);
        }
        b(true);
    }

    private final void g() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void h() {
        int c = ((iju) this.i).e + c() + ((iju) this.i).d;
        this.n = c;
        this.o = c + (((ijx) this.l).a / 2);
    }

    private final void i() {
        ikl iklVar = this.y;
        if (iklVar == null) {
            return;
        }
        if (iklVar.c.isEnabled()) {
            iklVar.p();
        }
        iklVar.c.removeAccessibilityStateChangeListener(iklVar.d);
        this.y = null;
        super.setAccessibilityDelegate(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        if (!this.x) {
            i();
            ikl iklVar = new ikl(this);
            od.c(this, iklVar);
            this.x = false;
            this.y = iklVar;
        }
        setWillNotDraw(false);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        i();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        ikr ikrVar;
        iju ijuVar;
        iju ijuVar2;
        super.onDraw(canvas);
        h();
        int i = this.n;
        float f = i;
        float f2 = i + ((ijx) this.l).a;
        canvas.drawRect(this.t.a(), f, this.t.b(), f2, ((ijx) this.q.c).b);
        ika ikaVar = this.q;
        ikr ikrVar2 = this.s;
        canvas.drawRect(bvox.a(ikrVar2.a) ? ikrVar2.b() : ikrVar2.a(), f, bvox.a(this.s.a) ? ikrVar.a() : ikrVar.b(), f2, ((ijx) ikaVar.c).c);
        this.q.a(canvas, this.s.a(), this.o, this.a);
        this.q.a(canvas, this.s.b(), this.o, this.b);
        this.q.b(canvas, this.s.a(), this.o, this.c);
        this.q.b(canvas, this.s.b(), this.o, this.d);
        ika ikaVar2 = this.q;
        int c = this.s.c();
        int a = this.t.a();
        int b = this.t.b();
        iju ijuVar3 = (iju) this.i;
        int min = Math.min(ijuVar3.f + ((int) ijuVar3.k.measureText(this.C)) + ((iju) this.i).f, this.t.c());
        int c2 = c();
        String str = this.C;
        int i2 = ((ijw) ikaVar2.b).b;
        int h = decl.h(c - (min / 2), a - i2, (b + i2) - min);
        int i3 = ((iju) ikaVar2.a).e;
        Path path = ikaVar2.d;
        ikaVar2.e.set(0.0f, 0.0f, min, c2 - ijuVar.b);
        int i4 = ((iju) ikaVar2.a).c;
        float f3 = i4 + i4;
        ikaVar2.f.set(ikaVar2.e.right - f3, ikaVar2.e.top, ikaVar2.e.right, ikaVar2.e.top + f3);
        ikaVar2.g.set(ikaVar2.e.right - f3, ikaVar2.e.bottom - f3, ikaVar2.e.right, ikaVar2.e.bottom);
        ikaVar2.h.set(ikaVar2.e.left, ikaVar2.e.bottom - f3, ikaVar2.e.left + f3, ikaVar2.e.bottom);
        ikaVar2.i.set(ikaVar2.e.left, ikaVar2.e.top, ikaVar2.e.left + f3, ikaVar2.e.top + f3);
        int i5 = ((iju) ikaVar2.a).a / 2;
        float f4 = i4;
        path.moveTo(ikaVar2.e.left + f4, ikaVar2.e.top);
        path.lineTo(ikaVar2.e.right - f4, ikaVar2.e.top);
        path.arcTo(ikaVar2.f, -90.0f, 90.0f);
        path.lineTo(ikaVar2.e.right, ikaVar2.e.bottom - f4);
        path.arcTo(ikaVar2.g, 0.0f, 90.0f);
        path.lineTo((c + i5) - h, ikaVar2.e.bottom);
        ikaVar2.d(path, -1.34f, 0.42f, -2.29f, 0.85f, -2.99f, 1.38f);
        ikaVar2.d(path, -1.14f, 0.85f, -1.74f, 1.39f, -2.19f, 2.64f);
        ikaVar2.d(path, -0.44f, 1.25f, -0.18f, 1.98f, -0.92f, 1.98f);
        ikaVar2.d(path, -0.74f, 0.0f, -0.48f, -0.73f, -0.92f, -1.98f);
        ikaVar2.d(path, -0.44f, -1.25f, -1.05f, -1.79f, -2.19f, -2.64f);
        ikaVar2.d(path, -0.7f, -0.53f, -1.65f, -0.96f, -2.99f, -1.38f);
        path.lineTo((c - i5) - h, ikaVar2.e.bottom);
        path.lineTo(ikaVar2.e.left + f4, ikaVar2.e.bottom);
        path.arcTo(ikaVar2.h, 90.0f, 90.0f);
        path.lineTo(ikaVar2.e.left, ikaVar2.e.top + f4);
        path.arcTo(ikaVar2.i, 180.0f, 90.0f);
        path.close();
        path.offset(h, i3);
        path.setFillType(Path.FillType.EVEN_ODD);
        ikaVar2.c(canvas, ikaVar2.d);
        canvas.drawPath(ikaVar2.d, ((iju) ikaVar2.a).h);
        ikaVar2.d.rewind();
        int i6 = ((iju) ikaVar2.a).k.getFontMetricsInt().ascent;
        canvas.drawText(str, h + ijuVar2.f, i3 + ijuVar2.g + (-i6), ((iju) ikaVar2.a).k);
        ikl iklVar = this.y;
        if (iklVar == null) {
            return;
        }
        iklVar.g = this.z;
        iklVar.h = this.A;
        iklVar.i = this.B;
        int i7 = ((ijv) this.j).b;
        iklVar.j.set(this.s.a() - i7, this.o - i7, this.s.a() + i7, this.o + i7);
        iklVar.k.set(this.s.b() - i7, this.o - i7, this.s.b() + i7, this.o + i7);
        iklVar.l = this.E;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int max = Math.max(((ijw) this.k).c, ((ijv) this.j).b);
        int i3 = max + max;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int i4 = ((iju) this.i).e;
        int c = c();
        int i5 = ((iju) this.i).d;
        int i6 = ((ijx) this.l).a;
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft + i3 + i3 + paddingRight, getMinimumWidth()), i, 0), resolveSizeAndState(Math.max(paddingTop + i4 + c + i5 + (i6 / 2) + max + getPaddingBottom(), getMinimumHeight()), i2, 0));
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iki.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAbsoluteMax(int i) {
        if (!ikb.d(this.e, i) || this.f == i) {
            return;
        }
        this.f = i;
        int min = Math.min(this.g, i);
        int min2 = Math.min(this.h, i);
        if (this.g == min && this.h == min2) {
            return;
        }
        this.g = min;
        this.h = min2;
        b(false);
        invalidate();
    }

    public void setAbsoluteMin(int i) {
        if (!ikb.d(i, this.f) || this.e == i) {
            return;
        }
        this.e = i;
        int max = Math.max(this.g, i);
        int max2 = Math.max(this.h, i);
        if (this.g == max && this.h == max2) {
            return;
        }
        this.g = max;
        this.h = max2;
        b(false);
        invalidate();
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(@dzsi View.AccessibilityDelegate accessibilityDelegate) {
        i();
        this.x = true;
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    public void setEnableHapticFeedback(boolean z) {
        this.D = z;
    }

    public void setLabelText(String str) {
        this.C = str;
        invalidate();
    }

    public void setMaxEndpointContentDescription(String str) {
        this.B = str;
    }

    public void setMinEndpointContentDescription(String str) {
        this.A = str;
    }

    public void setOnRangeSeekBarChangeListener(@dzsi ikd ikdVar) {
        this.E = ikdVar;
    }

    public void setRangeContentDescription(String str) {
        this.z = str;
    }

    public void setSelectedMax(int i) {
        if (!this.r.c(this.g, i) || this.h == i) {
            return;
        }
        this.h = i;
        b(false);
        invalidate();
    }

    public void setSelectedMin(int i) {
        if (!this.r.c(i, this.h) || this.g == i) {
            return;
        }
        this.g = i;
        b(false);
        invalidate();
    }

    public iki(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = "";
        this.A = "";
        this.B = "";
        this.C = "";
        setFocusable(true);
        setLayerType(1, null);
        int c = akm.c(context, ijy.l);
        int c2 = akm.c(context, ijy.n);
        int c3 = akm.c(context, ijy.m);
        int f = kc.f(c3, 77);
        int f2 = kc.f(c3, 38);
        int round = Math.round(TypedValue.applyDimension(2, 14.0f, context.getResources().getDisplayMetrics()));
        Typeface a = ibq.F().a(context);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(c);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(c);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setShadowLayer(3.0f, 0.0f, 1.0f, f);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(c);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setShadowLayer(8.0f, 0.0f, 4.0f, f2);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(c2);
        textPaint.setTextSize(round);
        textPaint.setTypeface(a);
        ijy l = ijy.l(jmj.b(context, 12.2f), jmj.a(context, 6), jmj.a(context, 6), jmj.a(context, 6), jmj.a(context, 2), jmj.a(context, 12), jmj.a(context, 4), paint, paint2, paint3, textPaint);
        this.i = l;
        int f3 = kc.f(akm.c(context, R.color.mod_daynight_blue100), 128);
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(f3);
        paint4.setStyle(Paint.Style.FILL);
        ijv ijvVar = new ijv(jmj.a(context, 1), jmj.a(context, 16), paint4);
        this.j = ijvVar;
        int c4 = akm.c(context, R.color.mod_daynight_blue600);
        Paint paint5 = new Paint();
        paint5.setAntiAlias(true);
        paint5.setColor(c4);
        paint5.setStyle(Paint.Style.FILL);
        ijw ijwVar = new ijw(jmj.a(context, 48), jmj.a(context, 6), jmj.a(context, 9), paint5);
        this.k = ijwVar;
        int c5 = akm.c(context, R.color.mod_daynight_blue100);
        int c6 = akm.c(context, R.color.mod_daynight_blue600);
        Paint paint6 = new Paint();
        paint6.setColor(c5);
        paint6.setStyle(Paint.Style.FILL);
        Paint paint7 = new Paint();
        paint7.setColor(c6);
        paint7.setStyle(Paint.Style.FILL);
        ijx ijxVar = new ijx(jmj.a(context, 2), paint6, paint7);
        this.l = ijxVar;
        int i = ijvVar.a;
        this.a = i;
        this.b = i;
        int i2 = ijwVar.b;
        this.c = i2;
        this.d = i2;
        this.m = ViewConfiguration.get(context).getScaledTouchSlop();
        ikt iktVar = new ikt(this, ijwVar);
        this.t = iktVar;
        ijz ijzVar = new ijz(this, iktVar);
        this.p = ijzVar;
        this.q = new ika(context, l, ijvVar, ijwVar, ijxVar);
        ikb ikbVar = new ikb(this);
        this.r = ikbVar;
        this.s = new ikr(this, ijzVar, ikbVar, ijwVar, iktVar);
        this.e = Integer.MIN_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MAX_VALUE;
    }
}
