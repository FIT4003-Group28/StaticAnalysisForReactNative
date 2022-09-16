package com.facebook.litho;

import android.content.Context;
import android.graphics.Rect;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ComponentTree {
    private static volatile Looper D = null;
    public static final String a = "ComponentTree";
    public volatile dkj A;
    public final zib B;
    private boolean E;
    private String F;
    private Deque G;
    private int H;
    private final dbh I;

    /* renamed from: J  reason: collision with root package name */
    private final boolean f145J;
    private final boolean K;
    private dby L;
    private final Runnable M;
    private final Object N;
    private czg O;
    private final Object P;
    private final List Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private boolean X;
    private int Y;
    private final dat Z;
    private volatile vel aa;
    private aflw ab;
    private final altf ac;
    public final boolean c;
    public final dbi d = new dbi();
    public List e;
    public final Object f;
    public czl g;
    public final cyv h;
    public boolean i;
    public final boolean j;
    public final boolean k;
    public boolean l;
    public final boolean m;
    public dci n;
    public dby o;
    public volatile boolean p;
    public ddz q;
    public ddz r;
    public cyr s;
    public dbq t;
    public dbq u;
    public dbq v;
    public ddm w;
    public final int x;
    public final boolean y;
    public final boolean z;
    private static final AtomicInteger C = new AtomicInteger(0);
    public static final ThreadLocal b = new ThreadLocal();

    public ComponentTree(czf czfVar) {
        dby dbyVar;
        new cze(this, 1);
        this.f = new Object();
        this.L = new dbx(Looper.getMainLooper());
        this.M = new cze(this);
        this.N = new Object();
        this.P = new Object();
        this.Q = new ArrayList();
        this.R = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.B = new zib();
        this.Z = new dat();
        this.ac = new altf();
        cyv cyvVar = new cyv(czfVar.a, new ddm(null), (aflw) null, (dbp) null, (byte[]) null);
        cyvVar.j = this;
        cyvVar.f = null;
        this.h = cyvVar;
        this.s = czfVar.c;
        this.j = czfVar.d;
        this.k = czfVar.b;
        this.f145J = czfVar.e;
        this.K = czfVar.f;
        this.o = czfVar.g;
        this.m = true;
        this.p = czfVar.i;
        g(czfVar.j);
        this.z = czfVar.l;
        this.y = czfVar.k;
        ddm ddmVar = czfVar.h;
        this.w = ddmVar == null ? ddm.a(null) : ddmVar;
        this.x = C.getAndIncrement();
        this.I = new dbh(this);
        dby dbyVar2 = this.L;
        czu.e(dbyVar2);
        this.L = dbyVar2;
        dav davVar = this.o;
        if (davVar == null) {
            if (dfz.r == null) {
                davVar = new dbx(y());
            } else {
                if (ddp.a == null) {
                    synchronized (ddp.class) {
                        if (ddp.a == null) {
                            ddp.a = new ddp(ddp.c);
                        }
                    }
                }
                davVar = ddp.a;
            }
        } else if (D != null) {
            boolean z = dfz.a;
        }
        if (dfz.q) {
            dbyVar = czu.e(davVar instanceof ddp ? new dav(anlz.g(((ddp) davVar).b)) : davVar);
        } else {
            ddi ddiVar = new ddi(davVar);
            czu.e(ddiVar);
            dbyVar = ddiVar;
        }
        this.o = dbyVar;
        this.c = czu.x(cyvVar.b);
    }

    private final void A() {
        this.Z.a();
    }

    private final synchronized void B() {
        Map map;
        dbq dbqVar = F() ? this.t : this.u;
        if (dbqVar != null) {
            altf altfVar = this.ac;
            dez dezVar = dbqVar.x;
            if (dezVar != null && (map = dezVar.a) != null) {
                for (String str : map.keySet()) {
                    dex dexVar = (dex) dezVar.a.get(str);
                    for (cyr cyrVar : dexVar.b) {
                        String str2 = dexVar.a;
                        if (altfVar.b(cyrVar)) {
                            String str3 = dexVar.a;
                            cyrVar.am();
                        }
                    }
                }
            }
        }
        this.ac.a.clear();
    }

    private final void C() {
        dkj dkjVar = this.A;
        if (dkjVar != null) {
            dkjVar.a.s();
            this.A = null;
        }
    }

    private final void D(Rect rect, boolean z) {
        boolean[] zArr;
        boolean[] zArr2;
        ViewGroup viewGroup;
        boolean[] zArr3;
        ComponentTree componentTree;
        dbq dbqVar = this.t;
        if (dbqVar == null) {
            Log.w(a, "Main Thread Layout state is not found");
            return;
        }
        if (!this.n.M() && this.p) {
            boolean z2 = dfz.a;
        }
        this.i = true;
        if (!this.p) {
            this.n.s.i = true;
            this.p = true;
        }
        try {
            dci dciVar = this.n;
            if (dciVar.A > 0 && (componentTree = dciVar.r) != null && componentTree.j) {
                if (!dciVar.M()) {
                }
                rect = new Rect(0, 0, dciVar.getWidth(), dciVar.getHeight());
                z = false;
            }
            dciVar.u.set(rect);
            dcg dcgVar = dciVar.B;
            if (dcgVar != null && dce.b(null) && (zArr3 = dcgVar.a) != null && !zArr3[0]) {
                throw null;
            }
            dcg dcgVar2 = dciVar.B;
            if (dcgVar2 != null && dce.b(null) && (zArr = dcgVar2.a) != null && zArr[0] && (zArr2 = dcgVar2.b) != null && !zArr2[0] && (viewGroup = (ViewGroup) dciVar.getParent()) != null) {
                if (!dcgVar2.c) {
                    if (dcgVar2.d) {
                        if (dciVar.getBottom() < viewGroup.getHeight() - viewGroup.getPaddingBottom()) {
                        }
                    } else if (dciVar.getRight() < viewGroup.getWidth() - viewGroup.getPaddingRight()) {
                    }
                }
                throw null;
            }
            dciVar.s.m(dbqVar, rect, z);
        } finally {
            this.i = false;
            this.r = null;
            this.q = null;
        }
    }

    private final boolean E() {
        return H(this.t) || H(this.u);
    }

    private final boolean F() {
        if (H(this.t)) {
            return true;
        }
        return !I(this.u, this.T, this.U) && I(this.t, this.T, this.U);
    }

    private static boolean G(dbq dbqVar, int i, int i2, int i3) {
        return dbqVar != null && dbqVar.m(i) && dbqVar.n == i2 && dbqVar.o == i3 && dbqVar.k();
    }

    private final boolean H(dbq dbqVar) {
        cyr cyrVar = this.s;
        if (cyrVar != null) {
            return dbqVar != null && dbqVar.d.k == cyrVar.k && dbqVar.l(this.T, this.U) && dbqVar.k();
        }
        return false;
    }

    private static boolean I(dbq dbqVar, int i, int i2) {
        return dbqVar != null && dbqVar.l(i, i2) && dbqVar.k();
    }

    private final void J() {
        if (F()) {
            this.u = null;
            return;
        }
        dci dciVar = this.n;
        if (dciVar != null) {
            dciVar.I();
        }
        this.t = this.u;
        this.u = null;
    }

    private final vel K() {
        vel velVar = this.aa;
        if (velVar == null) {
            synchronized (this) {
                velVar = this.aa;
                if (velVar == null) {
                    velVar = new vel();
                    this.aa = velVar;
                }
            }
        }
        return velVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059 A[Catch: all -> 0x0112, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0011, B:14:0x001f, B:17:0x0029, B:21:0x003c, B:27:0x0046, B:36:0x0055, B:38:0x0059, B:42:0x0060, B:44:0x0064, B:51:0x0071, B:59:0x0093, B:70:0x00af, B:72:0x00b3, B:74:0x00b7, B:76:0x00bb, B:77:0x00bd, B:63:0x009f, B:66:0x00a3, B:67:0x00ab, B:11:0x0019, B:13:0x001d, B:95:0x010a, B:96:0x0111), top: B:100:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009f A[Catch: all -> 0x0112, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0011, B:14:0x001f, B:17:0x0029, B:21:0x003c, B:27:0x0046, B:36:0x0055, B:38:0x0059, B:42:0x0060, B:44:0x0064, B:51:0x0071, B:59:0x0093, B:70:0x00af, B:72:0x00b3, B:74:0x00b7, B:76:0x00bb, B:77:0x00bd, B:63:0x009f, B:66:0x00a3, B:67:0x00ab, B:11:0x0019, B:13:0x001d, B:95:0x010a, B:96:0x0111), top: B:100:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L(defpackage.cyr r18, int r19, int r20, boolean r21, defpackage.ddj r22, int r23, java.lang.String r24, defpackage.aflw r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.L(cyr, int, int, boolean, ddj, int, java.lang.String, aflw, boolean):void");
    }

    private final dbq M(cyv cyvVar, cyr cyrVar, int i, int i2, boolean z, aflw aflwVar, int i3, String str) {
        boolean z2;
        String sb;
        czi cziVar = new czi(this, cyvVar, cyrVar, i, i2, z, aflwVar, i3, str, null);
        synchronized (this.P) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.Q.size()) {
                    z2 = false;
                    break;
                }
                czi cziVar2 = (czi) this.Q.get(i4);
                if (!cziVar2.j && cziVar2.equals(cziVar)) {
                    z2 = true;
                    cziVar = cziVar2;
                    break;
                }
                i4++;
            }
            if (!z2) {
                this.Q.add(cziVar);
            }
            cziVar.f.incrementAndGet();
        }
        dbq a2 = cziVar.a(i3);
        synchronized (this.P) {
            if (cziVar.f.decrementAndGet() >= 0) {
                if (cziVar.f.get() == 0) {
                    cziVar.b();
                    this.Q.remove(cziVar);
                }
            } else {
                throw new IllegalStateException("LayoutStateFuture ref count is below 0");
            }
        }
        Context context = cyvVar.b;
        if (context != cyrVar.r) {
            String valueOf = String.valueOf(context);
            String valueOf2 = String.valueOf(cyrVar.r);
            String o = cyrVar.o();
            if (!dfz.a) {
                sb = "Dumping of the component tree is not support on non-internal builds";
            } else if (cyvVar == null) {
                sb = "ComponentContext is null";
            } else {
                czt e = czt.e(cyvVar.j);
                if (e == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    czu.d(e, 0, sb2);
                    sb = sb2.toString();
                }
            }
            int length = String.valueOf(valueOf).length();
            int length2 = String.valueOf(valueOf2).length();
            StringBuilder sb3 = new StringBuilder(length + 128 + length2 + String.valueOf(o).length() + String.valueOf(sb).length());
            sb3.append("ComponentTree context is different from root builder context, ComponentTree context=");
            sb3.append(valueOf);
            sb3.append(", root builder context=");
            sb3.append(valueOf2);
            sb3.append(", root=");
            sb3.append(o);
            sb3.append(", ContextTree=");
            sb3.append(sb);
            czq.a(2, "ComponentTree:CTContextIsDifferentFromRootBuilderContext", sb3.toString());
        }
        return a2;
    }

    public static czf c(cyv cyvVar, cyr cyrVar) {
        czf czfVar = new czf(cyvVar);
        if (cyrVar != null) {
            czfVar.c = cyrVar;
            return czfVar;
        }
        throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
    }

    private static synchronized Looper y() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (D == null) {
                boolean z = dfz.a;
                HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
                handlerThread.start();
                D = handlerThread.getLooper();
            }
            looper = D;
        }
        return looper;
    }

    private final void z(List list) {
        A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cyr cyrVar = (cyr) it.next();
            this.B.a(cyrVar.q, cyrVar, cyrVar.m);
            synchronized (this.Z) {
                cyrVar.s(this.Z);
            }
        }
        this.B.b();
    }

    public final int a(int i, boolean z, ddz ddzVar, dfe dfeVar) {
        ded dedVar;
        if (ddzVar == null) {
            return -1;
        }
        if (!this.p && (dedVar = ddzVar.b) != null) {
            return (int) dee.c(dedVar, this.t, dfeVar);
        }
        if (this.p && !z) {
            return i;
        }
        return -1;
    }

    public final synchronized cyr b() {
        return this.s;
    }

    public final synchronized ddm d() {
        return ddm.a(this.w);
    }

    public final synchronized String e() {
        return this.F;
    }

    public final synchronized String f() {
        cyr cyrVar = this.s;
        if (cyrVar == null) {
            return null;
        }
        return cyrVar.o();
    }

    public final void g(czj czjVar) {
        if (czjVar == null) {
            return;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(czjVar);
        }
    }

    public dci getLithoView() {
        return this.n;
    }

    public final void h() {
        int i;
        dci dciVar = this.n;
        if (dciVar != null) {
            dbh dbhVar = this.I;
            if (dbhVar != null) {
                dbhVar.a(dciVar);
            }
            synchronized (this) {
                this.l = true;
                J();
                cyr cyrVar = this.s;
                if (cyrVar != null) {
                    i = cyrVar.k;
                } else {
                    boolean z = this.E;
                    String str = this.F;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
                    sb.append("Trying to attach a ComponentTree with a null root. Is released: ");
                    sb.append(z);
                    sb.append(", Released Component name is: ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
            }
            int measuredWidth = this.n.getMeasuredWidth();
            int measuredHeight = this.n.getMeasuredHeight();
            if (measuredWidth == 0) {
                if (measuredHeight == 0) {
                    return;
                }
                measuredWidth = 0;
            }
            if (!G(this.t, i, measuredWidth, measuredHeight) || this.n.M()) {
                this.n.requestLayout();
                return;
            } else {
                this.n.D();
                return;
            }
        }
        throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
    }

    public final void i() {
        if (!this.l) {
            C();
            return;
        }
        synchronized (this) {
            if (this.s == null) {
                return;
            }
            dbq dbqVar = this.t;
            J();
            dbq dbqVar2 = this.t;
            int i = this.s.k;
            if (dbqVar2 == dbqVar) {
                return;
            }
            C();
            if (!this.l) {
                return;
            }
            int measuredWidth = this.n.getMeasuredWidth();
            int measuredHeight = this.n.getMeasuredHeight();
            if (measuredWidth == 0) {
                if (measuredHeight == 0) {
                    return;
                }
                measuredWidth = 0;
            }
            if (!G(this.t, i, measuredWidth, measuredHeight)) {
                this.n.requestLayout();
            } else {
                t();
            }
        }
    }

    public final synchronized void j(List list, String str) {
        ddm ddmVar = this.w;
        if (ddmVar != null) {
            ddmVar.i(list, str);
        }
    }

    public final void k() {
        dbh dbhVar = this.I;
        if (dbhVar != null) {
            int size = dbhVar.a.size();
            for (int i = 0; i < size; i++) {
                dbg dbgVar = (dbg) dbhVar.a.get(i);
                dbgVar.a.clear();
                ViewPager viewPager = (ViewPager) dbgVar.b.get();
                if (viewPager != null) {
                    lj.H(viewPager, new dbf(dbgVar, viewPager));
                }
            }
            dbhVar.a.clear();
        }
        synchronized (this) {
            this.l = false;
        }
    }

    public final void l() {
        if (this.j) {
            if (this.n == null) {
                return;
            }
            Rect rect = new Rect();
            boolean z = dfz.a;
            if (!this.n.getLocalVisibleRect(rect)) {
                if (this.p) {
                    return;
                }
                if ((this.r == null || rect.height() != 0) && (this.q == null || rect.width() != 0)) {
                    return;
                }
            }
            n(rect, true);
            return;
        }
        throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (defpackage.czu.B(r13.U, r13.W) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r14, int r15, int[] r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.m(int, int, int[], boolean):void");
    }

    public final void n(Rect rect, boolean z) {
        if (this.i) {
            czk czkVar = new czk(rect, z);
            Deque deque = this.G;
            if (deque == null) {
                this.G = new ArrayDeque();
            } else if (deque.size() > 25) {
                dci dciVar = this.n;
                String a2 = dciVar != null ? LithoViewTestHelper.a(dciVar) : null;
                Object obj = this.s;
                if (obj == null) {
                    obj = f();
                }
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 55 + String.valueOf(valueOf).length());
                sb.append("Reentrant mounts exceed max attempts, view=");
                sb.append(a2);
                sb.append(", component=");
                sb.append(valueOf);
                czq.a(3, "ComponentTree:ReentrantMountsExceedMaxAttempts", sb.toString());
                this.G.clear();
                return;
            }
            this.G.add(czkVar);
            return;
        }
        D(rect, z);
        Deque deque2 = this.G;
        if (deque2 == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(deque2);
        this.G.clear();
        while (!arrayDeque.isEmpty()) {
            czk czkVar2 = (czk) arrayDeque.pollFirst();
            this.n.I();
            D(czkVar2.a, czkVar2.b);
        }
    }

    public final void o() {
        int i;
        if (!this.i) {
            synchronized (this) {
                ((dbx) this.L).removeCallbacks(this.M);
                synchronized (this.N) {
                    czg czgVar = this.O;
                    if (czgVar != null) {
                        this.o.a(czgVar);
                        this.O = null;
                    }
                }
                synchronized (this.f) {
                    czl czlVar = this.g;
                    if (czlVar != null) {
                        this.o.a(czlVar);
                        this.g = null;
                    }
                }
                synchronized (this.P) {
                    for (int i2 = 0; i2 < this.Q.size(); i2++) {
                        ((czi) this.Q.get(i2)).b();
                    }
                    this.Q.clear();
                }
                this.E = true;
                cyr cyrVar = this.s;
                if (cyrVar != null) {
                    this.F = cyrVar.o();
                }
                dci dciVar = this.n;
                if (dciVar != null) {
                    dciVar.G(null);
                }
                this.s = null;
                B();
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.e = null;
            }
            synchronized (this.Z) {
                A();
            }
            if (this.aa == null) {
                return;
            }
            vel velVar = this.aa;
            synchronized (velVar) {
                Map map = velVar.a;
                if (map == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(map.values());
                velVar.a.clear();
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    cyr cyrVar2 = (cyr) arrayList.get(i);
                    cyv cyvVar = cyrVar2.q;
                    cyrVar2.aq();
                }
                return;
            }
        }
        throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
    }

    public final void q(boolean z, String str, boolean z2) {
        boolean z3 = dfz.a;
        synchronized (this) {
            cyr cyrVar = this.s;
            if (cyrVar == null) {
                return;
            }
            int i = 1;
            if (this.X) {
                if (this.Y == 2) {
                    return;
                }
                if (true != z) {
                    i = 2;
                }
                this.Y = i;
                return;
            }
            cyr j = cyrVar.j();
            aflw i2 = aflw.i(this.ab);
            if (z2) {
                int i3 = this.H + 1;
                this.H = i3;
                if (i3 == 50) {
                    czq.a(3, "ComponentTree:StateUpdatesWhenLayoutInProgressExceedsThreshold", "State Updates when create layout in progress exceeds threshold");
                }
            }
            L(j, -1, -1, z, null, true != z ? 4 : 5, str, i2, z2);
        }
    }

    public final synchronized boolean r(int i, int i2) {
        boolean z;
        if (!I(this.t, i, i2)) {
            if (!I(this.u, i, i2)) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized boolean s() {
        return this.E;
    }

    public final boolean t() {
        if (this.n.M() || this.n.N()) {
            if (this.j) {
                l();
            } else {
                Rect rect = new Rect();
                this.n.getLocalVisibleRect(rect);
                n(rect, true);
            }
            return true;
        } else if (!this.f145J) {
            return false;
        } else {
            dci dciVar = this.n;
            if (dciVar.s.e) {
                return false;
            }
            dciVar.D();
            return false;
        }
    }

    public final tha u() {
        return this.h.l;
    }

    public final synchronized void v(int i, int i2, int i3) {
        Map map;
        dbq dbqVar = F() ? this.t : this.u;
        if (dbqVar != null) {
            altf altfVar = this.ac;
            dez dezVar = dbqVar.x;
            if (dezVar != null && (map = dezVar.a) != null) {
                for (String str : map.keySet()) {
                    dex dexVar = (dex) dezVar.a.get(str);
                    for (cyr cyrVar : dexVar.b) {
                        String str2 = dexVar.a;
                        if (!altfVar.b(cyrVar)) {
                            int i4 = (int) (((i3 - i2) + 1) * dexVar.c.a);
                            if (i >= i2 - i4 && i <= i4 + i3) {
                                String str3 = dexVar.a;
                                cyrVar.al();
                                String str4 = dexVar.a;
                                altfVar.c(cyrVar, 1);
                            }
                        }
                        String str5 = dexVar.a;
                        if (altfVar.b(cyrVar)) {
                            int i5 = (int) (((i3 - i2) + 1) * dexVar.c.a);
                            if (i < i2 - i5 || i > i5 + i3) {
                                String str6 = dexVar.a;
                                cyrVar.am();
                                String str7 = dexVar.a;
                                altfVar.c(cyrVar, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void w(ddj ddjVar, int i, String str, aflw aflwVar, boolean z) {
        ArrayList arrayList;
        int i2;
        boolean z2;
        List list;
        Map map;
        int i3;
        int i4;
        ddm ddmVar;
        synchronized (this.N) {
            czg czgVar = this.O;
            arrayList = null;
            if (czgVar != null) {
                this.o.a(czgVar);
                this.O = null;
            }
        }
        synchronized (this) {
            if (this.T != -1 && this.U != -1 && this.s != null) {
                if (E()) {
                    if (ddjVar != null) {
                        dbq dbqVar = this.u;
                        if (dbqVar == null) {
                            dbqVar = this.t;
                        }
                        ddjVar.a = dbqVar.n;
                        ddjVar.b = dbqVar.o;
                    }
                    return;
                }
                int i5 = this.T;
                int i6 = this.U;
                this.V = i5;
                this.W = i6;
                cyr j = this.s.j();
                boolean z3 = true;
                this.S++;
                dbq M = M(this.h, j, i5, i6, this.K, aflwVar, i, str);
                if (M == null) {
                    if (!this.E && ddjVar != null) {
                        throw new IllegalStateException("LayoutState is null, but only async operations can return a null LayoutState");
                    }
                    return;
                }
                if (ddjVar != null) {
                    ddjVar.a = M.n;
                    ddjVar.b = M.o;
                }
                synchronized (this) {
                    this.V = -1;
                    this.W = -1;
                    z2 = !E() && I(M, this.T, this.U);
                    ddm e = M.e();
                    if (z2) {
                        if (e != null && (ddmVar = this.w) != null) {
                            ddmVar.h(e);
                        }
                        if (this.e != null) {
                            i3 = M.n;
                            i4 = M.o;
                        } else {
                            i3 = 0;
                            i4 = 0;
                        }
                        list = M.h();
                        map = M.i();
                        this.u = M;
                        this.v = M;
                    } else {
                        list = null;
                        map = null;
                        i3 = 0;
                        i4 = 0;
                        z3 = false;
                    }
                    if (e != null) {
                        this.d.b(e);
                    }
                    if (!z) {
                        this.H = 0;
                    }
                }
                if (z2) {
                    synchronized (this) {
                        List list2 = this.e;
                        if (list2 != null) {
                            arrayList = new ArrayList(list2);
                        }
                    }
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (i2 = 0; i2 < size; i2++) {
                            ((czj) arrayList.get(i2)).a(i3, i4);
                        }
                    }
                    if (this.aa != null) {
                        this.aa.b(map);
                    } else if (map != null) {
                        K().b(map);
                    }
                }
                if (list != null) {
                    z(list);
                }
                if (!z3) {
                    return;
                }
                if (!czu.y()) {
                    ((dbx) this.L).post(this.M);
                } else {
                    i();
                }
            }
        }
    }

    public final void x(cyr cyrVar, int i, int i2, boolean z, ddj ddjVar, int i3, aflw aflwVar) {
        L(cyrVar, i, i2, z, ddjVar, i3, null, aflwVar, false);
    }

    public final void p(cyr cyrVar, int i, int i2, ddj ddjVar) {
        if (cyrVar == null) {
            throw new IllegalArgumentException("Root component can't be null");
        }
        x(cyrVar, i, i2, false, ddjVar, 0, null);
    }
}
