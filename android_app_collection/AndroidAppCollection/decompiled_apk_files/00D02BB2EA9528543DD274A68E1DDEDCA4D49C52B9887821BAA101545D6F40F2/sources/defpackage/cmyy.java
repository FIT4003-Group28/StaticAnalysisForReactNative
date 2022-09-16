package defpackage;

import android.app.Presentation;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.ar.core.ImageMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cmyy  reason: default package */
/* loaded from: classes.dex */
public final class cmyy extends Presentation {
    public final Rect A;
    public boolean B;
    public boolean C;
    public View D;
    public final Rect E;
    public final Queue<Runnable> F;
    public WeakReference<View> G;
    public final cmyw H;
    public final cmyx I;
    public cmxk J;
    private final boolean K;
    private boolean L;
    private final String M;
    private final ViewTreeObserver.OnGlobalLayoutListener N;
    private final ViewTreeObserver.OnGlobalFocusChangeListener O;
    private final ViewTreeObserver.OnGlobalFocusChangeListener P;
    private final ViewTreeObserver.OnGlobalFocusChangeListener Q;
    private final ViewTreeObserver.OnTouchModeChangeListener R;
    public View a;
    public boolean b;
    public final Pair<Integer, cnim> c;
    public final Pair<Integer, cnim> d;
    public final Pair<Integer, cnim> e;
    public boolean f;
    public final cniv g;
    public final boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public float q;
    public float r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public float z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cmyy(android.content.Context r5, android.view.Display r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.app.Service
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 3
            java.lang.String r2 = "CAR.PROJECTION.PRES"
            boolean r0 = defpackage.cmwk.a(r2, r0)
            if (r0 == 0) goto L10
            int r0 = defpackage.cnjc.a
        L10:
            r2 = 0
            goto L39
        L12:
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.Class r2 = r5.getClass()
            r0.<init>(r5, r2)
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L36
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r2.getServiceInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L36
            android.os.Bundle r0 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L36
            android.content.pm.ApplicationInfo r2 = r5.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L36
            int r2 = r2.theme     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L36
            if (r0 == 0) goto L39
            java.lang.String r3 = "android.app.theme"
            int r2 = r0.getInt(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L36
            goto L39
        L36:
            int r0 = defpackage.cnjc.a
            goto L10
        L39:
            r4.<init>(r5, r6, r2)
            r4.f = r1
            cniv r5 = new cniv
            r5.<init>()
            r4.g = r5
            r4.j = r1
            r5 = 1
            r4.k = r5
            r4.m = r1
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r4.A = r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r4.E = r5
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            r4.F = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r6 = 0
            r5.<init>(r6)
            r4.G = r5
            cmxg r5 = new cmxg
            r5.<init>()
            r4.H = r5
            cmyx r5 = new cmyx
            r5.<init>()
            r4.I = r5
            cmyn r5 = new cmyn
            r5.<init>(r4)
            r4.N = r5
            cmyo r5 = new cmyo
            r5.<init>(r4)
            r4.O = r5
            cmyp r5 = new cmyp
            r5.<init>(r4)
            r4.P = r5
            cmyq r5 = new cmyq
            r5.<init>(r4)
            r4.Q = r5
            cmyt r5 = new cmyt
            r5.<init>(r4)
            r4.R = r5
            cmxk r5 = r4.u(r1, r1)
            r4.J = r5
            r4.M = r7
            r4.h = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            android.util.Pair r5 = android.util.Pair.create(r5, r6)
            r4.c = r5
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.Pair r5 = android.util.Pair.create(r5, r6)
            r4.d = r5
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.Pair r5 = android.util.Pair.create(r5, r6)
            r4.e = r5
            android.view.Window r5 = r4.c()
            r6 = 2030(0x7ee, float:2.845E-42)
            r5.setType(r6)
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r5.addFlags(r6)
            r6 = 8
            r5.addFlags(r6)
            r4.K = r8
            if (r8 == 0) goto Le0
            r6 = 1024(0x400, float:1.435E-42)
            r5.addFlags(r6)
        Le0:
            r6 = 48
            r5.setSoftInputMode(r6)
            if (r9 == 0) goto Lea
            r4.o(r1)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmyy.<init>(android.content.Context, android.view.Display, java.lang.String, boolean, boolean):void");
    }

    public static boolean t(View view, ViewGroup viewGroup) {
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent == viewGroup) {
                return true;
            }
        }
        return false;
    }

    public static final void v(View view) {
        if (view.requestFocus() || !cmwk.a("CAR.PROJECTION.PRES", 5)) {
            return;
        }
        int i = cnjc.a;
    }

    public static final void w(View view, int i, Rect rect) {
        if (view.requestFocus(i, rect) || !cmwk.a("CAR.PROJECTION.PRES", 5)) {
            return;
        }
        int i2 = cnjc.a;
    }

    public static final void x(View view) {
        if (view.requestFocusFromTouch() || !cmwk.a("CAR.PROJECTION.PRES", 5)) {
            return;
        }
        int i = cnjc.a;
    }

    private final void y() {
        View view = this.a;
        if (view == null) {
            return;
        }
        view.setSystemUiVisibility(true != this.L ? 0 : 4);
    }

    private final boolean z(View view) {
        if (view != null && view != c().getDecorView()) {
            View decorView = c().getDecorView();
            if (decorView instanceof ViewGroup) {
                ArrayList<View> arrayList = new ArrayList<>();
                ((ViewGroup) decorView).addFocusables(arrayList, 0);
                if (arrayList.contains(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(Rect rect) {
        if (this.A.equals(rect)) {
            return;
        }
        this.A.set(rect);
    }

    public final void b(boolean z) {
        if (this.K) {
            return;
        }
        this.L = z;
        y();
    }

    public final Window c() {
        return (Window) Objects.requireNonNull(getWindow(), String.valueOf(this.M).concat(" getWindow() returned null"));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (!this.f) {
            super.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(boolean z) {
        int i = cnjc.a;
        this.i = z;
        ViewTreeObserver viewTreeObserver = c().getDecorView().getViewTreeObserver();
        if (viewTreeObserver != null) {
            if (z) {
                viewTreeObserver.addOnTouchModeChangeListener(this.R);
                if (this.t) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.N);
                    viewTreeObserver.addOnGlobalFocusChangeListener(this.O);
                    viewTreeObserver.addOnGlobalFocusChangeListener(this.P);
                    viewTreeObserver.addOnGlobalFocusChangeListener(this.Q);
                }
            } else {
                viewTreeObserver.removeOnTouchModeChangeListener(this.R);
                if (!this.t) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this.N);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.O);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.P);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.Q);
                return;
            }
        } else if (!z) {
            return;
        }
        if (!this.j) {
            if (this.k) {
                return;
            }
        } else if (this.h) {
            o(true);
        } else {
            m();
        }
        n(this.j, this.k);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (!this.f) {
            super.dismiss();
        }
    }

    public final void e() {
        f(getCurrentFocus());
    }

    public final void f(View view) {
        if (view == null) {
            return;
        }
        boolean z = false;
        if (view.isFocused() && this.j && this.o) {
            z = true;
        }
        if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
            int i = cnjc.a;
        }
        view.setHovered(z);
    }

    public final Pair<Integer, cnim> g(int i) {
        cmxk cmxkVar = this.J;
        View currentFocus = getCurrentFocus();
        cmxi cmxiVar = cmxkVar.b.get(i);
        if (cmxiVar != null) {
            if (i != cmxiVar.a || cmxiVar.c.get() != currentFocus || !cmxkVar.c(cmxiVar.b) || !cmxkVar.a.isEmpty()) {
                cmxkVar.a();
            } else {
                return Pair.create(-1, null);
            }
        }
        j();
        return Pair.create(-1, new cnim(i, this.E));
    }

    public final void h(MotionEvent motionEvent, int i, double d, double d2) {
        if (d != dcyn.a) {
            double d3 = this.q;
            double d4 = i;
            Double.isNaN(d4);
            Double.isNaN(d3);
            i((float) (d3 + (d4 * d)), motionEvent.getY());
        } else if (d2 == dcyn.a) {
        } else {
            float x = motionEvent.getX();
            double d5 = this.r;
            double d6 = i;
            Double.isNaN(d6);
            Double.isNaN(d5);
            i(x, (float) (d5 + (d6 * d2)));
        }
    }

    public final void i(float f, float f2) {
        this.q = f;
        this.r = f2;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    public final void j() {
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        int[] iArr = new int[2];
        currentFocus.getLocationInWindow(iArr);
        Rect rect = new Rect();
        currentFocus.getFocusedRect(rect);
        this.E.left = iArr[0] + rect.left;
        this.E.right = iArr[0] + rect.right;
        this.E.top = iArr[1] + rect.top;
        this.E.bottom = iArr[1] + rect.bottom;
    }

    public final void k(boolean z, boolean z2) {
        l(z, z2, -1, null);
    }

    public final void l(final boolean z, boolean z2, final int i, final Rect rect) {
        int i2 = cnjc.a;
        if (this.j == z) {
            return;
        }
        this.j = z;
        if (this.h) {
            boolean z3 = true;
            if (z && !z2) {
                z3 = false;
            }
            this.k = z3;
        } else {
            this.k = z2;
        }
        if (this.i) {
            cmwk.a("CAR.PROJECTION.PRES", 3);
            this.F.offer(new Runnable(this, z, i, rect) { // from class: cmys
                private final cmyy a;
                private final boolean b;
                private final int c;
                private final Rect d;

                {
                    this.a = this;
                    this.b = z;
                    this.c = i;
                    this.d = rect;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cmyy cmyyVar = this.a;
                    boolean z4 = this.b;
                    int i3 = this.c;
                    Rect rect2 = this.d;
                    if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                        int i4 = cnjc.a;
                    }
                    if (!z4) {
                        if (cmyyVar.t) {
                            cmyyVar.n = false;
                        }
                        if (!cmyyVar.h) {
                            return;
                        }
                        View currentFocus = cmyyVar.c().getCurrentFocus();
                        cmyyVar.o(false);
                        cmyyVar.I.a = new WeakReference<>(currentFocus);
                        return;
                    }
                    cmyyVar.s(true);
                    if (cmyyVar.t) {
                        if (rect2 == null) {
                            cmyyVar.n = false;
                            cmyyVar.J.a();
                        } else {
                            View decorView = cmyyVar.c().getDecorView();
                            if (decorView instanceof ViewGroup) {
                                decorView = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup) decorView, rect2, i3);
                            }
                            if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                                int i5 = cnjc.a;
                            }
                            cmyyVar.q(decorView, i3, rect2);
                            cmyyVar.n = true;
                            cmxk cmxkVar = cmyyVar.J;
                            View currentFocus2 = cmyyVar.getCurrentFocus();
                            int d = cmxk.d(i3);
                            cmxkVar.b.put(d, new cmxi(currentFocus2, d, SystemClock.elapsedRealtime()));
                            return;
                        }
                    }
                    if (cmyyVar.h) {
                        cmyyVar.I.a.clear();
                        cmyyVar.p(cmyyVar.I.a.get());
                        return;
                    }
                    cmyyVar.m();
                }
            });
            n(z, this.k);
        }
        if (!this.t) {
            return;
        }
        this.o = false;
        e();
    }

    public final void m() {
        View decorView = c().getDecorView();
        View findFocus = decorView.findFocus();
        if (findFocus == decorView) {
            if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                int i = cnjc.a;
            }
            p(decorView);
        } else if (!z(findFocus)) {
            if (!od.ao(decorView)) {
                if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                    int i2 = cnjc.a;
                }
                p(decorView);
            } else if (!cmwk.a("CAR.PROJECTION.PRES", 3)) {
            } else {
                int i3 = cnjc.a;
            }
        } else if (!cmwk.a("CAR.PROJECTION.PRES", 3)) {
        } else {
            int i4 = cnjc.a;
        }
    }

    public final void n(boolean z, boolean z2) {
        int i = cnjc.a;
        this.k = z2;
        try {
            c().setLocalFocus(z, z2);
        } catch (IllegalStateException unused) {
        }
    }

    public final void o(boolean z) {
        s(z);
        if (z) {
            p(null);
            return;
        }
        View currentFocus = c().getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        currentFocus.clearFocus();
    }

    @Override // android.app.Presentation, android.app.Dialog
    protected final void onStop() {
        this.F.clear();
        super.onStop();
    }

    public final void p(View view) {
        q(view, -1, null);
    }

    public final void q(View view, int i, Rect rect) {
        if (!z(view)) {
            view = c().getDecorView();
        }
        if (view == null) {
            if (!cmwk.a("CAR.PROJECTION.PRES", 5)) {
                return;
            }
            int i2 = cnjc.a;
            return;
        }
        if (this.t && view == c().getDecorView()) {
            r(view);
        }
        if (this.k && !view.isInTouchMode()) {
            if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                int i3 = cnjc.a;
            }
            x(view);
        } else if (i == -1 || rect == null) {
            if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                int i4 = cnjc.a;
            }
            v(view);
        } else {
            if (cmwk.a("CAR.PROJECTION.PRES", 3)) {
                int i5 = cnjc.a;
            }
            w(view, i, rect);
        }
    }

    public final void r(View view) {
        if (this.k) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).hasFocusable()) {
                    if (!view.isFocusable()) {
                        return;
                    }
                    view.setFocusable(false);
                    if (!cmwk.a("CAR.PROJECTION.PRES", 3)) {
                        return;
                    }
                    int i2 = cnjc.a;
                    return;
                }
            }
        }
        view.setFocusable(true);
        v(view);
        if (!cmwk.a("CAR.PROJECTION.PRES", 3)) {
            return;
        }
        int i3 = cnjc.a;
    }

    public final void s(boolean z) {
        View decorView = c().getDecorView();
        if (decorView instanceof ViewGroup) {
            ((ViewGroup) decorView).setDescendantFocusability(true != z ? ImageMetadata.HOT_PIXEL_MODE : 262144);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        if (this.D != view) {
            if (this.t) {
                this.g.b();
                this.J.a.clear();
            }
            this.D = view;
            this.a = new cmyv(this, getContext(), view);
            b((c().getAttributes().flags & 1024) != 0);
            y();
            super.setContentView(this.a);
            if (!this.t) {
                return;
            }
            this.g.a(c().getDecorView());
        }
    }

    @Override // android.app.Presentation, android.app.Dialog
    public final void show() {
        super.show();
        new cojb().post(new Runnable(this) { // from class: cmyr
            private final cmyy a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f = true;
            }
        });
    }

    public final cmxk u(int i, int i2) {
        return new cmxk(i, i2);
    }
}
