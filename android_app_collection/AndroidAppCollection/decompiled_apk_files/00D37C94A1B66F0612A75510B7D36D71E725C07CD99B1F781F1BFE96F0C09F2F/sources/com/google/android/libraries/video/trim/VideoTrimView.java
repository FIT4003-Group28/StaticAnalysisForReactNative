package com.google.android.libraries.video.trim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoTrimView extends ViewGroup implements vvr, vqs, vqm {
    private final Rect A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;

    /* renamed from: J  reason: collision with root package name */
    private final int f161J;
    private final int K;
    private final int L;
    private int M;
    private final boolean N;
    private final boolean O;
    private final boolean P;
    private final boolean Q;
    private final boolean R;
    private final boolean S;
    private final vwd T;
    private final vwf U;
    private final ImageView V;
    private final ImageView W;
    public final float a;
    private final List aa;
    private final List ab;
    private vqr ac;
    private VideoMetaData ad;
    private vvs ae;
    private vvs af;
    private final Drawable ag;
    private int ah;
    private float ai;
    private float aj;
    private float ak;
    private long al;
    private long am;
    private int an;
    private long ao;
    private int ap;
    private Animator aq;
    private Animator ar;
    private final vvu as;
    private long at;
    private final int au;
    public final int b;
    public final int c;
    public final boolean d;
    final Paint e;
    public final vvy f;
    public float g;
    public boolean h;
    public boolean i;
    public vqi j;
    public boolean k;
    public boolean l;
    public float m;
    public long n;
    public vwe o;
    public final Rect p;
    public vqp q;
    public vvl r;
    public vvs s;
    public vvt t;
    public vwg u;
    public boolean v;
    public float w;
    public zwm x;
    private boolean y;
    private final Rect z;

    /* JADX WARN: Removed duplicated region for block: B:10:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoTrimView(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.video.trim.VideoTrimView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final float A() {
        return this.W.getX() + this.D;
    }

    private final float B(long j) {
        return (this.q.b(j) * this.p.width()) + this.p.left;
    }

    private final float C() {
        return ((this.W.getX() + this.E) - this.as.a()) + this.as.b;
    }

    private final float D() {
        float x = this.V.getX();
        int i = this.D;
        return ((x + (i + i)) - this.E) - this.as.b;
    }

    private static long E(long j, long j2, long j3) {
        return Math.abs(j2 - j) < Math.abs(j3 - j) ? j2 : j3;
    }

    private final long F(long j) {
        VideoMetaData videoMetaData;
        vwg vwgVar = vwg.BEGIN;
        int i = this.au;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 1) {
                return (i2 == 2 && (videoMetaData = this.ad) != null) ? E(j, this.ad.l(videoMetaData.b(j)), d()) : j;
            }
            long E = E(j, 0L, d());
            vvg g = this.af.g(j, false);
            if (g == null) {
                return E;
            }
            long E2 = E(j, g.a(), E);
            g.d();
            return E2;
        }
        throw null;
    }

    private final ImageView K(Context context, int i) {
        vvx vvxVar = new vvx(context, i, this.F);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(vvxVar);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    private final vwe L(int i) {
        boolean z = false;
        aqxo.p(i >= 0);
        if (i == 0) {
            return vwe.a;
        }
        VideoMetaData videoMetaData = this.ad;
        float a = videoMetaData != null ? videoMetaData.a() : 1.7777778f;
        vqr vqrVar = this.ac;
        if (vqrVar != null) {
            int f = ((vqrVar.f() % 360) + 360) % 360;
            if (f % 90 == 0 && f >= 0) {
                z = true;
            }
            aqxo.p(z);
            if (f == 90 || f == 270) {
                a = 1.0f / a;
            }
        }
        int i2 = this.B;
        int i3 = this.C;
        int max = Math.max(1, (int) Math.floor((i + i3) / ((i2 * a) + i3)));
        float f2 = (i - (this.C * (max - 1))) / max;
        return new vwe(f2, f2 / a, max);
    }

    private final void M(ImageView imageView, RectF rectF) {
        float f = this.H / 2.0f;
        float x = imageView.getX() + this.D;
        float f2 = x - f;
        float f3 = x + f;
        float f4 = 0.0f;
        if (f2 < 0.0f) {
            f4 = -f2;
        } else if (f3 > getWidth()) {
            f4 = getWidth() - f3;
        }
        rectF.left = f2 + f4;
        rectF.top = imageView.getTop();
        rectF.right = f3 + f4;
        rectF.bottom = imageView.getBottom();
    }

    private final void N(boolean z, boolean z2) {
        ImageView imageView;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z2) {
            Animator animator = this.aq;
            if (animator != null) {
                animator.cancel();
            }
            this.aq = animatorSet;
            imageView = this.V;
        } else {
            Animator animator2 = this.ar;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.ar = animatorSet;
            imageView = this.W;
        }
        float scaleX = imageView.getScaleX();
        float f = 2.0f;
        float f2 = (true != z ? 1.0f : 2.0f) * this.a;
        long integer = getContext().getResources().getInteger(17694720);
        AnimatorSet.Builder with = animatorSet.play(ObjectAnimator.ofFloat(imageView, View.SCALE_X, scaleX, f2)).with(ObjectAnimator.ofFloat(imageView, View.SCALE_Y, scaleX, f2));
        float translationZ = imageView.getTranslationZ();
        if (true != z) {
            f = 0.0f;
        }
        with.with(ObjectAnimator.ofFloat(imageView, View.TRANSLATION_Z, translationZ, f * this.a));
        animatorSet.setDuration(integer);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    private final void O() {
        if (this.Q && w()) {
            N(false, this.u == vwg.BEGIN);
        }
        if (this.v) {
            aqxo.y(true);
            this.ac.s(this.u.e);
            this.v = false;
            vqi vqiVar = this.j;
            if (vqiVar != null) {
                vqiVar.a();
            }
            if (x()) {
                aqxo.y(x());
                this.g = 0.0f;
                vqp vqpVar = this.q;
                vqpVar.k(0L, vqpVar.b);
                l();
                s();
                this.t.l(this);
                this.t.j();
                this.t = null;
            }
            this.U.a(0.0f);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.u = null;
        }
    }

    private final void P(float f) {
        if (!this.S) {
            return;
        }
        float D = D();
        float C = C() - D;
        if (C == 0.0f) {
            return;
        }
        int a = this.as.a();
        long h = h();
        long g = g();
        o(Math.max(h, Math.min(((((f - D) - (a / 2.0f)) / C) * ((float) (g - h))) + h, g)));
        vqy.b("PlayheadPositionListener is null.");
    }

    private final void Q(float f, float f2) {
        float f3;
        this.V.setX(f - this.D);
        this.W.setX(f2 - this.D);
        int i = this.D;
        float f4 = ((i + i) + f) - f2;
        if (f4 > 0.0f) {
            float f5 = i;
            f3 = (f5 - f4) / f5;
        } else {
            f3 = 1.0f;
        }
        ((vvx) this.V.getDrawable()).a(f3, false);
        ((vvx) this.W.getDrawable()).a(f3, true);
        S();
        vvy vvyVar = this.f;
        vvyVar.b = f;
        vvyVar.c = f2;
        if (this.u != vwg.BEGIN) {
            f = f2;
        }
        T(f);
    }

    private final void R(long j) {
        VideoMetaData videoMetaData;
        int g;
        if (j < 0) {
            this.an = -1;
            this.ao = -1L;
        } else if (!this.O || (videoMetaData = this.ad) == null || (g = videoMetaData.g(j)) == this.an) {
        } else {
            if (x() && !v()) {
                this.ao = System.currentTimeMillis();
                this.ap = this.L;
                postDelayed(new Runnable() { // from class: vvz
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoTrimView.this.v();
                    }
                }, this.ap);
            }
            this.an = g;
        }
    }

    private final void S() {
        if (this.S && this.at >= 0) {
            long h = h();
            long g = g();
            if (h == g) {
                return;
            }
            float D = D();
            float C = C();
            double d = D;
            double d2 = this.at - h;
            double d3 = g - h;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = d2 / d3;
            double d5 = C - D;
            Double.isNaN(d5);
            Double.isNaN(d);
            this.as.setX((float) Math.max(d, Math.min((d4 * d5) + d, C)));
        }
    }

    private final void T(float f) {
        long g;
        boolean z;
        vqg vqgVar;
        if (!w() || this.j == null) {
            return;
        }
        if (this.u == vwg.BEGIN) {
            g = h();
            z = true;
        } else {
            g = g();
            z = false;
        }
        String f2 = vqw.f(getContext(), g / 1000, x());
        if (this.U.b()) {
            f = f < ((float) this.p.centerX()) ? this.p.left : this.p.right;
        }
        float strokeWidth = this.e.getStrokeWidth() / 2.0f;
        if (z) {
            strokeWidth = -strokeWidth;
        }
        int i = -this.G;
        vqi vqiVar = this.j;
        int i2 = (int) (f + strokeWidth);
        if (vqiVar.b == null || (vqgVar = vqiVar.c) == null) {
            return;
        }
        vqgVar.e(f2);
        int[] c = vqiVar.c(i2, i, this);
        vqiVar.c.d(c[0], c[1], vqiVar.a.getWidth());
    }

    private static final float U(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(findPointerIndex);
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private final float z() {
        return this.V.getX() + this.D;
    }

    @Override // defpackage.vvr
    public final void G(Exception exc) {
        vqy.c("Failed to render thumbnail", exc);
    }

    @Override // defpackage.vqm
    public final void H() {
        t(this.o);
        u();
        requestLayout();
    }

    @Override // defpackage.vvr
    public final void I(vvg vvgVar) {
    }

    @Override // defpackage.vqm
    public final void J() {
    }

    @Override // defpackage.vqs
    public final void a(vqr vqrVar, Set set) {
        R(-1L);
    }

    @Override // defpackage.vqs
    public final void b(vqr vqrVar, int i) {
        if (i == 0) {
            if (!this.v) {
                u();
                invalidate();
            }
            R(h());
        } else if (i != 1) {
            if (i != 2) {
                return;
            }
            t(L(this.p.width()));
        } else {
            if (!this.v) {
                u();
                invalidate();
            }
            R(g());
        }
    }

    @Override // defpackage.vqs
    public final void c(vqr vqrVar, Set set) {
        R(-1L);
    }

    public final long d() {
        VideoMetaData videoMetaData = this.ad;
        if (videoMetaData == null) {
            return 1L;
        }
        return videoMetaData.g;
    }

    public final long e() {
        vqr vqrVar = this.ac;
        if (vqrVar == null) {
            return 1L;
        }
        return vqrVar.j();
    }

    public final long f(float f) {
        return this.q.e((f - this.p.left) / this.p.width());
    }

    public final long g() {
        vqr vqrVar = this.ac;
        return vqrVar == null ? d() : vqrVar.l();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        if (!this.P) {
            return super.getPaddingLeft();
        }
        return Math.max((super.getPaddingLeft() - this.D) + (this.F / 2), 0);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        if (!this.P) {
            return super.getPaddingRight();
        }
        return Math.max((super.getPaddingRight() - this.D) + (this.F / 2), 0);
    }

    public final long h() {
        vqr vqrVar = this.ac;
        if (vqrVar == null) {
            return 0L;
        }
        return vqrVar.n();
    }

    public final void i(vvk vvkVar) {
        vvkVar.b(null);
        vvkVar.setCallback(null);
        this.aa.remove(vvkVar);
    }

    public final void j() {
        vqi vqiVar;
        aqxo.y(this.u != null);
        aqxo.y(!this.v);
        this.v = true;
        this.ac.r(this.u.e);
        if (w() && (vqiVar = this.j) != null) {
            vqiVar.b();
            T(B(this.u == vwg.BEGIN ? h() : g()));
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        zwm zwmVar = this.x;
        if (zwmVar == null || this.y) {
            return;
        }
        zwmVar.a("trim_handle_interaction");
        this.y = true;
    }

    public final void k(int i) {
        if (this.N) {
            ((Vibrator) getContext().getSystemService("vibrator")).vibrate(i);
        }
    }

    public final void l() {
        ArrayList arrayList = new ArrayList(this.ab);
        this.ab.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vvk vvkVar = (vvk) arrayList.get(i);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(vvkVar, "alpha", 0);
            ofInt.addListener(new vwc(this, vvkVar));
            ofInt.start();
        }
        this.q.g = true;
        t(this.o);
        for (vvk vvkVar2 : this.ab) {
            vvkVar2.c(true);
            ObjectAnimator.ofInt(vvkVar2, "alpha", 0, PrivateKeyType.INVALID).start();
        }
        this.q.g = false;
    }

    public final void m(long j) {
        long F = F(j);
        if (this.au == 3) {
            long g = g();
            if (g - F < e()) {
                F = this.ad.l(this.ad.e((g - e()) - 1));
            }
        }
        this.ac.D(F);
        o(F);
    }

    public final void n(long j) {
        long F = F(j);
        if (this.au == 3) {
            long h = h();
            if (F - h < e()) {
                int c = this.ad.c(h + e() + 1);
                F = c < 0 ? d() : this.ad.l(c);
            }
        }
        this.ac.C(F);
        o(F);
    }

    public final void o(long j) {
        if (!this.S) {
            return;
        }
        this.at = j;
        S();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.z);
        canvas.drawColor(getResources().getColor(R.color.trim_view_background_color));
        canvas.save();
        canvas.clipRect(B(0L), this.z.top, B(d()), this.z.bottom);
        if (this.i) {
            for (vvk vvkVar : this.aa) {
                vvkVar.a(canvas, this.ac.f());
            }
        } else {
            aqxo.p(this.p.width() >= 0);
            float f = this.B;
            int i = this.C;
            vwe vweVar = new vwe(f, this.B, Math.max(1, (int) Math.ceil((width + i) / (i + f))));
            float f2 = vweVar.b + this.C;
            int i2 = vweVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                float f3 = this.p.left + (i3 * f2);
                float f4 = vweVar.b;
                float paddingTop = getPaddingTop();
                this.ag.setBounds((int) f3, (int) paddingTop, (int) (f3 + f4), (int) (paddingTop + vweVar.c));
                this.ag.draw(canvas);
            }
        }
        canvas.restore();
        this.f.draw(canvas);
        if (this.l) {
            float strokeWidth = this.e.getStrokeWidth() / 2.0f;
            canvas.drawRect(z(), this.p.top + strokeWidth, A(), this.p.bottom - strokeWidth, this.e);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.T.a();
                    O();
                }
            } else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.ah)) {
                this.T.a();
                O();
            }
        } else if (motionEvent.getPointerCount() == 1) {
            int pointerId = motionEvent.getPointerId(0);
            this.ah = pointerId;
            float U = U(motionEvent, pointerId);
            this.w = U;
            RectF rectF = new RectF();
            M(this.V, rectF);
            float f = rectF.left;
            float f2 = rectF.right;
            M(this.W, rectF);
            float f3 = rectF.left;
            float f4 = rectF.right;
            if (f2 > f3) {
                float f5 = (f2 - f3) / 2.0f;
                f -= f5;
                f2 -= f5;
                f3 += f5;
                f4 += f5;
            }
            vwg vwgVar = null;
            if (U >= f && U <= f2) {
                vwgVar = vwg.BEGIN;
            } else if (U >= f3 && U <= f4) {
                vwgVar = vwg.END;
            } else if (U > f2 && U < f3) {
                if (this.S) {
                    vwgVar = vwg.PLAYHEAD;
                } else {
                    vwgVar = vwg.BOTH;
                }
            }
            this.u = vwgVar;
            if (vwgVar != null) {
                s();
                if (w()) {
                    this.T.b(this.M, this.w);
                    if (this.Q && !this.v) {
                        N(true, this.u == vwg.BEGIN);
                    }
                }
                P(this.w);
            }
        }
        return this.u != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.z.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.p.left = Math.min(this.z.left + this.D, this.z.right);
        this.p.top = this.z.top;
        this.p.right = Math.max(this.z.right - this.D, this.z.left);
        this.p.bottom = this.z.bottom;
        if (this.S) {
            int i5 = this.p.left;
            vvu vvuVar = this.as;
            int i6 = i5 - vvuVar.b;
            this.as.layout(i6, 0, vvuVar.a() + i6, getHeight());
        }
        int i7 = this.z.top;
        int i8 = this.z.bottom;
        int i9 = this.p.left;
        int i10 = this.D;
        int i11 = i9 - i10;
        this.V.layout(i11, i7, i10 + i10 + i11, i8);
        int i12 = this.p.right;
        int i13 = this.D;
        int i14 = i12 - i13;
        this.W.layout(i14, i7, i13 + i13 + i14, i8);
        u();
        vwe L = L(this.p.width());
        if (!y(L, this.o)) {
            t(L);
        }
        if (!this.P || x() || this.q.j()) {
            this.f.setBounds(this.z);
        } else {
            this.f.setBounds(this.p);
        }
        getHitRect(this.A);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(amuk.r(this.A));
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        aqxo.y(View.MeasureSpec.getMode(i) != 0);
        setMeasuredDimension(resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), resolveSizeAndState(getPaddingTop() + this.B + getPaddingBottom(), i2, 0));
        int i3 = this.D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 + i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.B, 1073741824);
        if (this.S) {
            this.as.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        this.V.measure(makeMeasureSpec, makeMeasureSpec2);
        this.W.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.y = bundle.getBoolean("trimHandleInteractionAlreadyLogged");
            parcelable = bundle.getParcelable("superViewInstanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superViewInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("trimHandleInteractionAlreadyLogged", this.y);
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r1 != 6) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.video.trim.VideoTrimView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(final vqr vqrVar, vvl vvlVar, vqp vqpVar) {
        VideoMetaData videoMetaData;
        boolean z = true;
        if (vqrVar != null) {
            vvlVar.getClass();
            videoMetaData = vqrVar.b;
            aqxo.p(videoMetaData.equals(((vvm) vvlVar).a));
            boolean L = vqrVar.L();
            this.l = L;
            if (L) {
                this.V.setVisibility(0);
                this.W.setVisibility(0);
            } else {
                this.V.setVisibility(8);
                this.W.setVisibility(8);
            }
        } else {
            aqxo.p(vvlVar == null);
            videoMetaData = null;
        }
        vqpVar.getClass();
        if (!y(vqrVar, this.ac) || vvlVar != this.r) {
            if (this.ac != null) {
                O();
                this.ac.u(this);
                this.r = null;
                this.s.l(this);
                this.s = null;
                this.ae.l(this);
                this.ae = null;
                this.af = null;
                if (this.t != null) {
                    z = false;
                }
                aqxo.y(z);
            }
            this.ac = vqrVar;
            this.ad = videoMetaData;
            this.r = vvlVar;
            final vwe L2 = L(this.p.width());
            vqr vqrVar2 = this.ac;
            if (vqrVar2 != null) {
                vqrVar2.q(this);
                vvs a = this.r.a();
                this.s = a;
                a.k(this);
                vvs b = this.r.b();
                this.ae = b;
                b.k(this);
                this.af = ((vvm) this.r).c;
            }
            if (this.au == 3 && this.ad != null) {
                vqr vqrVar3 = this.ac;
                long h = (vqrVar3 == null ? 0L : vqrVar3.h()) * 10;
                this.n = h;
                this.m = (float) (h / 2000);
            }
            vqp vqpVar2 = this.q;
            if (vqpVar2 != null) {
                vqpVar2.h(this);
            }
            this.q = vqpVar;
            vqpVar.f(this);
            post(new Runnable() { // from class: vwb
                @Override // java.lang.Runnable
                public final void run() {
                    VideoTrimView videoTrimView = VideoTrimView.this;
                    vwe vweVar = L2;
                    vqr vqrVar4 = vqrVar;
                    videoTrimView.t(vweVar);
                    videoTrimView.f.a = vqrVar4;
                    videoTrimView.requestLayout();
                }
            });
        }
    }

    @Override // defpackage.vvr
    public final void q(final vvs vvsVar) {
        post(new Runnable() { // from class: vwa
            @Override // java.lang.Runnable
            public final void run() {
                VideoTrimView videoTrimView = VideoTrimView.this;
                vvs vvsVar2 = vvsVar;
                if (!videoTrimView.q.j() && vvsVar2 == videoTrimView.s) {
                    videoTrimView.i = true;
                    videoTrimView.h = videoTrimView.d;
                    videoTrimView.t(videoTrimView.o);
                }
            }
        });
    }

    @Override // defpackage.vqm
    public final void r(vqp vqpVar) {
        for (vvk vvkVar : this.aa) {
            float B = B(vvkVar.b);
            Rect bounds = vvkVar.getBounds();
            float centerX = bounds.centerX() - B;
            if (centerX != 0.0f) {
                int i = (int) (bounds.left - centerX);
                vvkVar.setBounds(i, bounds.top, bounds.width() + i, bounds.bottom);
            }
        }
        u();
        invalidate();
    }

    public final void s() {
        this.ai = this.w;
        this.al = h();
        this.am = g();
        this.aj = z();
        this.ak = A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
        if (java.lang.Math.abs(r10 - r14) >= java.lang.Math.abs(r10 - r12)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.vwe r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.video.trim.VideoTrimView.t(vwe):void");
    }

    protected final void u() {
        Q(B(h()), B(g()));
    }

    public final boolean v() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.ao >= this.ap) {
            k(this.f161J);
            this.ap = this.K;
            this.ao = currentTimeMillis;
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof vvk);
    }

    public final boolean w() {
        return this.u == vwg.BEGIN || this.u == vwg.END;
    }

    public final boolean x() {
        return this.q.c;
    }
}
