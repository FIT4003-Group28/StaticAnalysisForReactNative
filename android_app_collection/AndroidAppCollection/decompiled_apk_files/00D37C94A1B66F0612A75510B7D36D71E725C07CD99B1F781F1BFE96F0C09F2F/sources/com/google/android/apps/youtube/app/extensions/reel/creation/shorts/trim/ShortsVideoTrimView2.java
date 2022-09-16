package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim;

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
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsVideoTrimView2 extends ViewGroup implements vvr, vqs, vqm {
    public float A;
    public long B;
    public hiy C;
    private boolean D;
    private final Rect E;
    private final Rect F;
    private final vqi G;
    private final int H;
    private final int I;

    /* renamed from: J  reason: collision with root package name */
    private final int f147J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private final boolean R;
    private int S;
    private final boolean T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    public gyq a;
    private long aA;
    private long aB;
    private long aC;
    private long aD;
    private int aE;
    private long aF;
    private int aG;
    private Animator aH;
    private Animator aI;
    private final vvu aJ;
    private final int aK;
    private final boolean aa;
    private final boolean ab;
    private final hiw ac;
    private final hka ad;
    private final hjw ae;
    private final hjy af;
    private final ImageView ag;
    private final ImageView ah;
    private final View ai;
    private final List aj;
    private final List ak;
    private boolean al;
    private VideoMetaData am;
    private vvs an;
    private vvs ao;
    private final Drawable ap;
    private final Vibrator aq;
    private int ar;
    private long as;
    private float at;
    private float au;
    private float av;
    private float aw;
    private float ax;
    private float ay;
    private float az;
    public hjx b;
    public final float c;
    public final int d;
    public final int e;
    public final vfy f;
    final Paint g;
    public final vvy h;
    public float i;
    public boolean j;
    public vqi k;
    public boolean l;
    public boolean m;
    public long n;
    public long o;
    public float p;
    public long q;
    public hjz r;
    public final Rect s;
    public vqp t;
    public vqr u;
    public vvl v;
    public vvt w;
    public vvt x;
    public hkc y;
    public boolean z;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShortsVideoTrimView2(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static boolean F(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private final float K() {
        return this.ag.getX() + this.f147J;
    }

    private final float L() {
        return this.ah.getX() + this.f147J;
    }

    private final float M(float f) {
        return (f - this.s.left) / this.s.width();
    }

    private static float N(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(findPointerIndex);
    }

    private final float O(long j) {
        vqp vqpVar = this.t;
        return ((vqpVar == null ? 0.0f : vqpVar.b(j)) * this.s.width()) + this.s.left;
    }

    private final float P() {
        return ((this.ah.getX() + this.K) - this.aJ.a()) + this.aJ.b;
    }

    private final float Q() {
        float x = this.ag.getX();
        int i = this.f147J;
        return ((x + (i + i)) - this.K) - this.aJ.b;
    }

    private static long R(long j, long j2, long j3) {
        return Math.abs(j2 - j) < Math.abs(j3 - j) ? j2 : j3;
    }

    private final long S(long j) {
        VideoMetaData videoMetaData;
        hkc hkcVar = hkc.BEGIN;
        int i = this.aK;
        int i2 = i - 1;
        vvg vvgVar = null;
        if (i != 0) {
            if (i2 != 1) {
                return (i2 == 2 && (videoMetaData = this.am) != null) ? R(j, this.am.l(videoMetaData.b(j)), e()) : j;
            }
            long R = R(j, 0L, e());
            vvs vvsVar = this.ao;
            if (vvsVar != null) {
                vvgVar = vvsVar.g(j, false);
            }
            if (vvgVar == null) {
                return R;
            }
            long R2 = R(j, vvgVar.a(), R);
            vvgVar.d();
            return R2;
        }
        throw null;
    }

    private final ImageView T(Context context, int i) {
        vvx vvxVar = new vvx(context, i, this.L);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(vvxVar);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    private final hjz U(int i) {
        boolean z = false;
        aqxo.p(i >= 0);
        if (i == 0) {
            return hjz.a;
        }
        VideoMetaData videoMetaData = this.am;
        float a = videoMetaData != null ? videoMetaData.a() : 1.7777778f;
        vqr vqrVar = this.u;
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
        int i2 = this.H;
        int i3 = this.I;
        int max = Math.max(1, (int) Math.floor((i + i3) / ((i2 * a) + i3)));
        float f2 = (i - (this.I * (max - 1))) / max;
        return new hjz(f2, f2 / a, max);
    }

    private final void V(ImageView imageView, RectF rectF) {
        float f = this.M / 2.0f;
        float x = imageView.getX() + this.f147J;
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

    private final void W(boolean z, boolean z2) {
        ImageView imageView;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z2) {
            Animator animator = this.aH;
            if (animator != null) {
                animator.cancel();
            }
            this.aH = animatorSet;
            imageView = this.ag;
        } else {
            Animator animator2 = this.aI;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.aI = animatorSet;
            imageView = this.ah;
        }
        float scaleX = imageView.getScaleX();
        float f = 2.0f;
        float f2 = (true != z ? 1.0f : 2.0f) * this.c;
        long integer = getContext().getResources().getInteger(17694720);
        AnimatorSet.Builder with = animatorSet.play(ObjectAnimator.ofFloat(imageView, View.SCALE_X, scaleX, f2)).with(ObjectAnimator.ofFloat(imageView, View.SCALE_Y, scaleX, f2));
        float translationZ = imageView.getTranslationZ();
        if (true != z) {
            f = 0.0f;
        }
        with.with(ObjectAnimator.ofFloat(imageView, View.TRANSLATION_Z, translationZ, f * this.c));
        animatorSet.setDuration(integer);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    private final void X() {
        hkc hkcVar;
        if (this.W && B()) {
            W(false, this.y == hkc.BEGIN);
        }
        if (this.z) {
            aqxo.y(true);
            vqr vqrVar = this.u;
            if (vqrVar != null && (hkcVar = this.y) != null) {
                vqrVar.s(hkcVar.e);
            }
            this.z = false;
            vqi vqiVar = this.k;
            if (vqiVar != null) {
                vqiVar.a();
            }
            if (E()) {
                aqxo.y(E());
                this.i = 0.0f;
                long j = this.n;
                long j2 = this.o;
                if (j > k()) {
                    j = k();
                    j2 = g() + j;
                }
                if (j2 < j()) {
                    j2 = j();
                    j = j2 - g();
                }
                vqp vqpVar = this.t;
                if (vqpVar != null) {
                    vqpVar.k(j, j2);
                }
                s();
                x();
                vvt vvtVar = this.x;
                if (vvtVar != null) {
                    vvtVar.l(this);
                    this.x.j();
                    this.x = null;
                }
            }
            this.ad.a(0.0f);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (this.y == hkc.BEGIN) {
                o();
            } else if (this.y == hkc.END) {
                o();
            }
            this.y = null;
        }
    }

    private final void Y(float f, float f2) {
        vqg vqgVar;
        this.ag.setX((f - this.f147J) + this.av);
        this.ah.setX((f2 - this.f147J) + this.aw);
        aa();
        vvy vvyVar = this.h;
        vvyVar.b = f + this.av;
        vvyVar.c = f2 + this.aw;
        if (this.G == null) {
            return;
        }
        int round = Math.round(((float) (i(L()) - i(K()))) / 100000.0f);
        String string = getContext().getResources().getString(R.string.seconds_abbr);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 15);
        sb.append(round / 10.0f);
        sb.append(string);
        String sb2 = sb.toString();
        int L = (int) (((L() - K()) / 2.0f) + K());
        int y = (int) (this.ag.getY() + (this.ag.getHeight() / 2.0f));
        vqi vqiVar = this.G;
        if (vqiVar.b == null || (vqgVar = vqiVar.c) == null) {
            return;
        }
        vqgVar.e(sb2);
        int[] c = vqiVar.c(L, y, this);
        vqg vqgVar2 = vqiVar.c;
        vqgVar2.d(c[0], c[1] + (vqgVar2.getIntrinsicHeight() / 2), vqiVar.a.getWidth());
    }

    private final void Z(long j) {
        VideoMetaData videoMetaData;
        int g;
        if (j < 0) {
            this.aE = -1;
            this.aF = -1L;
        } else if (!this.U || (videoMetaData = this.am) == null || (g = videoMetaData.g(j)) == this.aE) {
        } else {
            if (E() && !A()) {
                this.aF = System.currentTimeMillis();
                this.aG = this.Q;
                postDelayed(new Runnable() { // from class: hjo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortsVideoTrimView2.this.A();
                    }
                }, this.aG);
            }
            this.aE = g;
        }
    }

    private final void aa() {
        double max;
        if (this.ab && this.B >= 0) {
            long k = k();
            long j = j();
            if (k == j) {
                return;
            }
            float Q = Q();
            float P = P();
            float f = P - Q;
            if (f <= this.aJ.c) {
                double d = f / 2.0f;
                double d2 = Q;
                Double.isNaN(d);
                Double.isNaN(d2);
                max = d + d2;
            } else {
                double d3 = Q;
                double d4 = this.B - k;
                double d5 = j - k;
                Double.isNaN(d4);
                Double.isNaN(d5);
                double d6 = d4 / d5;
                double d7 = f;
                Double.isNaN(d7);
                Double.isNaN(d3);
                max = Math.max(d3, Math.min((d6 * d7) + d3, P));
            }
            this.aJ.setX((float) max);
        }
    }

    public final boolean A() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.aF >= this.aG) {
            n(this.O);
            this.aG = this.P;
            this.aF = currentTimeMillis;
            return true;
        }
        return false;
    }

    public final boolean B() {
        return this.y == hkc.BEGIN || this.y == hkc.END;
    }

    public final boolean C() {
        vqp vqpVar = this.t;
        return vqpVar != null && vqpVar.e(1.0f) > e();
    }

    public final boolean D() {
        vqp vqpVar = this.t;
        return vqpVar != null && vqpVar.e(0.0f) < 0;
    }

    public final boolean E() {
        vqp vqpVar = this.t;
        return vqpVar != null && vqpVar.c;
    }

    @Override // defpackage.vvr
    public final void G(Exception exc) {
        zep.d("Failed to render thumbnail", exc);
    }

    @Override // defpackage.vqm
    public final void H() {
        y(this.r);
        z();
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
        Z(-1L);
    }

    @Override // defpackage.vqs
    public final void b(vqr vqrVar, int i) {
        if (i == 0) {
            if (!this.z) {
                z();
                invalidate();
            }
            Z(k());
        } else if (i != 1) {
            if (i != 2) {
                return;
            }
            y(U(this.s.width()));
        } else {
            if (!this.z) {
                z();
                invalidate();
            }
            Z(j());
        }
    }

    @Override // defpackage.vqs
    public final void c(vqr vqrVar, Set set) {
        Z(-1L);
    }

    public final long e() {
        VideoMetaData videoMetaData = this.am;
        if (videoMetaData == null) {
            return 1L;
        }
        return videoMetaData.g;
    }

    public final long f() {
        vqr vqrVar = this.u;
        if (vqrVar == null) {
            return 0L;
        }
        return vqrVar.h();
    }

    public final long g() {
        vqr vqrVar = this.u;
        if (vqrVar == null) {
            return 1L;
        }
        return vqrVar.i();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        if (!this.V) {
            return super.getPaddingLeft();
        }
        return Math.max((super.getPaddingLeft() - this.f147J) + (this.L / 2), 0);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        if (!this.V) {
            return super.getPaddingRight();
        }
        return Math.max((super.getPaddingRight() - this.f147J) + (this.L / 2), 0);
    }

    public final long h() {
        vqr vqrVar = this.u;
        if (vqrVar == null) {
            return 1L;
        }
        return vqrVar.j();
    }

    public final long i(float f) {
        vqp vqpVar = this.t;
        if (vqpVar == null) {
            return 0L;
        }
        return vqpVar.e(M(f));
    }

    public final long j() {
        vqr vqrVar = this.u;
        return vqrVar == null ? e() : vqrVar.l();
    }

    public final long k() {
        vqr vqrVar = this.u;
        if (vqrVar == null) {
            return 0L;
        }
        return vqrVar.n();
    }

    public final void l(vvk vvkVar) {
        vvkVar.b(null);
        vvkVar.setCallback(null);
        this.aj.remove(vvkVar);
    }

    public final void m() {
        hkc hkcVar;
        aqxo.y(this.y != null);
        aqxo.y(!this.z);
        this.z = true;
        vqr vqrVar = this.u;
        if (vqrVar != null && (hkcVar = this.y) != null) {
            vqrVar.r(hkcVar.e);
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void n(int i) {
        Vibrator vibrator;
        if (!this.T || (vibrator = this.aq) == null) {
            return;
        }
        vibrator.vibrate(i);
    }

    final void o() {
        gyq gyqVar = this.a;
        if (gyqVar == null) {
            zep.l("The interaction logger is null.");
        } else {
            gyqVar.a(actj.SHORTS_CREATION_TRIM_TRIMMER).f();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.E);
        canvas.drawColor(getResources().getColor(R.color.trim_view_background_color));
        canvas.save();
        canvas.clipRect(O(0L), this.E.top, O(e()), this.E.bottom);
        if (this.j) {
            for (vvk vvkVar : this.aj) {
                vqr vqrVar = this.u;
                vvkVar.a(canvas, vqrVar == null ? 0 : vqrVar.f());
            }
        } else {
            aqxo.p(this.s.width() >= 0);
            float f = this.H;
            int i = this.I;
            hjz hjzVar = new hjz(f, this.H, Math.max(1, (int) Math.ceil((width + i) / (i + f))));
            float f2 = hjzVar.b + this.I;
            int i2 = hjzVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                float f3 = this.s.left + (i3 * f2);
                float f4 = hjzVar.b + f3;
                float paddingTop = getPaddingTop();
                float f5 = hjzVar.c + paddingTop;
                Drawable drawable = this.ap;
                if (drawable != null) {
                    drawable.setBounds((int) f3, (int) paddingTop, (int) f4, (int) f5);
                    this.ap.draw(canvas);
                }
            }
        }
        canvas.restore();
        this.h.draw(canvas);
        if (this.m) {
            float strokeWidth = this.g.getStrokeWidth() / 2.0f;
            canvas.drawRect(K(), this.s.top + strokeWidth, L(), this.s.bottom - strokeWidth, this.g);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hkc hkcVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.ac.a();
                    X();
                }
            } else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.ar)) {
                this.ac.a();
                X();
            }
        } else if (motionEvent.getPointerCount() == 1) {
            this.ae.a();
            int pointerId = motionEvent.getPointerId(0);
            this.ar = pointerId;
            this.A = N(motionEvent, pointerId);
            this.as = motionEvent.getEventTime();
            this.at = K();
            this.au = L();
            float f = this.A;
            RectF rectF = new RectF();
            V(this.ag, rectF);
            float f2 = rectF.left;
            float f3 = rectF.right;
            V(this.ah, rectF);
            float f4 = rectF.left;
            float f5 = rectF.right;
            if (f3 > f4) {
                float f6 = (f3 - f4) / 2.0f;
                f2 -= f6;
                f3 -= f6;
                f4 += f6;
                f5 += f6;
            }
            if (f >= f2 && f <= f3) {
                hkcVar = hkc.BEGIN;
            } else if (f < f4 || f > f5) {
                if (!this.ab || f < this.aJ.getX() || f > this.aJ.getX() + this.aJ.a()) {
                    hkcVar = e() > g() ? hkc.BOTH : null;
                } else {
                    hkcVar = hkc.PLAYHEAD;
                }
            } else {
                hkcVar = hkc.END;
            }
            this.y = hkcVar;
            if (hkcVar != null) {
                x();
                if (B()) {
                    this.ac.b(this.S, this.A);
                    if (this.W && !this.z) {
                        W(true, this.y == hkc.BEGIN);
                    }
                } else {
                    o();
                }
            }
        }
        return this.y != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.E.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.s.left = Math.min(this.E.left + this.f147J, this.E.right);
        this.s.top = this.E.top;
        this.s.right = Math.max(this.E.right - this.f147J, this.E.left);
        this.s.bottom = this.E.bottom;
        if (this.ab) {
            int i5 = this.s.left;
            vvu vvuVar = this.aJ;
            int i6 = i5 - vvuVar.b;
            this.aJ.layout(i6, 0, vvuVar.a() + i6, getHeight());
        }
        int i7 = this.E.top;
        int i8 = this.E.bottom;
        int i9 = this.s.left;
        int i10 = this.f147J;
        int i11 = i9 - i10;
        this.ag.layout(i11, i7, i10 + i10 + i11, i8);
        int i12 = this.s.right;
        int i13 = this.f147J;
        int i14 = i12 - i13;
        this.ah.layout(i14, i7, i13 + i13 + i14, i8);
        z();
        hjz U = U(this.s.width());
        if (!F(U, this.r)) {
            y(U);
        }
        this.ai.layout(this.E.left, this.E.top, this.E.right, this.E.bottom);
        this.h.setBounds(this.E);
        getHitRect(this.F);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(amuk.r(this.F));
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        aqxo.y(View.MeasureSpec.getMode(i) != 0);
        setMeasuredDimension(resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), resolveSizeAndState(getPaddingTop() + this.H + getPaddingBottom(), i2, 0));
        int i3 = this.f147J;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 + i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.H, 1073741824);
        if (this.ab) {
            this.aJ.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        this.ag.measure(makeMeasureSpec, makeMeasureSpec2);
        this.ah.measure(makeMeasureSpec, makeMeasureSpec2);
        this.ai.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.D = bundle.getBoolean("trimHandleInteractionAlreadyLogged");
            Parcelable parcelable2 = bundle.getParcelable("superViewInstanceState");
            if (parcelable2 != null) {
                parcelable = parcelable2;
            }
            vqp vqpVar = this.t;
            if (vqpVar != null) {
                vqpVar.i(bundle.getLong("trimLayoutStartTimeKey", 0L), bundle.getLong("trimLayoutEndTimeKey", g()), false, false);
                z();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superViewInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("trimHandleInteractionAlreadyLogged", this.D);
        vqp vqpVar = this.t;
        if (vqpVar != null) {
            bundle.putLong("trimLayoutStartTimeKey", vqpVar.e(0.0f));
            vqp vqpVar2 = this.t;
            bundle.putLong("trimLayoutEndTimeKey", vqpVar2 == null ? 0L : vqpVar2.e(1.0f));
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r5 != 6) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(long j) {
        hiy hiyVar = this.C;
        if (hiyVar == null) {
            zep.b("PlayheadPositionListener is null.");
        } else {
            hiyVar.accept(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(j)));
        }
    }

    @Override // defpackage.vvr
    public final void q(final vvs vvsVar) {
        post(new Runnable() { // from class: hjq
            @Override // java.lang.Runnable
            public final void run() {
                ShortsVideoTrimView2 shortsVideoTrimView2 = ShortsVideoTrimView2.this;
                vvs vvsVar2 = vvsVar;
                vqp vqpVar = shortsVideoTrimView2.t;
                if (vqpVar == null || vqpVar.j() || vvsVar2 != shortsVideoTrimView2.w) {
                    return;
                }
                shortsVideoTrimView2.j = true;
                shortsVideoTrimView2.y(shortsVideoTrimView2.r);
            }
        });
    }

    @Override // defpackage.vqm
    public final void r(vqp vqpVar) {
        for (vvk vvkVar : this.aj) {
            float O = O(vvkVar.b);
            Rect bounds = vvkVar.getBounds();
            float centerX = bounds.centerX() - O;
            if (centerX != 0.0f) {
                int i = (int) (bounds.left - centerX);
                vvkVar.setBounds(i, bounds.top, bounds.width() + i, bounds.bottom);
            }
        }
        z();
        invalidate();
        hjx hjxVar = this.b;
        if (hjxVar != null) {
            ((hjm) hjxVar).as.c = vqpVar.e(0.0f);
        }
    }

    public final void s() {
        ArrayList arrayList = new ArrayList(this.ak);
        this.ak.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vvk vvkVar = (vvk) arrayList.get(i);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(vvkVar, "alpha", 0);
            ofInt.addListener(new hjv(this, vvkVar));
            ofInt.start();
        }
        vqp vqpVar = this.t;
        if (vqpVar != null) {
            vqpVar.g = true;
        }
        y(this.r);
        for (vvk vvkVar2 : this.ak) {
            vvkVar2.c(true);
            ObjectAnimator.ofInt(vvkVar2, "alpha", 0, PrivateKeyType.INVALID).start();
        }
        vqp vqpVar2 = this.t;
        if (vqpVar2 != null) {
            vqpVar2.g = false;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            v(k());
            p(k());
        }
    }

    public final void t(long j) {
        long j2 = 0;
        if (!E()) {
            vqp vqpVar = this.t;
            j = Math.max(vqpVar == null ? 0L : vqpVar.e(0.0f), j);
        }
        long S = S(j);
        if (this.aK == 3) {
            long j3 = j();
            if (j3 - S < h()) {
                VideoMetaData videoMetaData = this.am;
                int e = videoMetaData == null ? 0 : videoMetaData.e((j3 - h()) - 1);
                VideoMetaData videoMetaData2 = this.am;
                if (videoMetaData2 != null) {
                    j2 = videoMetaData2.l(e);
                }
                S = j2;
            }
        }
        vqr vqrVar = this.u;
        if (vqrVar != null) {
            vqrVar.D(S);
        }
        v(S);
    }

    public final void u(long j) {
        long j2 = 0;
        if (!E()) {
            vqp vqpVar = this.t;
            j = Math.min(vqpVar == null ? 0L : vqpVar.e(1.0f), j);
        }
        long S = S(j);
        if (this.aK == 3) {
            long k = k();
            if (S - k < h()) {
                VideoMetaData videoMetaData = this.am;
                int c = videoMetaData == null ? 0 : videoMetaData.c(k + h() + 1);
                if (c < 0) {
                    S = e();
                } else {
                    VideoMetaData videoMetaData2 = this.am;
                    if (videoMetaData2 != null) {
                        j2 = videoMetaData2.l(c);
                    }
                    S = j2;
                }
            }
        }
        vqr vqrVar = this.u;
        if (vqrVar != null) {
            vqrVar.C(S);
        }
        v(S);
    }

    public final void v(long j) {
        if (!this.ab) {
            return;
        }
        this.B = j;
        aa();
        invalidate();
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof vvk);
    }

    public final void w(final vqr vqrVar, vvl vvlVar, final vqp vqpVar) {
        VideoMetaData videoMetaData;
        boolean z = true;
        if (vqrVar != null) {
            vvlVar.getClass();
            videoMetaData = vqrVar.b;
            aqxo.p(videoMetaData.equals(((vvm) vvlVar).a));
            boolean L = vqrVar.L();
            this.m = L;
            if (L) {
                this.ag.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.ag.setVisibility(8);
                this.ah.setVisibility(8);
            }
        } else {
            aqxo.p(vvlVar == null);
            videoMetaData = null;
        }
        vqpVar.getClass();
        if (!F(vqrVar, this.u) || vvlVar != this.v) {
            X();
            vqr vqrVar2 = this.u;
            if (vqrVar2 != null) {
                vqrVar2.u(this);
                this.v = null;
                vvt vvtVar = this.w;
                if (vvtVar != null) {
                    vvtVar.l(this);
                }
                this.w = null;
                vvs vvsVar = this.an;
                if (vvsVar != null) {
                    vvsVar.l(this);
                }
                this.an = null;
                this.ao = null;
                if (this.x != null) {
                    z = false;
                }
                aqxo.y(z);
            }
            this.u = vqrVar;
            this.am = videoMetaData;
            this.v = vvlVar;
            final hjz U = U(this.s.width());
            vqr vqrVar3 = this.u;
            if (vqrVar3 != null) {
                vqrVar3.q(this);
                this.al = this.R;
                vvl vvlVar2 = this.v;
                if (vvlVar2 != null) {
                    this.w = new vvt(vvlVar2);
                    vvs b = this.v.b();
                    this.an = b;
                    b.k(this);
                }
                vvl vvlVar3 = this.v;
                if (vvlVar3 != null) {
                    this.ao = ((vvm) vvlVar3).c;
                }
            }
            if (this.aK == 3 && this.am != null) {
                long f = f() * 10;
                this.q = f;
                this.p = (float) (f / 2000);
            }
            vqp vqpVar2 = this.t;
            if (vqpVar2 != null) {
                vqpVar2.h(this);
            }
            this.t = vqpVar;
            vqpVar.f(this);
            if (this.u == null || this.w == null) {
                return;
            }
            post(new Runnable() { // from class: hjp
                @Override // java.lang.Runnable
                public final void run() {
                    ShortsVideoTrimView2 shortsVideoTrimView2 = ShortsVideoTrimView2.this;
                    vqp vqpVar3 = vqpVar;
                    hjz hjzVar = U;
                    vqr vqrVar4 = vqrVar;
                    vvt vvtVar2 = shortsVideoTrimView2.w;
                    if (vvtVar2 == null) {
                        return;
                    }
                    vvtVar2.b(vqpVar3.e(0.0f), vqpVar3.e(1.0f));
                    shortsVideoTrimView2.w.k(shortsVideoTrimView2);
                    shortsVideoTrimView2.y(hjzVar);
                    if (vqrVar4 != null) {
                        shortsVideoTrimView2.h.a = vqrVar4;
                    }
                    shortsVideoTrimView2.requestLayout();
                }
            });
        }
    }

    public final void x() {
        this.ax = this.A;
        this.aA = k();
        this.aB = j();
        this.ay = K();
        this.az = L();
        vqp vqpVar = this.t;
        long j = 0;
        this.aC = vqpVar == null ? 0L : vqpVar.e(0.0f);
        vqp vqpVar2 = this.t;
        if (vqpVar2 != null) {
            j = vqpVar2.e(1.0f);
        }
        this.aD = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
        if (java.lang.Math.abs(r10 - r14) >= java.lang.Math.abs(r10 - r12)) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(defpackage.hjz r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2.y(hjz):void");
    }

    public final void z() {
        Y(O(k()), O(j()));
    }

    public final long d(long j, boolean z) {
        float f;
        long j2 = 0;
        long j3 = true != z ? 0L : -1000000L;
        long e = z ? e() + 1000000 : e();
        long j4 = this.aD;
        long j5 = this.aC;
        long j6 = j4 - j5;
        long j7 = j5 - j;
        long j8 = j4 - j;
        if (j7 < j3) {
            j8 = j3 + j6;
        } else {
            j3 = j7;
        }
        if (j8 > e) {
            j3 = e - j6;
        } else {
            e = j8;
        }
        if (D() && j3 > 0) {
            j3 = 0;
            e = j6;
        }
        if (C() && e < e()) {
            j3 = e() - j6;
            e = e();
        }
        long[] jArr = {j3, e};
        long j9 = jArr[0];
        long j10 = jArr[1];
        vqp vqpVar = this.t;
        this.i -= (vqpVar == null ? 0.0f : vqpVar.b(j9)) * this.s.width();
        vqp vqpVar2 = this.t;
        if (vqpVar2 != null) {
            f = 0.0f;
            vqpVar2.i(j9, j10, false, false);
        } else {
            f = 0.0f;
        }
        long e2 = e();
        vqp vqpVar3 = this.t;
        long e3 = vqpVar3 == null ? 0L : vqpVar3.e(M(this.at));
        vqp vqpVar4 = this.t;
        long e4 = vqpVar4 == null ? 0L : vqpVar4.e(M(this.au));
        this.av = f;
        if (e3 < 0) {
            this.av = O(e3) - O(0L);
        } else {
            j2 = e3;
        }
        this.aw = f;
        if (e4 > e2) {
            this.aw = O(e4) - O(e2);
        } else {
            e2 = e4;
        }
        long[] jArr2 = {j2, e2};
        long j11 = jArr2[0];
        long j12 = jArr2[1];
        vqr vqrVar = this.u;
        if (vqrVar != null) {
            vqrVar.E(j11, j12);
        }
        v(j11);
        vvt vvtVar = this.w;
        if (vvtVar != null) {
            vvtVar.b(j9, j10);
        }
        y(this.r);
        return this.aC - j9;
    }
}
