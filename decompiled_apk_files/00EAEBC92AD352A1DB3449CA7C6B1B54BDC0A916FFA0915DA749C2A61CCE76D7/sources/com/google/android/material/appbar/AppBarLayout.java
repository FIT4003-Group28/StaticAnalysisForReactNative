package com.google.android.material.appbar;

import a.g.m.d0;
import a.g.m.l;
import a.g.m.r;
import a.g.m.v;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.e.a.c.a0.g;
import c.e.a.c.a0.h;
import c.e.a.c.j;
import c.e.a.c.k;
import java.lang.ref.WeakReference;
import java.util.List;
@CoordinatorLayout.d(Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private int f7848b;

    /* renamed from: c  reason: collision with root package name */
    private int f7849c;

    /* renamed from: d  reason: collision with root package name */
    private int f7850d;

    /* renamed from: e  reason: collision with root package name */
    private int f7851e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7852f;

    /* renamed from: g  reason: collision with root package name */
    private int f7853g;

    /* renamed from: h  reason: collision with root package name */
    private d0 f7854h;
    private List<c> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private WeakReference<View> o;
    private ValueAnimator p;
    private int[] q;
    private Drawable r;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {
        private int k;
        private int l;
        private ValueAnimator m;
        private int n;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private b r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f7855a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f7856b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f7855a = coordinatorLayout;
                this.f7856b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.c(this.f7855a, (CoordinatorLayout) this.f7856b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* loaded from: classes.dex */
        public static abstract class b<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes.dex */
        public static class c extends a.i.a.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: d  reason: collision with root package name */
            int f7858d;

            /* renamed from: e  reason: collision with root package name */
            float f7859e;

            /* renamed from: f  reason: collision with root package name */
            boolean f7860f;

            /* loaded from: classes.dex */
            static class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: createFromParcel */
                public c mo261createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: createFromParcel */
                public c mo262createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: newArray */
                public c[] mo263newArray(int i) {
                    return new c[i];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f7858d = parcel.readInt();
                this.f7859e = parcel.readFloat();
                this.f7860f = parcel.readByte() != 0;
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // a.i.a.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f7858d);
                parcel.writeFloat(this.f7859e);
                parcel.writeByte(this.f7860f ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.n = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.n = -1;
        }

        private View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, float f2) {
            int abs = Math.abs(c() - i);
            float abs2 = Math.abs(f2);
            a(coordinatorLayout, (CoordinatorLayout) t, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c2 = c();
            if (c2 == i) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m;
            if (valueAnimator2 == null) {
                this.m = new ValueAnimator();
                this.m.setInterpolator(c.e.a.c.l.a.f4737e);
                this.m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.m.setDuration(Math.min(i2, 600));
            this.m.setIntValues(c2, i);
            this.m.start();
        }

        private void a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a2 = a(t, i);
            if (a2 != null) {
                int a3 = ((d) a2.getLayoutParams()).a();
                boolean z2 = false;
                if ((a3 & 1) != 0) {
                    int q = v.q(a2);
                    if (i2 <= 0 || (a3 & 12) == 0 ? !((a3 & 2) == 0 || (-i) < (a2.getBottom() - q) - t.getTopInset()) : (-i) >= (a2.getBottom() - q) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.c()) {
                    z2 = t.a(a(coordinatorLayout));
                }
                boolean a4 = t.a(z2);
                if (!z && (!a4 || !c(coordinatorLayout, (CoordinatorLayout) t))) {
                    return;
                }
                t.jumpDrawablesToCurrentState();
            }
        }

        private static boolean a(int i, int i2) {
            return (i & i2) == i2;
        }

        private boolean a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private int b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (a(dVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private int c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator b2 = dVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b2 != null) {
                    int a2 = dVar.a();
                    if ((a2 & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((a2 & 2) != 0) {
                            i2 -= v.q(childAt);
                        }
                    }
                    if (v.m(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f2 = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f2 * b2.getInterpolation((abs - childAt.getTop()) / f2)));
                    }
                }
            }
            return i;
        }

        private boolean c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c2 = coordinatorLayout.c(t);
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c d2 = ((CoordinatorLayout.f) c2.get(i).getLayoutParams()).d();
                if (d2 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) d2).c() != 0;
                }
            }
            return false;
        }

        private void d(CoordinatorLayout coordinatorLayout, T t) {
            int c2 = c();
            int b2 = b((BaseBehavior<T>) t, c2);
            if (b2 >= 0) {
                View childAt = t.getChildAt(b2);
                d dVar = (d) childAt.getLayoutParams();
                int a2 = dVar.a();
                if ((a2 & 17) != 17) {
                    return;
                }
                int i = -childAt.getTop();
                int i2 = -childAt.getBottom();
                if (b2 == t.getChildCount() - 1) {
                    i2 += t.getTopInset();
                }
                if (a(a2, 2)) {
                    i2 += v.q(childAt);
                } else if (a(a2, 5)) {
                    int q = v.q(childAt) + i2;
                    if (c2 < q) {
                        i = q;
                    } else {
                        i2 = q;
                    }
                }
                if (a(a2, 32)) {
                    i += ((LinearLayout.LayoutParams) dVar).topMargin;
                    i2 -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                if (c2 < (i2 + i) / 2) {
                    i = i2;
                }
                a(coordinatorLayout, (CoordinatorLayout) t, a.g.h.a.a(i, -t.getTotalScrollRange(), 0), 0.0f);
            }
        }

        int a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c2 = c();
            int i4 = 0;
            if (i2 == 0 || c2 < i2 || c2 > i3) {
                this.k = 0;
            } else {
                int a2 = a.g.h.a.a(i, i2, i3);
                if (c2 != a2) {
                    int c3 = t.a() ? c((BaseBehavior<T>) t, a2) : a2;
                    boolean a3 = a(c3);
                    i4 = c2 - a2;
                    this.k = a2 - c3;
                    if (!a3 && t.a()) {
                        coordinatorLayout.a(t);
                    }
                    t.a(b());
                    a(coordinatorLayout, (CoordinatorLayout) t, a2, a2 < c2 ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), parcelable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, i3, i4, i5, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, i, i2, iArr, i3);
        }

        void a(CoordinatorLayout coordinatorLayout, T t) {
            d(coordinatorLayout, (CoordinatorLayout) t);
            if (t.c()) {
                t.a(t.a(a(coordinatorLayout)));
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof c)) {
                super.a(coordinatorLayout, (CoordinatorLayout) t, parcelable);
                this.n = -1;
                return;
            }
            c cVar = (c) parcelable;
            super.a(coordinatorLayout, (CoordinatorLayout) t, cVar.j());
            this.n = cVar.f7858d;
            this.p = cVar.f7859e;
            this.o = cVar.f7860f;
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.l == 0 || i == 1) {
                d(coordinatorLayout, (CoordinatorLayout) t);
                if (t.c()) {
                    t.a(t.a(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = a(coordinatorLayout, (CoordinatorLayout) t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i4 = i6;
                    i5 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = a(coordinatorLayout, (CoordinatorLayout) t, i2, i4, i5);
                }
            }
            if (t.c()) {
                t.a(t.a(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ boolean a(View view) {
            return a((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3, i4);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean a2 = super.a(coordinatorLayout, (CoordinatorLayout) t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                c(coordinatorLayout, (CoordinatorLayout) t, (-childAt.getBottom()) + (this.o ? v.q(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, (CoordinatorLayout) t, i3, 0.0f);
                    } else {
                        c(coordinatorLayout, (CoordinatorLayout) t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, (CoordinatorLayout) t, 0, 0.0f);
                    } else {
                        c(coordinatorLayout, (CoordinatorLayout) t, 0);
                    }
                }
            }
            t.d();
            this.n = -1;
            a(a.g.h.a.a(b(), -t.getTotalScrollRange(), 0));
            a(coordinatorLayout, (CoordinatorLayout) t, b(), 0, true);
            t.a(b());
            return a2;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.a(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.a(coordinatorLayout, (CoordinatorLayout) t, i, i2, i3, i4);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.c() || a(coordinatorLayout, (CoordinatorLayout) t, view));
            if (z && (valueAnimator = this.m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.l = i2;
            return z;
        }

        boolean a(T t) {
            b bVar = this.r;
            if (bVar != null) {
                return bVar.a(t);
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int b(View view) {
            return b((BaseBehavior<T>) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int b(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3);
        }

        int b(T t) {
            return -t.getDownNestedScrollRange();
        }

        public Parcelable b(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d2 = super.d(coordinatorLayout, (CoordinatorLayout) t);
            int b2 = b();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 <= 0 && bottom >= 0) {
                    c cVar = new c(d2);
                    cVar.f7858d = i;
                    if (bottom == v.q(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f7860f = z;
                    cVar.f7859e = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return d2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, view3, i, i2);
        }

        @Override // com.google.android.material.appbar.a
        int c() {
            return b() + this.k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int c(View view) {
            return c((BaseBehavior<T>) ((AppBarLayout) view));
        }

        int c(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ Parcelable d(CoordinatorLayout coordinatorLayout, View view) {
            return b(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view) {
            a(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ScrollingViewBehavior_Layout);
            b(obtainStyledAttributes.getDimensionPixelSize(k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        private static int a(AppBarLayout appBarLayout) {
            CoordinatorLayout.c d2 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).d();
            if (d2 instanceof BaseBehavior) {
                return ((BaseBehavior) d2).c();
            }
            return 0;
        }

        private void a(View view, View view2) {
            CoordinatorLayout.c d2 = ((CoordinatorLayout.f) view2.getLayoutParams()).d();
            if (d2 instanceof BaseBehavior) {
                v.e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d2).k) + d()) - a(view2));
            }
        }

        private void b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (!appBarLayout.c()) {
                    return;
                }
                appBarLayout.a(appBarLayout.a(view));
            }
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: a */
        /* bridge */ /* synthetic */ View mo264a(List list) {
            return mo264a((List<View>) list);
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: a  reason: collision with other method in class */
        AppBarLayout mo264a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo264a = mo264a(coordinatorLayout.b(view));
            if (mo264a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f7873d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo264a.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.b
        float b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a2 = a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a2 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (a2 / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a(view, view2);
            b(view, view2);
            return false;
        }

        @Override // com.google.android.material.appbar.b
        int c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.c(view);
        }
    }

    /* loaded from: classes.dex */
    class a implements r {
        a() {
        }

        @Override // a.g.m.r
        public d0 a(View view, d0 d0Var) {
            return AppBarLayout.this.a(d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f7862a;

        b(AppBarLayout appBarLayout, g gVar) {
            this.f7862a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7862a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t, int i);
    }

    /* loaded from: classes.dex */
    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f7863a;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f7864b;

        public d(int i, int i2) {
            super(i, i2);
            this.f7863a = 1;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7863a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.AppBarLayout_Layout);
            this.f7863a = obtainStyledAttributes.getInt(k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f7864b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7863a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7863a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7863a = 1;
        }

        public int a() {
            return this.f7863a;
        }

        public void a(int i) {
            this.f7863a = i;
        }

        public Interpolator b() {
            return this.f7864b;
        }

        boolean c() {
            int i = this.f7863a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.e.a.c.b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7849c = -1;
        this.f7850d = -1;
        this.f7851e = -1;
        this.f7853g = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this);
            e.a(this, attributeSet, i, j.Widget_Design_AppBarLayout);
        }
        TypedArray c2 = com.google.android.material.internal.g.c(context, attributeSet, k.AppBarLayout, i, j.Widget_Design_AppBarLayout, new int[0]);
        v.a(this, c2.getDrawable(k.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            g gVar = new g();
            gVar.a(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.a(context);
            v.a(this, gVar);
        }
        if (c2.hasValue(k.AppBarLayout_expanded)) {
            a(c2.getBoolean(k.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && c2.hasValue(k.AppBarLayout_elevation)) {
            e.a(this, c2.getDimensionPixelSize(k.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (c2.hasValue(k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c2.getBoolean(k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c2.hasValue(k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c2.getBoolean(k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.m = c2.getBoolean(k.AppBarLayout_liftOnScroll, false);
        this.n = c2.getResourceId(k.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(c2.getDrawable(k.AppBarLayout_statusBarForeground));
        c2.recycle();
        v.a(this, new a());
    }

    private void a(g gVar, boolean z) {
        float dimension = getResources().getDimension(c.e.a.c.d.design_appbar_elevation);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.p = ValueAnimator.ofFloat(f2, dimension);
        this.p.setDuration(getResources().getInteger(c.e.a.c.g.app_bar_elevation_anim_duration));
        this.p.setInterpolator(c.e.a.c.l.a.f4733a);
        this.p.addUpdateListener(new b(this, gVar));
        this.p.start();
    }

    private void a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f7853g = i2 | i;
        requestLayout();
    }

    private View b(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean b(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private void e() {
        WeakReference<View> weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    private boolean f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void g() {
        this.f7849c = -1;
        this.f7850d = -1;
        this.f7851e = -1;
    }

    private boolean h() {
        return this.r != null && getTopInset() > 0;
    }

    private boolean i() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return childAt.getVisibility() != 8 && !v.m(childAt);
        }
        return false;
    }

    private void j() {
        setWillNotDraw(!h());
    }

    d0 a(d0 d0Var) {
        d0 d0Var2 = v.m(this) ? d0Var : null;
        if (!androidx.core.util.c.a(this.f7854h, d0Var2)) {
            this.f7854h = d0Var2;
            j();
            requestLayout();
        }
        return d0Var;
    }

    void a(int i) {
        this.f7848b = i;
        if (!willNotDraw()) {
            v.M(this);
        }
        List<c> list = this.i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = this.i.get(i2);
                if (cVar != null) {
                    cVar.a(this, i);
                }
            }
        }
    }

    public void a(boolean z, boolean z2) {
        a(z, z2, true);
    }

    boolean a() {
        return this.f7852f;
    }

    boolean a(View view) {
        View b2 = b(view);
        if (b2 != null) {
            view = b2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    boolean a(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
            if (!this.m || !(getBackground() instanceof g)) {
                return true;
            }
            a((g) getBackground(), z);
            return true;
        }
        return false;
    }

    boolean b() {
        return getTotalScrollRange() != 0;
    }

    public boolean c() {
        return this.m;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    void d() {
        this.f7853g = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (h()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f7848b);
            this.r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidateDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public d mo255generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public d mo257generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public d mo258generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams) : new d((LinearLayout.LayoutParams) layoutParams);
    }

    int getDownNestedPreScrollRange() {
        int i;
        int q;
        int i2 = this.f7850d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f7863a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    q = v.q(childAt);
                } else if ((i4 & 2) != 0) {
                    q = measuredHeight - v.q(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && v.m(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + q;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f7850d = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f7851e;
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
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            int i4 = dVar.f7863a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= v.q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f7851e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int q = v.q(this);
        if (q == 0) {
            int childCount = getChildCount();
            q = childCount >= 1 ? v.q(getChildAt(childCount - 1)) : 0;
            if (q == 0) {
                return getHeight() / 3;
            }
        }
        return (q * 2) + topInset;
    }

    int getPendingAction() {
        return this.f7853g;
    }

    public Drawable getStatusBarForeground() {
        return this.r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        d0 d0Var = this.f7854h;
        if (d0Var != null) {
            return d0Var.g();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f7849c;
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
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f7863a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
            if (i2 == 0 && v.m(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= v.q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f7849c = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.q == null) {
            this.q = new int[4];
        }
        int[] iArr = this.q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.k ? c.e.a.c.b.state_liftable : -c.e.a.c.b.state_liftable;
        iArr[1] = (!this.k || !this.l) ? -c.e.a.c.b.state_lifted : c.e.a.c.b.state_lifted;
        iArr[2] = this.k ? c.e.a.c.b.state_collapsible : -c.e.a.c.b.state_collapsible;
        iArr[3] = (!this.k || !this.l) ? -c.e.a.c.b.state_collapsed : c.e.a.c.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (v.m(this) && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                v.e(getChildAt(childCount), topInset);
            }
        }
        g();
        boolean z2 = false;
        this.f7852f = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((d) getChildAt(i5).getLayoutParams()).b() != null) {
                this.f7852f = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.j) {
            if (this.m || f()) {
                z2 = true;
            }
            b(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && v.m(this) && i()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = a.g.h.a.a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        g();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        h.a(this, f2);
    }

    public void setExpanded(boolean z) {
        a(z, v.I(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.m = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        e();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            Drawable drawable4 = this.r;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.a(this.r, v.p(this));
                this.r.setVisible(getVisibility() == 0, false);
                this.r.setCallback(this);
            }
            j();
            v.M(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(a.a.k.a.a.c(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this, f2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }
}
