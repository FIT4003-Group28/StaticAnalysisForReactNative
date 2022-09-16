package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
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
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements ajb {
    private int a;
    public boolean b;
    public int c;
    public mb d;
    public boolean e;
    public final List f;
    public Drawable g;
    private int h;
    private int i;
    private int j;
    private List k;
    private boolean l;
    private boolean m;
    private int n;
    private WeakReference o;
    private ValueAnimator p;
    private int[] q;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class BaseBehavior extends alir {
        public int a;
        public alif b;
        private int d;
        private ValueAnimator e;
        private int f;
        private boolean g;
        private float h;
        private WeakReference i;

        public BaseBehavior() {
            this.f = -1;
        }

        private final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int v = v();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                alii aliiVar = (alii) childAt.getLayoutParams();
                if (G(aliiVar.a, 32)) {
                    top -= aliiVar.topMargin;
                    bottom += aliiVar.bottomMargin;
                }
                int i2 = -v;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                alii aliiVar2 = (alii) childAt2.getLayoutParams();
                int i3 = aliiVar2.a;
                if ((i3 & 17) != 17) {
                    return;
                }
                int i4 = -childAt2.getTop();
                int i5 = -childAt2.getBottom();
                if (i == appBarLayout.getChildCount() - 1) {
                    i5 += appBarLayout.f();
                }
                if (G(i3, 2)) {
                    i5 += lj.f(childAt2);
                } else if (G(i3, 5)) {
                    int f = lj.f(childAt2) + i5;
                    if (v >= f) {
                        i5 = f;
                    } else {
                        i4 = f;
                    }
                }
                if (G(i3, 32)) {
                    i4 += aliiVar2.topMargin;
                    i5 -= aliiVar2.bottomMargin;
                }
                if (v < (i5 + i4) / 2) {
                    i4 = i5;
                }
                H(coordinatorLayout, appBarLayout, akf.c(i4, -appBarLayout.g(), 0));
            }
        }

        private final void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            lj.J(coordinatorLayout, mf.c.a());
            lj.J(coordinatorLayout, mf.d.a());
            View I = I(coordinatorLayout);
            if (I == null || appBarLayout.g() == 0 || !(((ajf) I.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                return;
            }
            if (v() != (-appBarLayout.g()) && I.canScrollVertically(1)) {
                J(coordinatorLayout, appBarLayout, mf.c, false);
            }
            if (v() == 0) {
                return;
            }
            if (I.canScrollVertically(-1)) {
                int i = -appBarLayout.c();
                if (i == 0) {
                    return;
                }
                lj.at(coordinatorLayout, mf.d, new alid(this, coordinatorLayout, appBarLayout, I, i));
                return;
            }
            J(coordinatorLayout, appBarLayout, mf.d, true);
        }

        private static boolean G(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(v() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int v = v();
            if (v == i) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.e.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.e = valueAnimator3;
                valueAnimator3.setInterpolator(alhv.e);
                this.e.addUpdateListener(new alic(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.e.setDuration(Math.min(height, 600));
            this.e.setIntValues(v, i);
            this.e.start();
        }

        private static final View I(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof kd) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, mf mfVar, boolean z) {
            lj.at(coordinatorLayout, mfVar, new alie(appBarLayout, z));
        }

        private static final void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            List list;
            View view;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                list = null;
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i3++;
            }
            boolean z2 = true;
            if (view != null) {
                int i4 = ((alii) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int f = lj.f(view);
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.e) {
                z2 = appBarLayout.p(I(coordinatorLayout));
            }
            boolean o = appBarLayout.o(z2);
            if (!z) {
                if (!o) {
                    return;
                }
                ArrayList a = coordinatorLayout.e.a(appBarLayout);
                if (a != null) {
                    list = new ArrayList(a);
                }
                if (list == null) {
                    list = Collections.emptyList();
                }
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ajc ajcVar = ((ajf) ((View) list.get(i5)).getLayoutParams()).a;
                    if (ajcVar instanceof ScrollingViewBehavior) {
                        if (((ScrollingViewBehavior) ajcVar).g == 0) {
                            return;
                        }
                    }
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            z(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = A(coordinatorLayout, appBarLayout, i4, -appBarLayout.d(), 0);
            }
            if (i4 == 0) {
                F(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.d == 0 || i == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.o(appBarLayout.p(view2));
                }
            }
            this.i = new WeakReference(view2);
        }

        @Override // defpackage.aliu, defpackage.ajc
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.c;
            int i3 = this.f;
            if (i3 >= 0 && (i2 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.g) {
                    round = lj.f(childAt) + appBarLayout.f();
                } else {
                    round = Math.round(childAt.getHeight() * this.h);
                }
                B(coordinatorLayout, appBarLayout, i4 + round);
            } else if (i2 != 0) {
                int i5 = i2 & 4;
                if ((i2 & 2) != 0) {
                    int i6 = -appBarLayout.g();
                    if (i5 != 0) {
                        H(coordinatorLayout, appBarLayout, i6);
                    } else {
                        B(coordinatorLayout, appBarLayout, i6);
                    }
                } else if ((i2 & 1) != 0) {
                    if (i5 != 0) {
                        H(coordinatorLayout, appBarLayout, 0);
                    } else {
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.c = 0;
            this.f = -1;
            D(akf.c(C(), -appBarLayout.g(), 0));
            K(coordinatorLayout, appBarLayout, C(), 0, true);
            appBarLayout.j(C());
            F(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = i & 2;
            boolean z = true;
            if (i3 == 0 || (!appBarLayout.e && (appBarLayout.g() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            }
            if (z && (valueAnimator = this.e) != null) {
                valueAnimator.cancel();
            }
            this.i = null;
            this.d = i2;
            return z;
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ajf) appBarLayout.getLayoutParams()).height == -2) {
                coordinatorLayout.o(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                return true;
            }
            return false;
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ void q(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof SavedState)) {
                this.f = -1;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.f = savedState.a;
            this.h = savedState.b;
            this.g = savedState.e;
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ Parcelable r(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int C = C();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + C;
                if (childAt.getTop() + C <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(absSavedState);
                    savedState.a = i;
                    if (bottom == lj.f(childAt) + appBarLayout.f()) {
                        z = true;
                    }
                    savedState.e = z;
                    savedState.b = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return absSavedState;
        }

        @Override // defpackage.alir
        public final /* bridge */ /* synthetic */ int t(View view) {
            return -((AppBarLayout) view).d();
        }

        @Override // defpackage.alir
        public final /* bridge */ /* synthetic */ int u(View view) {
            return ((AppBarLayout) view).g();
        }

        @Override // defpackage.alir
        public final int v() {
            return C() + this.a;
        }

        @Override // defpackage.alir
        public final /* bridge */ /* synthetic */ int w(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int v = v();
            int i6 = 0;
            if (i2 == 0 || v < i2 || v > i3) {
                this.a = 0;
            } else {
                int c = akf.c(i, i2, i3);
                if (v != c) {
                    if (appBarLayout.b) {
                        int abs = Math.abs(c);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            alii aliiVar = (alii) childAt.getLayoutParams();
                            Interpolator interpolator = aliiVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = aliiVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + aliiVar.topMargin + aliiVar.bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= lj.f(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (lj.af(childAt)) {
                                    i5 -= appBarLayout.f();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(c) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = c;
                    boolean D = D(i4);
                    int i9 = v - c;
                    this.a = c - i4;
                    int i10 = 1;
                    if (D) {
                        for (int i11 = 0; i11 < appBarLayout.getChildCount(); i11++) {
                            alii aliiVar2 = (alii) appBarLayout.getChildAt(i11).getLayoutParams();
                            alih alihVar = aliiVar2.b;
                            if (alihVar != null && (aliiVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                int C = C();
                                Rect rect = alihVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.f());
                                float abs2 = alihVar.a.top - Math.abs(C);
                                if (abs2 <= 0.0f) {
                                    float d = 1.0f - akf.d(Math.abs(abs2 / alihVar.a.height()));
                                    float height = (-abs2) - ((alihVar.a.height() * 0.3f) * (1.0f - (d * d)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(alihVar.b);
                                    alihVar.b.offset(0, (int) (-height));
                                    lj.R(childAt2, alihVar.b);
                                } else {
                                    lj.R(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.b) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.j(C());
                    if (c < v) {
                        i10 = -1;
                    }
                    K(coordinatorLayout, appBarLayout, c, i10, false);
                    i6 = i9;
                }
            }
            F(coordinatorLayout, appBarLayout);
            return i6;
        }

        @Override // defpackage.alir
        public final /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            E(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.o(appBarLayout.p(I(coordinatorLayout)));
            }
        }

        @Override // defpackage.alir
        public final /* bridge */ /* synthetic */ boolean y(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            alif alifVar = this.b;
            if (alifVar != null) {
                lvu lvuVar = alifVar.a.g;
                if (lvuVar.k && !lvuVar.v()) {
                    return true;
                }
            } else {
                WeakReference weakReference = this.i;
                if (weakReference == null) {
                    return true;
                }
                View view2 = (View) weakReference.get();
                if (view2 != null && view2.isShown() && !view2.canScrollVertically(-1)) {
                    return true;
                }
            }
            return false;
        }

        public final void z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    int i4 = -appBarLayout.g();
                    i2 = i4;
                    i3 = appBarLayout.c() + i4;
                } else {
                    i2 = -appBarLayout.g();
                    i3 = 0;
                }
                if (i2 != i3) {
                    iArr[1] = A(coordinatorLayout, appBarLayout, i, i2, i3);
                }
            }
            if (appBarLayout.e) {
                appBarLayout.o(appBarLayout.p(view));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = -1;
        }

        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public class SavedState extends androidx.customview.view.AbsSavedState {
            public static final Parcelable.Creator CREATOR = new aljh(1);
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
    /* loaded from: classes3.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ScrollingViewBehavior extends alis {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout w(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.ajc
        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ajc ajcVar = ((ajf) view2.getLayoutParams()).a;
            if (ajcVar instanceof BaseBehavior) {
                lj.E(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ajcVar).a) + this.f) - x(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (!appBarLayout.e) {
                    return false;
                }
                appBarLayout.o(appBarLayout.p(view));
                return false;
            }
            return false;
        }

        @Override // defpackage.aliu, defpackage.ajc
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.h(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.ajc
        public final boolean k(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout w = w(coordinatorLayout.h(view));
            if (w != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    w.m(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ajc
        public boolean n(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.ajc
        public final void o(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                lj.J(coordinatorLayout, mf.c.a());
                lj.J(coordinatorLayout, mf.d.a());
            }
        }

        @Override // defpackage.ajc
        public final /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            mb mbVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View v = v(coordinatorLayout.h(view));
            if (v != null) {
                int size = View.MeasureSpec.getSize(i3);
                if (size > 0) {
                    if (lj.af(v) && (mbVar = coordinatorLayout.f) != null) {
                        size += mbVar.f() + mbVar.c();
                    }
                } else {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.o(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + u(v)) - v.getMeasuredHeight(), i4 == -1 ? 1073741824 : CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
                return true;
            }
            return false;
        }

        @Override // defpackage.alis
        public final float t(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int g = appBarLayout.g();
                int c = appBarLayout.c();
                ajc ajcVar = ((ajf) appBarLayout.getLayoutParams()).a;
                int v = ajcVar instanceof BaseBehavior ? ((BaseBehavior) ajcVar).v() : 0;
                if ((c == 0 || g + v > c) && (i = g - c) != 0) {
                    return (v / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.alis
        public final int u(View view) {
            return ((AppBarLayout) view).g();
        }

        @Override // defpackage.alis
        public final /* bridge */ /* synthetic */ View v(List list) {
            return w(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alit.e);
            this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private final void b() {
        this.h = -1;
        this.i = -1;
        this.j = -1;
    }

    protected static final alii q() {
        return new alii();
    }

    protected static final alii r(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new alii((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new alii(layoutParams);
        }
        return new alii((LinearLayout.LayoutParams) layoutParams);
    }

    private final void s(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (true != z ? 2 : 1) | (true != z2 ? 0 : 4);
        if (true == z3) {
            i = 8;
        }
        this.c = i2 | i;
        requestLayout();
    }

    private final boolean t() {
        return this.g != null && f() > 0;
    }

    private final boolean u() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !lj.af(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajb
    public final ajc a() {
        return new Behavior();
    }

    final int c() {
        int i;
        int f;
        int i2 = this.i;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            alii aliiVar = (alii) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aliiVar.a;
            if ((i4 & 5) == 5) {
                int i5 = aliiVar.topMargin + aliiVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    f = lj.f(childAt);
                } else if ((i4 & 2) != 0) {
                    f = measuredHeight - lj.f(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && lj.af(childAt)) {
                        i = Math.min(i, measuredHeight - f());
                    }
                    i3 += i;
                }
                i = i5 + f;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - f());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.i = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof alii;
    }

    final int d() {
        int i = this.j;
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
            alii aliiVar = (alii) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + aliiVar.topMargin + aliiVar.bottomMargin;
            int i4 = aliiVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= lj.f(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.j = max;
        return max;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.a);
            this.g.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.g;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidateDrawable(drawable);
    }

    public final int e() {
        int f = f();
        int f2 = lj.f(this);
        if (f2 == 0) {
            int childCount = getChildCount();
            f2 = childCount > 0 ? lj.f(getChildAt(childCount - 1)) : 0;
            if (f2 == 0) {
                return getHeight() / 3;
            }
        }
        return f2 + f2 + f;
    }

    final int f() {
        mb mbVar = this.d;
        if (mbVar != null) {
            return mbVar.f();
        }
        return 0;
    }

    public final int g() {
        int i = this.h;
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
            alii aliiVar = (alii) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aliiVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + aliiVar.topMargin + aliiVar.bottomMargin;
            if (i2 == 0) {
                if (lj.af(childAt)) {
                    i3 -= f();
                }
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 -= lj.f(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.h = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return q();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h */
    public final alii mo162generateLayoutParams(AttributeSet attributeSet) {
        return new alii(getContext(), attributeSet);
    }

    public final void i(alig aligVar) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        if (aligVar == null || this.k.contains(aligVar)) {
            return;
        }
        this.k.add(aligVar);
    }

    final void j(int i) {
        this.a = i;
        if (!willNotDraw()) {
            lj.G(this);
        }
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                alig aligVar = (alig) this.k.get(i2);
                if (aligVar != null) {
                    aligVar.a(this, i);
                }
            }
        }
    }

    public final void k(alig aligVar) {
        List list = this.k;
        if (list == null || aligVar == null) {
            return;
        }
        list.remove(aligVar);
    }

    public final void l(boolean z) {
        m(z, lj.al(this));
    }

    public final void m(boolean z, boolean z2) {
        s(z, z2, true);
    }

    public final void n() {
        setWillNotDraw(!t());
    }

    final boolean o(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (this.e && (getBackground() instanceof almx)) {
                almx almxVar = (almx) getBackground();
                float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
                float f = true != z ? dimension : 0.0f;
                if (true != z) {
                    dimension = 0.0f;
                }
                ValueAnimator valueAnimator = this.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
                this.p = ofFloat;
                ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
                this.p.setInterpolator(alhv.a);
                this.p.addUpdateListener(new alib(this, almxVar));
                this.p.start();
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        almu.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.l;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970142 : R.attr.state_liftable;
        int i2 = -2130970143;
        if (z2) {
            if (this.m) {
                i2 = R.attr.state_lifted;
            }
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i2;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130970140;
        int i3 = -2130970139;
        if (z && this.m) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            boolean r2 = defpackage.lj.af(r1)
            if (r2 == 0) goto L23
            boolean r2 = r1.u()
            if (r2 == 0) goto L23
            int r2 = r1.f()
            int r3 = r1.getChildCount()
        L17:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L23
            android.view.View r4 = r1.getChildAt(r3)
            defpackage.lj.E(r4, r2)
            goto L17
        L23:
            r1.b()
            r2 = 0
            r1.b = r2
            int r3 = r1.getChildCount()
            r4 = 0
        L2e:
            r5 = 1
            if (r4 >= r3) goto L45
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            alii r6 = (defpackage.alii) r6
            android.view.animation.Interpolator r6 = r6.c
            if (r6 == 0) goto L42
            r1.b = r5
            goto L45
        L42:
            int r4 = r4 + 1
            goto L2e
        L45:
            android.graphics.drawable.Drawable r3 = r1.g
            if (r3 == 0) goto L54
            int r4 = r1.getWidth()
            int r6 = r1.f()
            r3.setBounds(r2, r2, r4, r6)
        L54:
            boolean r3 = r1.e
            if (r3 != 0) goto L77
            int r3 = r1.getChildCount()
            r4 = 0
        L5d:
            if (r4 >= r3) goto L78
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            alii r6 = (defpackage.alii) r6
            int r6 = r6.a
            r0 = r6 & 1
            if (r0 != r5) goto L74
            r6 = r6 & 10
            if (r6 == 0) goto L74
            goto L77
        L74:
            int r4 = r4 + 1
            goto L5d
        L77:
            r2 = 1
        L78:
            boolean r3 = r1.l
            if (r3 == r2) goto L81
            r1.l = r2
            r1.refreshDrawableState()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && lj.af(this) && u()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = akf.c(getMeasuredHeight() + f(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += f();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        b();
    }

    final boolean p(View view) {
        int i;
        View view2 = null;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        almu.b(this, f);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams mo161generateDefaultLayoutParams() {
        return q();
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(alqt.a(context, attributeSet, i, 2132084197), attributeSet, i);
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.c = 0;
        this.f = new ArrayList();
        Context context2 = getContext();
        boolean z = true;
        setOrientation(1);
        int[] iArr = aliw.a;
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        Context context3 = getContext();
        TypedArray a = alli.a(context3, attributeSet, aliw.a, i, 2132084197, new int[0]);
        try {
            if (a.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
            }
            a.recycle();
            TypedArray a2 = alli.a(context2, attributeSet, alit.a, i, 2132084197, new int[0]);
            lj.O(this, a2.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                almx almxVar = new almx();
                almxVar.l(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                almxVar.j(context2);
                lj.O(this, almxVar);
            }
            if (a2.hasValue(4)) {
                s(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                int dimensionPixelSize = a2.getDimensionPixelSize(3, 0);
                int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = integer;
                stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130970143}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
                stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, "elevation", dimensionPixelSize).setDuration(j));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
                setStateListAnimator(stateListAnimator);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (a2.hasValue(2)) {
                    setKeyboardNavigationCluster(a2.getBoolean(2, false));
                }
                if (a2.hasValue(1)) {
                    setTouchscreenBlocksFocus(a2.getBoolean(1, false));
                }
            }
            this.e = a2.getBoolean(5, false);
            this.n = a2.getResourceId(6, -1);
            Drawable drawable = a2.getDrawable(7);
            Drawable drawable2 = this.g;
            if (drawable2 != drawable) {
                Drawable drawable3 = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                drawable3 = drawable != null ? drawable.mutate() : drawable3;
                this.g = drawable3;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.g.setState(getDrawableState());
                    }
                    iy.n(this.g, lj.e(this));
                    this.g.setVisible(getVisibility() != 0 ? false : z, false);
                    this.g.setCallback(this);
                }
                n();
                lj.G(this);
            }
            a2.recycle();
            lj.X(this, new alia(this));
        } catch (Throwable th) {
            a.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return r(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams mo163generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return r(layoutParams);
    }
}
