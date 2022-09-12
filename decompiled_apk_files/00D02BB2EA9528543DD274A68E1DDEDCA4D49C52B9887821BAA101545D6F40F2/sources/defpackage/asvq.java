package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asvq  reason: default package */
/* loaded from: classes2.dex */
public final class asvq extends FrameLayout {
    private static final cqtv n = cqrp.d(2.5d);
    private static final cqtv o = cqrp.d(4.0d);
    private static final cqtv p = cqrp.d(0.800000011920929d);
    private static final cqtv q = cjxh.b(cjxf.LARGE);
    private static final cqtv r = cjxh.b(cjxf.EXTRA_LARGE);
    private static final cqtv s = cqrp.d(48.0d);
    private static final cqtv t = cqrp.d(10.0d);
    private static final cqtv u = cqrp.d(16.0d);
    private static final cqtv v = cqrp.d(8.0d);
    private static final cqtv w = cqrp.f(16.0d);
    private static final Typeface x = Typeface.DEFAULT_BOLD;
    private final cqss A;
    private float B;
    private float C;
    private float D;
    private float E;
    private final Paint F;
    private final Paint G;
    private final Paint H;
    private Paint I;
    private final Rect J;
    private final RectF K;
    private final RectF L;
    private final RectF M;
    private final RectF N;
    private final Rect O;
    private final RectF P;
    private cren[] Q;
    private cqtv R;
    private final crzp<aufb> S;
    public ValueAnimator a;
    public AnimatorSet b;
    public AnimatorSet c;
    public View d;
    cren e;
    cjxf f;
    boolean g;
    public String h;
    boolean i;
    boolean j;
    btrm k;
    aufc l;
    cjqy m;
    private final cqss y;
    private final cqss z;

    public asvq(Context context) {
        this(context, null);
    }

    public static <T extends cqkp> cqnf<T> a(cqlc<T, asvr> cqlcVar) {
        return cqjv.g(iug.MUTE_BUTTON_PROPERTIES, cqlcVar, asva.a);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(asvq.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(cjxf cjxfVar) {
        return cqjv.i(iug.MUTE_BUTTON_SIZE, cjxfVar, asva.a);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(iug.MUTE_BUTTON_POWER_SAVE_COLORS, cqlcVar, asva.a);
    }

    private final cqtv i() {
        return cjxh.b(this.f);
    }

    private final boolean j() {
        return this.f == cjxf.EXTRA_LARGE;
    }

    private final ValueAnimator k(float f, float f2, String str, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, str, f, f2);
        ofFloat.setInterpolator(irf.a);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    private final void l() {
        dbsk.l(getChildCount() > 0);
        String str = null;
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof asvf) {
                asvf asvfVar = (asvf) getChildAt(i);
                if (this.e.equals(asvfVar.c)) {
                    str = asvfVar.d.a(getContext()).toString();
                }
            }
        }
        getChildAt(0).setContentDescription(str);
    }

    private final int m() {
        int NR;
        if (j()) {
            NR = cjxh.d.NR(getContext());
        } else {
            NR = cjxh.a.NR(getContext());
        }
        return (NR - i().e(getContext())) / 2;
    }

    private final int n() {
        cren[] crenVarArr = this.Q;
        return (int) (this.R.e(getContext()) * ((crenVarArr == null ? 3.0f : crenVarArr.length) / 3.0f));
    }

    private final boolean o(cren crenVar) {
        cren[] crenVarArr = this.Q;
        if (crenVarArr == null) {
            return true;
        }
        for (cren crenVar2 : crenVarArr) {
            if (crenVar == crenVar2) {
                return true;
            }
        }
        return false;
    }

    private final void p(RectF rectF, float f, float f2) {
        if (cjxu.d(this)) {
            float f3 = rectF.right;
            float f4 = rectF.left;
            rectF.left = q(f3, f, f2);
            rectF.right = q(f4, f, f2);
        }
    }

    private static float q(float f, float f2, float f3) {
        float f4 = f - (f3 - ((f3 - f2) / 2.0f));
        return f - (f4 + f4);
    }

    private static cqtv r(cjxf cjxfVar) {
        return cqsg.d(cqsg.f(cjxh.b(cjxfVar), Float.valueOf(3.0f)), s);
    }

    public final void e() {
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
    }

    public final void f(Context context) {
        int b;
        int e;
        int b2;
        if (this.g) {
            b = getResources().getColor(R.color.qu_grey_700);
        } else {
            b = this.y.b(context);
        }
        if (this.j) {
            e = o.e(getContext());
        } else {
            e = n.e(getContext());
        }
        this.F.setColor(b);
        this.F.setStyle(Paint.Style.FILL);
        this.F.setShadowLayer(e, 0.0f, 0.0f, b);
        Paint paint = this.G;
        if (this.g) {
            b2 = getResources().getColor(R.color.quantum_grey900);
        } else {
            b2 = this.z.b(getContext());
        }
        paint.setColor(b2);
        this.G.setStyle(Paint.Style.FILL);
        setLayerType(1, this.G);
        this.H.setColor(this.z.b(context));
        this.H.setStyle(Paint.Style.FILL);
        this.I.setColorFilter(new LightingColorFilter(0, this.A.b(context)));
        this.I.setTextSize(w.e(context));
        this.I.setTypeface(x);
    }

    public final void g(String str) {
        this.h = str;
        l();
        if (h() || this.b.isRunning()) {
            return;
        }
        this.a.cancel();
        this.c.cancel();
        this.b.cancel();
        this.b.start();
    }

    public final boolean h() {
        return this.B == 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        btrm btrmVar = this.k;
        if (btrmVar != null) {
            dceq a = dcet.a();
            a.b(alhw.class, new asvs(0, alhw.class, this, bvrj.UI_THREAD));
            a.b(alid.class, new asvs(1, alid.class, this, bvrj.UI_THREAD));
            btrmVar.g(this, a.a());
        }
        aufc aufcVar = this.l;
        if (aufcVar != null) {
            aufcVar.i().d(this.S, dege.a);
        }
        if (this.d == null) {
            View childAt = getChildAt(0);
            dbsk.s(childAt);
            this.d = childAt;
            childAt.setVisibility(0);
            this.d.setOnClickListener(new asvl(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        btrm btrmVar = this.k;
        if (btrmVar != null) {
            btrmVar.a(this);
        }
        aufc aufcVar = this.l;
        if (aufcVar != null) {
            aufcVar.i().c(this.S);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int e;
        float f;
        String str;
        if (this.Q == null) {
            return;
        }
        canvas.getClipBounds(this.J);
        int i = this.J.top;
        int i2 = this.J.right;
        float f2 = this.B;
        int e2 = i().e(getContext());
        int n2 = n();
        if (j()) {
            e = r.e(getContext());
        } else {
            e = q.e(getContext());
        }
        float f3 = e2;
        this.L.right = (i2 - getPaddingRight()) - m();
        this.L.top = i + getPaddingTop() + ((int) ((getHeight() - f) / 2.0f));
        RectF rectF = this.L;
        rectF.left = rectF.right - (f3 + (f2 * (n2 - e2)));
        RectF rectF2 = this.L;
        rectF2.bottom = rectF2.top + ((e - e2) * f2) + f3;
        float height = this.L.height() / 2.0f;
        float f4 = this.L.left;
        p(this.L, this.J.left, this.J.right);
        float e3 = p.e(getContext());
        float f5 = height - e3;
        this.M.right = this.L.right - e3;
        this.M.left = this.L.left + e3;
        this.M.top = this.L.top + e3;
        this.M.bottom = this.L.bottom - e3;
        int n3 = n();
        RectF rectF3 = this.L;
        int length = this.Q.length;
        float width = rectF3.width();
        float min = Math.min(width, n3 / length);
        float max = Math.max((width - min) / (length - 1), 0.0f);
        float f6 = rectF3.left;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof asvf) {
                asvf asvfVar = (asvf) getChildAt(i3);
                this.P.top = rectF3.top;
                this.P.bottom = rectF3.bottom;
                this.P.left = f6;
                boolean equals = this.e.equals(asvfVar.c);
                boolean o2 = o(asvfVar.c);
                if (equals) {
                    this.P.right = f6 + min;
                } else if (!o2) {
                    RectF rectF4 = this.P;
                    rectF4.right = rectF4.left;
                } else {
                    this.P.right = f6 + max;
                }
                f6 = this.P.right;
                p(this.P, rectF3.left, rectF3.right);
                RectF rectF5 = this.P;
                float f7 = this.B;
                asvfVar.e = rectF5;
                asvfVar.f = equals;
                asvfVar.g = o2;
                asvfVar.h = f7;
                asvfVar.d();
            }
        }
        canvas.drawRoundRect(this.L, height, height, this.F);
        canvas.drawRoundRect(this.M, f5, f5, this.G);
        if (!h() || (str = this.h) == null) {
            return;
        }
        this.I.getTextBounds(str, 0, str.length(), this.O);
        int e4 = v.e(getContext());
        int e5 = u.e(getContext());
        int height2 = this.O.height();
        float width2 = this.O.width() + e5 + e5;
        float f8 = this.C;
        float f9 = height2 + e4 + e4;
        float f10 = f9 / 2.0f;
        this.N.left = (f4 - t.e(getContext())) - width2;
        this.N.top = this.M.top + ((this.M.height() - f9) / 2.0f);
        RectF rectF6 = this.N;
        rectF6.right = rectF6.left + (width2 * f8);
        RectF rectF7 = this.N;
        rectF7.bottom = rectF7.top + f9;
        p(this.N, this.J.left, this.J.right);
        this.H.setAlpha((int) this.D);
        canvas.drawRoundRect(this.N, f10, f10, this.H);
        float f11 = this.N.left;
        float f12 = this.N.bottom;
        int i4 = this.O.bottom;
        this.I.setAlpha((int) this.E);
        canvas.drawText(this.h, (int) (f11 + e5), (int) ((f12 - e4) - i4), this.I);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int NR;
        if (this.Q == null) {
            return;
        }
        int i5 = i3 - i;
        if (j()) {
            NR = cjxh.d.NR(getContext());
        } else {
            NR = cjxh.a.NR(getContext());
        }
        this.K.right = i5 - getPaddingRight();
        this.K.top = getPaddingTop() + ((getHeight() - NR) / 2);
        RectF rectF = this.K;
        float f = NR;
        rectF.left = rectF.right - f;
        RectF rectF2 = this.K;
        rectF2.bottom = rectF2.top + f;
        p(this.K, 0.0f, i5);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).layout((int) this.K.left, (int) this.K.top, (int) this.K.right, (int) this.K.bottom);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int e;
        int NR;
        int e2;
        if (this.Q == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (this.j) {
            e = o.NR(getContext());
        } else {
            e = n.e(getContext());
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof asvf) {
                asvf asvfVar = (asvf) getChildAt(i5);
                if (o(asvfVar.c)) {
                    String c = asvfVar.c();
                    this.I.getTextBounds(c, 0, c.length(), this.O);
                    i4 = Math.max(i4, this.O.width());
                    i3 = Math.max(i3, this.O.height());
                }
            }
        }
        int e3 = v.e(getContext());
        int e4 = u.e(getContext());
        int i6 = i3 + e3 + e3;
        int i7 = i4 + e4 + e4;
        int i8 = e + e;
        int e5 = i().e(getContext()) + i8;
        if (j()) {
            NR = cjxh.d.NR(getContext());
        } else {
            NR = cjxh.a.NR(getContext());
        }
        int e6 = t.e(getContext());
        int max = Math.max(i6, NR);
        int i9 = i7 + e6 + e5;
        if (j()) {
            e2 = r.e(getContext());
        } else {
            e2 = q.e(getContext());
        }
        int e7 = this.R.e(getContext());
        int m = m();
        setMeasuredDimension(Math.max(i9, e7 + e + m), Math.max(max, e2 + i8));
    }

    public void setButtonProgress(float f) {
        this.B = f;
        invalidate();
    }

    public void setButtonSize(cjxf cjxfVar) {
        if (this.f == cjxfVar) {
            return;
        }
        this.f = cjxfVar;
        this.R = r(cjxfVar);
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof asvf) {
                ((asvf) getChildAt(i)).setButtonSize(cjxfVar);
            }
        }
        requestLayout();
    }

    public void setShowPowerSaveColors(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        f(getContext());
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof asvf) {
                ((asvf) getChildAt(i)).setShowPowerSaveColors(z);
            }
        }
    }

    public void setTextBackExpandProgress(float f) {
        this.C = f;
        invalidate();
    }

    public void setTextBackFadeProgress(float f) {
        this.D = f;
        invalidate();
    }

    public void setTextFadeProgress(float f) {
        this.E = f;
        invalidate();
    }

    public asvq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public asvq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = new Paint(1);
        this.G = new Paint(1);
        this.H = new Paint(1);
        this.I = new Paint(1);
        this.J = new Rect();
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Rect();
        this.P = new RectF();
        this.f = cjxf.MEDIUM;
        this.g = false;
        this.R = r(cjxf.MEDIUM);
        this.i = true;
        this.j = false;
        this.S = new asvk(this);
        this.k = ((btri) btsr.a(btri.class)).rz();
        this.l = ((aufd) btsr.a(aufd.class)).sB();
        this.m = ((cjqz) btsr.a(cjqz.class)).tr();
        ((bvjq) btsr.a(bvjq.class)).rB();
        final aufc aufcVar = this.l;
        aufcVar.getClass();
        this.y = iva.d(new aufe(aufcVar) { // from class: asvh
            private final aufc a;

            {
                this.a = aufcVar;
            }

            @Override // defpackage.aufe
            public final boolean b() {
                return this.a.b();
            }
        }, cqrt.c(R.color.mod_grey650_alpha40), ibl.k());
        final aufc aufcVar2 = this.l;
        aufcVar2.getClass();
        this.z = iva.d(new aufe(aufcVar2) { // from class: asvi
            private final aufc a;

            {
                this.a = aufcVar2;
            }

            @Override // defpackage.aufe
            public final boolean b() {
                return this.a.b();
            }
        }, ibl.b(), ibl.d());
        final aufc aufcVar3 = this.l;
        aufcVar3.getClass();
        this.A = iva.d(new aufe(aufcVar3) { // from class: asvj
            private final aufc a;

            {
                this.a = aufcVar3;
            }

            @Override // defpackage.aufe
            public final boolean b() {
                return this.a.b();
            }
        }, ibl.q(), ibl.b());
        e();
        f(context);
        ValueAnimator k = k(0.0f, 1.0f, "buttonProgress", 250L);
        this.a = k;
        k.addListener(new asvn(this));
        this.b = new AnimatorSet();
        ValueAnimator k2 = k(1.0f, 0.0f, "buttonProgress", 250L);
        k2.addListener(new asvo(this));
        ValueAnimator k3 = k(0.0f, 1.0f, "textBackExpandProgress", 100L);
        this.b.play(k3).after(k2);
        ValueAnimator k4 = k(100.0f, 180.0f, "textBackFadeProgress", 500L);
        this.b.play(k4).after(k2);
        ValueAnimator k5 = k(0.0f, 255.0f, "textFadeProgress", 400L);
        this.b.play(k5).after(k3);
        ValueAnimator k6 = k(180.0f, 0.0f, "textBackFadeProgress", 500L);
        k6.setStartDelay(2500L);
        this.b.play(k6).after(k5);
        ValueAnimator k7 = k(255.0f, 0.0f, "textFadeProgress", 500L);
        k7.setStartDelay(2500L);
        this.b.play(k7).after(k5);
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(k4).with(k3);
        this.c.play(k5).after(k3);
        this.c.play(k6).after(k5);
        this.c.play(k7).after(k5);
        setWillNotDraw(false);
    }

    public void setProperties(asvr asvrVar) {
        cren[] crenVarArr = this.Q;
        int length = crenVarArr == null ? 0 : crenVarArr.length;
        this.e = asvrVar.a;
        this.Q = asvrVar.b;
        asvm asvmVar = new asvm(this, asvrVar);
        l();
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof asvf) {
                asvf asvfVar = (asvf) getChildAt(i);
                cren crenVar = asvfVar.c;
                cren crenVar2 = this.e;
                if (crenVar == crenVar2 && !crenVar2.equals(cren.UNMUTED)) {
                    this.h = asvfVar.c();
                }
                asvfVar.setMuteLevelChangedListener(asvmVar);
            }
        }
        if (length != asvrVar.b.length) {
            requestLayout();
        }
        if (this.i) {
            this.i = false;
            if (this.h != null && !this.e.equals(cren.UNMUTED)) {
                this.c.cancel();
                this.c.start();
            }
        }
        invalidate();
    }
}
