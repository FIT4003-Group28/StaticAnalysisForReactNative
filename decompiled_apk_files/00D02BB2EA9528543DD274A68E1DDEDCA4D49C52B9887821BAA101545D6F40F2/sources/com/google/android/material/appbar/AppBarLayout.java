package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AppBarLayout extends LinearLayout implements ajh {
    private int a;
    private int b;
    private int c;
    private int d;
    private List<czuz> e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private WeakReference<View> j;
    private ValueAnimator k;
    private int[] l;
    private Drawable m;
    public boolean p;
    public int q;
    public ow r;
    public boolean s;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class BaseBehavior<T extends AppBarLayout> extends czvi<T> {
        public int a;
        private int c;
        private ValueAnimator d;
        private int e;
        private boolean f;
        private float g;
        private WeakReference<View> h;

        public BaseBehavior() {
            this.e = -1;
        }

        private final void E(CoordinatorLayout coordinatorLayout, T t) {
            int s = s();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                czva czvaVar = (czva) childAt.getLayoutParams();
                if (F(czvaVar.a, 32)) {
                    top -= czvaVar.topMargin;
                    bottom += czvaVar.bottomMargin;
                }
                int i2 = -s;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                czva czvaVar2 = (czva) childAt2.getLayoutParams();
                int i3 = czvaVar2.a;
                if ((i3 & 17) != 17) {
                    return;
                }
                int i4 = -childAt2.getTop();
                int i5 = -childAt2.getBottom();
                if (i == t.getChildCount() - 1) {
                    i5 += t.n();
                }
                if (F(i3, 2)) {
                    i5 += od.A(childAt2);
                } else if (F(i3, 5)) {
                    int A = od.A(childAt2) + i5;
                    if (s >= A) {
                        i5 = A;
                    } else {
                        i4 = A;
                    }
                }
                if (F(i3, 32)) {
                    i4 += czvaVar2.topMargin;
                    i5 -= czvaVar2.bottomMargin;
                }
                if (s < (i5 + i4) / 2) {
                    i4 = i5;
                }
                H(coordinatorLayout, t, akn.b(i4, -t.g(), 0));
            }
        }

        private static boolean F(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void G(CoordinatorLayout coordinatorLayout, T t) {
            od.p(coordinatorLayout, oy.d.a());
            od.p(coordinatorLayout, oy.e.a());
            View I = I(coordinatorLayout);
            if (I == null || t.g() == 0 || !(((ajl) I.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (s() != (-t.g()) && I.canScrollVertically(1)) {
                J(coordinatorLayout, t, oy.d, false);
            }
            if (s() == 0) {
                return;
            }
            if (I.canScrollVertically(-1)) {
                int i = -t.h();
                if (i == 0) {
                    return;
                }
                od.aD(coordinatorLayout, oy.e, new czuw(this, coordinatorLayout, t, I, i));
                return;
            }
            J(coordinatorLayout, t, oy.e, true);
        }

        private final void H(CoordinatorLayout coordinatorLayout, T t, int i) {
            int abs = Math.abs(s() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            int s = s();
            if (s == i) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.d.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.d = valueAnimator3;
                valueAnimator3.setInterpolator(czum.e);
                this.d.addUpdateListener(new czuv(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration(Math.min(round, 600));
            this.d.setIntValues(s, i);
            this.d.start();
        }

        private static final View I(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof nl) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void J(CoordinatorLayout coordinatorLayout, T t, oy oyVar, boolean z) {
            od.aD(coordinatorLayout, oyVar, new czux(t, z));
        }

        private static final void K(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View view;
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = t.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i3++;
            }
            if (view != null) {
                int i4 = ((czva) view.getLayoutParams()).a;
                boolean z2 = true;
                if ((i4 & 1) != 0) {
                    int A = od.A(view);
                    if (i2 > 0) {
                    }
                }
                z2 = false;
                if (t.s) {
                    z2 = t.m(I(coordinatorLayout));
                }
                boolean l = t.l(z2);
                if (!z) {
                    if (!l) {
                        return;
                    }
                    List b = coordinatorLayout.e.b(t);
                    coordinatorLayout.f.clear();
                    if (b != null) {
                        coordinatorLayout.f.addAll(b);
                    }
                    List<View> list = coordinatorLayout.f;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        aji ajiVar = ((ajl) list.get(i5).getLayoutParams()).a;
                        if (ajiVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) ajiVar).d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                t.jumpDrawablesToCurrentState();
            }
        }

        public static boolean z(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            if (((ajl) t.getLayoutParams()).height == -2) {
                coordinatorLayout.o(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.czvl, defpackage.aji
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean f = super.f(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.q;
            int i3 = this.e;
            if (i3 >= 0 && (i2 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                B(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f ? od.A(childAt) + appBarLayout.n() : Math.round(childAt.getHeight() * this.g)));
            } else if (i2 != 0) {
                int i4 = i2 & 4;
                if ((i2 & 2) != 0) {
                    int i5 = -appBarLayout.g();
                    if (i4 != 0) {
                        H(coordinatorLayout, appBarLayout, i5);
                    } else {
                        B(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((i2 & 1) != 0) {
                    if (i4 != 0) {
                        H(coordinatorLayout, appBarLayout, 0);
                    } else {
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.q = 0;
            this.e = -1;
            C(akn.b(D(), -appBarLayout.g(), 0));
            K(coordinatorLayout, appBarLayout, D(), 0, true);
            appBarLayout.j(D());
            G(coordinatorLayout, appBarLayout);
            return f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ void g(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.c == 0 || i == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.s) {
                    appBarLayout.l(appBarLayout.m(view2));
                }
            }
            this.h = new WeakReference<>(view2);
        }

        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return z(coordinatorLayout, (AppBarLayout) view, i, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            y(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = A(coordinatorLayout, appBarLayout, i3, -appBarLayout.i(), 0);
            }
            if (i3 == 0) {
                G(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ void p(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof SavedState)) {
                this.e = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.e = savedState.a;
            this.g = savedState.b;
            this.f = savedState.e;
        }

        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ Parcelable q(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int D = D();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + D;
                if (childAt.getTop() + D <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.a = i;
                    if (bottom == od.A(childAt) + appBarLayout.n()) {
                        z = true;
                    }
                    savedState.e = z;
                    savedState.b = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = true;
            if ((i & 2) == 0 || (!appBarLayout.s && (appBarLayout.g() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.h = null;
            this.c = i2;
            return z;
        }

        @Override // defpackage.czvi
        public final int s() {
            return D() + this.a;
        }

        @Override // defpackage.czvi
        public final /* bridge */ /* synthetic */ int t(View view) {
            return ((AppBarLayout) view).g();
        }

        @Override // defpackage.czvi
        public final /* bridge */ /* synthetic */ int u(View view) {
            return -((AppBarLayout) view).i();
        }

        @Override // defpackage.czvi
        public final /* bridge */ /* synthetic */ boolean v(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.h;
            if (weakReference != null) {
                View view2 = weakReference.get();
                return view2 != null && view2.isShown() && !view2.canScrollVertically(-1);
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.czvi
        public final /* bridge */ /* synthetic */ void w(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            E(coordinatorLayout, appBarLayout);
            if (appBarLayout.s) {
                appBarLayout.l(appBarLayout.m(I(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.czvi
        public final /* bridge */ /* synthetic */ int x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int s = s();
            int i6 = 0;
            if (i2 == 0 || s < i2 || s > i3) {
                this.a = 0;
            } else {
                int b = akn.b(i, i2, i3);
                if (s != b) {
                    if (appBarLayout.p) {
                        int abs = Math.abs(b);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            czva czvaVar = (czva) childAt.getLayoutParams();
                            Interpolator interpolator = czvaVar.b;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = czvaVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + czvaVar.topMargin + czvaVar.bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= od.A(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (od.M(childAt)) {
                                    i5 -= appBarLayout.n();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(b) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = b;
                    boolean C = C(i4);
                    int i9 = s - b;
                    this.a = b - i4;
                    if (!C && appBarLayout.p) {
                        coordinatorLayout.k(appBarLayout);
                    }
                    appBarLayout.j(D());
                    K(coordinatorLayout, appBarLayout, b, b < s ? -1 : 1, false);
                    i6 = i9;
                }
            }
            G(coordinatorLayout, appBarLayout);
            return i6;
        }

        public final void y(CoordinatorLayout coordinatorLayout, T t, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -t.g();
                    i2 = i4;
                    i3 = t.h() + i4;
                } else {
                    i2 = -t.g();
                    i3 = 0;
                }
                if (i2 != i3) {
                    iArr[1] = A(coordinatorLayout, t, i, i2, i3);
                }
            }
            if (t.s) {
                t.l(t.m(view));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
        }

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new czuy();
            int a;
            float b;
            boolean e;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readInt();
                this.b = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.a);
                parcel.writeFloat(this.b);
                parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class ScrollingViewBehavior extends czvj {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout v(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.aji
        public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            aji ajiVar = ((ajl) view2.getLayoutParams()).a;
            if (ajiVar instanceof BaseBehavior) {
                od.ag(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ajiVar).a) + this.c) - x(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (!appBarLayout.s) {
                    return false;
                }
                appBarLayout.l(appBarLayout.m(view));
                return false;
            }
            return false;
        }

        @Override // defpackage.aji
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout v = v(coordinatorLayout.l(view));
            if (v != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    v.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.aji
        public final boolean i(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.aji
        public final void j(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                od.p(coordinatorLayout, oy.d.a());
                od.p(coordinatorLayout, oy.e.a());
            }
        }

        @Override // defpackage.aji
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            ow owVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View u = u(coordinatorLayout.l(view));
            if (u != null) {
                int size = View.MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = coordinatorLayout.getHeight();
                } else if (od.M(u) && (owVar = coordinatorLayout.g) != null) {
                    size += owVar.d() + owVar.f();
                }
                coordinatorLayout.o(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + t(u)) - u.getMeasuredHeight(), i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
                return true;
            }
            return false;
        }

        @Override // defpackage.czvj
        public final float s(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int g = appBarLayout.g();
                int h = appBarLayout.h();
                aji ajiVar = ((ajl) appBarLayout.getLayoutParams()).a;
                int s = ajiVar instanceof BaseBehavior ? ((BaseBehavior) ajiVar).s() : 0;
                if ((h == 0 || g + s > h) && (i = g - h) != 0) {
                    return (s / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.czvj
        public final int t(View view) {
            if (!(view instanceof AppBarLayout)) {
                return view.getMeasuredHeight();
            }
            return ((AppBarLayout) view).g();
        }

        @Override // defpackage.czvj
        public final /* bridge */ /* synthetic */ View u(List list) {
            return v(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, czvk.e);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private final boolean b() {
        return this.m != null && n() > 0;
    }

    protected static final czva o() {
        return new czva();
    }

    protected static final czva p(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new czva((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new czva(layoutParams);
        }
        return new czva((LinearLayout.LayoutParams) layoutParams);
    }

    private final void r() {
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    private final void s(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (true != z ? 2 : 1) | (true != z2 ? 0 : 4);
        if (true == z3) {
            i = 8;
        }
        this.q = i2 | i;
        requestLayout();
    }

    private final void t() {
        WeakReference<View> weakReference = this.j;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.j = null;
    }

    private final boolean u() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !od.M(childAt)) {
                return true;
            }
        }
        return false;
    }

    private final void v(boolean z) {
        if (this.g != z) {
            this.g = z;
            refreshDrawableState();
        }
    }

    @Override // defpackage.ajh
    public final aji<AppBarLayout> a() {
        return new Behavior();
    }

    public final void c(czuz czuzVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (czuzVar == null || this.e.contains(czuzVar)) {
            return;
        }
        this.e.add(czuzVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof czva;
    }

    public final void d(czuz czuzVar) {
        List<czuz> list = this.e;
        if (list == null || czuzVar == null) {
            return;
        }
        list.remove(czuzVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (b()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.m.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.m;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidateDrawable(drawable);
    }

    public final void e() {
        setWillNotDraw(!b());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f */
    public final czva mo4generateLayoutParams(AttributeSet attributeSet) {
        return new czva(getContext(), attributeSet);
    }

    public final int g() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            czva czvaVar = (czva) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = czvaVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + czvaVar.topMargin + czvaVar.bottomMargin;
            if (i2 == 0) {
                if (od.M(childAt)) {
                    i3 -= n();
                }
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 -= od.A(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return o();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams mo3generateDefaultLayoutParams() {
        return o();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return p(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams mo5generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return p(layoutParams);
    }

    final int h() {
        int i;
        int A;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            czva czvaVar = (czva) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = czvaVar.a;
            if ((i4 & 5) == 5) {
                int i5 = czvaVar.topMargin + czvaVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    A = od.A(childAt);
                } else if ((i4 & 2) != 0) {
                    A = measuredHeight - od.A(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && od.M(childAt)) {
                        i = Math.min(i, measuredHeight - n());
                    }
                    i3 += i;
                }
                i = i5 + A;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - n());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    final int i() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            czva czvaVar = (czva) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + czvaVar.topMargin + czvaVar.bottomMargin;
            int i4 = czvaVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= od.A(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    final void j(int i) {
        this.a = i;
        if (!willNotDraw()) {
            od.i(this);
        }
        List<czuz> list = this.e;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                czuz czuzVar = this.e.get(i2);
                if (czuzVar != null) {
                    czuzVar.h(this, i);
                }
            }
        }
    }

    public final int k() {
        int n = n();
        int A = od.A(this);
        if (A == 0) {
            int childCount = getChildCount();
            A = childCount > 0 ? od.A(getChildAt(childCount - 1)) : 0;
            if (A == 0) {
                return getHeight() / 3;
            }
        }
        return A + A + n;
    }

    public final boolean l(boolean z) {
        if (this.h != z) {
            this.h = z;
            refreshDrawableState();
            if (this.s && (getBackground() instanceof dadr)) {
                dadr dadrVar = (dadr) getBackground();
                float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
                float f = true != z ? dimension : 0.0f;
                if (true != z) {
                    dimension = 0.0f;
                }
                ValueAnimator valueAnimator = this.k;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
                this.k = ofFloat;
                ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
                this.k.setInterpolator(czum.a);
                this.k.addUpdateListener(new czuu(dadrVar));
                this.k.start();
            }
            return true;
        }
        return false;
    }

    final boolean m(View view) {
        int i;
        View view2 = null;
        if (this.j == null && (i = this.i) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.i);
            }
            if (findViewById != null) {
                this.j = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.j;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    final int n() {
        ow owVar = this.r;
        if (owVar != null) {
            return owVar.d();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dads.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.l == null) {
            this.l = new int[4];
        }
        int[] iArr = this.l;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.g;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130969772 : R.attr.state_liftable;
        int i2 = -2130969773;
        if (z2) {
            if (this.h) {
                i2 = R.attr.state_lifted;
            }
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i2;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130969769;
        int i3 = -2130969768;
        if (z && this.h) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (od.M(this) && u()) {
            int n = n();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                od.ag(getChildAt(childCount), n);
            }
        }
        r();
        boolean z2 = false;
        this.p = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((czva) getChildAt(i5).getLayoutParams()).b != null) {
                this.p = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), n());
        }
        if (!this.f) {
            if (!this.s) {
                int childCount3 = getChildCount();
                for (int i6 = 0; i6 < childCount3; i6++) {
                    int i7 = ((czva) getChildAt(i6).getLayoutParams()).a;
                    if ((i7 & 1) != 1 || (i7 & 10) == 0) {
                    }
                }
                v(z2);
            }
            z2 = true;
            v(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && od.M(this) && u()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = akn.b(getMeasuredHeight() + n(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += n();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        r();
    }

    public final void q(boolean z) {
        this.f = true;
        v(z);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        dads.d(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, od.ae(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.s = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.i = i;
        t();
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.m;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.m = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.m.setState(getDrawableState());
                }
                ks.d(this.m, od.s(this));
                this.m.setVisible(getVisibility() == 0, false);
                this.m.setCallback(this);
            }
            e();
            od.i(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(sl.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        czvn.a(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.m;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z, boolean z2) {
        s(z, z2, true);
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 2132018535), attributeSet, i);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.q = 0;
        Context context2 = getContext();
        setOrientation(1);
        int[] iArr = czvn.a;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context3 = getContext();
        TypedArray a = daaz.a(context3, attributeSet, czvn.a, i, 2132018535, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = daaz.a(context2, attributeSet, czvk.a, i, 2132018535, new int[0]);
            od.U(this, a2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                dadr dadrVar = new dadr();
                dadrVar.Q(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                dadrVar.W(context2);
                od.U(this, dadrVar);
            }
            if (a2.hasValue(4)) {
                s(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                czvn.a(this, a2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (a2.hasValue(2)) {
                    setKeyboardNavigationCluster(a2.getBoolean(2, false));
                }
                if (a2.hasValue(1)) {
                    setTouchscreenBlocksFocus(a2.getBoolean(1, false));
                }
            }
            this.s = a2.getBoolean(5, false);
            this.i = a2.getResourceId(6, -1);
            setStatusBarForeground(a2.getDrawable(7));
            a2.recycle();
            od.O(this, new czut(this));
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }
}
