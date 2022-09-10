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
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements nl {
    public static final Interpolator Q;
    public static final /* synthetic */ int R = 0;
    private static final int[] S = {16843830};
    private static final Class<?>[] T;
    public static final boolean a;
    public EdgeEffect A;
    public EdgeEffect B;
    public abn C;
    public int D;
    public abv E;
    public final int F;
    public final ack G;
    public zu H;
    public zs I;
    public final aci J;
    public boolean K;
    public boolean L;
    public boolean M;
    public acn N;
    public final int[] O;
    final List<acl> P;
    private final acc U;
    private final Rect V;
    private final ArrayList<abw> W;
    private boolean aA;
    private int aB;
    private int aC;
    private abo aD;
    private final abd aE;
    private abw aa;
    private int ab;
    private boolean ac;
    private int ad;
    private final AccessibilityManager ae;
    private int af;
    private int ag;
    private int ah;
    private VelocityTracker ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private final int ao;
    private float ap;
    private float aq;
    private boolean ar;
    private abx as;
    private List<abx> at;
    private abj au;
    private final int[] av;
    private nm aw;
    private final int[] ax;
    private final int[] ay;
    private Runnable az;
    public final aca b;
    SavedState c;
    public xa d;
    public yo e;
    public final afk f;
    public boolean g;
    public final Runnable h;
    public final Rect i;
    public final RectF j;
    public abg k;
    public abs l;
    public acb m;
    public final List<acb> n;
    public final ArrayList<abp> o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public List<abu> v;
    public boolean w;
    boolean x;
    public EdgeEffect y;
    public EdgeEffect z;

    static {
        a = Build.VERSION.SDK_INT >= 23;
        T = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        Q = new abc();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static acl Y(View view) {
        if (view == null) {
            return null;
        }
        return ((abt) view.getLayoutParams()).c;
    }

    private final void a() {
        ach achVar;
        this.G.c();
        abs absVar = this.l;
        if (absVar == null || (achVar = absVar.t) == null) {
            return;
        }
        achVar.m();
    }

    private final boolean aA() {
        return this.C != null && this.l.RZ();
    }

    private final void aB() {
        boolean z;
        if (this.w) {
            this.d.a();
            if (this.x) {
                this.l.Sg();
            }
        }
        if (aA()) {
            this.d.b();
        } else {
            this.d.i();
        }
        boolean z2 = true;
        boolean z3 = this.K || this.L;
        aci aciVar = this.J;
        boolean z4 = this.r && this.C != null && ((z = this.w) || z3 || this.l.u) && (!z || this.k.c);
        aciVar.j = z4;
        if (!z4 || !z3 || this.w || !aA()) {
            z2 = false;
        }
        aciVar.k = z2;
    }

    private final void aC() {
        aci aciVar = this.J;
        aciVar.m = -1L;
        aciVar.l = -1;
        aciVar.n = -1;
    }

    private final void aD() {
        int f;
        afj afjVar;
        boolean z = true;
        this.J.a(1);
        N(this.J);
        this.J.i = false;
        r();
        this.f.a();
        G();
        aB();
        acl aclVar = null;
        View focusedChild = (!this.ar || !hasFocus() || this.k == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            aclVar = X(focusedChild);
        }
        if (aclVar == null) {
            aC();
        } else {
            aci aciVar = this.J;
            aciVar.m = this.k.c ? aclVar.e : -1L;
            if (this.w) {
                f = -1;
            } else {
                f = aclVar.p() ? aclVar.d : aclVar.f();
            }
            aciVar.l = f;
            aci aciVar2 = this.J;
            View view = aclVar.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            aciVar2.n = id;
        }
        aci aciVar3 = this.J;
        if (!aciVar3.j || !this.L) {
            z = false;
        }
        aciVar3.h = z;
        this.L = false;
        this.K = false;
        aciVar3.g = aciVar3.k;
        aciVar3.e = this.k.c();
        aF(this.av);
        if (this.J.j) {
            int f2 = this.e.f();
            for (int i = 0; i < f2; i++) {
                acl Y = Y(this.e.d(i));
                if (!Y.c() && (!Y.m() || this.k.c)) {
                    abn abnVar = this.C;
                    abn.w(Y);
                    Y.x();
                    this.f.b(Y, abnVar.v(Y));
                    if (this.J.h && Y.B() && !Y.p() && !Y.c() && !Y.m()) {
                        this.f.e(P(Y), Y);
                    }
                }
            }
        }
        if (this.J.k) {
            int g = this.e.g();
            for (int i2 = 0; i2 < g; i2++) {
                acl Y2 = Y(this.e.h(i2));
                if (!Y2.c() && Y2.d == -1) {
                    Y2.d = Y2.c;
                }
            }
            aci aciVar4 = this.J;
            boolean z2 = aciVar4.f;
            aciVar4.f = false;
            this.l.d(this.b, aciVar4);
            this.J.f = z2;
            for (int i3 = 0; i3 < this.e.f(); i3++) {
                acl Y3 = Y(this.e.d(i3));
                if (!Y3.c() && ((afjVar = this.f.a.get(Y3)) == null || (afjVar.a & 4) == 0)) {
                    abn.w(Y3);
                    boolean q = Y3.q(8192);
                    abn abnVar2 = this.C;
                    Y3.x();
                    abm v = abnVar2.v(Y3);
                    if (q) {
                        O(Y3, v);
                    } else {
                        afk afkVar = this.f;
                        afj afjVar2 = afkVar.a.get(Y3);
                        if (afjVar2 == null) {
                            afjVar2 = afj.a();
                            afkVar.a.put(Y3, afjVar2);
                        }
                        afjVar2.a |= 2;
                        afjVar2.b = v;
                    }
                }
            }
            R();
        } else {
            R();
        }
        H();
        s(false);
        this.J.d = 2;
    }

    private final void aE() {
        r();
        G();
        this.J.a(6);
        this.d.i();
        this.J.e = this.k.c();
        this.J.c = 0;
        SavedState savedState = this.c;
        if (savedState != null) {
            int i = this.k.d;
            Parcelable parcelable = savedState.a;
            if (parcelable != null) {
                this.l.C(parcelable);
            }
            this.c = null;
        }
        aci aciVar = this.J;
        aciVar.g = false;
        this.l.d(this.b, aciVar);
        aci aciVar2 = this.J;
        aciVar2.f = false;
        aciVar2.j = aciVar2.j && this.C != null;
        aciVar2.d = 4;
        H();
        s(false);
    }

    private final void aF(int[] iArr) {
        int f = this.e.f();
        if (f != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < f; i3++) {
                acl Y = Y(this.e.d(i3));
                if (!Y.c()) {
                    int d = Y.d();
                    if (d < i) {
                        i = d;
                    }
                    if (d > i2) {
                        i2 = d;
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

    private final nm aG() {
        if (this.aw == null) {
            this.aw = new nm(this);
        }
        return this.aw;
    }

    private final void aH(Context context, String str, AttributeSet attributeSet, int i) {
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
                Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(abs.class);
                try {
                    constructor = asSubclass.getConstructor(T);
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
                setLayoutManager((abs) constructor.newInstance(objArr));
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

    public static void ad(View view, Rect rect) {
        abt abtVar = (abt) view.getLayoutParams();
        Rect rect2 = abtVar.d;
        rect.set((view.getLeft() - rect2.left) - abtVar.leftMargin, (view.getTop() - rect2.top) - abtVar.topMargin, view.getRight() + rect2.right + abtVar.rightMargin, view.getBottom() + rect2.bottom + abtVar.bottomMargin);
    }

    public static RecyclerView ah(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView ah = ah(viewGroup.getChildAt(i));
            if (ah != null) {
                return ah;
            }
        }
        return null;
    }

    public static void ai(acl aclVar) {
        WeakReference<RecyclerView> weakReference = aclVar.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == aclVar.a) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            aclVar.b = null;
        }
    }

    private final void av(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof abt) {
            abt abtVar = (abt) layoutParams;
            if (!abtVar.e) {
                Rect rect = abtVar.d;
                this.i.left -= rect.left;
                this.i.right += rect.right;
                this.i.top -= rect.top;
                this.i.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.i);
            offsetRectIntoDescendantCoords(view, this.i);
        } else {
            view2 = null;
        }
        this.l.aW(this, view, this.i, !this.r, view2 == null);
    }

    private final boolean aw(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            abw abwVar = this.W.get(i);
            if (abwVar.f(this, motionEvent) && action != 3) {
                this.aa = abwVar;
                return true;
            }
        }
        return false;
    }

    private final void ax() {
        VelocityTracker velocityTracker = this.ai;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        al(0);
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.y.isFinished();
        }
        EdgeEffect edgeEffect2 = this.z;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.B.isFinished();
        }
        if (z) {
            od.i(this);
        }
    }

    private final void ay() {
        ax();
        f(0);
    }

    private final void az(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ah) {
            int i = actionIndex == 0 ? 1 : 0;
            this.ah = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.al = x;
            this.aj = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.am = y;
            this.ak = y;
        }
    }

    public final void A() {
        if (this.B != null) {
            return;
        }
        EdgeEffect a2 = abk.a(this);
        this.B = a2;
        if (this.g) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void B() {
        this.B = null;
        this.z = null;
        this.A = null;
        this.y = null;
    }

    public final void C(String str) {
        if (K()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Sx());
            }
            throw new IllegalStateException(str);
        } else if (this.ag <= 0) {
        } else {
            new IllegalStateException("" + Sx());
        }
    }

    public void D(abw abwVar) {
        this.W.add(abwVar);
    }

    public void E(abw abwVar) {
        this.W.remove(abwVar);
        if (this.aa == abwVar) {
            this.aa = null;
        }
    }

    public final void F(int i, int i2) {
        setMeasuredDimension(abs.at(i, getPaddingLeft() + getPaddingRight(), od.z(this)), abs.at(i2, getPaddingTop() + getPaddingBottom(), od.A(this)));
    }

    public final void G() {
        this.af++;
    }

    final void H() {
        I(true);
    }

    public final void I(boolean z) {
        int i;
        int i2 = this.af - 1;
        this.af = i2;
        if (i2 <= 0) {
            this.af = 0;
            if (!z) {
                return;
            }
            int i3 = this.ad;
            this.ad = 0;
            if (i3 != 0 && J()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                obtain.setContentChangeTypes(i3);
                sendAccessibilityEventUnchecked(obtain);
            }
            for (int size = this.P.size() - 1; size >= 0; size--) {
                acl aclVar = this.P.get(size);
                if (aclVar.a.getParent() == this && !aclVar.c() && (i = aclVar.p) != -1) {
                    od.m(aclVar.a, i);
                    aclVar.p = -1;
                }
            }
            this.P.clear();
        }
    }

    public final boolean J() {
        AccessibilityManager accessibilityManager = this.ae;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean K() {
        return this.af > 0;
    }

    public final void L() {
        if (this.M || !this.p) {
            return;
        }
        od.j(this, this.az);
        this.M = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d8, code lost:
        if (r17.e.k(getFocusedChild()) != false) goto L142;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void M() {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.M():void");
    }

    final void N(aci aciVar) {
        if (this.D != 2) {
            aciVar.o = 0;
            aciVar.p = 0;
            return;
        }
        OverScroller overScroller = this.G.c;
        aciVar.o = overScroller.getFinalX() - overScroller.getCurrX();
        aciVar.p = overScroller.getFinalY() - overScroller.getCurrY();
    }

    public final void O(acl aclVar, abm abmVar) {
        aclVar.t(0, 8192);
        if (this.J.h && aclVar.B() && !aclVar.p() && !aclVar.c()) {
            this.f.e(P(aclVar), aclVar);
        }
        this.f.b(aclVar, abmVar);
    }

    final long P(acl aclVar) {
        return this.k.c ? aclVar.e : aclVar.c;
    }

    final void Q() {
        int g = this.e.g();
        for (int i = 0; i < g; i++) {
            ((abt) this.e.h(i).getLayoutParams()).e = true;
        }
        aca acaVar = this.b;
        int size = acaVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            abt abtVar = (abt) acaVar.c.get(i2).a.getLayoutParams();
            if (abtVar != null) {
                abtVar.e = true;
            }
        }
    }

    final void R() {
        int g = this.e.g();
        for (int i = 0; i < g; i++) {
            acl Y = Y(this.e.h(i));
            if (!Y.c()) {
                Y.b();
            }
        }
        aca acaVar = this.b;
        int size = acaVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            acaVar.c.get(i2).b();
        }
        int size2 = acaVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            acaVar.a.get(i3).b();
        }
        ArrayList<acl> arrayList = acaVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                acaVar.b.get(i4).b();
            }
        }
    }

    public final void S(int i, int i2, boolean z) {
        int i3 = i + i2;
        int g = this.e.g();
        for (int i4 = 0; i4 < g; i4++) {
            acl Y = Y(this.e.h(i4));
            if (Y != null && !Y.c()) {
                int i5 = Y.c;
                if (i5 >= i3) {
                    Y.a(-i2, z);
                    this.J.f = true;
                } else if (i5 >= i) {
                    Y.u(8);
                    Y.a(-i2, z);
                    Y.c = i - 1;
                    this.J.f = true;
                }
            }
        }
        aca acaVar = this.b;
        int size = acaVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                acl aclVar = acaVar.c.get(size);
                if (aclVar != null) {
                    int i6 = aclVar.c;
                    if (i6 >= i3) {
                        aclVar.a(-i2, z);
                    } else if (i6 >= i) {
                        aclVar.u(8);
                        acaVar.g(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final String Sx() {
        return " " + super.toString() + ", adapter:" + this.k + ", layout:" + this.l + ", context:" + getContext();
    }

    public final void T(boolean z) {
        this.x = z | this.x;
        this.w = true;
        int g = this.e.g();
        for (int i = 0; i < g; i++) {
            acl Y = Y(this.e.h(i));
            if (Y != null && !Y.c()) {
                Y.u(6);
            }
        }
        Q();
        aca acaVar = this.b;
        int size = acaVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            acl aclVar = acaVar.c.get(i2);
            if (aclVar != null) {
                aclVar.u(6);
                aclVar.v(null);
            }
        }
        abg abgVar = acaVar.i.k;
        if (abgVar == null || !abgVar.c) {
            acaVar.f();
        }
    }

    public final void U() {
        if (this.o.size() == 0) {
            return;
        }
        abs absVar = this.l;
        if (absVar != null) {
            absVar.Y("Cannot invalidate item decorations during a scroll or layout");
        }
        Q();
        requestLayout();
    }

    public final acl V(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return Y(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View W(android.view.View r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.W(android.view.View):android.view.View");
    }

    public final acl X(View view) {
        View W = W(view);
        if (W == null) {
            return null;
        }
        return V(W);
    }

    public final int Z(View view) {
        acl Y = Y(view);
        if (Y != null) {
            return Y.f();
        }
        return -1;
    }

    public final int aa(View view) {
        acl Y = Y(view);
        if (Y != null) {
            return Y.d();
        }
        return -1;
    }

    public final acl ab(int i) {
        acl aclVar = null;
        if (this.w) {
            return null;
        }
        int g = this.e.g();
        for (int i2 = 0; i2 < g; i2++) {
            acl Y = Y(this.e.h(i2));
            if (Y != null && !Y.p() && ak(Y) == i) {
                if (!this.e.k(Y.a)) {
                    return Y;
                }
                aclVar = Y;
            }
        }
        return aclVar;
    }

    public final acl ac(long j) {
        abg abgVar = this.k;
        acl aclVar = null;
        if (abgVar != null && abgVar.c) {
            int g = this.e.g();
            for (int i = 0; i < g; i++) {
                acl Y = Y(this.e.h(i));
                if (Y != null && !Y.p() && Y.e == j) {
                    if (!this.e.k(Y.a)) {
                        return Y;
                    }
                    aclVar = Y;
                }
            }
        }
        return aclVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        abs absVar = this.l;
        if (absVar == null || !absVar.bu(arrayList, i)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final Rect ae(View view) {
        abt abtVar = (abt) view.getLayoutParams();
        if (!abtVar.e) {
            return abtVar.d;
        }
        if (!this.J.g || (!abtVar.RV() && !abtVar.c.m())) {
            Rect rect = abtVar.d;
            rect.set(0, 0, 0, 0);
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                this.i.set(0, 0, 0, 0);
                this.o.get(i).b(this.i, view, this, this.J);
                rect.left += this.i.left;
                rect.top += this.i.top;
                rect.right += this.i.right;
                rect.bottom += this.i.bottom;
            }
            abtVar.e = false;
            return rect;
        }
        return abtVar.d;
    }

    public final void af(int i, int i2) {
        this.ag++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        abx abxVar = this.as;
        if (abxVar != null) {
            abxVar.a(this, i, i2);
        }
        List<abx> list = this.at;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.at.get(size).a(this, i, i2);
            }
        }
        this.ag--;
    }

    public final boolean ag() {
        return !this.r || this.w || this.d.e();
    }

    public final void aj(View view) {
        acl Y = Y(view);
        abg abgVar = this.k;
        if (abgVar != null && Y != null) {
            abgVar.n(Y);
        }
        List<abu> list = this.v;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                this.v.get(size).a(view);
            }
        }
    }

    public final int ak(acl aclVar) {
        if (aclVar.q(524) || !aclVar.o()) {
            return -1;
        }
        xa xaVar = this.d;
        int i = aclVar.c;
        int size = xaVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            wz wzVar = xaVar.a.get(i2);
            int i3 = wzVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = wzVar.b;
                    if (i4 <= i) {
                        int i5 = wzVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = wzVar.b;
                    if (i6 == i) {
                        i = wzVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (wzVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (wzVar.b <= i) {
                i += wzVar.d;
            }
        }
        return i;
    }

    public final void al(int i) {
        aG().g(i);
    }

    public final void am(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aG().i(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean an(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aG().k(i, i2, iArr, iArr2, i3);
    }

    public final void as(acl aclVar, int i) {
        if (K()) {
            aclVar.p = i;
            this.P.add(aclVar);
            return;
        }
        od.m(aclVar.a, i);
    }

    public final void at(int i, int i2, boolean z) {
        abs absVar = this.l;
        if (absVar != null && !this.t) {
            int i3 = 0;
            if (true != absVar.D()) {
                i = 0;
            }
            if (true != this.l.E()) {
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
                au(i3, 1);
            }
            this.G.b(i, i2, Integer.MIN_VALUE, null);
        }
    }

    public final void au(int i, int i2) {
        aG().e(i, i2);
    }

    public final void c() {
        abn abnVar = this.C;
        if (abnVar != null) {
            abnVar.i();
        }
        abs absVar = this.l;
        if (absVar != null) {
            absVar.bc(this.b);
            this.l.aR(this.b);
        }
        this.b.a();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof abt) && this.l.i((abt) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        abs absVar = this.l;
        if (absVar != null && absVar.D()) {
            return this.l.S(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        abs absVar = this.l;
        if (absVar != null && absVar.D()) {
            return this.l.Q(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        abs absVar = this.l;
        if (absVar != null && absVar.D()) {
            return this.l.U(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        abs absVar = this.l;
        if (absVar != null && absVar.E()) {
            return this.l.T(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        abs absVar = this.l;
        if (absVar != null && absVar.E()) {
            return this.l.R(this.J);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        abs absVar = this.l;
        if (absVar != null && absVar.E()) {
            return this.l.V(this.J);
        }
        return 0;
    }

    public final void d(acl aclVar) {
        View view = aclVar.a;
        ViewParent parent = view.getParent();
        this.b.l(V(view));
        if (aclVar.r()) {
            this.e.e(view, -1, view.getLayoutParams(), true);
        } else if (parent != this) {
            this.e.b(view, -1, true);
        } else {
            yo yoVar = this.e;
            int b = yoVar.c.b(view);
            if (b < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            yoVar.a.a(b);
            yoVar.a(view);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aG().l(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aG().m(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aG().j(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aG().h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.o.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.o.get(i).k(canvas, this);
        }
        EdgeEffect edgeEffect = this.y;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.y;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.z;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.A;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.A;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.B;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.B;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.C != null && this.o.size() > 0 && this.C.g())) {
            od.i(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final abz e() {
        return this.b.m();
    }

    public final void f(int i) {
        if (i == this.D) {
            return;
        }
        this.D = i;
        if (i != 2) {
            a();
        }
        abs absVar = this.l;
        if (absVar != null) {
            absVar.bb(i);
        }
        abx abxVar = this.as;
        if (abxVar != null) {
            abxVar.QA(this, i);
        }
        List<abx> list = this.at;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.at.get(size).QA(this, i);
        }
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
        if (r3.findNextFocus(r13, r14, true != ((r13.l.ay() == 1) ^ (r15 == 2)) ? 17 : 66) == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006e, code lost:
        if (W(r14) != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        r();
        r13.l.Sb(r14, r15, r13.b, r13.J);
        s(false);
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

    public final void g(abp abpVar) {
        abs absVar = this.l;
        if (absVar != null) {
            absVar.Y("Cannot add item decoration during a scroll  or layout");
        }
        if (this.o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.o.add(abpVar);
        Q();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.l != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        abj abjVar = this.au;
        if (abjVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return abjVar.a();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.g;
    }

    public final void h(abp abpVar) {
        abs absVar = this.l;
        if (absVar != null) {
            absVar.Y("Cannot remove item decoration during a scroll  or layout");
        }
        this.o.remove(abpVar);
        if (this.o.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        Q();
        requestLayout();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aG().b();
    }

    public final void i(abx abxVar) {
        if (this.at == null) {
            this.at = new ArrayList();
        }
        this.at.add(abxVar);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.t;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aG().a;
    }

    public final void j(abx abxVar) {
        List<abx> list = this.at;
        if (list != null) {
            list.remove(abxVar);
        }
    }

    public final void k() {
        List<abx> list = this.at;
        if (list != null) {
            list.clear();
        }
    }

    public final void l(int i) {
        if (this.t) {
            return;
        }
        v();
        abs absVar = this.l;
        if (absVar == null) {
            return;
        }
        absVar.O(i);
        awakenScrollBars();
    }

    public final void m(int i) {
        if (this.l == null) {
            return;
        }
        f(2);
        this.l.O(i);
        awakenScrollBars();
    }

    public final void n(int i) {
        abs absVar;
        if (!this.t && (absVar = this.l) != null) {
            absVar.ao(this, i);
        }
    }

    public final void o(int i, int i2, int[] iArr) {
        acl aclVar;
        r();
        G();
        aky.a("RV Scroll");
        N(this.J);
        int m = i != 0 ? this.l.m(i, this.b, this.J) : 0;
        int n = i2 != 0 ? this.l.n(i2, this.b, this.J) : 0;
        aky.b();
        int f = this.e.f();
        for (int i3 = 0; i3 < f; i3++) {
            View d = this.e.d(i3);
            acl V = V(d);
            if (V != null && (aclVar = V.i) != null) {
                View view = aclVar.a;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        H();
        s(false);
        if (iArr != null) {
            iArr[0] = m;
            iArr[1] = n;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.af = 0;
        boolean z = true;
        this.p = true;
        if (!this.r || isLayoutRequested()) {
            z = false;
        }
        this.r = z;
        abs absVar = this.l;
        if (absVar != null) {
            absVar.au(this);
        }
        this.M = false;
        zu zuVar = zu.a.get();
        this.H = zuVar;
        if (zuVar == null) {
            this.H = new zu();
            Display an = od.an(this);
            float f = 60.0f;
            if (!isInEditMode() && an != null) {
                float refreshRate = an.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            this.H.d = 1.0E9f / f;
            zu.a.set(this.H);
        }
        this.H.b.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        abn abnVar = this.C;
        if (abnVar != null) {
            abnVar.i();
        }
        v();
        this.p = false;
        abs absVar = this.l;
        if (absVar != null) {
            absVar.bz(this);
        }
        this.P.clear();
        removeCallbacks(this.az);
        afj.c();
        zu zuVar = this.H;
        if (zuVar != null) {
            zuVar.b.remove(this);
            this.H = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            this.o.get(i).c(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
        if (r0 != false) goto L47;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        aky.a("RV OnLayout");
        M();
        aky.b();
        this.r = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        abs absVar = this.l;
        if (absVar == null) {
            F(i, i2);
            return;
        }
        boolean z = false;
        if (absVar.RY()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.l.bw(this.b, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aA = z;
            if (z || this.k == null) {
                return;
            }
            if (this.J.d == 1) {
                aD();
            }
            this.l.aq(i, i2);
            this.J.i = true;
            aE();
            this.l.ar(i, i2);
            if (this.l.aa()) {
                this.l.aq(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.J.i = true;
                aE();
                this.l.ar(i, i2);
            }
            this.aB = getMeasuredWidth();
            this.aC = getMeasuredHeight();
        } else if (this.q) {
            this.l.bw(this.b, i, i2);
        } else {
            if (this.u) {
                r();
                G();
                aB();
                H();
                aci aciVar = this.J;
                if (aciVar.k) {
                    aciVar.g = true;
                } else {
                    this.d.i();
                    this.J.g = false;
                }
                this.u = false;
                s(false);
            } else if (this.J.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            abg abgVar = this.k;
            if (abgVar != null) {
                this.J.e = abgVar.c();
            } else {
                this.J.e = 0;
            }
            r();
            this.l.bw(this.b, i, i2);
            s(false);
            this.J.g = false;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (K()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.c = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.c;
        if (savedState2 != null) {
            savedState.a = savedState2.a;
        } else {
            abs absVar = this.l;
            savedState.a = absVar != null ? absVar.B() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x016f, code lost:
        if (r0 != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
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
    final boolean q(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.q(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void r() {
        int i = this.ab + 1;
        this.ab = i;
        if (i != 1 || this.t) {
            return;
        }
        this.s = false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        acl Y = Y(view);
        if (Y != null) {
            if (Y.r()) {
                Y.k();
            } else if (!Y.c()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + Y + Sx());
            }
        }
        view.clearAnimation();
        aj(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.l.bx(this, view) && view2 != null) {
            av(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.l.aW(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).h(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ab != 0 || this.t) {
            this.s = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(boolean z) {
        int i = this.ab;
        if (i <= 0) {
            this.ab = 1;
            i = 1;
        }
        if (!z && !this.t) {
            this.s = false;
        }
        if (i == 1) {
            if (z && this.s && !this.t && this.l != null && this.k != null) {
                M();
            }
            if (!this.t) {
                this.s = false;
            }
        }
        this.ab--;
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        abs absVar = this.l;
        if (absVar != null && !this.t) {
            boolean D = absVar.D();
            boolean E = this.l.E();
            if (!D) {
                if (!E) {
                    return;
                }
                E = true;
            }
            if (true != D) {
                i = 0;
            }
            if (true != E) {
                i2 = 0;
            }
            q(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (K()) {
            int i = 0;
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i = contentChangeTypes;
            }
            this.ad |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(acn acnVar) {
        this.N = acnVar;
        od.c(this, acnVar);
    }

    public void setAdapter(abg abgVar) {
        setLayoutFrozen(false);
        abg abgVar2 = this.k;
        if (abgVar2 != null) {
            abgVar2.p(this.U);
            this.k.r(this);
        }
        c();
        this.d.a();
        abg abgVar3 = this.k;
        this.k = abgVar;
        if (abgVar != null) {
            abgVar.o(this.U);
            abgVar.q(this);
        }
        abs absVar = this.l;
        if (absVar != null) {
            absVar.aX(abgVar3, this.k);
        }
        aca acaVar = this.b;
        abg abgVar4 = this.k;
        acaVar.a();
        abz m = acaVar.m();
        if (abgVar3 != null) {
            m.e();
        }
        if (m.b == 0) {
            m.a();
        }
        if (abgVar4 != null) {
            m.d();
        }
        this.J.f = true;
        T(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(abj abjVar) {
        if (abjVar == this.au) {
            return;
        }
        this.au = abjVar;
        setChildrenDrawingOrderEnabled(abjVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.g) {
            B();
        }
        this.g = z;
        super.setClipToPadding(z);
        if (this.r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(abk abkVar) {
        nb.b(abkVar);
        B();
    }

    public void setHasFixedSize(boolean z) {
        this.q = z;
    }

    public void setItemAnimator(abn abnVar) {
        abn abnVar2 = this.C;
        if (abnVar2 != null) {
            abnVar2.i();
            this.C.l = null;
        }
        this.C = abnVar;
        if (abnVar != null) {
            abnVar.l = this.aD;
        }
    }

    public void setItemViewCacheSize(int i) {
        aca acaVar = this.b;
        acaVar.e = i;
        acaVar.b();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(abs absVar) {
        if (absVar == this.l) {
            return;
        }
        v();
        if (this.l != null) {
            abn abnVar = this.C;
            if (abnVar != null) {
                abnVar.i();
            }
            this.l.bc(this.b);
            this.l.aR(this.b);
            this.b.a();
            if (this.p) {
                this.l.bz(this);
            }
            this.l.ap(null);
            this.l = null;
        } else {
            this.b.a();
        }
        yo yoVar = this.e;
        yoVar.a.d();
        int size = yoVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            yoVar.c.e(yoVar.b.get(size));
            yoVar.b.remove(size);
        }
        abe abeVar = yoVar.c;
        int a2 = abeVar.a();
        for (int i = 0; i < a2; i++) {
            View d = abeVar.d(i);
            abeVar.a.aj(d);
            d.clearAnimation();
        }
        abeVar.a.removeAllViews();
        this.l = absVar;
        if (absVar != null) {
            if (absVar.q != null) {
                throw new IllegalArgumentException("LayoutManager " + absVar + " is already attached to a RecyclerView:" + absVar.q.Sx());
            }
            this.l.ap(this);
            if (this.p) {
                this.l.au(this);
            }
        }
        this.b.b();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        aG().a(z);
    }

    public void setOnFlingListener(abv abvVar) {
        this.E = abvVar;
    }

    @Deprecated
    public void setOnScrollListener(abx abxVar) {
        this.as = abxVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.ar = z;
    }

    public void setRecycledViewPool(abz abzVar) {
        aca acaVar = this.b;
        abz abzVar2 = acaVar.g;
        if (abzVar2 != null) {
            abzVar2.e();
        }
        acaVar.g = abzVar;
        abz abzVar3 = acaVar.g;
        if (abzVar3 == null || acaVar.i.k == null) {
            return;
        }
        abzVar3.d();
    }

    @Deprecated
    public void setRecyclerListener(acb acbVar) {
        this.m = acbVar;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.an = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            String str = "setScrollingTouchSlop(): bad argument constant " + i + "; using default value";
        }
        this.an = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(acj acjVar) {
        this.b.h = acjVar;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aG().d(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aG().f();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.t) {
            C("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.t = true;
                this.ac = true;
                v();
                return;
            }
            this.t = false;
            if (this.s && this.l != null && this.k != null) {
                requestLayout();
            }
            this.s = false;
        }
    }

    public void t(int i, int i2) {
        at(i, i2, false);
    }

    public boolean u(int i, int i2) {
        abs absVar = this.l;
        if (absVar != null && !this.t) {
            boolean D = absVar.D();
            boolean E = this.l.E();
            int i3 = (!D || Math.abs(i) < this.F) ? 0 : i;
            int i4 = (!E || Math.abs(i2) < this.F) ? 0 : i2;
            if (i3 == 0) {
                if (i4 == 0) {
                    return false;
                }
                i3 = 0;
            }
            float f = i3;
            float f2 = i4;
            if (dispatchNestedPreFling(f, f2)) {
                return false;
            }
            dispatchNestedFling(f, f2, true);
            abv abvVar = this.E;
            if (abvVar != null && abvVar.e(i3, i4)) {
                return true;
            }
            if (E) {
                boolean z = D ? 1 : 0;
                char c = D ? 1 : 0;
                D = z | true;
            }
            int i5 = D ? 1 : 0;
            int i6 = D ? 1 : 0;
            au(i5, 1);
            int i7 = this.ao;
            int max = Math.max(-i7, Math.min(i3, i7));
            int i8 = this.ao;
            int max2 = Math.max(-i8, Math.min(i4, i8));
            ack ackVar = this.G;
            ackVar.e.f(2);
            ackVar.b = 0;
            ackVar.a = 0;
            Interpolator interpolator = ackVar.d;
            Interpolator interpolator2 = Q;
            if (interpolator != interpolator2) {
                ackVar.d = interpolator2;
                ackVar.c = new OverScroller(ackVar.e.getContext(), interpolator2);
            }
            ackVar.c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            ackVar.a();
            return true;
        }
        return false;
    }

    public final void v() {
        f(0);
        a();
    }

    public final void w(int i, int i2) {
        EdgeEffect edgeEffect = this.y;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.y.onRelease();
            z = this.y.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A.onRelease();
            z |= this.A.isFinished();
        }
        EdgeEffect edgeEffect3 = this.z;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.z.onRelease();
            z |= this.z.isFinished();
        }
        EdgeEffect edgeEffect4 = this.B;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.B.onRelease();
            z |= this.B.isFinished();
        }
        if (z) {
            od.i(this);
        }
    }

    public final void x() {
        if (this.y != null) {
            return;
        }
        EdgeEffect a2 = abk.a(this);
        this.y = a2;
        if (this.g) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.A != null) {
            return;
        }
        EdgeEffect a2 = abk.a(this);
        this.A = a2;
        if (this.g) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.z != null) {
            return;
        }
        EdgeEffect a2 = abk.a(this);
        this.z = a2;
        if (this.g) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new acd();
        Parcelable a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readParcelable(classLoader == null ? abs.class.getClassLoader() : classLoader);
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

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        abs absVar = this.l;
        if (absVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + Sx());
        }
        return absVar.f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        abs absVar = this.l;
        if (absVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + Sx());
        }
        return absVar.g(getContext(), attributeSet);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.U = new acc(this);
        this.b = new aca(this);
        this.f = new afk();
        this.h = new aba(this);
        this.i = new Rect();
        this.V = new Rect();
        this.j = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList<>();
        this.W = new ArrayList<>();
        this.ab = 0;
        this.w = false;
        this.x = false;
        this.af = 0;
        this.ag = 0;
        this.C = new zc();
        this.D = 0;
        this.ah = -1;
        this.ap = Float.MIN_VALUE;
        this.aq = Float.MIN_VALUE;
        this.ar = true;
        this.G = new ack(this);
        this.I = new zs();
        this.J = new aci();
        this.K = false;
        this.L = false;
        this.aD = new abo(this);
        this.M = false;
        this.av = new int[2];
        this.ax = new int[2];
        this.ay = new int[2];
        this.O = new int[2];
        this.P = new ArrayList();
        this.az = new abb(this);
        this.aB = 0;
        this.aC = 0;
        this.aE = new abd(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.an = viewConfiguration.getScaledTouchSlop();
        this.ap = oe.a(viewConfiguration, context);
        this.aq = oe.b(viewConfiguration, context);
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ao = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.C.l = this.aD;
        this.d = new xa(new abf(this));
        this.e = new yo(new abe(this));
        if (od.d(this) == 0) {
            od.e(this, 8);
        }
        if (od.l(this) == 0) {
            od.m(this, 1);
        }
        this.ae = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new acn(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ta.a, i, 0);
        od.a(this, context, ta.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.g = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Sx());
            }
            Resources resources = getContext().getResources();
            new zm(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        }
        obtainStyledAttributes.recycle();
        aH(context, string, attributeSet, i);
        int[] iArr = S;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        od.a(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    public final void p() {
        if (!this.r || this.w) {
            aky.a("RV FullInvalidate");
            M();
            aky.b();
        } else if (!this.d.e()) {
        } else {
            if (!this.d.f(4) || this.d.f(11)) {
                if (!this.d.e()) {
                    return;
                }
                aky.a("RV FullInvalidate");
                M();
                aky.b();
                return;
            }
            aky.a("RV PartialInvalidate");
            r();
            G();
            this.d.b();
            if (!this.s) {
                int f = this.e.f();
                int i = 0;
                while (true) {
                    if (i < f) {
                        acl Y = Y(this.e.d(i));
                        if (Y != null && !Y.c() && Y.B()) {
                            M();
                            break;
                        }
                        i++;
                    } else {
                        this.d.c();
                        break;
                    }
                }
            }
            s(true);
            H();
            aky.b();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        abs absVar = this.l;
        if (absVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + Sx());
        }
        return absVar.Sa(layoutParams);
    }
}
