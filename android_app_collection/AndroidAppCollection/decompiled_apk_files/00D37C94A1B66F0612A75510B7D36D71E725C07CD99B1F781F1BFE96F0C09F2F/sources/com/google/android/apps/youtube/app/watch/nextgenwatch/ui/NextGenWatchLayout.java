package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll.WatchOverscrollBehavior;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NextGenWatchLayout extends nzc implements nxd, nvz, nqw {
    nzp A;
    nzs B;
    public nxk C;
    public boolean D;
    public final nzr E;
    public boolean F;
    public boolean G;
    public aacz H;
    private final azpa I;

    /* renamed from: J  reason: collision with root package name */
    private final int f153J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private View P;
    private View Q;
    private ArrayList R;
    private nzu S;
    private nzv T;
    private WatchOverscrollBehavior U;
    private final yzl V;
    private boolean W;
    public final fqo a;
    private int aa;
    private int ab;
    private int ac;
    private final Point ad;
    private boolean ae;
    private final Paint af;
    public gcf b;
    public nzy c;
    public acti d;
    public oah e;
    public aynx f;
    public nyv g;
    public UpForFullController h;
    public FullscreenExitController i;
    public nml j;
    public ghs k;
    public oad l;
    public WatchEngagementPanelViewContainerController m;
    public nxf n;
    public aadd o;
    public khy p;
    public boolean q;
    public final int r;
    public View s;
    public View t;
    public View u;
    public azqb v;
    public RelativeLayout w;
    public RelativeLayout x;
    public final ArrayList y;
    public nzq z;

    public NextGenWatchLayout(Context context) {
        this(context, null);
    }

    private final void A() {
        boolean g = this.c.a.g();
        zag.o(this.s, g);
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            zag.o((View) this.y.get(i), g);
        }
        zag.o(this.t, this.c.o());
        zag.o(this.u, nzy.q(this.c.c().n()));
        zag.o(this.P, this.c.m());
        zag.o((View) this.v.get(), this.c.m());
        if (this.c.p()) {
            if (zew.y(getContext())) {
                View view = this.Q;
                if ((view instanceof ViewStub) && (view.getParent() instanceof ViewGroup)) {
                    View inflate = ((ViewStub) this.Q).inflate();
                    this.Q = inflate;
                    this.a.c((ViewGroup) inflate);
                }
            }
            if (!this.a.d()) {
                View view2 = this.Q;
                if (!(view2 instanceof ViewStub) && view2 != null) {
                    this.a.c((ViewGroup) view2);
                }
            }
        }
        View view3 = this.Q;
        if (view3 == null || (view3 instanceof ViewStub)) {
            return;
        }
        zag.o(view3, this.c.p());
    }

    private final void B(int i) {
        int h = h(i);
        i(nys.a(h), h);
    }

    private final boolean C() {
        nyv nyvVar = this.g;
        return (nyvVar.a() && nyvVar.a.s() && !nyvVar.f.e && !nyvVar.g) || this.c.f() || this.c.t();
    }

    private final boolean D(Canvas canvas, View view, long j) {
        nzr nzrVar = this.E;
        if (view == nzrVar.c.t && view.getVisibility() == 0) {
            if (!nzrVar.c.r()) {
                nzrVar.b.draw(canvas);
            }
            nzrVar.a.draw(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    private final boolean E() {
        return this.aa != 0;
    }

    private final boolean F() {
        nxk nxkVar = this.C;
        return nxkVar != null && nxkVar.e();
    }

    private final boolean G() {
        return lj.e(this) == 1;
    }

    private final boolean H(int i, int i2) {
        this.c.j(this);
        nzy nzyVar = this.c;
        boolean G = G();
        nwz nwzVar = nzyVar.f;
        if (nwzVar != null) {
            nwzVar.c(G);
        }
        for (int i3 = 0; i3 < nzyVar.b.size(); i3++) {
            ((nwz) nzyVar.b.valueAt(i3)).c(G);
        }
        nzy nzyVar2 = this.c;
        boolean z = true;
        if (i == nzyVar2.d && i2 == nzyVar2.e) {
            z = false;
        }
        nzyVar2.d = i;
        nzyVar2.e = i2;
        nwz nwzVar2 = nzyVar2.f;
        if (nwzVar2 != null) {
            nwzVar2.z(i, i2);
        }
        if (nzyVar2.f == null) {
            for (int i4 = 0; i4 < nzyVar2.b.size(); i4++) {
                ((nwz) nzyVar2.b.valueAt(i4)).z(nzyVar2.d, nzyVar2.e);
            }
        }
        this.c.e(this);
        return z;
    }

    static void o(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        if (!z && view.getVisibility() == 8) {
            return;
        }
        view.layout(i, i2, i3, i4);
    }

    private final float s() {
        int c;
        int t = t();
        int min = Math.min(0, t);
        int max = Math.max(0, t);
        int i = this.aa;
        if (i == 1) {
            c = akf.c(this.ac, min, max);
            this.ac = c;
        } else if (i != 2) {
            return 0.0f;
        } else {
            c = akf.c(this.ab, min, max);
            this.ab = c;
        }
        return c / t;
    }

    private final int t() {
        int i;
        int i2;
        nxk nxkVar = this.C;
        int i3 = 0;
        if (nxkVar == null) {
            return 0;
        }
        int i4 = this.aa;
        if (i4 == 2) {
            int a = nxkVar.a(2);
            return G() ? -a : a;
        }
        if (i4 == 1) {
            i3 = nxkVar.a(1);
            if (this.g.a() && this.c.s() && !this.c.l() && (i2 = nxkVar.c) != 128 && i2 != 512) {
                return -i3;
            }
            if (this.h.g() && this.c.t() && ((i = nxkVar.c) == 1 || i == 256)) {
                return -i3;
            }
        }
        return i3;
    }

    private final nxk w() {
        nxk nxkVar = this.C;
        nxkVar.getClass();
        return nxkVar;
    }

    private final void x(boolean z) {
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
    }

    private final void y(nxk nxkVar) {
        nxk nxkVar2 = this.C;
        if (nxkVar2 != null) {
            nxkVar2.c();
        }
        this.C = nxkVar;
        this.c.k(nxkVar.d);
        this.C.getClass();
    }

    private final void z(int i, MotionEvent motionEvent) {
        nxk nxkVar;
        int i2;
        actj actjVar;
        int i3;
        if (!E()) {
            return;
        }
        x(false);
        if (this.C != null && !F()) {
            float s = s();
            boolean z = i != 1 ? !(i != 2 || t() >= 0) : t() > 0;
            int i4 = w().c;
            if ((i4 != 128 && i4 != 512 && i4 != 1 && i4 != 256 && (z || s > 0.5f)) || this.g.b(this.ac) || this.h.h(-this.V.b(motionEvent))) {
                int a = nys.a(i4);
                if (a != this.c.b()) {
                    if (a == 2 || a == 1 || a == 3) {
                        if (a == 2) {
                            actjVar = actj.WATCH_MINIMIZE_BUTTON;
                        } else {
                            nxk nxkVar2 = this.C;
                            if (nxkVar2 != null && nxkVar2.c == 128) {
                                actjVar = actj.FULLSCREEN_WATCH_SWIPE_CLOSE_BUTTON;
                            } else if (nxkVar2 != null && nxkVar2.c == 512) {
                                actjVar = actj.FULLSCREEN_WATCH_SWIPE_CLOSE_BUTTON;
                            } else if (nxkVar2 == null || ((i3 = nxkVar2.c) != 256 && i3 != 1)) {
                                actjVar = actj.MINI_PLAYER_EXPAND_BUTTON;
                            } else {
                                actjVar = actj.UP_FOR_FULL;
                            }
                        }
                        this.d.D(new acte(actjVar));
                        this.d.H(65, new acte(actjVar), null);
                    } else if (a == 0) {
                        this.d.H(3, new acte(actj.MINI_PLAYER_DISMISSAL_BUTTON), null);
                    }
                }
                nxk nxkVar3 = this.C;
                if (nxkVar3 == null || nxkVar3.c != 256 || !this.h.h(this.ac)) {
                    if (this.g.b(this.ac) && (nxkVar = this.C) != null && ((i2 = nxkVar.c) == 128 || i2 == 512)) {
                        if (!this.c.l()) {
                            nxk nxkVar4 = this.C;
                            nxkVar4.getClass();
                            int h = h(4);
                            y(new nxk(this, nxkVar4.c, h, nxkVar4.d, this.c.d(nys.a(h)), this.e, this.f, this.o));
                            s = 0.0f;
                        }
                    }
                    w().f(s, new nzw(this));
                }
                s = 1.0f;
                w().f(s, new nzw(this));
            } else {
                nxk w = w();
                w.b();
                View view = w.a;
                int i5 = w.c;
                int i6 = w.b;
                nxn nxnVar = w.d;
                nxnVar.b();
                this.C = new nxk(view, i5, i6, nxnVar, w.f);
                w().f(1.0f - s, new nzw(this));
            }
        }
        this.aa = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        super.addChildrenForAccessibility(arrayList);
        if (this.c.f() || this.c.r()) {
            return;
        }
        Collections.sort(arrayList, new Comparator() { // from class: nzj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                View view = (View) obj;
                View view2 = (View) obj2;
                View view3 = NextGenWatchLayout.this.s;
                if (view != view3) {
                    if (view2 == view3) {
                        return 1;
                    }
                    if (!(view instanceof InlineTimeBarWrapper)) {
                        return view2 instanceof InlineTimeBarWrapper ? 1 : 0;
                    }
                }
                return -1;
            }
        });
    }

    @Override // defpackage.nvz
    public final View b() {
        return this.t;
    }

    @Override // defpackage.nvz
    public final View c() {
        return this.u;
    }

    @Override // defpackage.nvz
    public final void d(nxd nxdVar) {
        this.c.e(nxdVar);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        Rect c;
        float a;
        if (view == this.t) {
            int save = canvas.save();
            boolean D = D(canvas, view, j);
            canvas.restoreToCount(save);
            return D;
        } else if (view == this.P || view == this.Q || view == this.v.get()) {
            if (view == this.Q) {
                c = this.T.c();
            } else if (view == this.v.get()) {
                c = this.z.c();
            } else if (view == this.w) {
                c = this.A.c();
            } else {
                c = this.S.c();
            }
            if (view == this.Q) {
                a = this.T.a();
            } else if (view == this.v) {
                a = this.z.a();
            } else if (view == this.w) {
                a = this.A.a();
            } else {
                a = this.S.a();
            }
            int save2 = canvas.save();
            canvas.clipRect(c);
            if (view != this.v.get() && r() && a > 0.0f && a < 1.0f) {
                canvas.drawRect(c, this.af);
            }
            boolean D2 = D(canvas, view, j);
            canvas.restoreToCount(save2);
            return D2;
        } else {
            return D(canvas, view, j);
        }
    }

    final int h(int i) {
        if (C() && i != 0) {
            if (!this.c.t() || i != 4) {
                int i2 = 1;
                if (this.h.g() && this.c.t() && this.W && i == 2) {
                    asxp asxpVar = this.h.a.a().e;
                    if (asxpVar == null) {
                        asxpVar = asxp.a;
                    }
                    return asxpVar.aH ? 256 : 1;
                }
                nxk nxkVar = this.C;
                if (nxkVar == null || nxkVar.c != 256) {
                    if (this.c.f()) {
                        nzr nzrVar = this.E;
                        if (i != 2) {
                            return i == 4 ? 16 : 0;
                        }
                        NextGenWatchLayout nextGenWatchLayout = nzrVar.c;
                        if (true != nextGenWatchLayout.b.h()) {
                            i2 = 3;
                        }
                        return nextGenWatchLayout.k(i2);
                    }
                    nxk nxkVar2 = this.C;
                    if (nxkVar2 == null || nxkVar2.c != 128) {
                        if (nxkVar2 == null || nxkVar2.c != 512) {
                            if (this.g.a() && this.c.s() && i == 4) {
                                return this.i.b ? 512 : 128;
                            }
                        } else {
                            return k(0);
                        }
                    } else {
                        return k(1);
                    }
                } else {
                    return k(3);
                }
            } else {
                return k(2);
            }
        }
        return 0;
    }

    public final int i(int i, int i2) {
        int b = this.c.b();
        int k = k(b);
        if (!nys.b(k, i2)) {
            return 2;
        }
        return j(b, k, i, i2);
    }

    public final int j(int i, int i2, int i3, int i4) {
        nxk nxkVar = this.C;
        if (nxkVar != null) {
            nxkVar.b();
            if (nxkVar.b == i2 && nxkVar.c == i4) {
                return 1;
            }
        }
        y(new nxk(this, i2, i4, this.c.d(i), this.c.d(i3), this.e, this.f, this.o));
        return 0;
    }

    public final int k(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.E.c.r() ? 64 : 4;
            } else if (i == 3) {
                return 1;
            } else {
                return i != 4 ? 16 : 8;
            }
        }
        return 2;
    }

    public final FlexyBehavior l() {
        nuw m = m();
        if (m != null) {
            return m.d;
        }
        return null;
    }

    public final nuw m() {
        nxe b = nwz.b(this.c.d(1));
        if (b instanceof nuw) {
            return (nuw) b;
        }
        if (!(b instanceof nxb)) {
            return null;
        }
        nxb nxbVar = (nxb) b;
        nxe nxeVar = nxbVar.a;
        if (!(nxeVar instanceof nuw)) {
            nxe nxeVar2 = nxbVar.b;
            if (!(nxeVar2 instanceof nuw)) {
                return null;
            }
            return (nuw) nxeVar2;
        }
        return (nuw) nxeVar;
    }

    public final void n() {
        super.bringChildToFront(this.t);
        super.bringChildToFront(this.s);
        super.bringChildToFront(this.P);
        View view = this.Q;
        if (view instanceof ViewStub) {
            super.bringChildToFront(view);
        }
        if (!this.D) {
            super.bringChildToFront((View) this.v.get());
        }
        int size = this.y.size();
        for (int i = 0; i < size; i++) {
            super.bringChildToFront((View) this.y.get(i));
        }
        if (this.D) {
            super.bringChildToFront((View) this.v.get());
        }
        super.bringChildToFront(this.u);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jfw.k();
        nzy nzyVar = this.c;
        nwz nwzVar = nzyVar.f;
        if (nwzVar != null) {
            nwzVar.x();
        }
        for (int i = 0; i < nzyVar.b.size(); i++) {
            ((nwz) nzyVar.b.get(i)).x();
        }
        final oad oadVar = this.l;
        oadVar.c.d(aynx.e(oadVar.b.a(), oadVar.a.h().i(aynq.LATEST), nti.f).n().Z(new ayqb() { // from class: oab
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                View view = oad.this.d;
                if (view == null) {
                    return;
                }
                view.setClickable(bool.booleanValue());
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jfw.k();
        nzy nzyVar = this.c;
        nwz nwzVar = nzyVar.f;
        if (nwzVar != null) {
            nwzVar.y();
        }
        for (int i = 0; i < nzyVar.b.size(); i++) {
            ((nwz) nzyVar.b.get(i)).y();
        }
        this.l.c.c();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.s = findViewById(this.f153J);
        this.P = findViewById(this.M);
        this.Q = findViewById(this.N);
        this.t = findViewById(this.K);
        this.v = new nzl(this);
        this.s.setFocusableInTouchMode(true);
        lj.M(this.s, new nzm(this));
        this.u = findViewById(this.L);
        this.S = new nzu(this.c, this.P);
        this.T = new nzv(this.c, this.a);
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        arrayList.add(this.S);
        this.R.add(this.T);
        nzq nzqVar = new nzq(this.c, (View) this.v.get());
        this.z = nzqVar;
        this.R.add(nzqVar);
        final nzp nzpVar = new nzp(this, this.c, this.w);
        aynx.e(nzpVar.c.j.h().m, nzpVar.c.k.a, nti.e).Z(new ayqb() { // from class: nzo
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nzp nzpVar2 = nzp.this;
                Pair pair = (Pair) obj;
                nzpVar2.a = ((Integer) pair.first).intValue();
                nzpVar2.b = ((Boolean) pair.second).booleanValue();
                nzpVar2.f();
                RelativeLayout relativeLayout = nzpVar2.c.w;
                if (relativeLayout != null) {
                    relativeLayout.requestLayout();
                }
            }
        });
        this.A = nzpVar;
        this.R.add(nzpVar);
        nzs nzsVar = new nzs(this, this.c, this.x);
        this.B = nzsVar;
        this.R.add(nzsVar);
        FlexyBehavior l = l();
        if (l != null) {
            nml nmlVar = (nml) this.n.a.get();
            nmlVar.getClass();
            this.U = new WatchOverscrollBehavior(nmlVar, l);
        }
        this.j.h().m.C(new ayqe() { // from class: nzh
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() < NextGenWatchLayout.this.c.a().height());
            }
        }).n().Z(new ayqb() { // from class: nzg
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                NextGenWatchLayout nextGenWatchLayout = NextGenWatchLayout.this;
                nextGenWatchLayout.D = ((Boolean) obj).booleanValue();
                nextGenWatchLayout.q();
            }
        });
        View findViewById = findViewById(this.O);
        khy khyVar = this.p;
        if (khyVar.i && (findViewById instanceof ViewStub)) {
            this.y.add(khyVar.f((ViewStub) findViewById, lws.r));
        }
        nzr nzrVar = this.E;
        NextGenWatchLayout nextGenWatchLayout = nzrVar.c;
        View view = nextGenWatchLayout.t;
        if (view instanceof ViewStub) {
            nextGenWatchLayout.t = ((ViewStub) view).inflate();
        }
        NextGenWatchLayout nextGenWatchLayout2 = nzrVar.c;
        View view2 = nextGenWatchLayout2.u;
        if (view2 instanceof ViewStub) {
            nextGenWatchLayout2.u = ((ViewStub) view2).inflate();
        }
        n();
        A();
        oad oadVar = this.l;
        View view3 = this.s;
        oadVar.d = view3;
        lj.M(view3, new oac(oadVar, view3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r10.A.c().contains(r0, r1) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
        if (r2 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (r6.y > r7.a) goto L38;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c.r()) {
            return;
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            nzn nznVar = (nzn) arrayList.get(i5);
            if (nznVar.g()) {
                Rect b = nznVar.b();
                if (b.width() > 0 && b.height() > 0) {
                    nznVar.e().layout(0, 0, b.width(), b.height());
                }
                nznVar.f();
                nznVar.e().setAlpha(nznVar.a());
            }
        }
        nxe c = this.c.c();
        Rect t = c.t();
        o(this.s, z, t.left, t.top, t.left + this.s.getMeasuredWidth(), t.top + this.s.getMeasuredHeight());
        int size2 = this.y.size();
        for (int i6 = 0; i6 < size2; i6++) {
            View view = (View) this.y.get(i6);
            o(view, z, t.left, t.top, t.left + view.getMeasuredWidth(), t.top + view.getMeasuredHeight());
        }
        if (this.c.o()) {
            Rect s = c.s();
            o(this.t, z, s.left, s.top, s.left + this.t.getMeasuredWidth(), s.top + this.t.getMeasuredHeight());
        }
        nzr nzrVar = this.E;
        if (!nzrVar.c.r()) {
            Rect s2 = c.s();
            o(nzrVar.c.u, true, s2.left, s2.top, s2.left + nzrVar.c.u.getMeasuredWidth(), s2.top + nzrVar.c.u.getMeasuredHeight());
            return;
        }
        Rect t2 = c.t();
        o(nzrVar.c.u, true, t2.left, t2.top, t2.left + nzrVar.c.u.getMeasuredWidth(), t2.top + nzrVar.c.u.getMeasuredHeight());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Rect s;
        View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
        boolean H = H(size2, size);
        A();
        if (!this.c.r() || H) {
            ArrayList arrayList = this.R;
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                nzn nznVar = (nzn) arrayList.get(i3);
                if (nznVar.g()) {
                    Rect b = nznVar.b();
                    nznVar.e().measure(View.MeasureSpec.makeMeasureSpec(b.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(b.height(), 1073741824));
                }
            }
            nxe c = this.c.c();
            if (this.c.o()) {
                Rect s2 = c.s();
                this.t.measure(View.MeasureSpec.makeMeasureSpec(s2.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(s2.height(), 1073741824));
                nzr nzrVar = this.E;
                if (nzrVar.c.r()) {
                    s = c.t();
                } else {
                    s = c.s();
                }
                nzrVar.c.u.measure(View.MeasureSpec.makeMeasureSpec(s.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(s.height(), 1073741824));
            }
            Rect t = c.t();
            int width = t.width();
            int height = t.height();
            this.s.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            int size4 = this.y.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((View) this.y.get(i4)).measure(View.MeasureSpec.makeMeasureSpec(width, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(height, CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        H(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r0.c == 1) goto L46;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        if (this.s != view) {
            if (this.P == view) {
                throw new IllegalStateException("Metadata view must not be removed.");
            }
            this.y.remove(view);
            return;
        }
        throw new IllegalStateException("Player view must not be removed.");
    }

    public final void p(int i) {
        if (this.c.a.h(i) || this.C != null) {
            nxk nxkVar = this.C;
            if (nxkVar != null) {
                nxkVar.c();
            }
            this.C = null;
            this.c.k(null);
            this.E.a(i == 2 ? 1.0f : 0.0f);
        }
    }

    @Override // defpackage.nxd
    public final void ph(nxe nxeVar) {
        jfw.k();
        if (this.ae != this.c.s()) {
            this.ae = this.c.s();
            q();
        }
        if (isInLayout()) {
            post(new Runnable() { // from class: nzi
                @Override // java.lang.Runnable
                public final void run() {
                    NextGenWatchLayout.this.requestLayout();
                }
            });
        } else {
            requestLayout();
        }
        if (this.c.m()) {
            ArrayList arrayList = this.R;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((nzn) arrayList.get(i)).f();
            }
        }
    }

    public final void q() {
        int i = true != (this.D && !this.ae) ? 0 : 4;
        this.s.setImportantForAccessibility(i);
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setImportantForAccessibility(i);
        }
        n();
    }

    public final boolean r() {
        return this.G ? this.k.e : this.q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.V.f();
    }

    @Override // defpackage.nqw
    public final void u(RelativeLayout relativeLayout) {
        ((ViewGroup) this.v.get()).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        this.w = relativeLayout;
        if (this.U != null) {
            this.j.h().b.x(this.j.h(), relativeLayout);
            ((ajf) relativeLayout.getLayoutParams()).b(this.U);
        }
        this.I.c(true);
    }

    @Override // defpackage.nqw
    public final void v(RelativeLayout relativeLayout) {
        ((ViewGroup) this.v.get()).removeView(relativeLayout);
        this.w = null;
        this.I.c(false);
    }

    public NextGenWatchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NextGenWatchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new fqo();
        this.I = azpa.ar();
        boolean z = false;
        this.aa = 0;
        Paint paint = new Paint();
        this.af = paint;
        paint.setColor(zhn.j(context, R.attr.ytBrandBackgroundSolid).orElse(0));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oae.b);
        int resourceId = obtainStyledAttributes.getResourceId(6, 0);
        this.f153J = resourceId;
        aqxo.y(resourceId != 0);
        this.K = obtainStyledAttributes.getResourceId(3, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.N = obtainStyledAttributes.getResourceId(7, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        this.M = resourceId2;
        aqxo.y(resourceId2 != 0);
        aqxo.y(obtainStyledAttributes.getResourceId(1, 0) != 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        this.r = resourceId3;
        aqxo.y(resourceId3 != 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(8, 0);
        this.O = resourceId4;
        aqxo.y(resourceId4 != 0 ? true : z);
        obtainStyledAttributes.recycle();
        this.y = new ArrayList();
        yzk yzkVar = new yzk(context);
        yzkVar.c = 2;
        this.V = yzkVar.a();
        this.E = new nzr(this, context);
        this.F = true;
        this.ad = new Point();
    }
}
