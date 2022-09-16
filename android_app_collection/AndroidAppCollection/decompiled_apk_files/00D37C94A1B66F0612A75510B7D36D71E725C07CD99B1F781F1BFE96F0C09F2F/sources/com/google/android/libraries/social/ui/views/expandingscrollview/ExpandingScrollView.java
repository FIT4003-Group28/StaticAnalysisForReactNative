package com.google.android.libraries.social.ui.views.expandingscrollview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Scroller;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandingScrollView extends vgr {
    public static final vgn a = new vgn(Arrays.asList(vgm.COLLAPSED, vgm.EXPANDED, vgm.FULLY_EXPANDED));
    public static final vgn b = new vgo();
    private static boolean s;
    private final float[] A;
    private final Set B;
    public int c;
    public boolean d;
    EnumSet e;
    public vgm f;
    final Set g;
    final Set h;
    public View i;
    private final int t;
    private vgq u;
    private vgn v;
    private vgn w;
    private vgn x;
    private vgm y;
    private vgm z;

    static {
        new vgn(Arrays.asList(vgm.HIDDEN, vgm.EXPANDED));
        new vgn(Arrays.asList(vgm.COLLAPSED, vgm.EXPANDED));
    }

    public ExpandingScrollView(Context context) {
        super(context);
        this.d = true;
        this.e = EnumSet.of(vgm.EXPANDED);
        vgn vgnVar = a;
        this.v = vgnVar;
        this.w = vgnVar;
        this.x = b;
        this.f = vgm.HIDDEN;
        this.A = new float[vgm.values().length];
        this.B = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!s) {
            r(resources.getConfiguration());
            s = true;
        }
        this.u = new vgq(this, new vgj(this, 1), new vgj(this));
        this.t = (int) (resources.getDisplayMetrics().density * 400.0f);
        h();
    }

    public static /* synthetic */ void j(ExpandingScrollView expandingScrollView, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (expandingScrollView.o == null) {
            expandingScrollView.o = VelocityTracker.obtain();
        }
        expandingScrollView.o.addMovement(motionEvent);
        if (!expandingScrollView.p) {
            if (super.n(motionEvent) || action != 1 || !expandingScrollView.q) {
                return;
            }
            expandingScrollView.q = false;
            expandingScrollView.performClick();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float f = expandingScrollView.j[1];
                expandingScrollView.m(motionEvent);
                expandingScrollView.k(expandingScrollView.getScrollY() + Math.round(f - expandingScrollView.j[1]));
                expandingScrollView.q = false;
                return;
            } else if (action != 3) {
                return;
            }
        }
        expandingScrollView.p = false;
        if (action == 3 || expandingScrollView.getChildCount() <= 0) {
            expandingScrollView.g(0.0f);
        } else {
            expandingScrollView.o.computeCurrentVelocity(1000, expandingScrollView.l);
            float yVelocity = expandingScrollView.o.getYVelocity();
            int i = expandingScrollView.m;
            if (yVelocity > i || yVelocity < (-i)) {
                float f2 = -yVelocity;
                expandingScrollView.n = f2;
                int scrollX = expandingScrollView.getScrollX();
                int scrollY = expandingScrollView.getScrollY();
                Scroller scroller = expandingScrollView.r;
                int[] iArr = expandingScrollView.k;
                scroller.fling(scrollX, scrollY, 0, (int) f2, 0, 0, iArr[0], iArr[1]);
                expandingScrollView.invalidate();
            } else {
                expandingScrollView.g(0.0f);
            }
        }
        VelocityTracker velocityTracker = expandingScrollView.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            expandingScrollView.o = null;
        }
        expandingScrollView.q = false;
    }

    private final void p(vgm vgmVar) {
        vgm vgmVar2 = this.f;
        this.f = vgmVar;
        q();
        if (this.f != vgmVar2) {
            for (abqc abqcVar : this.B) {
                vgm vgmVar3 = this.f;
                if (vgmVar3 == vgm.COLLAPSED || vgmVar3 == vgm.FULLY_EXPANDED) {
                    if (vgmVar2 == vgm.COLLAPSED || vgmVar2 == vgm.FULLY_EXPANDED) {
                        boolean z = vgmVar3 == vgm.FULLY_EXPANDED;
                        abiq abiqVar = (abiq) abqcVar.a.get();
                        if (z) {
                            abiqVar.v(abqcVar.c.d);
                        } else {
                            abiqVar.r();
                        }
                        abqcVar.b.b(abqcVar.c, z);
                    }
                }
            }
        }
    }

    private final void q() {
        if (this.f == vgm.HIDDEN) {
            int a2 = a(vgm.HIDDEN);
            l(a2, a2);
            return;
        }
        vgm vgmVar = (vgm) Collections.max(this.v.a);
        vgm vgmVar2 = vgm.COLLAPSED;
        Iterator it = this.v.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            vgm vgmVar3 = (vgm) it.next();
            if (!vgmVar3.equals(vgm.HIDDEN)) {
                vgmVar2 = vgmVar3;
                break;
            }
        }
        l(a(vgmVar2), a(vgmVar));
    }

    private final void r(Configuration configuration) {
        this.v = configuration.orientation == 2 ? this.x : this.w;
        i(this.f, false);
    }

    public final int a(vgm vgmVar) {
        return Math.round((this.c * this.A[vgmVar.ordinal()]) / 100.0f);
    }

    public final vgm b(vgm vgmVar) {
        return this.v.a(vgmVar.f);
    }

    public final vgm c(vgm vgmVar) {
        return this.v.b(vgmVar);
    }

    @Override // defpackage.vgr
    public final void d() {
        for (abqc abqcVar : this.B) {
        }
    }

    @Override // defpackage.vgr
    public final void e() {
        for (abqc abqcVar : this.B) {
        }
    }

    public final void f(vgm vgmVar) {
        i(vgmVar, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vgr
    public final void g(float f) {
        vgm vgmVar;
        vgm c;
        if (this.f == vgm.HIDDEN) {
            return;
        }
        if (Math.abs(f) > this.t) {
            int scrollY = (int) ((f * 0.3f) + getScrollY());
            vgmVar = null;
            int i = Integer.MAX_VALUE;
            for (vgm vgmVar2 : this.v.a) {
                int abs = Math.abs(a(vgmVar2) - scrollY);
                int i2 = abs < i ? abs : i;
                if (abs < i) {
                    vgmVar = vgmVar2;
                }
                i = i2;
            }
        } else {
            vgmVar = this.f;
            if (getScrollY() > a(this.f)) {
                c = b(this.f);
            } else {
                c = c(this.f);
            }
            vgm vgmVar3 = this.f;
            if (c != vgmVar3) {
                int a2 = a(vgmVar3);
                if ((getScrollY() - a2) / (a(c) - a2) > 0.2f) {
                    vgmVar = c;
                }
            }
        }
        f(vgmVar);
    }

    public final void h() {
        vgm[] values;
        for (vgm vgmVar : vgm.values()) {
            this.A[vgmVar.ordinal()] = vgmVar.g;
        }
    }

    public final void i(vgm vgmVar, boolean z) {
        char c = true != z ? (char) 0 : (char) 500;
        vgm a2 = this.v.a(vgmVar);
        p(a2);
        int a3 = a(a2);
        if (c > 0) {
            o(a3, false);
        } else {
            k(a3);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vgm vgmVar = this.f;
        r(configuration);
        vgm vgmVar2 = this.f;
        if (vgmVar2 != vgmVar) {
            this.y = vgmVar;
            this.z = vgmVar2;
        } else {
            vgm vgmVar3 = this.y;
            if (vgmVar3 != null && this.v.a.contains(vgmVar3)) {
                if (this.f == this.z) {
                    i(this.y, false);
                }
                this.y = null;
                this.z = null;
            }
        }
        for (vgk vgkVar : this.h) {
            vgkVar.a();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() <= 0 || this.i != null) {
            return;
        }
        View childAt = getChildAt(0);
        removeAllViews();
        this.u.e.b();
        this.i = childAt;
        if (childAt == null) {
            return;
        }
        addView(childAt);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.vgr, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = (i4 - i2) / 2;
        int i6 = this.c;
        if (i6 != i5) {
            this.c = i5;
            z2 = true;
        } else {
            i5 = i6;
            z2 = false;
        }
        int i7 = i3 - i;
        int i8 = 0;
        while (i8 < getChildCount()) {
            View childAt = getChildAt(i8);
            int measuredHeight = childAt.getMeasuredHeight() + i5;
            childAt.layout(getPaddingLeft(), i5, i7 - getPaddingRight(), measuredHeight);
            i8++;
            i5 = measuredHeight;
        }
        View view = this.i;
        if (!(view instanceof vgl) || ((vgl) view).a()) {
            View findViewById = findViewById(0);
            int height = findViewById == null ? 0 : findViewById.getHeight();
            if (height > 0) {
                vgm vgmVar = vgm.COLLAPSED;
                float min = (Math.min(height, this.c) * 100.0f) / this.c;
                int ordinal = vgmVar.ordinal();
                if (this.A[ordinal] != min) {
                    vgm c = c(vgmVar);
                    if (vgmVar == c || min >= this.A[c.ordinal()]) {
                        vgm b2 = b(vgmVar);
                        if (vgmVar == b2 || min <= this.A[b2.ordinal()]) {
                            this.A[ordinal] = min;
                            q();
                            if (this.p) {
                                int scrollY = getScrollY();
                                while (scrollY < a(c(this.f))) {
                                    vgm vgmVar2 = this.f;
                                    if (vgmVar2 == c(vgmVar2)) {
                                        break;
                                    }
                                    p(c(this.f));
                                }
                                while (scrollY > a(b(this.f))) {
                                    vgm vgmVar3 = this.f;
                                    if (vgmVar3 == b(vgmVar3)) {
                                        break;
                                    }
                                    p(b(this.f));
                                }
                            } else if (this.f == vgmVar) {
                                o(a(vgmVar), true);
                            }
                        } else {
                            throw new IllegalArgumentException("exposure percentage more than next state");
                        }
                    } else {
                        throw new IllegalArgumentException("exposure percentage less than previous state");
                    }
                }
            }
        }
        q();
        if (z2) {
            i(this.f, false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) ((size * this.A[vgm.FULLY_EXPANDED.ordinal()]) / 100.0f), 1073741824);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(i, makeMeasureSpec);
            i3 = Math.max(i3, getChildAt(i4).getMeasuredWidth());
        }
        setMeasuredDimension(i3, size + size);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f = savedState.a;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f, this.A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
        if (r1 > r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
        if (r1 > r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014f, code lost:
        if (r0.k == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
        if (r2 != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    @Override // defpackage.vgr, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.B.isEmpty()) {
            return;
        }
        Set<abqc> set = this.B;
        int scrollY = getScrollY();
        int i3 = 0;
        vgm vgmVar = vgm.values()[0];
        vgm[] values = vgm.values();
        int length = values.length;
        while (i3 < length) {
            vgm vgmVar2 = values[i3];
            if (scrollY < a(vgmVar2)) {
                break;
            }
            i3++;
            vgmVar = vgmVar2;
        }
        if (this.A[vgmVar.ordinal()] == 100.0f) {
            for (abqc abqcVar : set) {
            }
            return;
        }
        a(vgmVar);
        a(vgmVar == vgm.HIDDEN ? vgm.COLLAPSED : b(vgmVar));
        for (abqc abqcVar2 : set) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new rxi(14);
        public final vgm a;
        private final float[] b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = vgm.a(parcel.readString());
            this.b = parcel.createFloatArray();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a.toString());
            parcel.writeFloatArray(this.b);
        }

        public SavedState(Parcelable parcelable, vgm vgmVar, float[] fArr) {
            super(parcelable);
            this.a = vgmVar;
            this.b = fArr;
        }
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = EnumSet.of(vgm.EXPANDED);
        vgn vgnVar = a;
        this.v = vgnVar;
        this.w = vgnVar;
        this.x = b;
        this.f = vgm.HIDDEN;
        this.A = new float[vgm.values().length];
        this.B = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!s) {
            r(resources.getConfiguration());
            s = true;
        }
        this.u = new vgq(this, new vgj(this, 1), new vgj(this));
        this.t = (int) (resources.getDisplayMetrics().density * 400.0f);
        h();
    }

    public ExpandingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.e = EnumSet.of(vgm.EXPANDED);
        vgn vgnVar = a;
        this.v = vgnVar;
        this.w = vgnVar;
        this.x = b;
        this.f = vgm.HIDDEN;
        this.A = new float[vgm.values().length];
        this.B = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        Resources resources = getResources();
        if (!s) {
            r(resources.getConfiguration());
            s = true;
        }
        this.u = new vgq(this, new vgj(this, 1), new vgj(this));
        this.t = (int) (resources.getDisplayMetrics().density * 400.0f);
        h();
    }
}
