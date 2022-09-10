package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private int A;
    private float B;
    private float C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private int IY;
    private int J;
    private boolean K;
    private float L;
    private float M;
    private int N;
    private int O;
    private int P;
    private EdgeEffect Q;
    private EdgeEffect R;
    private boolean S;
    private boolean T;
    private int U;
    private List<bbb> V;
    private bbb W;
    private bbc aa;
    private int ab;
    private int ac;
    private ArrayList<View> ad;
    private final Runnable af;
    private int ag;
    public bas b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;
    public int h;
    public VelocityTracker i;
    public int j;
    public boolean k;
    public long l;
    public List<dafu> m;
    private final ArrayList<bay> q;
    private final bay r;
    private final Rect s;
    private int t;
    private Scroller u;
    private boolean v;
    private bbd w;
    private int x;
    private Drawable y;
    private int z;
    public static final int[] a = {16842931};
    private static final Comparator<bay> o = new bat();
    private static final Interpolator p = new bau();
    private static final bbg ae = new bbg();

    public ViewPager(Context context) {
        super(context);
        this.q = new ArrayList<>();
        this.r = new bay();
        this.s = new Rect();
        this.t = -1;
        this.B = -3.4028235E38f;
        this.C = Float.MAX_VALUE;
        this.F = 1;
        this.K = true;
        this.h = -1;
        this.S = true;
        this.af = new bav(this);
        this.ag = 0;
        NT();
    }

    private final void A(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.q.isEmpty()) {
            bay o2 = o(this.c);
            int min = (int) ((o2 != null ? Math.min(o2.e, this.C) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            D(false);
            scrollTo(min, getScrollY());
        } else if (!this.u.isFinished()) {
            this.u.setFinalX(e() * d());
        } else {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - paddingLeft) - paddingRight) + i3)), getScrollY());
        }
    }

    private final boolean B(int i) {
        if (this.q.size() == 0) {
            if (this.S) {
                return false;
            }
            this.T = false;
            p(0, 0.0f, 0);
            if (!this.T) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        bay q = q();
        int d = d();
        int i2 = this.x;
        float f = d;
        int i3 = q.b;
        float f2 = ((i / f) - q.e) / (q.d + (i2 / f));
        this.T = false;
        p(i3, f2, (int) ((d + i2) * f2));
        if (!this.T) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    private void C(int i) {
        bbb bbbVar = this.W;
        if (bbbVar != null) {
            bbbVar.b(i);
        }
        List<bbb> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                bbb bbbVar2 = this.V.get(i2);
                if (bbbVar2 != null) {
                    bbbVar2.b(i);
                }
            }
        }
    }

    private final void D(boolean z) {
        boolean z2 = this.ag == 2;
        if (z2) {
            H(false);
            if (!this.u.isFinished()) {
                this.u.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.u.getCurrX();
                int currY = this.u.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.d = false;
        for (int i = 0; i < this.q.size(); i++) {
            bay bayVar = this.q.get(i);
            if (bayVar.c) {
                bayVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                od.j(this, this.af);
            } else {
                this.af.run();
            }
        }
    }

    private final boolean E() {
        this.h = -1;
        t();
        this.Q.onRelease();
        this.R.onRelease();
        return this.Q.isFinished() || this.R.isFinished();
    }

    private final boolean F(float f) {
        ArrayList<bay> arrayList;
        boolean z;
        boolean z2;
        float f2 = this.f;
        this.f = f;
        float scrollX = getScrollX() + (f2 - f);
        float d = d();
        float f3 = this.B * d;
        float f4 = this.C * d;
        boolean z3 = false;
        bay bayVar = this.q.get(0);
        bay bayVar2 = this.q.get(arrayList.size() - 1);
        if (bayVar.b != 0) {
            f3 = bayVar.e * d;
            z = false;
        } else {
            z = true;
        }
        if (bayVar2.b != this.b.OV() - 1) {
            f4 = bayVar2.e * d;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.Q.onPull(Math.abs(f3 - scrollX) / d);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.R.onPull(Math.abs(scrollX - f4) / d);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f += scrollX - i;
        scrollTo(i, getScrollY());
        B(i);
        return z3;
    }

    private final void G(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.h) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f = motionEvent.getX(i);
            this.h = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.i;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    private final void H(boolean z) {
        if (this.E != z) {
            this.E = z;
        }
    }

    private final Rect I(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final void J() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void y(int i, boolean z, int i2, boolean z2) {
        int scrollX;
        int i3;
        bay o2 = o(i);
        int d = o2 != null ? (int) (d() * Math.max(this.B, Math.min(o2.e, this.C))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                H(false);
            } else {
                Scroller scroller = this.u;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    scrollX = this.v ? this.u.getCurrX() : this.u.getStartX();
                    this.u.abortAnimation();
                    H(false);
                }
                int i4 = scrollX;
                int scrollY = getScrollY();
                int i5 = d - i4;
                int i6 = -scrollY;
                if (i5 != 0) {
                    i3 = i5;
                } else if (i6 == 0) {
                    D(false);
                    l();
                    b(0);
                } else {
                    i3 = 0;
                }
                H(true);
                b(2);
                int d2 = d();
                float f = d2;
                float f2 = d2 / 2;
                float sin = f2 + (((float) Math.sin((Math.min(1.0f, Math.abs(i3) / f) - 0.5f) * 0.47123894f)) * f2);
                int abs = Math.abs(i2);
                int min = Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / ((f * this.b.r(this.c)) + this.x)) + 1.0f) * 100.0f), 600);
                this.v = false;
                this.u.startScroll(i4, scrollY, i3, i6, min);
                od.i(this);
            }
            if (!z2) {
                return;
            }
            C(i);
            return;
        }
        if (z2) {
            C(i);
        }
        D(false);
        scrollTo(d, 0);
        B(d);
    }

    private final void z() {
        if (this.ac != 0) {
            ArrayList<View> arrayList = this.ad;
            if (arrayList == null) {
                this.ad = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ad.add(getChildAt(i));
            }
            Collections.sort(this.ad, ae);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r9 != r10) goto L246;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void NM(int r19) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.NM(int):void");
    }

    final void NT() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.u = new Scroller(context, p);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.J = viewConfiguration.getScaledPagingTouchSlop();
        this.N = (int) (400.0f * f);
        this.j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.O = (int) (25.0f * f);
        this.P = (int) (f + f);
        this.H = (int) (f * 16.0f);
        od.c(this, new bba(this));
        if (od.l(this) == 0) {
            od.m(this, 1);
        }
        od.O(this, new baw(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        bay n;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (n = n(childAt)) != null && n.b == this.c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        bay n;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (n = n(childAt)) != null && n.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        baz bazVar = (baz) layoutParams;
        boolean z = bazVar.a | (view.getClass().getAnnotation(bax.class) != null);
        bazVar.a = z;
        if (!this.D) {
            super.addView(view, i, layoutParams);
        } else if (bazVar == null || !z) {
            bazVar.d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void b(int i) {
        if (this.ag == i) {
            return;
        }
        this.ag = i;
        if (this.aa != null) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setLayerType(i != 0 ? this.ab : 0, null);
            }
        }
        bbb bbbVar = this.W;
        if (bbbVar != null) {
            bbbVar.c(i);
        }
        List<bbb> list = this.V;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            bbb bbbVar2 = this.V.get(i3);
            if (bbbVar2 != null) {
                bbbVar2.c(i);
            }
        }
    }

    public bas c() {
        return this.b;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.b == null) {
            return false;
        }
        int d = d();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) d) * this.B)) : i > 0 && scrollX < ((int) (((float) d) * this.C));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof baz) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.v = true;
        if (this.u.isFinished() || !this.u.computeScrollOffset()) {
            D(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.u.getCurrX();
        int currY = this.u.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.u.abortAnimation();
                scrollTo(0, currY);
            }
        }
        od.i(this);
    }

    public final int d() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.v(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.v(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.x()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.v(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.w()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.v(r6)
            goto L5b
        L5a:
            r6 = 0
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        bay n;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (n = n(childAt)) != null && n.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        bas basVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (basVar = this.b) == null || basVar.OV() <= 1)) {
            this.Q.finish();
            this.R.finish();
            return;
        }
        if (!this.Q.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.B * width);
            this.Q.setSize(height, width);
            z = this.Q.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        if (!this.R.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.C + 1.0f)) * width2);
            this.R.setSize((height2 - paddingTop) - paddingBottom, width2);
            z |= this.R.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (!z) {
            return;
        }
        od.i(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.y;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public int e() {
        return this.c;
    }

    final void f(int i, boolean z, boolean z2) {
        g(i, z, z2, 0);
    }

    public final void g(int i, boolean z, boolean z2, int i2) {
        bas basVar = this.b;
        boolean z3 = false;
        if (basVar == null || basVar.OV() <= 0) {
            H(false);
        } else if (z2 || this.c != i || this.q.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.b.OV()) {
                i = this.b.OV() - 1;
            }
            int i3 = this.F;
            int i4 = this.c;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.q.size(); i5++) {
                    this.q.get(i5).c = true;
                }
            }
            if (this.c != i) {
                z3 = true;
            }
            if (this.S) {
                this.c = i;
                if (z3) {
                    C(i);
                }
                requestLayout();
                return;
            }
            NM(i);
            y(i, z, i2, z3);
        } else {
            H(false);
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new baz();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new baz(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (this.ac == 2) {
            i2 = (i - 1) - i2;
        }
        return ((baz) this.ad.get(i2).getLayoutParams()).f;
    }

    public void h(bbb bbbVar) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.add(bbbVar);
    }

    public void i(bbb bbbVar) {
        List<bbb> list = this.V;
        if (list != null) {
            list.remove(bbbVar);
        }
    }

    final bay j(int i, int i2) {
        bay bayVar = new bay();
        bayVar.b = i;
        bayVar.a = this.b.c(this, i);
        bayVar.d = this.b.r(i);
        if (i2 < 0 || i2 >= this.q.size()) {
            this.q.add(bayVar);
        } else {
            this.q.add(i2, bayVar);
        }
        return bayVar;
    }

    public final void k() {
        int OV = this.b.OV();
        this.IY = OV;
        int size = this.q.size();
        int i = this.F;
        boolean z = size < (i + i) + 1 && this.q.size() < OV;
        int i2 = this.c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.q.size()) {
            bay bayVar = this.q.get(i3);
            int OX = this.b.OX(bayVar.a);
            if (OX != -1) {
                if (OX == -2) {
                    this.q.remove(i3);
                    i3--;
                    if (!z2) {
                        this.b.OY(this);
                    }
                    this.b.d(this, bayVar.b, bayVar.a);
                    int i4 = this.c;
                    if (i4 == bayVar.b) {
                        i2 = Math.max(0, Math.min(i4, (-1) + OV));
                    }
                    z = true;
                    z2 = true;
                } else {
                    int i5 = bayVar.b;
                    if (i5 != OX) {
                        if (i5 == this.c) {
                            i2 = OX;
                        }
                        bayVar.b = OX;
                        z = true;
                    }
                }
            }
            i3++;
        }
        if (z2) {
            this.b.f(this);
        }
        Collections.sort(this.q, o);
        if (z) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                baz bazVar = (baz) getChildAt(i6).getLayoutParams();
                if (!bazVar.a) {
                    bazVar.c = 0.0f;
                }
            }
            f(i2, false, true);
            requestLayout();
        }
    }

    public final void l() {
        NM(this.c);
    }

    final bay n(View view) {
        for (int i = 0; i < this.q.size(); i++) {
            bay bayVar = this.q.get(i);
            if (this.b.OW(view, bayVar.a)) {
                return bayVar;
            }
        }
        return null;
    }

    final bay o(int i) {
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            bay bayVar = this.q.get(i2);
            if (bayVar.b == i) {
                return bayVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.af);
        Scroller scroller = this.u;
        if (scroller != null && !scroller.isFinished()) {
            this.u.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        int i;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.x <= 0 || this.y == null || this.q.size() <= 0 || this.b == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f3 = this.x / width2;
        int i2 = 0;
        bay bayVar = this.q.get(0);
        float f4 = bayVar.e;
        int size = this.q.size();
        int i3 = bayVar.b;
        int i4 = this.q.get(size - 1).b;
        while (i3 < i4) {
            while (true) {
                i = bayVar.b;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                bayVar = this.q.get(i2);
            }
            if (i3 == i) {
                float f5 = bayVar.e + bayVar.d;
                f = f5 * width2;
                f4 = f5 + f3;
            } else {
                float r = this.b.r(i3);
                f4 += r + f3;
                f = (f4 + r) * width2;
            }
            if (this.x + f > scrollX) {
                f2 = width2;
                this.y.setBounds(Math.round(f), this.z, Math.round(this.x + f), this.A);
                this.y.draw(canvas);
            } else {
                f2 = width2;
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            width2 = f2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            E();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.g = x;
            this.f = x;
            float y = motionEvent.getY();
            this.M = y;
            this.L = y;
            this.h = motionEvent.getPointerId(0);
            this.G = false;
            this.v = true;
            this.u.computeScrollOffset();
            if (this.ag != 2 || Math.abs(this.u.getFinalX() - this.u.getCurrX()) <= this.P) {
                D(false);
                this.e = false;
            } else {
                this.u.abortAnimation();
                this.d = false;
                l();
                this.e = true;
                J();
                b(1);
            }
        } else if (this.e) {
            return true;
        } else {
            if (this.G) {
                return false;
            }
            if (action == 2) {
                int i = this.h;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.f;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.M);
                    if (f != 0.0f) {
                        float f2 = this.f;
                        if ((this.K || ((f2 >= this.I || f <= 0.0f) && (f2 <= getWidth() - this.I || f >= 0.0f))) && u(this, false, (int) f, (int) x2, (int) y2)) {
                            this.f = x2;
                            this.L = y2;
                            this.G = true;
                            return false;
                        }
                    }
                    float f3 = this.J;
                    if (abs > f3 && abs * 0.5f > abs2) {
                        this.e = true;
                        J();
                        b(1);
                        this.f = f > 0.0f ? this.g + this.J : this.g - this.J;
                        this.L = y2;
                        H(true);
                    } else if (abs2 > f3) {
                        this.G = true;
                    }
                    if (this.e && F(x2)) {
                        od.i(this);
                    }
                }
            } else if (action == 6) {
                G(motionEvent);
            }
        }
        if (this.i == null) {
            this.i = VelocityTracker.obtain();
        }
        this.i.addMovement(motionEvent);
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        bay n;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (n = n(childAt)) != null && n.b == this.c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        if (this.b != null) {
            Parcelable parcelable2 = savedState.b;
            ClassLoader classLoader = savedState.e;
            f(savedState.a, false, true);
            return;
        }
        this.t = savedState.a;
        Parcelable parcelable3 = savedState.b;
        ClassLoader classLoader2 = savedState.e;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        bas basVar = this.b;
        if (basVar != null) {
            savedState.b = basVar.OZ();
        }
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.x;
            A(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.U
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            baz r9 = (defpackage.baz) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            bbb r0 = r12.W
            if (r0 == 0) goto L72
            r0.a(r13, r14, r15)
        L72:
            java.util.List<bbb> r0 = r12.V
            if (r0 == 0) goto L8d
            int r0 = r0.size()
            r3 = 0
        L7b:
            if (r3 >= r0) goto L8d
            java.util.List<bbb> r4 = r12.V
            java.lang.Object r4 = r4.get(r3)
            bbb r4 = (defpackage.bbb) r4
            if (r4 == 0) goto L8a
            r4.a(r13, r14, r15)
        L8a:
            int r3 = r3 + 1
            goto L7b
        L8d:
            bbc r13 = r12.aa
            if (r13 == 0) goto Lbd
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L99:
            if (r1 >= r14) goto Lbd
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            baz r0 = (defpackage.baz) r0
            boolean r0 = r0.a
            if (r0 != 0) goto Lba
            int r0 = r15.getLeft()
            int r3 = r12.d()
            bbc r4 = r12.aa
            int r0 = r0 - r13
            float r0 = (float) r0
            float r3 = (float) r3
            float r0 = r0 / r3
            r4.a(r15, r0)
        Lba:
            int r1 = r1 + 1
            goto L99
        Lbd:
            r12.T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.p(int, float, int):void");
    }

    public final bay q() {
        int i;
        int d = d();
        float f = 0.0f;
        float scrollX = d > 0 ? getScrollX() / d : 0.0f;
        float f2 = d > 0 ? this.x / d : 0.0f;
        bay bayVar = null;
        float f3 = 0.0f;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        while (i2 < this.q.size()) {
            bay bayVar2 = this.q.get(i2);
            if (!z && bayVar2.b != (i = i3 + 1)) {
                bayVar2 = this.r;
                bayVar2.e = f + f3 + f2;
                bayVar2.b = i;
                bayVar2.d = this.b.r(i);
                i2--;
            }
            f = bayVar2.e;
            float f4 = bayVar2.d + f + f2;
            if (!z && scrollX < f) {
                return bayVar;
            }
            if (scrollX < f4 || i2 == this.q.size() - 1) {
                return bayVar2;
            }
            i3 = bayVar2.b;
            f3 = bayVar2.d;
            i2++;
            bayVar = bayVar2;
            z = false;
        }
        return bayVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.D) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(float f) {
        ArrayList<bay> arrayList;
        if (this.k) {
            if (this.b == null) {
                return;
            }
            this.f += f;
            float scrollX = getScrollX() - f;
            float d = d();
            float f2 = this.B * d;
            float f3 = this.C * d;
            bay bayVar = this.q.get(0);
            bay bayVar2 = this.q.get(arrayList.size() - 1);
            if (bayVar.b != 0) {
                f2 = bayVar.e * d;
            }
            if (bayVar2.b != this.b.OV() - 1) {
                f3 = bayVar2.e * d;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.f += scrollX - i;
            scrollTo(i, getScrollY());
            B(i);
            MotionEvent obtain = MotionEvent.obtain(this.l, SystemClock.uptimeMillis(), 2, this.f, 0.0f, 0);
            this.i.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void setAdapter(bas basVar) {
        bas basVar2 = this.b;
        if (basVar2 != null) {
            basVar2.p(null);
            this.b.OY(this);
            for (int i = 0; i < this.q.size(); i++) {
                bay bayVar = this.q.get(i);
                this.b.d(this, bayVar.b, bayVar.a);
            }
            this.b.f(this);
            this.q.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((baz) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = basVar;
        this.IY = 0;
        if (basVar != null) {
            if (this.w == null) {
                this.w = new bbd(this);
            }
            this.b.p(this.w);
            this.d = false;
            boolean z = this.S;
            this.S = true;
            this.IY = this.b.OV();
            if (this.t >= 0) {
                this.b.j();
                f(this.t, false, true);
                this.t = -1;
            } else if (!z) {
                l();
            } else {
                requestLayout();
            }
        }
        List<dafu> list = this.m;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.m.size();
        for (int i3 = 0; i3 < size; i3++) {
            dafu dafuVar = this.m.get(i3);
            dagg daggVar = dafuVar.b;
            if (daggVar.A == this) {
                daggVar.l(basVar, dafuVar.a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.d = false;
        f(i, !this.S, false);
    }

    public void setDragInGutterEnabled(boolean z) {
        this.K = z;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            String str = "Requested offscreen page limit " + i + " too small; defaulting to 1";
            i = 1;
        }
        if (i != this.F) {
            this.F = i;
            l();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(bbb bbbVar) {
        this.W = bbbVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.x;
        this.x = i;
        int width = getWidth();
        A(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    public void setPageTransformer(boolean z, bbc bbcVar) {
        setPageTransformer(z, bbcVar, 2);
    }

    public final void t() {
        this.e = false;
        this.G = false;
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && u(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L5d
        L9:
            if (r0 == 0) goto L5d
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L5d
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.toString()
            goto L7
        L5d:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 0
            r3 = 66
            r4 = 17
            if (r1 == 0) goto Lae
            if (r1 == r0) goto Lae
            if (r6 != r4) goto L8e
            android.graphics.Rect r2 = r5.s
            android.graphics.Rect r2 = r5.I(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.s
            android.graphics.Rect r3 = r5.I(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L89
            if (r2 < r3) goto L89
            boolean r2 = r5.w()
            goto Lc2
        L89:
            boolean r2 = r1.requestFocus()
            goto Lc2
        L8e:
            if (r6 != r3) goto Lc2
            android.graphics.Rect r2 = r5.s
            android.graphics.Rect r2 = r5.I(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.s
            android.graphics.Rect r3 = r5.I(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La9
            if (r2 > r3) goto La9
            boolean r2 = r5.x()
            goto Lc2
        La9:
            boolean r2 = r1.requestFocus()
            goto Lc2
        Lae:
            if (r6 == r4) goto Lbe
            r0 = 1
            if (r6 != r0) goto Lb4
            goto Lbe
        Lb4:
            if (r6 == r3) goto Lb9
            r0 = 2
            if (r6 != r0) goto Lc2
        Lb9:
            boolean r2 = r5.x()
            goto Lc2
        Lbe:
            boolean r2 = r5.w()
        Lc2:
            if (r2 == 0) goto Lcb
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        Lcb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.v(int):boolean");
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    final boolean w() {
        int i = this.c;
        if (i > 0) {
            setCurrentItem(i - 1, true);
            return true;
        }
        return false;
    }

    final boolean x() {
        bas basVar = this.b;
        if (basVar == null || this.c >= basVar.OV() - 1) {
            return false;
        }
        setCurrentItem(this.c + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItem(int i, boolean z) {
        this.d = false;
        f(i, z, false);
    }

    public void setPageTransformer(boolean z, bbc bbcVar, int i) {
        int i2 = 1;
        boolean z2 = bbcVar != null;
        boolean z3 = this.aa != null;
        this.aa = bbcVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (true == z) {
                i2 = 2;
            }
            this.ac = i2;
            this.ab = i;
        } else {
            this.ac = 0;
        }
        if (z2 != z3) {
            l();
        }
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.y = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new bbe();
        int a;
        Parcelable b;
        ClassLoader e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final int r(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.O || Math.abs(i2) <= this.N) {
            i += (int) (f + (i >= this.c ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.q.size() > 0) {
            ArrayList<bay> arrayList = this.q;
            return Math.max(this.q.get(0).b, Math.min(i, arrayList.get(arrayList.size() - 1).b));
        }
        return i;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new ArrayList<>();
        this.r = new bay();
        this.s = new Rect();
        this.t = -1;
        this.B = -3.4028235E38f;
        this.C = Float.MAX_VALUE;
        this.F = 1;
        this.K = true;
        this.h = -1;
        this.S = true;
        this.af = new bav(this);
        this.ag = 0;
        NT();
    }
}
