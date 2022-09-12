package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: abs  reason: default package */
/* loaded from: classes.dex */
public abstract class abs {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    private final afh a;
    private final afh b;
    yo p;
    public RecyclerView q;
    final afi r;
    final afi s;
    public ach t;
    public boolean u;
    boolean v;
    public boolean w;
    public final boolean x;
    public final boolean y;
    public int z;

    public abs() {
        abq abqVar = new abq(this);
        this.a = abqVar;
        abr abrVar = new abr(this);
        this.b = abrVar;
        this.r = new afi(abqVar);
        this.s = new afi(abrVar);
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = true;
        this.y = true;
    }

    public static boolean aT(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode == 0) {
                return true;
            } else {
                return mode == 1073741824 && size == i;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r5 == 1073741824) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int aU(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1a
            if (r7 < 0) goto L11
            goto L1c
        L11:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L21
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L21
            goto L2f
        L1a:
            if (r7 < 0) goto L1f
        L1c:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L31
        L1f:
            if (r7 != r1) goto L23
        L21:
            r7 = r4
            goto L31
        L23:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L2a
            goto L2c
        L2a:
            r5 = 0
            goto L21
        L2c:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L21
        L2f:
            r5 = 0
            r7 = 0
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abs.aU(int, int, int, int, boolean):int");
    }

    public static int at(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    public static final int bA(View view) {
        return view.getBottom() + bi(view);
    }

    public static final int bB(View view) {
        return view.getLeft() - bl(view);
    }

    public static final int bC(View view) {
        return view.getRight() + bn(view);
    }

    public static final int bD(View view) {
        return view.getTop() - bo(view);
    }

    public static final int bi(View view) {
        return ((abt) view.getLayoutParams()).d.bottom;
    }

    public static final int bj(View view) {
        Rect rect = ((abt) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bk(View view) {
        Rect rect = ((abt) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bl(View view) {
        return ((abt) view.getLayoutParams()).d.left;
    }

    public static final int bm(View view) {
        return ((abt) view.getLayoutParams()).RW();
    }

    public static final int bn(View view) {
        return ((abt) view.getLayoutParams()).d.right;
    }

    public static final int bo(View view) {
        return ((abt) view.getLayoutParams()).d.top;
    }

    public static final void br(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((abt) view.getLayoutParams()).d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public static final void bs(View view, int i, int i2, int i3, int i4) {
        abt abtVar = (abt) view.getLayoutParams();
        Rect rect = abtVar.d;
        view.layout(i + rect.left + abtVar.leftMargin, i2 + rect.top + abtVar.topMargin, (i3 - rect.right) - abtVar.rightMargin, (i4 - rect.bottom) - abtVar.bottomMargin);
    }

    private final void k(View view, int i, boolean z) {
        acl Y = RecyclerView.Y(view);
        if (z || Y.p()) {
            this.q.f.g(Y);
        } else {
            this.q.f.h(Y);
        }
        abt abtVar = (abt) view.getLayoutParams();
        if (Y.i() || Y.g()) {
            if (Y.g()) {
                Y.h();
            } else {
                Y.j();
            }
            this.p.e(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.q) {
            int j = this.p.j(view);
            if (i == -1) {
                i = this.p.f();
            }
            if (j == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(view) + this.q.Sx());
            } else if (j != i) {
                abs absVar = this.q.l;
                View aK = absVar.aK(j);
                if (aK == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + absVar.q.toString());
                }
                absVar.aG(j);
                abt abtVar2 = (abt) aK.getLayoutParams();
                acl Y2 = RecyclerView.Y(aK);
                if (Y2.p()) {
                    absVar.q.f.g(Y2);
                } else {
                    absVar.q.f.h(Y2);
                }
                absVar.p.e(aK, i, abtVar2, Y2.p());
            }
        } else {
            this.p.b(view, i, false);
            abtVar.e = true;
            ach achVar = this.t;
            if (achVar != null && achVar.k && achVar.p(view) == achVar.n()) {
                achVar.l = view;
            }
        }
        if (abtVar.f) {
            Y.a.invalidate();
            abtVar.f = false;
        }
    }

    public Parcelable B() {
        return null;
    }

    public void C(Parcelable parcelable) {
    }

    public boolean D() {
        return false;
    }

    public boolean E() {
        throw null;
    }

    public View I(int i) {
        int aJ = aJ();
        for (int i2 = 0; i2 < aJ; i2++) {
            View aK = aK(i2);
            acl Y = RecyclerView.Y(aK);
            if (Y != null && Y.d() == i && !Y.c() && (this.q.J.g || !Y.p())) {
                return aK;
            }
        }
        return null;
    }

    public void O(int i) {
    }

    public int Q(aci aciVar) {
        return 0;
    }

    public int R(aci aciVar) {
        return 0;
    }

    public void RX(Rect rect, int i, int i2) {
        int width = rect.width();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int height = rect.height();
        int paddingTop = getPaddingTop();
        aY(at(i, width + paddingLeft + paddingRight, aZ()), at(i2, height + paddingTop + getPaddingBottom(), ba()));
    }

    public boolean RY() {
        return this.w;
    }

    public boolean RZ() {
        return false;
    }

    public int S(aci aciVar) {
        return 0;
    }

    public abt Sa(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof abt) {
            return new abt((abt) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new abt((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new abt(layoutParams);
    }

    public View Sb(View view, int i, aca acaVar, aci aciVar) {
        return null;
    }

    public void Sc(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.q;
        be(recyclerView.b, recyclerView.J, accessibilityEvent);
    }

    public void Sd(aca acaVar, aci aciVar, View view, pc pcVar) {
    }

    public int Se(aca acaVar, aci aciVar) {
        return -1;
    }

    public int Sf(aca acaVar, aci aciVar) {
        return -1;
    }

    public void Sg() {
    }

    public int T(aci aciVar) {
        return 0;
    }

    public int U(aci aciVar) {
        return 0;
    }

    public int V(aci aciVar) {
        return 0;
    }

    public void Y(String str) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.C(str);
        }
    }

    public final void aA(View view, int i) {
        k(view, i, true);
    }

    public final void aB(View view) {
        aC(view, -1);
    }

    public final void aC(View view, int i) {
        k(view, i, false);
    }

    public final void aD(int i) {
        if (aK(i) != null) {
            this.p.c(i);
        }
    }

    public final void aE() {
        int aJ = aJ();
        while (true) {
            aJ--;
            if (aJ >= 0) {
                this.p.c(aJ);
            } else {
                return;
            }
        }
    }

    public final View aF(View view) {
        View W;
        RecyclerView recyclerView = this.q;
        if (recyclerView == null || (W = recyclerView.W(view)) == null || this.p.k(W)) {
            return null;
        }
        return W;
    }

    public final void aG(int i) {
        aK(i);
        this.p.i(i);
    }

    public final void aH(View view, aca acaVar) {
        yo yoVar = this.p;
        int b = yoVar.c.b(view);
        if (b >= 0) {
            if (yoVar.a.f(b)) {
                yoVar.l(view);
            }
            yoVar.c.c(b);
        }
        acaVar.e(view);
    }

    public final void aI(int i, aca acaVar) {
        View aK = aK(i);
        aD(i);
        acaVar.e(aK);
    }

    public final int aJ() {
        yo yoVar = this.p;
        if (yoVar != null) {
            return yoVar.f();
        }
        return 0;
    }

    public final View aK(int i) {
        yo yoVar = this.p;
        if (yoVar != null) {
            return yoVar.d(i);
        }
        return null;
    }

    public final boolean aL() {
        RecyclerView recyclerView = this.q;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final View aM() {
        View focusedChild;
        RecyclerView recyclerView = this.q;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.p.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final int aN() {
        RecyclerView recyclerView = this.q;
        abg abgVar = recyclerView != null ? recyclerView.k : null;
        if (abgVar != null) {
            return abgVar.c();
        }
        return 0;
    }

    public void aO(int i) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            int f = recyclerView.e.f();
            for (int i2 = 0; i2 < f; i2++) {
                recyclerView.e.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aP(int i) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            int f = recyclerView.e.f();
            for (int i2 = 0; i2 < f; i2++) {
                recyclerView.e.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aQ(aca acaVar) {
        int aJ = aJ();
        while (true) {
            aJ--;
            if (aJ >= 0) {
                View aK = aK(aJ);
                acl Y = RecyclerView.Y(aK);
                if (!Y.c()) {
                    if (!Y.m() || Y.p() || this.q.k.c) {
                        aG(aJ);
                        acaVar.k(aK);
                        this.q.f.h(Y);
                    } else {
                        aD(aJ);
                        acaVar.h(Y);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void aR(aca acaVar) {
        int size = acaVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = acaVar.a.get(i).a;
            acl Y = RecyclerView.Y(view);
            if (!Y.c()) {
                Y.z(false);
                if (Y.r()) {
                    this.q.removeDetachedView(view, false);
                }
                abn abnVar = this.q.C;
                if (abnVar != null) {
                    abnVar.f(Y);
                }
                Y.z(true);
                acaVar.j(view);
            }
        }
        acaVar.a.clear();
        ArrayList<acl> arrayList = acaVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.q.invalidate();
        }
    }

    public boolean aS(View view, int i, int i2, abt abtVar) {
        return view.isLayoutRequested() || !this.x || !aT(view.getWidth(), i, abtVar.width) || !aT(view.getHeight(), i2, abtVar.height);
    }

    public final void aV(View view, Rect rect) {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.ae(view));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
        if ((r11.bottom - r3) > r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
        if (r3 != 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aW(android.support.v7.widget.RecyclerView r17, android.view.View r18, android.graphics.Rect r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r16.getPaddingLeft()
            int r5 = r16.getPaddingTop()
            int r6 = r0.D
            int r7 = r16.getPaddingRight()
            int r8 = r0.E
            int r9 = r16.getPaddingBottom()
            int r10 = r18.getLeft()
            int r11 = r2.left
            int r10 = r10 + r11
            int r11 = r18.getScrollX()
            int r10 = r10 - r11
            int r11 = r18.getTop()
            int r12 = r2.top
            int r11 = r11 + r12
            int r12 = r18.getScrollY()
            int r11 = r11 - r12
            int r12 = r19.width()
            int r2 = r19.height()
            int r4 = r10 - r4
            r13 = 0
            int r14 = java.lang.Math.min(r13, r4)
            int r5 = r11 - r5
            int r15 = java.lang.Math.min(r13, r5)
            int r10 = r10 + r12
            int r6 = r6 - r7
            int r10 = r10 - r6
            int r6 = java.lang.Math.max(r13, r10)
            int r11 = r11 + r2
            int r8 = r8 - r9
            int r11 = r11 - r8
            int r2 = java.lang.Math.max(r13, r11)
            int r7 = r16.ay()
            r8 = 1
            if (r7 != r8) goto L68
            if (r6 == 0) goto L63
            r14 = r6
            goto L6f
        L63:
            int r14 = java.lang.Math.max(r14, r10)
            goto L6f
        L68:
            if (r14 == 0) goto L6b
            goto L6f
        L6b:
            int r14 = java.lang.Math.min(r4, r6)
        L6f:
            if (r15 == 0) goto L72
            goto L76
        L72:
            int r15 = java.lang.Math.min(r5, r2)
        L76:
            r3[r13] = r14
            r3[r8] = r15
            r2 = r3[r13]
            r3 = r3[r8]
            if (r21 == 0) goto Lb8
            android.view.View r4 = r17.getFocusedChild()
            if (r4 != 0) goto L87
            goto Lbd
        L87:
            int r5 = r16.getPaddingLeft()
            int r6 = r16.getPaddingTop()
            int r7 = r0.D
            int r9 = r16.getPaddingRight()
            int r10 = r0.E
            int r11 = r16.getPaddingBottom()
            int r10 = r10 - r11
            android.support.v7.widget.RecyclerView r11 = r0.q
            android.graphics.Rect r11 = r11.i
            android.support.v7.widget.RecyclerView.ad(r4, r11)
            int r4 = r11.left
            int r4 = r4 - r2
            int r7 = r7 - r9
            if (r4 >= r7) goto Lbd
            int r4 = r11.right
            int r4 = r4 - r2
            if (r4 <= r5) goto Lbd
            int r4 = r11.top
            int r4 = r4 - r3
            if (r4 >= r10) goto Lbd
            int r4 = r11.bottom
            int r4 = r4 - r3
            if (r4 <= r6) goto Lbd
        Lb8:
            if (r2 != 0) goto Lbe
            if (r3 == 0) goto Lbd
            goto Lbf
        Lbd:
            return r13
        Lbe:
            r13 = r2
        Lbf:
            if (r20 == 0) goto Lc5
            r1.scrollBy(r13, r3)
            goto Lc8
        Lc5:
            r1.t(r13, r3)
        Lc8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abs.aW(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void aX(abg abgVar, abg abgVar2) {
    }

    public final void aY(int i, int i2) {
        this.q.setMeasuredDimension(i, i2);
    }

    public final int aZ() {
        return od.z(this.q);
    }

    public boolean aa() {
        return false;
    }

    public void ai(int i, zs zsVar) {
    }

    public void aj(int i, int i2, aci aciVar, zs zsVar) {
    }

    public void am(RecyclerView recyclerView) {
    }

    public void ao(RecyclerView recyclerView, int i) {
    }

    public final void ap(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.q = null;
            this.p = null;
            this.D = 0;
            this.E = 0;
        } else {
            this.q = recyclerView;
            this.p = recyclerView.e;
            this.D = recyclerView.getWidth();
            this.E = recyclerView.getHeight();
        }
        this.B = 1073741824;
        this.C = 1073741824;
    }

    public final void aq(int i, int i2) {
        this.D = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.B = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.D = 0;
        }
        this.E = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.C = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.E = 0;
    }

    public final void ar(int i, int i2) {
        int aJ = aJ();
        if (aJ != 0) {
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < aJ; i7++) {
                View aK = aK(i7);
                Rect rect = this.q.i;
                RecyclerView.ad(aK, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.q.i.set(i5, i6, i3, i4);
            RX(this.q.i, i, i2);
            return;
        }
        this.q.F(i, i2);
    }

    public final void as() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void au(RecyclerView recyclerView) {
        this.v = true;
        av(recyclerView);
    }

    public void av(RecyclerView recyclerView) {
    }

    public final void aw(ach achVar) {
        ach achVar2 = this.t;
        if (achVar2 != null && achVar != achVar2 && achVar2.k) {
            achVar2.m();
        }
        this.t = achVar;
        RecyclerView recyclerView = this.q;
        recyclerView.G.c();
        if (achVar.m) {
            String str = "An instance of " + achVar.getClass().getSimpleName() + " was started more than once. Each instance of" + achVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.";
        }
        achVar.h = recyclerView;
        achVar.i = this;
        int i = achVar.g;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        achVar.h.J.a = i;
        achVar.k = true;
        achVar.j = true;
        achVar.l = achVar.h.l.I(achVar.n());
        achVar.h.G.a();
        achVar.m = true;
    }

    public final boolean ax() {
        ach achVar = this.t;
        return achVar != null && achVar.k;
    }

    public final int ay() {
        return od.s(this.q);
    }

    public final void az(View view) {
        aA(view, -1);
    }

    public final int ba() {
        return od.A(this.q);
    }

    public void bb(int i) {
    }

    public final void bc(aca acaVar) {
        int aJ = aJ();
        while (true) {
            aJ--;
            if (aJ >= 0) {
                if (!RecyclerView.Y(aK(aJ)).c()) {
                    aI(aJ, acaVar);
                }
            } else {
                return;
            }
        }
    }

    public void bd(aca acaVar, aci aciVar, pc pcVar) {
        if (this.q.canScrollVertically(-1) || this.q.canScrollHorizontally(-1)) {
            pcVar.f(8192);
            pcVar.y(true);
        }
        if (this.q.canScrollVertically(1) || this.q.canScrollHorizontally(1)) {
            pcVar.f(4096);
            pcVar.y(true);
        }
        pcVar.H(oz.b(Se(acaVar, aciVar), Sf(acaVar, aciVar), 0));
    }

    public void be(aca acaVar, aci aciVar, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.q.canScrollVertically(-1) && !this.q.canScrollHorizontally(-1) && !this.q.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        abg abgVar = this.q.k;
        if (abgVar == null) {
            return;
        }
        accessibilityEvent.setItemCount(abgVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bf(View view, pc pcVar) {
        acl Y = RecyclerView.Y(view);
        if (Y == null || Y.p() || this.p.k(Y.a)) {
            return;
        }
        RecyclerView recyclerView = this.q;
        Sd(recyclerView.b, recyclerView.J, view, pcVar);
    }

    public final void bg() {
        this.u = true;
    }

    public final void bh(RecyclerView recyclerView) {
        aq(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void bp(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((abt) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.q != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.q.j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean bq(View view, boolean z) {
        boolean z2 = this.r.b(view) && this.s.b(view);
        return z ? z2 : !z2;
    }

    public void bt(View view) {
        abt abtVar = (abt) view.getLayoutParams();
        Rect ae = this.q.ae(view);
        int i = ae.left;
        int i2 = ae.right;
        int i3 = ae.top;
        int i4 = ae.bottom;
        int aU = aU(this.D, this.B, getPaddingLeft() + getPaddingRight() + abtVar.leftMargin + abtVar.rightMargin + i + i2, abtVar.width, D());
        int aU2 = aU(this.E, this.C, getPaddingTop() + getPaddingBottom() + abtVar.topMargin + abtVar.bottomMargin + i3 + i4, abtVar.height, E());
        if (aS(view, aU, aU2, abtVar)) {
            view.measure(aU, aU2);
        }
    }

    public boolean bu(ArrayList<View> arrayList, int i) {
        return false;
    }

    public void bv(int i) {
    }

    public void bw(aca acaVar, int i, int i2) {
        this.q.F(i, i2);
    }

    public boolean bx(RecyclerView recyclerView, View view) {
        return ax() || recyclerView.K();
    }

    public final void by(Runnable runnable) {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bz(RecyclerView recyclerView) {
        this.v = false;
        am(recyclerView);
    }

    public void d(aca acaVar, aci aciVar) {
        throw null;
    }

    public void e(aci aciVar) {
    }

    public abstract abt f();

    public abt g(Context context, AttributeSet attributeSet) {
        return new abt(context, attributeSet);
    }

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return od.x(recyclerView);
        }
        return 0;
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return od.w(recyclerView);
        }
        return 0;
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public boolean i(abt abtVar) {
        return abtVar != null;
    }

    public int m(int i, aca acaVar, aci aciVar) {
        return 0;
    }

    public int n(int i, aca acaVar, aci aciVar) {
        return 0;
    }

    public void u(int i, int i2) {
    }

    public void w(int i, int i2) {
    }

    public void x(int i, int i2) {
    }

    public void y(int i, int i2) {
        bv(i);
    }
}
