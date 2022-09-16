package android.support.v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements kd {
    public static final /* synthetic */ int V = 0;
    private static final int[] W = {16843830};
    public static final boolean a;
    private static final Class[] aa;
    public static final Interpolator b;
    static final ym c;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public xs E;
    public int F;
    public int G;
    public xz H;
    public final int I;

    /* renamed from: J  reason: collision with root package name */
    public final yn f66J;
    public wg K;
    public we L;
    public final yl M;
    public boolean N;
    public boolean O;
    public boolean P;
    public yq Q;
    public final int[] R;
    final List S;
    public na T;
    public ne U;
    private final int[] aA;
    private Runnable aB;
    private boolean aC;
    private int aD;
    private int aE;
    private xt aF;
    private final xl aG;
    private final yf ab;
    private final Rect ac;
    private final ArrayList ad;
    private ya ae;
    private int af;
    private boolean ag;
    private int ah;
    private final AccessibilityManager ai;
    private int aj;
    private int ak;
    private int al;
    private VelocityTracker am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private final int ar;
    private float as;
    private float at;
    private boolean au;
    private List av;
    private xq aw;
    private final int[] ax;
    private ke ay;
    private final int[] az;
    public final yd d;
    SavedState e;
    public tw f;
    public vf g;
    public final aau h;
    public boolean i;
    public final Runnable j;
    public final Rect k;
    public final RectF l;
    public xo m;
    public xw n;
    public ye o;
    public final List p;
    public final ArrayList q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;

    static {
        a = Build.VERSION.SDK_INT >= 23;
        aa = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        b = new abb(1);
        c = new ym();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void L(View view, Rect rect) {
        xx xxVar = (xx) view.getLayoutParams();
        Rect rect2 = xxVar.d;
        rect.set((view.getLeft() - rect2.left) - xxVar.leftMargin, (view.getTop() - rect2.top) - xxVar.topMargin, view.getRight() + rect2.right + xxVar.rightMargin, view.getBottom() + rect2.bottom + xxVar.bottomMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.A
            r1 = 0
            if (r0 == 0) goto L36
            float r0 = defpackage.kv.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L36
            android.widget.EdgeEffect r0 = r3.A
            float r4 = -r4
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = defpackage.kv.e(r0, r4, r2)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.A
            float r5 = defpackage.kv.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L34
            android.widget.EdgeEffect r5 = r3.A
            r5.onRelease()
        L34:
            r1 = r4
            goto L58
        L36:
            android.widget.EdgeEffect r0 = r3.C
            if (r0 == 0) goto L58
            float r0 = defpackage.kv.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            android.widget.EdgeEffect r0 = r3.C
            float r4 = defpackage.kv.e(r0, r4, r5)
            android.widget.EdgeEffect r5 = r3.C
            float r5 = defpackage.kv.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L34
            android.widget.EdgeEffect r5 = r3.C
            r5.onRelease()
            goto L34
        L58:
            int r4 = r3.getWidth()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L68
            r3.invalidate()
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.a(int, float):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int aH(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.B
            r1 = 0
            if (r0 == 0) goto L33
            float r0 = defpackage.kv.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            android.widget.EdgeEffect r0 = r3.B
            float r4 = -r4
            float r4 = defpackage.kv.e(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.B
            float r5 = defpackage.kv.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L31
            android.widget.EdgeEffect r5 = r3.B
            r5.onRelease()
        L31:
            r1 = r4
            goto L58
        L33:
            android.widget.EdgeEffect r0 = r3.D
            if (r0 == 0) goto L58
            float r0 = defpackage.kv.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            android.widget.EdgeEffect r0 = r3.D
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = defpackage.kv.e(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.D
            float r5 = defpackage.kv.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L31
            android.widget.EdgeEffect r5 = r3.D
            r5.onRelease()
            goto L31
        L58:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L68
            r3.invalidate()
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aH(int, float):int");
    }

    private final ke aI() {
        if (this.ay == null) {
            this.ay = new ke(this);
        }
        return this.ay;
    }

    private final void aJ() {
        aR();
        ai(0);
    }

    private final void aK() {
        int a2;
        aat aatVar;
        boolean z = true;
        this.M.b(1);
        K(this.M);
        this.M.i = false;
        am();
        this.h.f();
        R();
        aO();
        yo yoVar = null;
        View focusedChild = (!this.au || !hasFocus() || this.m == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            yoVar = h(focusedChild);
        }
        if (yoVar == null) {
            aQ();
        } else {
            yl ylVar = this.M;
            ylVar.m = this.m.b ? yoVar.e : -1L;
            if (this.y) {
                a2 = -1;
            } else {
                a2 = yoVar.v() ? yoVar.d : yoVar.a();
            }
            ylVar.l = a2;
            yl ylVar2 = this.M;
            View view = yoVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            ylVar2.n = id;
        }
        yl ylVar3 = this.M;
        if (!ylVar3.j || !this.O) {
            z = false;
        }
        ylVar3.h = z;
        this.O = false;
        this.N = false;
        ylVar3.g = ylVar3.k;
        ylVar3.e = this.m.b();
        aM(this.ax);
        if (this.M.j) {
            int a3 = this.g.a();
            for (int i = 0; i < a3; i++) {
                yo l = l(this.g.d(i));
                if (!l.A() && (!l.t() || this.m.b)) {
                    xs.v(l);
                    l.d();
                    this.h.e(l, xs.w(l));
                    if (this.M.h && l.y() && !l.v() && !l.A() && !l.t()) {
                        this.h.c(e(l), l);
                    }
                }
            }
        }
        if (this.M.k) {
            int b2 = this.g.b();
            for (int i2 = 0; i2 < b2; i2++) {
                yo l2 = l(this.g.e(i2));
                if (!l2.A() && l2.d == -1) {
                    l2.d = l2.c;
                }
            }
            yl ylVar4 = this.M;
            boolean z2 = ylVar4.f;
            ylVar4.f = false;
            this.n.n(this.d, ylVar4);
            this.M.f = z2;
            for (int i3 = 0; i3 < this.g.a(); i3++) {
                yo l3 = l(this.g.d(i3));
                if (!l3.A() && ((aatVar = (aat) this.h.a.get(l3)) == null || (aatVar.b & 4) == 0)) {
                    xs.v(l3);
                    boolean q = l3.q(8192);
                    l3.d();
                    xr w = xs.w(l3);
                    if (q) {
                        W(l3, w);
                    } else {
                        aau aauVar = this.h;
                        aat aatVar2 = (aat) aauVar.a.get(l3);
                        if (aatVar2 == null) {
                            aatVar2 = aat.a();
                            aauVar.a.put(l3, aatVar2);
                        }
                        aatVar2.b |= 2;
                        aatVar2.c = w;
                    }
                }
            }
            y();
        } else {
            y();
        }
        S();
        an(false);
        this.M.d = 2;
    }

    private final void aL() {
        am();
        R();
        this.M.b(6);
        this.f.e();
        this.M.e = this.m.b();
        this.M.c = 0;
        SavedState savedState = this.e;
        if (savedState != null) {
            int i = this.m.c;
            Parcelable parcelable = savedState.a;
            if (parcelable != null) {
                this.n.Y(parcelable);
            }
            this.e = null;
        }
        yl ylVar = this.M;
        ylVar.g = false;
        this.n.n(this.d, ylVar);
        yl ylVar2 = this.M;
        ylVar2.f = false;
        ylVar2.j = ylVar2.j && this.E != null;
        ylVar2.d = 4;
        S();
        an(false);
    }

    private final void aM(int[] iArr) {
        int a2 = this.g.a();
        if (a2 != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            for (int i3 = 0; i3 < a2; i3++) {
                yo l = l(this.g.d(i3));
                if (!l.A()) {
                    int c2 = l.c();
                    if (c2 < i) {
                        i = c2;
                    }
                    if (c2 > i2) {
                        i2 = c2;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    private final void aN(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.al) {
            int i = actionIndex == 0 ? 1 : 0;
            this.al = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.ap = x;
            this.an = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.aq = y;
            this.ao = y;
        }
    }

    private final void aO() {
        boolean z;
        if (this.y) {
            this.f.j();
            if (this.z) {
                this.n.qi();
            }
        }
        if (aU()) {
            this.f.g();
        } else {
            this.f.e();
        }
        boolean z2 = true;
        boolean z3 = this.N || this.O;
        yl ylVar = this.M;
        boolean z4 = this.t && this.E != null && ((z = this.y) || z3 || this.n.y) && (!z || this.m.b);
        ylVar.j = z4;
        if (!z4 || !z3 || this.y || !aU()) {
            z2 = false;
        }
        ylVar.k = z2;
    }

    private final void aP(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof xx) {
            xx xxVar = (xx) layoutParams;
            if (!xxVar.e) {
                Rect rect = xxVar.d;
                this.k.left -= rect.left;
                this.k.right += rect.right;
                this.k.top -= rect.top;
                this.k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.k);
            offsetRectIntoDescendantCoords(view, this.k);
        } else {
            view2 = null;
        }
        this.n.bg(this, view, this.k, !this.t, view2 == null);
    }

    private final void aQ() {
        yl ylVar = this.M;
        ylVar.m = -1L;
        ylVar.l = -1;
        ylVar.n = -1;
    }

    private final void aR() {
        VelocityTracker velocityTracker = this.am;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        ao(0);
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.D.isFinished();
        }
        if (z) {
            lj.G(this);
        }
    }

    private final void aS() {
        yk ykVar;
        this.f66J.c();
        xw xwVar = this.n;
        if (xwVar == null || (ykVar = xwVar.x) == null) {
            return;
        }
        ykVar.f();
    }

    private final boolean aT(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.ad.size();
        for (int i = 0; i < size; i++) {
            ya yaVar = (ya) this.ad.get(i);
            if (yaVar.m(this, motionEvent) && action != 3) {
                this.ae = yaVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aU() {
        return this.E != null && this.n.qh();
    }

    private final void aV(Context context, String str, AttributeSet attributeSet, int i) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            if (trim.charAt(0) == '.') {
                trim = context.getPackageName() + trim;
            } else if (!trim.contains(".")) {
                trim = RecyclerView.class.getPackage().getName() + '.' + trim;
            }
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(xw.class);
                try {
                    constructor = asSubclass.getConstructor(aa);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                    }
                }
                constructor.setAccessible(true);
                ag((xw) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
            }
        }
    }

    public static yo l(View view) {
        if (view == null) {
            return null;
        }
        return ((xx) view.getLayoutParams()).c;
    }

    public static RecyclerView m(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m = m(viewGroup.getChildAt(i));
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    public static void x(yo yoVar) {
        WeakReference weakReference = yoVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == yoVar.a) {
                    return;
                }
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            yoVar.b = null;
        }
    }

    public final void A() {
        if (!this.t || this.y) {
            D();
        } else if (!this.f.l()) {
        } else {
            if (!this.f.k(4) || this.f.k(11)) {
                if (!this.f.l()) {
                    return;
                }
                D();
                return;
            }
            am();
            R();
            this.f.g();
            if (!this.u) {
                int a2 = this.g.a();
                int i = 0;
                while (true) {
                    if (i < a2) {
                        yo l = l(this.g.d(i));
                        if (l != null && !l.A() && l.y()) {
                            D();
                            break;
                        }
                        i++;
                    } else {
                        this.f.d();
                        break;
                    }
                }
            }
            an(true);
            S();
        }
    }

    public final void B(int i, int i2) {
        setMeasuredDimension(xw.ap(i, getPaddingLeft() + getPaddingRight(), lj.g(this)), xw.ap(i2, getPaddingTop() + getPaddingBottom(), lj.f(this)));
    }

    public final void C(View view) {
        l(view);
        List list = this.x;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                ((xy) this.x.get(size)).a(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e7, code lost:
        if (r17.g.k(getFocusedChild()) != false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void D() {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.D():void");
    }

    public final void E(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aI().i(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void F(int i, int i2) {
        this.ak++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        ne neVar = this.U;
        if (neVar != null) {
            ((oat) neVar).b();
        }
        List list = this.av;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((ne) this.av.get(size)).j(this, i, i2);
            }
        }
        this.ak--;
    }

    public final void G() {
        if (this.D != null) {
            return;
        }
        EdgeEffect d = this.T.d(this, 3);
        this.D = d;
        if (this.i) {
            d.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            d.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void H() {
        if (this.A != null) {
            return;
        }
        EdgeEffect d = this.T.d(this, 0);
        this.A = d;
        if (this.i) {
            d.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            d.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void I() {
        if (this.C != null) {
            return;
        }
        EdgeEffect d = this.T.d(this, 2);
        this.C = d;
        if (this.i) {
            d.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            d.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void J() {
        if (this.B != null) {
            return;
        }
        EdgeEffect d = this.T.d(this, 1);
        this.B = d;
        if (this.i) {
            d.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            d.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void K(yl ylVar) {
        if (this.F == 2) {
            OverScroller overScroller = this.f66J.c;
            ylVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            ylVar.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        ylVar.o = 0;
        ylVar.p = 0;
    }

    public final void M() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void N() {
        if (this.q.size() == 0) {
            return;
        }
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.T("Cannot invalidate item decorations during a scroll or layout");
        }
        P();
        requestLayout();
    }

    public final void O(int i) {
        if (this.n == null) {
            return;
        }
        ai(2);
        this.n.Z(i);
        awakenScrollBars();
    }

    final void P() {
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            ((xx) this.g.e(i).getLayoutParams()).e = true;
        }
        yd ydVar = this.d;
        int size = ydVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            xx xxVar = (xx) ((yo) ydVar.c.get(i2)).a.getLayoutParams();
            if (xxVar != null) {
                xxVar.e = true;
            }
        }
    }

    public final void Q(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b2 = this.g.b();
        for (int i4 = 0; i4 < b2; i4++) {
            yo l = l(this.g.e(i4));
            if (l != null && !l.A()) {
                int i5 = l.c;
                if (i5 >= i3) {
                    l.k(-i2, z);
                    this.M.f = true;
                } else if (i5 >= i) {
                    l.f(8);
                    l.k(-i2, z);
                    l.c = i - 1;
                    this.M.f = true;
                }
            }
        }
        yd ydVar = this.d;
        int size = ydVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                yo yoVar = (yo) ydVar.c.get(size);
                if (yoVar != null) {
                    int i6 = yoVar.c;
                    if (i6 >= i3) {
                        yoVar.k(-i2, z);
                    } else if (i6 >= i) {
                        yoVar.f(8);
                        ydVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void R() {
        this.aj++;
    }

    final void S() {
        T(true);
    }

    public final void T(boolean z) {
        int i;
        int i2 = this.aj - 1;
        this.aj = i2;
        if (i2 <= 0) {
            this.aj = 0;
            if (!z) {
                return;
            }
            int i3 = this.ah;
            this.ah = 0;
            if (i3 != 0 && au()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                obtain.setContentChangeTypes(i3);
                sendAccessibilityEventUnchecked(obtain);
            }
            for (int size = this.S.size() - 1; size >= 0; size--) {
                yo yoVar = (yo) this.S.get(size);
                if (yoVar.a.getParent() == this && !yoVar.A() && (i = yoVar.p) != -1) {
                    lj.V(yoVar.a, i);
                    yoVar.p = -1;
                }
            }
            this.S.clear();
        }
    }

    public final void U() {
        if (this.P || !this.r) {
            return;
        }
        lj.H(this, this.aB);
        this.P = true;
    }

    public final void V(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            yo l = l(this.g.e(i));
            if (l != null && !l.A()) {
                l.f(6);
            }
        }
        P();
        yd ydVar = this.d;
        int size = ydVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            yo yoVar = (yo) ydVar.c.get(i2);
            if (yoVar != null) {
                yoVar.f(6);
                yoVar.e(null);
            }
        }
        xo xoVar = ydVar.h.m;
        if (xoVar == null || !xoVar.b) {
            ydVar.g();
        }
    }

    public final void W(yo yoVar, xr xrVar) {
        yoVar.m(0, 8192);
        if (this.M.h && yoVar.y() && !yoVar.v() && !yoVar.A()) {
            this.h.c(e(yoVar), yoVar);
        }
        this.h.e(yoVar, xrVar);
    }

    public final void X() {
        xs xsVar = this.E;
        if (xsVar != null) {
            xsVar.c();
        }
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.aQ(this.d);
            this.n.aR(this.d);
        }
        this.d.e();
    }

    public final void Y(xy xyVar) {
        List list = this.x;
        if (list == null) {
            return;
        }
        list.remove(xyVar);
    }

    public final void Z(ya yaVar) {
        this.ad.remove(yaVar);
        if (this.ae == yaVar) {
            this.ae = null;
        }
    }

    public final void aA(int i, int i2, Interpolator interpolator, boolean z) {
        xw xwVar = this.n;
        if (xwVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.v) {
        } else {
            int i3 = 0;
            if (true != xwVar.ad()) {
                i = 0;
            }
            if (true != this.n.ae()) {
                i2 = 0;
            }
            if (i == 0) {
                if (i2 == 0) {
                    return;
                }
                i = 0;
            }
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                aB(i3, 1);
            }
            this.f66J.b(i, i2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, interpolator);
        }
    }

    public final void aB(int i, int i2) {
        aI().m(i, i2);
    }

    public final void aC(nd ndVar) {
        aD(ndVar, -1);
    }

    public final void aD(nd ndVar, int i) {
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.T("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.q.add(ndVar);
        } else {
            this.q.add(0, ndVar);
        }
        P();
        requestLayout();
    }

    public final void aE(ne neVar) {
        if (this.av == null) {
            this.av = new ArrayList();
        }
        this.av.add(neVar);
    }

    public final void aF(nd ndVar) {
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.T("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(ndVar);
        if (this.q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        P();
        requestLayout();
    }

    public final void aG(ne neVar) {
        List list = this.av;
        if (list != null) {
            list.remove(neVar);
        }
    }

    public final void aa(int i, int i2, int[] iArr) {
        yo yoVar;
        am();
        R();
        K(this.M);
        int d = i != 0 ? this.n.d(i, this.d, this.M) : 0;
        int e = i2 != 0 ? this.n.e(i2, this.d, this.M) : 0;
        int a2 = this.g.a();
        for (int i3 = 0; i3 < a2; i3++) {
            View d2 = this.g.d(i3);
            yo k = k(d2);
            if (k != null && (yoVar = k.i) != null) {
                View view = yoVar.a;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        S();
        an(false);
        if (iArr != null) {
            iArr[0] = d;
            iArr[1] = e;
        }
    }

    public final void ab(int i) {
        if (this.v) {
            return;
        }
        ap();
        xw xwVar = this.n;
        if (xwVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        xwVar.Z(i);
        awakenScrollBars();
    }

    public final void ac(yq yqVar) {
        this.Q = yqVar;
        lj.M(this, yqVar);
    }

    public void ad(xo xoVar) {
        suppressLayout(false);
        xo xoVar2 = this.m;
        if (xoVar2 != null) {
            xoVar2.v(this.ab);
            this.m.t();
        }
        X();
        this.f.j();
        xo xoVar3 = this.m;
        this.m = xoVar;
        if (xoVar != null) {
            xoVar.u(this.ab);
            xoVar.r();
        }
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.bs();
        }
        yd ydVar = this.d;
        xo xoVar4 = this.m;
        ydVar.e();
        yc b2 = ydVar.b();
        if (xoVar3 != null) {
            b2.e();
        }
        if (b2.b == 0) {
            b2.d();
        }
        if (xoVar4 != null) {
            b2.c();
        }
        this.M.f = true;
        V(false);
        requestLayout();
    }

    public final void ae(xq xqVar) {
        if (xqVar == this.aw) {
            return;
        }
        this.aw = xqVar;
        setChildrenDrawingOrderEnabled(xqVar != null);
    }

    public final void af(xs xsVar) {
        xs xsVar2 = this.E;
        if (xsVar2 != null) {
            xsVar2.c();
            this.E.j = null;
        }
        this.E = xsVar;
        if (xsVar != null) {
            xsVar.j = this.aF;
        }
    }

    public void ag(xw xwVar) {
        if (xwVar == this.n) {
            return;
        }
        ap();
        if (this.n != null) {
            xs xsVar = this.E;
            if (xsVar != null) {
                xsVar.c();
            }
            this.n.aQ(this.d);
            this.n.aR(this.d);
            this.d.e();
            if (this.r) {
                this.n.aJ(this, this.d);
            }
            this.n.bc(null);
            this.n = null;
        } else {
            this.d.e();
        }
        vf vfVar = this.g;
        vfVar.a.d();
        int size = vfVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            vfVar.c.d((View) vfVar.b.get(size));
            vfVar.b.remove(size);
        }
        xm xmVar = vfVar.c;
        int a2 = xmVar.a();
        for (int i = 0; i < a2; i++) {
            View c2 = xmVar.c(i);
            xmVar.a.C(c2);
            c2.clearAnimation();
        }
        xmVar.a.removeAllViews();
        this.n = xwVar;
        if (xwVar != null) {
            if (xwVar.u != null) {
                throw new IllegalArgumentException("LayoutManager " + xwVar + " is already attached to a RecyclerView:" + xwVar.u.p());
            }
            this.n.bc(this);
            if (this.r) {
                this.n.aI(this);
            }
        }
        this.d.m();
        requestLayout();
    }

    public final void ah(yc ycVar) {
        yd ydVar = this.d;
        yc ycVar2 = ydVar.g;
        if (ycVar2 != null) {
            ycVar2.e();
        }
        ydVar.g = ycVar;
        yc ycVar3 = ydVar.g;
        if (ycVar3 == null || ydVar.h.m == null) {
            return;
        }
        ycVar3.c();
    }

    public final void ai(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        if (i != 2) {
            aS();
        }
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.aO(i);
        }
        List list = this.av;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((ne) this.av.get(size)).i(this, i);
        }
    }

    public final void aj(int i, int i2) {
        ak(i, i2, null);
    }

    public final void ak(int i, int i2, Interpolator interpolator) {
        aA(i, i2, interpolator, false);
    }

    public final void al(int i) {
        if (this.v) {
            return;
        }
        xw xwVar = this.n;
        if (xwVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            xwVar.ao(this, i);
        }
    }

    public final void am() {
        int i = this.af + 1;
        this.af = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void an(boolean z) {
        int i = this.af;
        if (i <= 0) {
            this.af = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.n != null && this.m != null) {
                D();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.af--;
    }

    public final void ao(int i) {
        aI().c(i);
    }

    public final void ap() {
        ai(0);
        aS();
    }

    public final boolean ar(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aI().g(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean as(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.as(int, int):boolean");
    }

    public final boolean at() {
        return !this.t || this.y || this.f.l();
    }

    public final boolean au() {
        AccessibilityManager accessibilityManager = this.ai;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean av() {
        return this.aj > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
        if (r2 == 0.0f) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean aw(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aw(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void ax() {
        int d = d();
        if (d > 0) {
            int d2 = d();
            if (d2 <= 0) {
                throw new IndexOutOfBoundsException("0 is an invalid index for size " + d2);
            }
            aF((nd) this.q.get(0));
            return;
        }
        throw new IndexOutOfBoundsException("0 is an invalid index for size " + d);
    }

    public final void ay(yo yoVar, int i) {
        if (av()) {
            yoVar.p = i;
            this.S.add(yoVar);
            return;
        }
        lj.V(yoVar.a, i);
    }

    public final void az() {
        yd ydVar = this.d;
        ydVar.e = 0;
        ydVar.m();
    }

    public final int b(yo yoVar) {
        if (yoVar.q(524) || !yoVar.s()) {
            return -1;
        }
        tw twVar = this.f;
        int i = yoVar.c;
        int size = twVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            tv tvVar = (tv) twVar.a.get(i2);
            int i3 = tvVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = tvVar.b;
                    if (i4 <= i) {
                        int i5 = tvVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = tvVar.b;
                    if (i6 == i) {
                        i = tvVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (tvVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (tvVar.b <= i) {
                i += tvVar.d;
            }
        }
        return i;
    }

    public final int c(View view) {
        yo l = l(view);
        if (l != null) {
            return l.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof xx) && this.n.s((xx) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        xw xwVar = this.n;
        if (xwVar != null && xwVar.ad()) {
            return this.n.A(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        xw xwVar = this.n;
        if (xwVar != null && xwVar.ad()) {
            return this.n.B(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        xw xwVar = this.n;
        if (xwVar != null && xwVar.ad()) {
            return this.n.C(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        xw xwVar = this.n;
        if (xwVar != null && xwVar.ae()) {
            return this.n.D(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        xw xwVar = this.n;
        if (xwVar != null && xwVar.ae()) {
            return this.n.E(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        xw xwVar = this.n;
        if (xwVar != null && xwVar.ae()) {
            return this.n.F(this.M);
        }
        return 0;
    }

    public final int d() {
        return this.q.size();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aI().d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aI().e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aI().f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aI().h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.q.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((nd) this.q.get(i)).d(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.E != null && this.q.size() > 0 && this.E.j())) {
            lj.G(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    final long e(yo yoVar) {
        return this.m.b ? yoVar.e : yoVar.c;
    }

    public final Rect f(View view) {
        xx xxVar = (xx) view.getLayoutParams();
        if (!xxVar.e) {
            return xxVar.d;
        }
        if (!this.M.g || (!xxVar.qb() && !xxVar.c.t())) {
            Rect rect = xxVar.d;
            rect.set(0, 0, 0, 0);
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                this.k.set(0, 0, 0, 0);
                ((nd) this.q.get(i)).b(this.k, view, this, this.M);
                rect.left += this.k.left;
                rect.top += this.k.top;
                rect.right += this.k.right;
                rect.bottom += this.k.bottom;
            }
            xxVar.e = false;
            return rect;
        }
        return xxVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0195, code lost:
        if (r8 > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b6, code lost:
        if (r10 > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b9, code lost:
        if (r8 < 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bc, code lost:
        if (r10 < 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c5, code lost:
        if ((r10 * r3) > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ce, code lost:
        if ((r10 * r3) < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d2, code lost:
        if (r1 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r3.findNextFocus(r13, r14, r15 == 2 ? 130 : 33) != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r3.findNextFocus(r13, r14, true != ((r13.n.au() == 1) ^ (r15 == 2)) ? 17 : 66) == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
        if (o(r14) != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        am();
        r13.n.qe(r14, r15, r13.d, r13.M);
        an(false);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final yc g() {
        return this.d.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        xq xqVar = this.aw;
        return xqVar == null ? super.getChildDrawingOrder(i, i2) : xqVar.a(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final yo h(View view) {
        View o = o(view);
        if (o == null) {
            return null;
        }
        return k(o);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aI().j();
    }

    public final yo i(int i) {
        yo yoVar = null;
        if (this.y) {
            return null;
        }
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            yo l = l(this.g.e(i2));
            if (l != null && !l.v() && b(l) == i) {
                if (!this.g.k(l.a)) {
                    return l;
                }
                yoVar = l;
            }
        }
        return yoVar;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aI().a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yo j(int r6, boolean r7) {
        /*
            r5 = this;
            vf r0 = r5.g
            int r0 = r0.b()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            vf r3 = r5.g
            android.view.View r3 = r3.e(r2)
            yo r3 = l(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.c()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            vf r1 = r5.g
            android.view.View r4 = r3.a
            boolean r1 = r1.k(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.j(int, boolean):yo");
    }

    public final yo k(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return l(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final View n(float f, float f2) {
        int a2 = this.g.a();
        while (true) {
            a2--;
            if (a2 >= 0) {
                View d = this.g.d(a2);
                float translationX = d.getTranslationX();
                float translationY = d.getTranslationY();
                if (f >= d.getLeft() + translationX && f <= d.getRight() + translationX && f2 >= d.getTop() + translationY && f2 <= d.getBottom() + translationY) {
                    return d;
                }
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o(android.view.View):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aj = 0;
        boolean z = true;
        this.r = true;
        if (!this.t || isLayoutRequested()) {
            z = false;
        }
        this.t = z;
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.aI(this);
        }
        this.P = false;
        wg wgVar = (wg) wg.a.get();
        this.K = wgVar;
        if (wgVar == null) {
            this.K = new wg();
            Display u = lj.u(this);
            float f = 60.0f;
            if (!isInEditMode() && u != null) {
                float refreshRate = u.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            this.K.e = 1.0E9f / f;
            wg.a.set(this.K);
        }
        this.K.c.add(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xs xsVar = this.E;
        if (xsVar != null) {
            xsVar.c();
        }
        ap();
        this.r = false;
        xw xwVar = this.n;
        if (xwVar != null) {
            xwVar.aJ(this, this.d);
        }
        this.S.clear();
        removeCallbacks(this.aB);
        aat.b();
        wg wgVar = this.K;
        if (wgVar != null) {
            wgVar.c.remove(this);
            this.K = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((nd) this.q.get(i)).c(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
        if (r10.F != 2) goto L75;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        D();
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        xw xwVar = this.n;
        if (xwVar == null) {
            B(i, i2);
            return;
        }
        boolean z = false;
        if (xwVar.af()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.bu(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aC = z;
            if (z || this.m == null) {
                return;
            }
            if (this.M.d == 1) {
                aK();
            }
            this.n.aZ(i, i2);
            this.M.i = true;
            aL();
            this.n.bb(i, i2);
            if (this.n.ai()) {
                this.n.aZ(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.M.i = true;
                aL();
                this.n.bb(i, i2);
            }
            this.aD = getMeasuredWidth();
            this.aE = getMeasuredHeight();
        } else if (this.s) {
            this.n.bu(i, i2);
        } else {
            if (this.w) {
                am();
                R();
                aO();
                S();
                yl ylVar = this.M;
                if (ylVar.k) {
                    ylVar.g = true;
                } else {
                    this.f.e();
                    this.M.g = false;
                }
                this.w = false;
                an(false);
            } else if (this.M.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            xo xoVar = this.m;
            if (xoVar != null) {
                this.M.e = xoVar.b();
            } else {
                this.M.e = 0;
            }
            am();
            this.n.bu(i, i2);
            an(false);
            this.M.g = false;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (av()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.e = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.e;
        if (savedState2 != null) {
            savedState.a = savedState2.a;
        } else {
            xw xwVar = this.n;
            savedState.a = xwVar != null ? xwVar.P() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0188, code lost:
        if (r0 != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final String p() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        yo l = l(view);
        if (l != null) {
            if (l.x()) {
                l.j();
            } else if (!l.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + l + p());
            }
        }
        view.clearAnimation();
        C(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.bf() && !av() && view2 != null) {
            aP(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.bg(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.ad.size();
        for (int i = 0; i < size; i++) {
            ((ya) this.ad.get(i)).g(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.af != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        xw xwVar = this.n;
        if (xwVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.v) {
        } else {
            boolean ad = xwVar.ad();
            boolean ae = this.n.ae();
            if (!ad) {
                if (!ae) {
                    return;
                }
                ae = true;
            }
            if (true != ad) {
                i = 0;
            }
            if (true != ae) {
                i2 = 0;
            }
            aw(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (av()) {
            int i = 0;
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.ah |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            M();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.t) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aI().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aI().l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aI().b();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            w("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.ag = true;
                ap();
                return;
            }
            this.v = false;
            if (this.u && this.n != null && this.m != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t(yo yoVar) {
        View view = yoVar.a;
        ViewParent parent = view.getParent();
        this.d.l(k(view));
        if (yoVar.x()) {
            this.g.g(view, -1, view.getLayoutParams(), true);
        } else if (parent != this) {
            this.g.f(view, -1, true);
        } else {
            vf vfVar = this.g;
            int b2 = vfVar.c.b(view);
            if (b2 < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            vfVar.a.e(b2);
            vfVar.i(view);
        }
    }

    public final void u(xy xyVar) {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(xyVar);
    }

    public final void v(ya yaVar) {
        this.ad.add(yaVar);
    }

    public final void w(String str) {
        if (av()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + p());
            }
            throw new IllegalStateException(str);
        } else if (this.ak <= 0) {
        } else {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + p()));
        }
    }

    final void y() {
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            yo l = l(this.g.e(i));
            if (!l.A()) {
                l.g();
            }
        }
        yd ydVar = this.d;
        int size = ydVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((yo) ydVar.c.get(i2)).g();
        }
        int size2 = ydVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((yo) ydVar.a.get(i3)).g();
        }
        ArrayList arrayList = ydVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((yo) ydVar.b.get(i4)).g();
            }
        }
    }

    public final void z(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            z = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            z |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            z |= this.D.isFinished();
        }
        if (z) {
            lj.G(this);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        xw xwVar = this.n;
        if (xwVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
        }
        return xwVar.f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        xw xwVar = this.n;
        if (xwVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
        }
        return xwVar.h(getContext(), attributeSet);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new yg();
        Parcelable a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readParcelable(classLoader == null ? xw.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ab = new yf(this);
        this.d = new yd(this);
        this.h = new aau();
        this.j = new xk(this, 1);
        this.k = new Rect();
        this.ac = new Rect();
        this.l = new RectF();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.ad = new ArrayList();
        this.af = 0;
        this.y = false;
        this.z = false;
        this.aj = 0;
        this.ak = 0;
        this.T = c;
        this.E = new vq();
        this.F = 0;
        this.al = -1;
        this.as = Float.MIN_VALUE;
        this.at = Float.MIN_VALUE;
        this.au = true;
        this.f66J = new yn(this);
        this.L = new we();
        this.M = new yl();
        this.N = false;
        this.O = false;
        this.aF = new xt(this);
        this.P = false;
        this.ax = new int[2];
        this.az = new int[2];
        this.aA = new int[2];
        this.R = new int[2];
        this.S = new ArrayList();
        this.aB = new xk(this);
        this.aD = 0;
        this.aE = 0;
        this.aG = new xl(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.G = viewConfiguration.getScaledTouchSlop();
        this.as = lk.a(viewConfiguration, context);
        this.at = lk.b(viewConfiguration, context);
        this.I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ar = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.E.j = this.aF;
        this.f = new tw(new xn(this));
        this.g = new vf(new xm(this));
        if (lj.d(this) == 0) {
            lj.W(this, 8);
        }
        if (lj.c(this) == 0) {
            lj.V(this, 1);
        }
        this.ai = (AccessibilityManager) getContext().getSystemService("accessibility");
        ac(new yq(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qd.a, i, 0);
        lj.L(this, context, qd.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.i = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + p());
            }
            Resources resources = getContext().getResources();
            new wa(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        }
        obtainStyledAttributes.recycle();
        aV(context, string, attributeSet, i);
        int[] iArr = W;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        lj.L(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        xw xwVar = this.n;
        if (xwVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
        }
        return xwVar.qd(layoutParams);
    }
}
