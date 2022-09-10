package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class BottomSheetBehavior<V extends View> extends aji<V> {
    private boolean A;
    private boolean B;
    private dadx C;
    private boolean D;
    private czvz E;
    private ValueAnimator F;
    private boolean G;
    private int H;
    private boolean I;
    private int J;
    private final ArrayList<czvx> K;
    private VelocityTracker L;
    private int M;
    private Map<View, Integer> N;
    private int O;
    private final amx P;
    private int a;
    public boolean b;
    public int c;
    public dadr d;
    public int e;
    public int f;
    public int g;
    public int h;
    float i;
    public int j;
    float k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public amy p;
    int q;
    public int r;
    public WeakReference<V> s;
    public WeakReference<View> t;
    public int u;
    public boolean v;
    private float w;
    private boolean x;
    private int y;
    private int z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.E = null;
        this.i = 0.5f;
        this.k = -1.0f;
        this.n = true;
        this.o = 4;
        this.K = new ArrayList<>();
        this.O = -1;
        this.P = new czvv(this);
    }

    public static <V extends View> BottomSheetBehavior<V> F(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof ajl)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        aji ajiVar = ((ajl) layoutParams).a;
        if (!(ajiVar instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior) ajiVar;
    }

    private final void H(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.D == z) {
            return;
        }
        this.D = z;
        if (this.d == null || (valueAnimator = this.F) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.F.reverse();
            return;
        }
        float f = i == 3 ? 0.0f : 1.0f;
        this.F.setFloatValues(1.0f - f, f);
        this.F.start();
    }

    private final int I() {
        int i;
        return this.x ? Math.min(Math.max(this.y, this.r - ((this.q * 9) / 16)), this.J) : (this.B || (i = this.e) <= 0) ? this.c : Math.max(this.c, i + this.z);
    }

    private final void J() {
        int I = I();
        if (this.b) {
            this.j = Math.max(this.r - I, this.g);
        } else {
            this.j = this.r - I;
        }
    }

    private final void K() {
        this.h = (int) (this.r * (1.0f - this.i));
    }

    private final void L() {
        this.u = -1;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
    }

    private final void M(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.A) {
            this.C = dadx.b(context, attributeSet, R.attr.bottomSheetStyle, 2132018537).b();
            dadr dadrVar = new dadr(this.C);
            this.d = dadrVar;
            dadrVar.W(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.d.setTint(typedValue.data);
                return;
            }
            this.d.Q(colorStateList);
        }
    }

    private final void N(boolean z) {
        WeakReference<V> weakReference = this.s;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.N != null) {
                return;
            }
            this.N = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.s.get() && z) {
                this.N.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (z) {
            return;
        }
        this.N = null;
    }

    private final void O() {
        V v;
        WeakReference<V> weakReference = this.s;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        od.p(v, ImageMetadata.LENS_APERTURE);
        od.p(v, 262144);
        od.p(v, ImageMetadata.SHADING_MODE);
        int i = this.O;
        if (i != -1) {
            od.p(v, i);
        }
        int i2 = 6;
        if (this.o != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            pp Q = Q(6);
            List<oy> q = od.q(v);
            int i3 = 0;
            int i4 = -1;
            while (true) {
                int length = od.a.length;
                if (i3 >= 32 || i4 != -1) {
                    break;
                }
                int i5 = od.a[i3];
                boolean z = true;
                for (int i6 = 0; i6 < q.size(); i6++) {
                    z &= q.get(i6).a() != i5;
                }
                i4 = true != z ? -1 : i5;
                i3++;
            }
            if (i4 != -1) {
                od.o(v, new oy(null, i4, string, Q, null));
            }
            this.O = i4;
        }
        if (this.l && this.o != 5) {
            P(v, oy.h, 5);
        }
        int i7 = this.o;
        if (i7 == 3) {
            if (true == this.b) {
                i2 = 4;
            }
            P(v, oy.g, i2);
        } else if (i7 == 4) {
            if (true == this.b) {
                i2 = 3;
            }
            P(v, oy.f, i2);
        } else if (i7 == 6) {
            P(v, oy.g, 4);
            P(v, oy.f, 3);
        }
    }

    private final void P(V v, oy oyVar, int i) {
        od.aD(v, oyVar, Q(i));
    }

    private final pp Q(int i) {
        return new czvw(this, i);
    }

    public final boolean A(View view, float f) {
        if (this.m) {
            return true;
        }
        if (view.getTop() < this.j) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.j)) / ((float) I()) > 0.5f;
    }

    final View B(View view) {
        if (od.Z(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View B = B(viewGroup.getChildAt(i));
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    public final void D(View view, int i, int i2, boolean z) {
        amy amyVar = this.p;
        if (amyVar == null || (!z ? !amyVar.d(view, view.getLeft(), i2) : !amyVar.e(view.getLeft(), i2))) {
            z(i);
            return;
        }
        z(2);
        H(i);
        if (this.E == null) {
            this.E = new czvz(this, view, i);
        }
        czvz czvzVar = this.E;
        if (czvzVar.a) {
            czvzVar.b = i;
            return;
        }
        czvzVar.b = i;
        od.j(view, czvzVar);
        this.E.a = true;
    }

    public final void E(int i) {
        float f;
        float f2;
        if (this.s.get() == null || this.K.isEmpty()) {
            return;
        }
        int i2 = this.j;
        if (i > i2 || i2 == u()) {
            int i3 = this.j;
            f = i3 - i;
            f2 = this.r - i3;
        } else {
            int i4 = this.j;
            f = i4 - i;
            f2 = i4 - u();
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.K.size(); i5++) {
            this.K.get(i5).a(f3);
        }
    }

    public final void G() {
        V v;
        if (this.s != null) {
            J();
            if (this.o != 4 || (v = this.s.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // defpackage.aji
    public final void a(ajl ajlVar) {
        this.s = null;
        this.p = null;
    }

    @Override // defpackage.aji
    public final void b() {
        this.s = null;
        this.p = null;
    }

    @Override // defpackage.aji
    public boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        amy amyVar;
        if (!v.isShown() || !this.n) {
            this.G = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            L();
            actionMasked = 0;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.M = (int) motionEvent.getY();
            if (this.o != 2) {
                WeakReference<View> weakReference = this.t;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m(view2, x, this.M)) {
                    this.u = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.v = true;
                }
            }
            this.G = this.u == -1 && !coordinatorLayout.m(v, x, this.M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.v = false;
            this.u = -1;
            if (this.G) {
                this.G = false;
                return false;
            }
        }
        if (!this.G && (amyVar = this.p) != null && amyVar.i(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.t;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.G && this.o != 1 && !coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.p != null && Math.abs(((float) this.M) - motionEvent.getY()) > ((float) this.p.b);
    }

    @Override // defpackage.aji
    public final boolean d(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.o == 1 && actionMasked == 0) {
            return true;
        }
        amy amyVar = this.p;
        if (amyVar != null) {
            amyVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            L();
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        if (this.p != null && actionMasked == 2 && !this.G) {
            float abs = Math.abs(this.M - motionEvent.getY());
            amy amyVar2 = this.p;
            if (abs > amyVar2.b) {
                amyVar2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.G;
    }

    @Override // defpackage.aji
    public final boolean f(CoordinatorLayout coordinatorLayout, V v, int i) {
        dadr dadrVar;
        if (od.M(coordinatorLayout) && !od.M(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.s == null) {
            this.y = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.B && !this.x) {
                od.O(v, new daba(new czvu(this), new dabc(od.w(v), v.getPaddingTop(), od.x(v), v.getPaddingBottom())));
                if (od.ak(v)) {
                    od.L(v);
                } else {
                    v.addOnAttachStateChangeListener(new dabb());
                }
            }
            this.s = new WeakReference<>(v);
            if (this.A && (dadrVar = this.d) != null) {
                od.U(v, dadrVar);
            }
            dadr dadrVar2 = this.d;
            if (dadrVar2 != null) {
                float f = this.k;
                if (f == -1.0f) {
                    f = od.G(v);
                }
                dadrVar2.aa(f);
                int i2 = this.o;
                this.D = i2 == 3;
                this.d.Y(i2 == 3 ? 0.0f : 1.0f);
            }
            O();
            if (od.l(v) == 0) {
                od.m(v, 1);
            }
        }
        if (this.p == null) {
            this.p = amy.a(coordinatorLayout, this.P);
        }
        int top = v.getTop();
        coordinatorLayout.h(v, i);
        this.q = coordinatorLayout.getWidth();
        this.r = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.J = height;
        this.g = Math.max(0, this.r - height);
        K();
        J();
        int i3 = this.o;
        if (i3 == 3) {
            od.ag(v, u());
        } else if (i3 == 6) {
            od.ag(v, this.h);
        } else if (this.l && i3 == 5) {
            od.ag(v, this.r);
        } else if (i3 == 4) {
            od.ag(v, this.j);
        } else if (i3 == 1 || i3 == 2) {
            od.ag(v, top - v.getTop());
        }
        this.t = new WeakReference<>(B(v));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.j)) goto L47;
     */
    @Override // defpackage.aji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.u()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.z(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.t
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto Lcd
            boolean r4 = r3.I
            if (r4 != 0) goto L1f
            goto Lcd
        L1f:
            int r4 = r3.H
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L3d
            boolean r4 = r3.b
            if (r4 == 0) goto L2d
            int r4 = r3.g
            goto Lc7
        L2d:
            int r4 = r5.getTop()
            int r6 = r3.h
            if (r4 <= r6) goto L39
            r4 = r6
        L36:
            r0 = 6
            goto Lc7
        L39:
            int r4 = r3.f
            goto Lc7
        L3d:
            boolean r4 = r3.l
            if (r4 == 0) goto L60
            android.view.VelocityTracker r4 = r3.L
            if (r4 != 0) goto L47
            r4 = 0
            goto L56
        L47:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.w
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.L
            int r1 = r3.u
            float r4 = r4.getYVelocity(r1)
        L56:
            boolean r4 = r3.A(r5, r4)
            if (r4 == 0) goto L60
            int r4 = r3.r
            r0 = 5
            goto Lc7
        L60:
            int r4 = r3.H
            if (r4 != 0) goto La3
            int r4 = r5.getTop()
            boolean r1 = r3.b
            if (r1 == 0) goto L80
            int r7 = r3.g
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.j
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto La7
            int r4 = r3.g
            goto Lc7
        L80:
            int r1 = r3.h
            if (r4 >= r1) goto L91
            int r6 = r3.j
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto La0
            int r4 = r3.f
            goto Lc7
        L91:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.j
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto La7
        La0:
            int r4 = r3.h
            goto L36
        La3:
            boolean r4 = r3.b
            if (r4 == 0) goto Lab
        La7:
            int r4 = r3.j
        La9:
            r0 = 4
            goto Lc7
        Lab:
            int r4 = r5.getTop()
            int r0 = r3.h
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.j
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Lc4
            int r4 = r3.h
            goto L36
        Lc4:
            int r4 = r3.j
            goto La9
        Lc7:
            r6 = 0
            r3.D(r5, r0, r4, r6)
            r3.I = r6
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.aji
    public final boolean l(View view) {
        WeakReference<View> weakReference = this.t;
        return (weakReference == null || view != weakReference.get() || this.o == 3) ? false : true;
    }

    @Override // defpackage.aji
    public final void n(CoordinatorLayout coordinatorLayout, V v, View view, int i, int[] iArr, int i2) {
        if (i2 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.t;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i;
        if (i > 0) {
            if (i3 < u()) {
                int u = top - u();
                iArr[1] = u;
                od.ag(v, -u);
                z(3);
            } else if (!this.n) {
                return;
            } else {
                iArr[1] = i;
                od.ag(v, -i);
                z(1);
            }
        } else if (i < 0 && !view.canScrollVertically(-1)) {
            int i4 = this.j;
            if (i3 <= i4 || this.l) {
                if (!this.n) {
                    return;
                }
                iArr[1] = i;
                od.ag(v, -i);
                z(1);
            } else {
                int i5 = top - i4;
                iArr[1] = i5;
                od.ag(v, -i5);
                z(4);
            }
        }
        E(v.getTop());
        this.H = i;
        this.I = true;
    }

    @Override // defpackage.aji
    public final void o(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int[] iArr) {
    }

    @Override // defpackage.aji
    public final void p(V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = savedState.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.l = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.m = savedState.g;
            }
        }
        int i2 = savedState.a;
        if (i2 == 1 || i2 == 2) {
            this.o = 4;
        } else {
            this.o = i2;
        }
    }

    @Override // defpackage.aji
    public final Parcelable q(V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // defpackage.aji
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2) {
        this.H = 0;
        this.I = false;
        return (i & 2) != 0;
    }

    public final void s(int i) {
        if (i == -1) {
            if (this.x) {
                return;
            }
            this.x = true;
        } else if (!this.x && this.c == i) {
            return;
        } else {
            this.x = false;
            this.c = Math.max(0, i);
        }
        G();
    }

    public final void t(int i) {
        if (i >= 0) {
            this.f = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final int u() {
        return this.b ? this.g : this.f;
    }

    public final void v(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (!z && this.o == 5) {
                y(4);
            }
            O();
        }
    }

    @Deprecated
    public final void w(czvx czvxVar) {
        this.K.clear();
        this.K.add(czvxVar);
    }

    public final void x(czvx czvxVar) {
        if (!this.K.contains(czvxVar)) {
            this.K.add(czvxVar);
        }
    }

    public final void y(int i) {
        if (i == this.o) {
            return;
        }
        WeakReference<V> weakReference = this.s;
        if (weakReference == null) {
            if (i != 4 && i != 3 && i != 6) {
                if (!this.l || i != 5) {
                    return;
                }
                i = 5;
            }
            this.o = i;
            return;
        }
        V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent == null || !parent.isLayoutRequested() || !od.ak(v)) {
            C(v, i);
        } else {
            v.post(new czvs(this, v, i));
        }
    }

    public final void z(int i) {
        if (this.o == i) {
            return;
        }
        this.o = i;
        WeakReference<V> weakReference = this.s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i == 3) {
            N(true);
        } else {
            if (i != 6 && i != 5) {
                if (i == 4) {
                    i = 4;
                }
            }
            N(false);
        }
        H(i);
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            this.K.get(i2).b(i);
        }
        O();
    }

    public final void C(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.j;
        } else if (i == 6) {
            i2 = this.h;
            if (this.b && i2 <= (i3 = this.g)) {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = u();
        } else if (!this.l || i != 5) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.r;
            i = 5;
        }
        D(view, i, i2, false);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = true;
        this.E = null;
        this.i = 0.5f;
        this.k = -1.0f;
        this.n = true;
        this.o = 4;
        this.K = new ArrayList<>();
        this.O = -1;
        this.P = new czvv(this);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, czwg.a);
        this.A = obtainStyledAttributes.hasValue(11);
        if (!obtainStyledAttributes.hasValue(1)) {
            M(context, attributeSet, false, null);
        } else {
            M(context, attributeSet, true, dada.a(context, obtainStyledAttributes, 1));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        ofFloat.setDuration(500L);
        this.F.addUpdateListener(new czvt(this));
        this.k = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || peekValue.data != -1) {
            s(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            s(peekValue.data);
        }
        v(obtainStyledAttributes.getBoolean(6, false));
        this.B = obtainStyledAttributes.getBoolean(10, false);
        boolean z = obtainStyledAttributes.getBoolean(4, true);
        if (this.b != z) {
            this.b = z;
            if (this.s != null) {
                J();
            }
            z((!this.b || this.o != 6) ? this.o : 3);
            O();
        }
        this.m = obtainStyledAttributes.getBoolean(9, false);
        this.n = obtainStyledAttributes.getBoolean(2, true);
        this.a = obtainStyledAttributes.getInt(8, 0);
        float f = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.i = f;
        if (this.s != null) {
            K();
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            t(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        } else {
            t(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new czvy();
        final int a;
        int b;
        boolean e;
        boolean f;
        boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            boolean z = false;
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1 ? true : z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.a = bottomSheetBehavior.o;
            this.b = bottomSheetBehavior.c;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.l;
            this.g = bottomSheetBehavior.m;
        }
    }
}
