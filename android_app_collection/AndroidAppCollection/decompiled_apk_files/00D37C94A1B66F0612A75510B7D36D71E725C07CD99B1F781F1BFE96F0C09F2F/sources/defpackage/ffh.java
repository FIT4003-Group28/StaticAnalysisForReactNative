package defpackage;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ffh  reason: default package */
/* loaded from: classes3.dex */
public final class ffh extends few implements View.OnLayoutChangeListener, ffo {
    private final fff A;
    private final ffg B;
    private final ValueAnimator C;
    private final IdentityHashMap D;
    private boolean E;
    private boolean F;
    private int G;
    private Point H;
    private final amxv I;

    /* renamed from: J  reason: collision with root package name */
    private amxt f205J;
    private TimelineMarker[] K;
    private ampq L;
    public aadd a;
    public Set b;
    public ffi c;
    public ffk d;
    public ahwu e;
    public axxu f;
    public final Rect g;
    final Rect h;
    public final int i;
    public final ValueAnimator j;
    public View k;
    public zaj l;
    int m;
    final List n;
    public boolean o;
    public ampq p;
    public ffm q;
    private final Rect v;
    private final Rect w;
    private final Rect x;
    private final Rect y;
    private final ffc z;

    public ffh(Context context, AttributeSet attributeSet) {
        super(new aibt(), context, attributeSet);
        int i;
        Resources resources = context.getResources();
        this.v = new Rect();
        this.g = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.h = new Rect();
        this.y = new Rect();
        this.n = new ArrayList();
        this.I = amzr.c();
        this.p = amon.a;
        this.L = amon.a;
        this.D = new IdentityHashMap(4);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fft.a);
            i = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
        } else {
            i = 0;
        }
        i = i == 0 ? getResources().getDimensionPixelSize(R.dimen.inline_time_bar_size) : i;
        this.i = i;
        this.z = new ffc(this);
        this.B = new ffa(this);
        this.A = new fff(this, new azqb() { // from class: fez
            @Override // defpackage.azqb
            public final Object get() {
                int i2;
                ffh ffhVar = ffh.this;
                if (!ffhVar.d.d(ffhVar.r).h()) {
                    i2 = ffhVar.i;
                } else {
                    i2 = ffhVar.c.p;
                }
                return Integer.valueOf(i2);
            }
        }, resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_default_size), resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubber_drag_size));
        ValueAnimator duration = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("timed_markers_width", Keyframe.ofInt(0.0f, this.c.h), Keyframe.ofInt(1.0f, this.c.i)), PropertyValuesHolder.ofKeyframe("timed_markers_bar_height", Keyframe.ofFloat(0.0f, this.c.p), Keyframe.ofFloat(1.0f, this.c.q)), PropertyValuesHolder.ofKeyframe("timed_markers_color", Keyframe.ofInt(0.0f, Color.red(this.c.n)), Keyframe.ofInt(1.0f, Color.red(this.c.m)))).setDuration(200L);
        duration.addUpdateListener(new fex(this));
        this.C = duration;
        int red = Color.red(this.c.n);
        ValueAnimator duration2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("timed_markers_width", Keyframe.ofInt(0.0f, 0), Keyframe.ofInt(0.2f, 0), Keyframe.ofInt(0.35f, this.c.i), Keyframe.ofInt(1.0f, this.c.h)), PropertyValuesHolder.ofKeyframe("timed_markers_bar_height", Keyframe.ofFloat(0.0f, i), Keyframe.ofFloat(0.2f, i), Keyframe.ofFloat(0.35f, this.c.q), Keyframe.ofFloat(1.0f, this.c.p)), PropertyValuesHolder.ofKeyframe("timed_markers_color", Keyframe.ofInt(0.0f, red), Keyframe.ofInt(0.2f, red), Keyframe.ofInt(0.35f, Color.red(this.c.m)), Keyframe.ofInt(1.0f, red))).setDuration(1200L);
        duration2.addUpdateListener(new fex(this, 1));
        this.j = duration2;
        this.d.c.add(new ffb(this));
    }

    private final int Q() {
        if (kM()) {
            return this.c.w;
        }
        return this.c.v;
    }

    private final void R(TimelineMarker timelineMarker) {
        amxt amxtVar;
        if (timelineMarker != null) {
            long j = timelineMarker.a;
            long j2 = timelineMarker.b;
            long kJ = kJ();
            int i = this.w.left;
            int width = this.w.width();
            long O = zgd.O(j, 0L, kJ);
            amxtVar = amxt.d(Integer.valueOf(hqb.k(O, kJ, i, width)), Integer.valueOf(hqb.k(zgd.O(j2, O, kJ), kJ, i, width)));
        } else {
            amxtVar = null;
        }
        this.f205J = amxtVar;
        if (amxtVar == null || ((amrx) this.I).d().isEmpty()) {
            return;
        }
        for (amxt amxtVar2 : this.I.d()) {
            if (amxtVar2.l(this.f205J)) {
                this.f205J = amxtVar2;
                return;
            }
        }
    }

    private final boolean S() {
        return kJ() > 0;
    }

    public static View f(View view) {
        if (view.getParent() instanceof View) {
            return (View) view.getParent();
        }
        return null;
    }

    @Override // defpackage.ffo
    public final void A(int i) {
        ffc ffcVar = this.z;
        int i2 = ffc.d;
        ffcVar.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aibs
    public final void B() {
        if (kM() && !isEnabled()) {
            kN();
        }
        if (kM()) {
            fff fffVar = this.A;
            int i = fff.g;
            fffVar.a();
            this.C.cancel();
            this.C.start();
        } else if (this.G == 1) {
        } else {
            fff fffVar2 = this.A;
            int i2 = fff.g;
            fffVar2.f.removeCallbacks(fffVar2.e);
            if (fffVar2.b() == 0.0f) {
                fffVar2.g();
            } else {
                fffVar2.f.postDelayed(fffVar2.e, fffVar2.d);
            }
        }
    }

    @Override // defpackage.aibs
    protected final boolean C(float f, float f2) {
        return this.g.contains((int) f, (int) f2);
    }

    public final boolean D() {
        return this.E || this.k == null;
    }

    public final int b() {
        return getResources().getDimensionPixelSize(R.dimen.inline_controls_bottom_bar_height);
    }

    @Override // defpackage.aibs
    public final long c() {
        long j = ((aibt) this.r).d;
        if (this.w.width() <= 0) {
            return j;
        }
        return j + (((this.m - this.w.left) * kJ()) / this.w.width());
    }

    @Override // defpackage.ffo
    public final void g(View view) {
        if (this.D.containsKey(view)) {
            return;
        }
        this.D.put(view, new ffd(this, view));
    }

    @Override // defpackage.ffo
    public final void h() {
        if (!isEnabled()) {
            return;
        }
        P(E());
        kK();
    }

    @Override // defpackage.ffo
    public final void i(Rect rect) {
        getGlobalVisibleRect(rect);
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        boolean z = false;
        if (super.isEnabled() && S()) {
            z = true;
        }
        setFocusable(z);
        return z;
    }

    @Override // defpackage.ffo
    public final void j(Point point) {
        if (point != null) {
            point.set(this.m + getLeft(), this.w.top + getTop());
        }
    }

    public final void k() {
        if (!kM()) {
            return;
        }
        kN();
        this.C.cancel();
        if (this.G == 1) {
            return;
        }
        fff fffVar = this.A;
        int i = fff.g;
        fffVar.f.removeCallbacks(fffVar.e);
        fffVar.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aibs
    public final void kK() {
        TimelineMarker timelineMarker;
        kL();
        long kJ = kJ();
        ahwu ahwuVar = this.e;
        long j = this.s;
        TimelineMarker timelineMarker2 = ahwuVar.d;
        if (timelineMarker2 == null || ahwuVar.c == null) {
            timelineMarker = ahwuVar.c;
        } else {
            timelineMarker = Math.abs(j - timelineMarker2.a) < Math.abs(j - ahwuVar.c.a) ? ahwuVar.d : ahwuVar.c;
        }
        if (timelineMarker != null) {
            long abs = Math.abs(timelineMarker.a - j);
            long d = ahwuVar.a.d() - ahwuVar.b;
            if (((float) abs) / ((float) kJ) <= 0.1f && d <= 500) {
                j = timelineMarker.a;
            }
        }
        J(j);
        if (j != this.s) {
            for (aibq aibqVar : this.b) {
                aibqVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aibs
    public final void kL() {
        this.x.set(this.w);
        this.h.set(this.w);
        aibx aibxVar = this.r;
        long kJ = kJ();
        long E = E();
        long F = F();
        if (true != kM()) {
            F = E;
        }
        if (kJ > 0) {
            long kI = kI();
            this.x.right = this.w.left + ((int) ((this.w.width() * kI) / kJ));
            this.m = this.w.left + ((int) ((this.w.width() * F) / kJ));
            this.h.right = this.w.left + ((int) ((this.w.width() * E) / kJ));
        } else {
            this.x.right = this.w.left;
            this.h.right = this.w.left;
            this.m = this.w.left;
        }
        this.c.d.setColor(aibxVar.d() | (-16777216));
        this.c.e.setColor(aibxVar.e());
        this.c.b.setColor(aibxVar.a());
        this.c.c.setColor(aibxVar.b());
        this.c.a.setColor(aibxVar.c());
        setEnabled(aibxVar.p());
        ffk ffkVar = this.d;
        if (ffkVar.d != kJ) {
            ffkVar.d = kJ;
            ffkVar.b.clear();
        }
        invalidate(this.g);
    }

    @Override // defpackage.ffo
    public final void l() {
        if (!isEnabled() || !kM()) {
            return;
        }
        kK();
    }

    @Override // defpackage.ffo
    public final void m(int i) {
        if (!isEnabled()) {
            return;
        }
        N(i);
    }

    @Override // defpackage.ffo
    public final void n(int i) {
        if (!isEnabled()) {
            return;
        }
        O(i);
    }

    @Override // defpackage.aibs
    protected final void o(float f) {
        if (D()) {
            int scaledEdgeSlop = ViewConfiguration.get(getContext()).getScaledEdgeSlop();
            int i = this.g.left + scaledEdgeSlop;
            int i2 = this.g.right - scaledEdgeSlop;
            this.m = this.w.left + ((this.w.width() * (Math.max(i, Math.min(i2, (int) f)) - i)) / (i2 - i));
            return;
        }
        this.m = Math.max(this.w.left, Math.min(this.w.right, (int) f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0102, code lost:
        if ((((java.lang.Integer) r2.h()).intValue() - ((java.lang.Integer) r2.g()).intValue()) != Q()) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0571 A[LOOP:3: B:189:0x056f->B:190:0x0571, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r42) {
        /*
            Method dump skipped, instructions count: 2293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffh.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.F = z;
        int b = b();
        int i5 = this.i;
        this.w.set(this.g);
        int i6 = this.g.top + ((b - i5) / 2);
        this.w.top = i6;
        this.w.bottom = i6 + i5;
        kL();
        R(this.d.a.a(aicb.CHAPTER));
        this.d.b.clear();
        if (Build.VERSION.SDK_INT >= 29) {
            this.v.set(this.g);
            setSystemGestureExclusionRects(amuk.r(this.v));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view != this.k) {
            view.removeOnLayoutChangeListener(this);
        } else if (D()) {
        } else {
            requestLayout();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), b());
    }

    @Override // defpackage.aibs, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        Point G = G(motionEvent);
        int i3 = G.x;
        int i4 = G.y;
        if (this.L.h() && (!this.c.y || C(i3, i4))) {
            ((ffn) this.L.c()).a(motionEvent);
        }
        if (this.G == 0 || this.z.b() <= 0.0f) {
            if (kM()) {
                kK();
            }
            if (D() && C(i3, i4) && i4 > this.w.centerY()) {
                z = true;
            }
            if (!z || motionEvent.getAction() != 0 || !this.p.h()) {
                return z;
            }
            ((ffl) this.p.c()).a();
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            float f = i3;
            if (C(f, i4)) {
                ffm ffmVar = this.q;
                if (ffmVar != null) {
                    long c = c();
                    int i5 = this.m + (this.A.c / 2);
                    if (i - i2 <= f && f <= i5) {
                        z = true;
                    }
                    ffmVar.b(c, z);
                }
                this.H = new Point(i3, i4);
                if (this.c.s) {
                    L();
                }
                return true;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.H = null;
                    if (kM()) {
                        M();
                        return true;
                    }
                }
            } else if (kM()) {
                N(i3);
                return true;
            } else {
                Point point = this.H;
                if (point != null && Math.abs(i3 - point.x) > this.c.r) {
                    O(i3);
                    return true;
                }
            }
        } else if (kM()) {
            ffm ffmVar2 = this.q;
            if (ffmVar2 != null) {
                ffmVar2.a(c());
            }
            this.H = null;
            kK();
            return true;
        } else if (this.H != null) {
            Iterator it = this.D.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ffd ffdVar = (ffd) it.next();
                if (ffdVar.a.isClickable() && ffdVar.a(this.H.x, this.H.y) && ffdVar.a(i3, i4)) {
                    ffdVar.a.performClick();
                    break;
                }
            }
            this.H = null;
            if (this.c.s) {
                M();
            }
        }
        return false;
    }

    @Override // defpackage.ffo
    public final void p(boolean z) {
        int i;
        if (kM() || (i = this.G) == 0 || i == 3) {
            return;
        }
        if (!z || i == 1) {
            fff fffVar = this.A;
            int i2 = fff.g;
            fffVar.a();
            return;
        }
        fff fffVar2 = this.A;
        int i3 = fff.g;
        fffVar2.a();
        fffVar2.f.postDelayed(fffVar2.e, fffVar2.d);
    }

    @Override // defpackage.ffo
    public final void r(ffn ffnVar) {
        this.L = ampq.j(ffnVar);
    }

    @Override // defpackage.ffo
    public final void s(boolean z) {
        if (this.E == z) {
            return;
        }
        boolean D = D();
        this.E = z;
        if (D == D()) {
            return;
        }
        requestLayout();
    }

    @Override // defpackage.ffo
    public final void t(View view) {
        View view2 = this.k;
        if (view == view2) {
            return;
        }
        boolean D = D();
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this);
        }
        if (view != null) {
            view.addOnLayoutChangeListener(this);
        }
        this.k = view;
        if (D == D()) {
            return;
        }
        requestLayout();
    }

    @Override // defpackage.ffo
    public final void u(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        if (i == 1) {
            return;
        }
        if (!kM()) {
            fff fffVar = this.A;
            int i2 = fff.g;
            fffVar.f.removeCallbacks(fffVar.e);
            if (fffVar.b() == 0.0f) {
                fffVar.g();
            } else {
                fffVar.c();
                fffVar.f.postInvalidate();
            }
        }
        if (i != 0) {
            return;
        }
        k();
    }

    @Override // defpackage.ffo
    public final void v(ffm ffmVar) {
        this.q = ffmVar;
    }

    @Override // defpackage.ffo
    public final void w(int i) {
        this.z.e(i);
        this.A.e(i);
        this.C.setDuration(i);
    }

    @Override // defpackage.ffo
    public final void x(boolean z, boolean z2) {
        Boolean bool;
        if (z) {
            ffc ffcVar = this.z;
            int i = ffc.d;
            ffcVar.e(ffcVar.a);
            if (ffcVar.b() == 1.0f) {
                ffcVar.f();
            } else {
                if (z2) {
                    ffcVar.d();
                } else {
                    ffcVar.f();
                }
                ffcVar.c.postInvalidate();
            }
        } else {
            ffc ffcVar2 = this.z;
            int i2 = ffc.d;
            ffcVar2.e(ffcVar2.b);
            if (ffcVar2.b() == 0.0f) {
                ffcVar2.g();
            } else {
                if (z2) {
                    ffcVar2.c();
                } else {
                    ffcVar2.g();
                    ffcVar2.c.k();
                }
                ffcVar2.c.postInvalidate();
            }
        }
        aqxe aqxeVar = this.f.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z3 = false;
        int i3 = 1;
        if (aqxeVar.a(45354872L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354872L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354872L);
            if (aqxfVar.b == 1) {
                z3 = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z3);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            setFocusable(z);
            setClickable(z);
            if (true != z) {
                i3 = 2;
            }
            setImportantForAccessibility(i3);
        }
    }

    public final void z(TimelineMarker timelineMarker) {
        amxt amxtVar = this.f205J;
        R(timelineMarker);
        if (!Objects.equals(amxtVar, this.f205J)) {
            this.B.d();
            invalidate();
        }
    }
}
