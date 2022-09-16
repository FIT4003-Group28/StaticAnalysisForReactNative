package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoViewTestHelper;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dci  reason: default package */
/* loaded from: classes3.dex */
public final class dci extends dbd {
    private static final String C = "dci";
    private static final int[] D = new int[2];
    public int A;
    public dcg B;
    private boolean E;
    private boolean F;
    private boolean G;
    private final AccessibilityManager H;
    private final dcf I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f173J;
    private Map K;
    private String L;
    private String M;
    public ComponentTree r;
    public final dcp s;
    public final cyv t;
    public final Rect u;
    public boolean v;
    public int w;
    public int x;
    public dch y;
    public ComponentTree z;

    public dci(Context context) {
        this(new cyv(context));
    }

    private static int O(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return mode == 0 ? i : View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - i2), mode);
    }

    private final void P() {
        ComponentTree componentTree = this.r;
        if (componentTree == null || componentTree.j) {
            return;
        }
        C(new Rect(0, 0, getWidth(), getHeight()));
    }

    private final void Q() {
        if (!this.E) {
            this.E = true;
            ComponentTree componentTree = this.r;
            if (componentTree != null) {
                componentTree.h();
            }
            p(cyf.b(getContext()));
            AccessibilityManager accessibilityManager = this.H;
            dcf dcfVar = this.I;
            if (dcfVar != null) {
                accessibilityManager.addAccessibilityStateChangeListener(new me(dcfVar));
            }
            if (L() || M() || N() || dfz.n) {
                return;
            }
            P();
        }
    }

    private final void R() {
        ComponentTree componentTree;
        if (this.E) {
            this.E = false;
            if (!L() && !dfz.n && (componentTree = this.r) != null && !componentTree.j) {
                C(new Rect());
            }
            this.s.o();
            ComponentTree componentTree2 = this.r;
            if (componentTree2 != null) {
                componentTree2.k();
            }
            AccessibilityManager accessibilityManager = this.H;
            dcf dcfVar = this.I;
            if (dcfVar == null) {
                return;
            }
            accessibilityManager.removeAccessibilityStateChangeListener(new me(dcfVar));
        }
    }

    private final void S() {
        if (this.r == null || !(getParent() instanceof View)) {
            return;
        }
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int translationX = (int) getTranslationX();
        int translationY = (int) getTranslationY();
        int top = getTop() + translationY;
        int bottom = getBottom() + translationY;
        int left = getLeft();
        int right = getRight() + translationX;
        if (left + translationX >= 0 && top >= 0 && right <= width && bottom <= height && this.u.width() == getWidth() && this.u.height() == getHeight()) {
            return;
        }
        Rect rect = new Rect();
        if (!getLocalVisibleRect(rect)) {
            return;
        }
        B(rect, true);
    }

    private static void T(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = componentHost.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof ComponentHost) {
                T((ComponentHost) childAt);
            }
        }
    }

    private static void U(String str, String str2, qxi qxiVar) {
        boolean z = qxiVar.d;
        int i = qxiVar.c;
        czq.b(str2, str);
    }

    public final void A() {
        ComponentTree componentTree = this.r;
        if (componentTree == null || componentTree.t == null) {
            return;
        }
        if (componentTree.j) {
            componentTree.l();
        } else if (!componentTree.k) {
        } else {
            Rect rect = new Rect();
            if (!getLocalVisibleRect(rect)) {
                rect.setEmpty();
            }
            C(rect);
        }
    }

    public final void B(Rect rect, boolean z) {
        ComponentTree componentTree = this.r;
        if (componentTree != null) {
            if (componentTree.t == null) {
                if (!isLayoutRequested()) {
                    throw new RuntimeException("Trying to incrementally mount a component with a null main thread LayoutState on a LithoView that hasn't requested layout!");
                }
            } else if (componentTree.j) {
                componentTree.n(rect, z);
            } else if (!z || !componentTree.k) {
            } else {
                C(rect);
            }
        }
    }

    final void C(Rect rect) {
        dbq dbqVar = this.r.t;
        if (dbqVar == null) {
            Log.w(C, "Main Thread Layout state is not found");
        } else {
            this.s.r(dbqVar, rect, M(), null);
        }
    }

    public final void D() {
        dcp dcpVar = this.s;
        long[] jArr = dcpVar.b;
        if (jArr == null) {
            return;
        }
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            dms g = dcpVar.g(i);
            if (g != null && !g.c) {
                cyr cyrVar = dbn.a(g).b;
                Object obj = g.a;
                dcpVar.i(cyrVar, obj);
                g.c = true;
                if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                    View view = (View) obj;
                    if (view.isLayoutRequested()) {
                        dcp.h(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
                    }
                }
            }
        }
        dcpVar.e = true;
    }

    public final void E() {
        ComponentTree componentTree = this.r;
        if (componentTree != null) {
            componentTree.o();
            this.r = null;
            this.M = "release_CT";
        }
    }

    public final void F() {
        this.B = null;
    }

    public final void G(ComponentTree componentTree) {
        Map map;
        if (!this.F) {
            String str = null;
            this.z = null;
            ComponentTree componentTree2 = this.r;
            if (componentTree2 == componentTree) {
                if (!this.E) {
                    return;
                }
                D();
                return;
            }
            boolean z = true;
            if (componentTree2 != null && componentTree != null && componentTree2.x == componentTree.x) {
                z = false;
            }
            this.G = z;
            I();
            if (this.r != null) {
                boolean z2 = dfz.a;
                this.s.j();
                if (this.K != null) {
                    this.L = this.r.f();
                }
                if (componentTree != null && componentTree.getLithoView() != null && (map = this.K) != null && map.containsKey("LithoView:SetAlreadyAttachedComponentTree")) {
                    ComponentTree componentTree3 = this.r;
                    qxi qxiVar = (qxi) this.K.get("LithoView:SetAlreadyAttachedComponentTree");
                    U(qxiVar.b + "-LithoView:SetAlreadyAttachedComponentTree, currentView=" + LithoViewTestHelper.a(componentTree3.getLithoView()) + ", newComponent.LV=" + LithoViewTestHelper.a(componentTree.getLithoView()) + ", currentComponent=" + componentTree3.f() + ", newComponent=" + componentTree.f(), "LithoView:SetAlreadyAttachedComponentTree", qxiVar);
                }
                if (this.E) {
                    this.r.k();
                }
                ComponentTree componentTree4 = this.r;
                if (!componentTree4.l) {
                    componentTree4.n = null;
                } else {
                    throw new IllegalStateException("Clearing the LithoView while the ComponentTree is attached");
                }
            }
            this.r = componentTree;
            if (componentTree != null) {
                if (componentTree.s()) {
                    String valueOf = String.valueOf(this.r.e());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Setting a released ComponentTree to a LithoView, released component was: ".concat(valueOf) : new String("Setting a released ComponentTree to a LithoView, released component was: "));
                }
                ComponentTree componentTree5 = this.r;
                dci dciVar = componentTree5.n;
                if (dciVar != this) {
                    if (dciVar != null) {
                        dciVar.G(null);
                    } else if (componentTree5.l) {
                        componentTree5.k();
                    }
                    cyv cyvVar = componentTree5.h;
                    if (cyvVar.b != cyvVar.a()) {
                        if (czu.a(getContext()) != czu.a(componentTree5.h.b)) {
                            String valueOf2 = String.valueOf(getContext());
                            String valueOf3 = String.valueOf(componentTree5.h.b);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 72 + String.valueOf(valueOf3).length());
                            sb.append("Base view context differs, view context is: ");
                            sb.append(valueOf2);
                            sb.append(", ComponentTree context is: ");
                            sb.append(valueOf3);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    componentTree5.n = this;
                }
                if (this.E) {
                    this.r.h();
                } else {
                    requestLayout();
                }
            }
            if (this.r == null) {
                str = "set_CT";
            }
            this.M = str;
            return;
        }
        throw new RuntimeException("Cannot update ComponentTree while in the middle of measure");
    }

    public final void H(List list) {
        if (list == null) {
            this.K = null;
            return;
        }
        this.K = new HashMap();
        int i = ((amxx) list).c;
        for (int i2 = 0; i2 < i; i2++) {
            qxi qxiVar = (qxi) list.get(i2);
            this.K.put(qxiVar.a, qxiVar);
        }
    }

    public final void I() {
        dcp dcpVar = this.s;
        dcpVar.c = true;
        dcpVar.g.setEmpty();
        this.u.setEmpty();
    }

    public final void J() {
        this.s.o();
    }

    public final boolean L() {
        ComponentTree componentTree = this.r;
        return componentTree != null && componentTree.j;
    }

    public final boolean M() {
        return this.s.c;
    }

    public final boolean N() {
        return this.s.d;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            super.draw(canvas);
        } catch (Throwable th) {
            ComponentTree componentTree = this.r;
            if (componentTree == null || componentTree.b() == null) {
                throw th;
            }
            throw new czm(this.r.b(), th, null);
        }
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        S();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01bc A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:24:0x0053, B:26:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006d, B:36:0x0071, B:38:0x0077, B:41:0x007e, B:43:0x0082, B:45:0x008a, B:48:0x0091, B:52:0x0097, B:54:0x00a4, B:56:0x00a8, B:57:0x00ad, B:59:0x00b1, B:61:0x00b9, B:64:0x00c0, B:66:0x00c6, B:68:0x00cc, B:70:0x00f7, B:72:0x00fd, B:74:0x0101, B:77:0x0106, B:84:0x0119, B:86:0x0121, B:87:0x0125, B:89:0x0129, B:90:0x0138, B:94:0x0145, B:97:0x014c, B:99:0x015d, B:101:0x016b, B:104:0x017b, B:102:0x0170, B:103:0x0177, B:81:0x010e, B:105:0x019d, B:107:0x01a1, B:109:0x01a5, B:111:0x01a9, B:113:0x01af, B:116:0x01b4, B:118:0x01bc, B:119:0x01bf, B:122:0x01ce, B:126:0x01de, B:5:0x0014, B:8:0x0019, B:12:0x0024, B:15:0x0029, B:17:0x003c, B:19:0x0043, B:21:0x0049, B:23:0x004f, B:18:0x0041, B:14:0x0027), top: B:134:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:24:0x0053, B:26:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006d, B:36:0x0071, B:38:0x0077, B:41:0x007e, B:43:0x0082, B:45:0x008a, B:48:0x0091, B:52:0x0097, B:54:0x00a4, B:56:0x00a8, B:57:0x00ad, B:59:0x00b1, B:61:0x00b9, B:64:0x00c0, B:66:0x00c6, B:68:0x00cc, B:70:0x00f7, B:72:0x00fd, B:74:0x0101, B:77:0x0106, B:84:0x0119, B:86:0x0121, B:87:0x0125, B:89:0x0129, B:90:0x0138, B:94:0x0145, B:97:0x014c, B:99:0x015d, B:101:0x016b, B:104:0x017b, B:102:0x0170, B:103:0x0177, B:81:0x010e, B:105:0x019d, B:107:0x01a1, B:109:0x01a5, B:111:0x01a9, B:113:0x01af, B:116:0x01b4, B:118:0x01bc, B:119:0x01bf, B:122:0x01ce, B:126:0x01de, B:5:0x0014, B:8:0x0019, B:12:0x0024, B:15:0x0029, B:17:0x003c, B:19:0x0043, B:21:0x0049, B:23:0x004f, B:18:0x0041, B:14:0x0027), top: B:134:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:24:0x0053, B:26:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006d, B:36:0x0071, B:38:0x0077, B:41:0x007e, B:43:0x0082, B:45:0x008a, B:48:0x0091, B:52:0x0097, B:54:0x00a4, B:56:0x00a8, B:57:0x00ad, B:59:0x00b1, B:61:0x00b9, B:64:0x00c0, B:66:0x00c6, B:68:0x00cc, B:70:0x00f7, B:72:0x00fd, B:74:0x0101, B:77:0x0106, B:84:0x0119, B:86:0x0121, B:87:0x0125, B:89:0x0129, B:90:0x0138, B:94:0x0145, B:97:0x014c, B:99:0x015d, B:101:0x016b, B:104:0x017b, B:102:0x0170, B:103:0x0177, B:81:0x010e, B:105:0x019d, B:107:0x01a1, B:109:0x01a5, B:111:0x01a9, B:113:0x01af, B:116:0x01b4, B:118:0x01bc, B:119:0x01bf, B:122:0x01ce, B:126:0x01de, B:5:0x0014, B:8:0x0019, B:12:0x0024, B:15:0x0029, B:17:0x003c, B:19:0x0043, B:21:0x0049, B:23:0x004f, B:18:0x0041, B:14:0x0027), top: B:134:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:24:0x0053, B:26:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006d, B:36:0x0071, B:38:0x0077, B:41:0x007e, B:43:0x0082, B:45:0x008a, B:48:0x0091, B:52:0x0097, B:54:0x00a4, B:56:0x00a8, B:57:0x00ad, B:59:0x00b1, B:61:0x00b9, B:64:0x00c0, B:66:0x00c6, B:68:0x00cc, B:70:0x00f7, B:72:0x00fd, B:74:0x0101, B:77:0x0106, B:84:0x0119, B:86:0x0121, B:87:0x0125, B:89:0x0129, B:90:0x0138, B:94:0x0145, B:97:0x014c, B:99:0x015d, B:101:0x016b, B:104:0x017b, B:102:0x0170, B:103:0x0177, B:81:0x010e, B:105:0x019d, B:107:0x01a1, B:109:0x01a5, B:111:0x01a9, B:113:0x01af, B:116:0x01b4, B:118:0x01bc, B:119:0x01bf, B:122:0x01ce, B:126:0x01de, B:5:0x0014, B:8:0x0019, B:12:0x0024, B:15:0x0029, B:17:0x003c, B:19:0x0043, B:21:0x0049, B:23:0x004f, B:18:0x0041, B:14:0x0027), top: B:134:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:24:0x0053, B:26:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006d, B:36:0x0071, B:38:0x0077, B:41:0x007e, B:43:0x0082, B:45:0x008a, B:48:0x0091, B:52:0x0097, B:54:0x00a4, B:56:0x00a8, B:57:0x00ad, B:59:0x00b1, B:61:0x00b9, B:64:0x00c0, B:66:0x00c6, B:68:0x00cc, B:70:0x00f7, B:72:0x00fd, B:74:0x0101, B:77:0x0106, B:84:0x0119, B:86:0x0121, B:87:0x0125, B:89:0x0129, B:90:0x0138, B:94:0x0145, B:97:0x014c, B:99:0x015d, B:101:0x016b, B:104:0x017b, B:102:0x0170, B:103:0x0177, B:81:0x010e, B:105:0x019d, B:107:0x01a1, B:109:0x01a5, B:111:0x01a9, B:113:0x01af, B:116:0x01b4, B:118:0x01bc, B:119:0x01bf, B:122:0x01ce, B:126:0x01de, B:5:0x0014, B:8:0x0019, B:12:0x0024, B:15:0x0029, B:17:0x003c, B:19:0x0043, B:21:0x0049, B:23:0x004f, B:18:0x0041, B:14:0x0027), top: B:134:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7 A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:24:0x0053, B:26:0x0059, B:32:0x0065, B:33:0x0069, B:35:0x006d, B:36:0x0071, B:38:0x0077, B:41:0x007e, B:43:0x0082, B:45:0x008a, B:48:0x0091, B:52:0x0097, B:54:0x00a4, B:56:0x00a8, B:57:0x00ad, B:59:0x00b1, B:61:0x00b9, B:64:0x00c0, B:66:0x00c6, B:68:0x00cc, B:70:0x00f7, B:72:0x00fd, B:74:0x0101, B:77:0x0106, B:84:0x0119, B:86:0x0121, B:87:0x0125, B:89:0x0129, B:90:0x0138, B:94:0x0145, B:97:0x014c, B:99:0x015d, B:101:0x016b, B:104:0x017b, B:102:0x0170, B:103:0x0177, B:81:0x010e, B:105:0x019d, B:107:0x01a1, B:109:0x01a5, B:111:0x01a9, B:113:0x01af, B:116:0x01b4, B:118:0x01bc, B:119:0x01bf, B:122:0x01ce, B:126:0x01de, B:5:0x0014, B:8:0x0019, B:12:0x0024, B:15:0x0029, B:17:0x003c, B:19:0x0043, B:21:0x0049, B:23:0x004f, B:18:0x0041, B:14:0x0027), top: B:134:0x0000, inners: #0 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dci.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        R();
    }

    @Override // android.view.View
    public final void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        if (z) {
            if (this.A == 0 && this.r != null) {
                B(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            this.A++;
            return;
        }
        int i = this.A - 1;
        this.A = i;
        if (i == 0 && this.r != null) {
            A();
        }
        if (this.A >= 0) {
            return;
        }
        this.A = 0;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        if (f == getTranslationX()) {
            return;
        }
        super.setTranslationX(f);
        S();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f == getTranslationY()) {
            return;
        }
        super.setTranslationY(f);
        S();
    }

    @Override // android.view.View
    public final String toString() {
        return LithoViewTestHelper.viewToString(this, true);
    }

    @Override // com.facebook.litho.ComponentHost
    protected final boolean x() {
        ComponentTree componentTree = this.r;
        if (componentTree == null || !componentTree.i) {
            return super.x();
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.litho.ComponentHost
    public final void y(int i, int i2, int i3, int i4) {
        char c;
        ComponentTree componentTree = this.r;
        if (componentTree != null) {
            if (componentTree.s()) {
                throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
            }
            int i5 = i4 - i2;
            if (i5 >= 4096 || i3 - i >= 4096) {
                String str = Build.MODEL;
                switch (str.hashCode()) {
                    case -399073275:
                        if (str.equals("SM-J415F")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -399073274:
                        if (str.equals("SM-J415G")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -399013848:
                        if (str.equals("SM-J610F")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -399013847:
                        if (str.equals("SM-J610G")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 513630441:
                        if (str.equals("SM-J415FN")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 515472678:
                        if (str.equals("SM-J610FN")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) {
                    int i6 = i3 - i;
                    String o = this.r.b() != null ? this.r.b().o() : null;
                    StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 101);
                    sb.append("LithoView has measured greater than 4096 in one dimension. Size: ");
                    sb.append(i6);
                    sb.append("x");
                    sb.append(i5);
                    sb.append(", component: ");
                    sb.append(o);
                    czq.b("TextureTooBig", sb.toString());
                }
            }
            if (this.f173J || this.r.t == null) {
                this.r.m(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, (i5 - getPaddingTop()) - getPaddingBottom()), 1073741824), D, false);
                this.G = false;
                this.f173J = false;
            }
            boolean t = this.r.t();
            if (t && !L() && !dfz.n) {
                P();
            }
            if (!t) {
                A();
            }
            if (t) {
                return;
            }
            T(this);
        }
    }

    @Override // defpackage.dbd
    public final boolean z() {
        if (hasTransientState()) {
            return true;
        }
        if (!(getParent() instanceof View)) {
            return false;
        }
        return ((View) getParent()).hasTransientState();
    }

    public dci(cyv cyvVar) {
        super(cyvVar);
        this.u = new Rect();
        this.F = false;
        this.G = false;
        this.w = -1;
        this.x = -1;
        new Rect();
        this.y = null;
        this.I = new dcf(this);
        this.t = cyvVar;
        boolean z = dfz.a;
        this.s = new dcp(this);
        this.H = (AccessibilityManager) cyvVar.b.getSystemService("accessibility");
    }

    public Deque findTestItems(String str) {
        Map map = this.s.a;
        if (map == null) {
            throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
        }
        Deque deque = (Deque) map.get(str);
        return deque == null ? new LinkedList() : deque;
    }

    public final void K() {
        dcp dcpVar = this.s;
        long[] jArr = dcpVar.b;
        if (jArr != null) {
            int length = jArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                dcpVar.p(length, dcpVar.f);
            }
            dcpVar.g.setEmpty();
            dcpVar.d = true;
            dqt dqtVar = dcpVar.o;
            dqt dqtVar2 = dcpVar.n;
            deu deuVar = dcpVar.m;
            if (deuVar != null) {
                deuVar.b.setEmpty();
            }
            dcpVar.j();
        }
        this.u.setEmpty();
    }
}
