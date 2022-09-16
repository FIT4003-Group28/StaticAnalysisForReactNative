package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: dlc  reason: default package */
/* loaded from: classes3.dex */
public final class dlc implements dit, djg {
    public static Field a;
    public final dmp D;
    public int E;
    public final dlk F;
    public final djo H;
    public final akcx I;
    private final int M;
    private final boolean O;
    private final boolean P;
    private final dlg Q;
    private final boolean R;
    private final boolean S;
    private final boolean T;
    private final boolean U;
    private final boolean V;
    private final boolean ab;
    private ddj ac;
    private int ad;
    private final dby ae;
    private final boolean af;
    private final dka al;
    private dlq an;
    private final dbu ao;
    public final dkn d;
    public final cyv f;
    public final float h;
    public final List j;
    public final boolean k;
    final boolean m;
    public boolean q;
    public RecyclerView t;
    public int w;
    volatile ddj x;
    public daq y;
    private static final ddj K = new ddj();
    private static final Rect L = new Rect();

    /* renamed from: J  reason: collision with root package name */
    static final dqt f176J = new dqt();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final Handler g = new Handler(Looper.getMainLooper());
    public final AtomicBoolean i = new AtomicBoolean(false);
    private final AtomicBoolean N = new AtomicBoolean(false);
    public final AtomicLong l = new AtomicLong(-1);
    private final Deque W = new ArrayDeque();
    private final AtomicBoolean X = new AtomicBoolean(false);
    private final AtomicBoolean Y = new AtomicBoolean(false);
    final Deque n = new ArrayDeque();
    final Runnable o = new dkh(this, 1);
    private final dkf ak = new dkf(this);
    private final ViewTreeObserver.OnPreDrawListener Z = new dkg(this);
    private final Runnable aa = new dkh(this);
    private final dkj am = new dkj(this);
    public final dfv p = new dkk(this);
    public int r = -1;
    public int s = -1;
    int u = -1;
    int v = -1;
    public volatile boolean z = false;
    private boolean ag = false;
    private int ah = 0;
    public final String A = "";
    public final boolean[] B = new boolean[1];
    public final boolean[] C = new boolean[1];
    private dko ai = null;
    private final dmn aj = new dkl(this);
    public final Runnable G = new dkh(this, 2);
    public final xo e = new dla(this);

    public dlc(dkx dkxVar) {
        this.w = -1;
        dka dkaVar = null;
        this.f = dkxVar.c;
        this.d = dkxVar.o;
        boolean z = dkxVar.q;
        this.P = z;
        this.M = z ? 0 : dkxVar.a;
        this.h = dkxVar.b;
        djo djoVar = dkxVar.r;
        this.H = djoVar;
        dbu dbuVar = dkxVar.s;
        if (dbuVar != null) {
            this.ao = dbuVar;
            this.ae = ddp.d(dbuVar);
        } else if (dfz.s != null) {
            dbu dbuVar2 = dfz.s;
            this.ao = dbuVar2;
            this.ae = ddp.d(dbuVar2);
        } else {
            this.ao = null;
            this.ae = null;
        }
        boolean z2 = dkxVar.e;
        this.F = new dlk(z2, z2 ? dkxVar.f : 0);
        boolean z3 = djoVar.h() == 0 ? dkxVar.d : false;
        this.ab = z3;
        this.al = z3 ? new dka(this) : dkaVar;
        this.q = false;
        boolean W = djoVar.a.m ^ W();
        this.m = W;
        if (W) {
            this.Q = dlg.b;
        } else {
            this.Q = dlg.a;
        }
        this.D = new dmp(this.u, this.v, dkxVar.r);
        this.j = dkxVar.g;
        int i = dkxVar.k;
        if (i != -1) {
            this.w = i;
            this.k = true;
        } else {
            this.k = false;
        }
        this.af = dkxVar.p;
        this.R = dkxVar.h;
        this.O = dkxVar.n;
        this.S = dkxVar.i;
        this.T = dkxVar.j;
        this.U = dkxVar.l;
        this.V = dkxVar.m;
        this.I = dkxVar.t;
    }

    public static void G(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((diz) list.get(i)).k();
        }
    }

    private final ddj R(int i, int i2, boolean z) {
        int size;
        int i3;
        ddj ddjVar = new ddj();
        int h = this.H.h();
        boolean N = N(i, i2, h, z);
        int i4 = 0;
        if (h != 1) {
            int size2 = View.MeasureSpec.getSize(i);
            if (!N) {
                i3 = View.MeasureSpec.getSize(i2);
            } else if (this.x != null) {
                i3 = this.x.b;
            } else {
                i4 = size2;
                size = 0;
            }
            size = i3;
            i4 = size2;
        } else {
            size = View.MeasureSpec.getSize(i2);
            if (!N) {
                i4 = View.MeasureSpec.getSize(i);
            } else if (this.x != null) {
                i4 = this.x.a;
            }
        }
        ddjVar.a = i4;
        ddjVar.b = size;
        return ddjVar;
    }

    private final void S(diz dizVar) {
        int o = o(dizVar);
        int n = n(dizVar);
        if (dizVar.r(o, n)) {
            if (!dizVar.o()) {
                return;
            }
            ComponentTree b = dizVar.b();
            if (b.A == null) {
                return;
            }
            b.A = null;
            U();
            return;
        }
        dizVar.g(this.f, o, n);
    }

    private final void T(int i, int i2) {
        v(i, i2, this.Q);
    }

    private final void U() {
        if (czu.y()) {
            s();
        } else {
            dfy.a.a(this.p);
        }
    }

    private final void V(dko dkoVar) {
        ArrayList arrayList = dkoVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dkr dkrVar = (dkr) arrayList.get(i);
            if (dkrVar instanceof dkp) {
                S(((dkp) dkrVar).b);
            }
        }
    }

    private final boolean W() {
        return this.H.a.k;
    }

    private final boolean X() {
        return !(this.x == null || this.w == -1) || this.k;
    }

    private final boolean Y() {
        return this.i.get() && !this.N.get();
    }

    private static final void Z(diz dizVar, dlj dljVar) {
        dizVar.d();
        dizVar.n(dljVar);
    }

    private final afzp aa() {
        int m;
        if (!this.b.isEmpty()) {
            int m2 = m(this.b, this.m);
            if (this.u < this.b.size() && m2 >= 0) {
                return new afzp(m2, this.b);
            }
            return null;
        } else if (!this.c.isEmpty() && (m = m(this.c, this.m)) >= 0) {
            return new afzp(m, this.c);
        } else {
            return null;
        }
    }

    static int m(List list, boolean z) {
        if (z) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((diz) list.get(size)).d().j()) {
                    return size;
                }
            }
        } else {
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                if (((diz) list.get(i)).d().j()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void t(dlj dljVar) {
        if (dljVar != null) {
            return;
        }
        throw new RuntimeException("Received null RenderInfo to insert/update!");
    }

    public static void x(diz dizVar) {
        if (dizVar.q()) {
            Object e = dizVar.b.e("prevent_release");
            if (((e instanceof Boolean) && ((Boolean) e).booleanValue()) || dizVar.d().i() || dizVar.b() == null || dizVar.b().getLithoView() != null) {
                return;
            }
            dizVar.e();
        }
    }

    public final void A(dky dkyVar) {
        diz mo416next = dkyVar.mo416next();
        if (this.b.isEmpty() || mo416next == null || this.w != -1) {
            return;
        }
        int o = o(mo416next);
        int n = n(mo416next);
        if (mo416next.r(o, n)) {
            return;
        }
        mo416next.h(this.f, o, n, new dkc(this, dkyVar, mo416next));
    }

    public final void B() {
        afzp aa;
        int m;
        if (!this.i.get()) {
            return;
        }
        if (this.N.get()) {
            ddj ddjVar = this.ac;
            if (ddjVar.a == 0 || ddjVar.b == 0) {
                J();
                return;
            }
            ddj R = R(this.r, this.s, true);
            ddj ddjVar2 = new ddj();
            int i = R.a;
            int i2 = R.b;
            int c = this.H.c();
            if (c == -1) {
                c = 0;
            }
            List list = this.b;
            djn djnVar = new djn(i, i2, this.H.h());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            ddj ddjVar3 = new ddj();
            while (true) {
                if (djnVar.d >= (djnVar.c == 1 ? djnVar.b : djnVar.a) || c >= list.size()) {
                    break;
                }
                diz dizVar = (diz) list.get(c);
                dlj d = dizVar.d();
                if (d.k()) {
                    break;
                }
                dizVar.i(this.f, this.H.i(makeMeasureSpec), this.H.f(makeMeasureSpec2, d), ddjVar3);
                int i3 = ddjVar3.a;
                int i4 = ddjVar3.b;
                int i5 = djnVar.d;
                if (1 == djnVar.c) {
                    i3 = i4;
                }
                djnVar.d = i5 + i3;
                c++;
            }
            int i6 = djnVar.d;
            if (this.H.h() == 1) {
                ddjVar2.a = i;
                ddjVar2.b = Math.min(i6, i2);
            } else {
                ddjVar2.a = Math.min(i6, i);
                ddjVar2.b = i2;
            }
            list.size();
            if (dlm.a) {
                hashCode();
            }
            if (!X() && (aa = aa()) != null) {
                Q(i, i2, aa, this.H.h());
            }
            int i7 = ddjVar2.a;
            ddj ddjVar4 = this.ac;
            if (i7 == ddjVar4.a && ddjVar2.b == ddjVar4.b) {
                return;
            }
            J();
            return;
        }
        if (!X() && (m = m(this.b, this.m)) >= 0) {
            afzp afzpVar = new afzp(m, this.b);
            ddj ddjVar5 = this.ac;
            Q(ddjVar5.a, ddjVar5.b, afzpVar, this.H.h());
        }
        z();
    }

    @Override // defpackage.dit
    /* renamed from: C */
    public final void c(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.t;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e(recyclerView2);
        }
        if (this.z) {
            s();
        }
        this.t = recyclerView;
        this.ag = true;
        LinearLayoutManager linearLayoutManager = this.H.a;
        linearLayoutManager.aY(this.af);
        recyclerView.getPaddingLeft();
        recyclerView.ag(linearLayoutManager);
        recyclerView.ad(this.e);
        recyclerView.aE(this.D.d);
        if (linearLayoutManager instanceof djt) {
            new Rect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            ((djt) linearLayoutManager).a();
        }
        if (recyclerView instanceof djp) {
            ((djp) recyclerView).aa = this.ak;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(this.Z);
        }
        this.D.a(this.aj);
        int i = this.u;
        if (i != -1 && i >= 0) {
            this.H.a.aa(i, this.ad);
        }
        RecyclerView recyclerView3 = this.t;
        if (recyclerView3 == null) {
            return;
        }
        int i2 = dln.o;
        dln dlnVar = recyclerView3.getParent() instanceof dln ? (dln) recyclerView3.getParent() : null;
        if (dlnVar == null) {
            return;
        }
        dlq dlqVar = new dlq(this);
        this.an = dlqVar;
        if (dlqVar.a == null) {
            dlqVar.a = dlnVar;
            dlqVar.a.p();
            dlqVar.b = dlnVar.l.n;
            if (dlqVar.b == null) {
                throw new RuntimeException("LayoutManager of RecyclerView is not initialized yet.");
            }
            dlqVar.a.l.aE(dlqVar);
            return;
        }
        throw new RuntimeException("SectionsRecyclerView has already been initialized but never reset.");
    }

    public final void D(int i, int i2) {
        diz dizVar;
        boolean z;
        boolean z2;
        if (dlm.a) {
            hashCode();
        }
        synchronized (this) {
            dizVar = (diz) this.b.remove(i);
            this.b.add(i2, dizVar);
            int i3 = this.w;
            z = true;
            if (i3 != -1) {
                float f = i2;
                int i4 = this.u;
                float f2 = i3 * this.h;
                if (f >= i4 - f2 && f <= i4 + i3 + f2) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (dizVar.q() && !z2) {
            dizVar.e();
        }
        this.e.om(i, i2);
        dmp dmpVar = this.D;
        int i5 = this.w;
        if (!dmpVar.d() && i5 != -1) {
            int i6 = dmpVar.a;
            boolean z3 = i2 >= i6 && i2 <= (i6 + i5) + (-1);
            boolean z4 = i >= i6 && i <= (i6 + i5) + (-1);
            if (!z3 && !z4) {
                z = false;
            }
        }
        dmpVar.c(z);
    }

    public final void E(List list) {
        this.g.post(new djz(list));
    }

    public final void F(dkp dkpVar) {
        r(dkpVar);
        diz dizVar = dkpVar.b;
        dizVar.s(this.am);
        if (Y()) {
            S(dizVar);
        }
    }

    public final void H(int i) {
        diz dizVar;
        if (dlm.a) {
            hashCode();
        }
        synchronized (this) {
            dizVar = (diz) this.b.remove(i);
        }
        this.e.n(i);
        dmp dmpVar = this.D;
        dmpVar.c(dmpVar.g(i));
        this.g.post(new dke(dizVar, 1));
    }

    public final void I(int i, int i2) {
        if (dlm.a) {
            hashCode();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add((diz) this.b.remove(i));
            }
        }
        this.e.m(i, i2);
        dmp dmpVar = this.D;
        dmpVar.c(dmpVar.g(i));
        E(arrayList);
    }

    public final void J() {
        if (dlm.a) {
            hashCode();
        }
        if (this.t != null) {
            this.g.removeCallbacks(this.o);
            this.t.removeCallbacks(this.o);
            lj.H(this.t, this.o);
            return;
        }
        this.g.removeCallbacks(this.o);
        this.g.post(this.o);
    }

    @Override // defpackage.dit
    /* renamed from: K */
    public final void e(RecyclerView recyclerView) {
        int bz;
        int bx;
        LinearLayoutManager linearLayoutManager = this.H.a;
        View S = linearLayoutManager.S(this.u);
        if (S != null) {
            boolean W = W();
            if (this.H.h() == 0) {
                if (W) {
                    bx = (recyclerView.getWidth() - linearLayoutManager.getPaddingRight()) - xw.by(S);
                } else {
                    bx = xw.bx(S) - linearLayoutManager.getPaddingLeft();
                }
                this.ad = bx;
            } else {
                if (W) {
                    bz = (recyclerView.getHeight() - linearLayoutManager.getPaddingBottom()) - xw.bw(S);
                } else {
                    bz = xw.bz(S) - linearLayoutManager.getPaddingTop();
                }
                this.ad = bz;
            }
        } else {
            this.ad = 0;
        }
        recyclerView.aG(this.D.d);
        if (recyclerView instanceof djp) {
            ((djp) recyclerView).aa = null;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.Z);
        }
        y();
        recyclerView.ad(null);
        recyclerView.ag(null);
        dmp dmpVar = this.D;
        dmn dmnVar = this.aj;
        if (dmnVar != null) {
            synchronized (dmpVar) {
                if (!dmpVar.c.isEmpty()) {
                    dmpVar.c.remove(dmnVar);
                }
            }
        }
        synchronized (this) {
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((diz) this.b.get(size)).e();
            }
        }
        if (this.t != recyclerView) {
            return;
        }
        this.t = null;
        dlq dlqVar = this.an;
        if (dlqVar == null) {
            return;
        }
        dln dlnVar = dlqVar.a;
        if (dlnVar == null) {
            throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
        }
        dlnVar.l.aG(dlqVar);
        dlqVar.b = null;
        dlqVar.a = null;
    }

    public final void L(int i, dlj dljVar) {
        boolean k;
        if (dlm.a) {
            hashCode();
            String.valueOf(dljVar.r()).length();
        }
        synchronized (this) {
            diz dizVar = (diz) this.b.get(i);
            k = dizVar.d().k();
            t(dljVar);
            this.F.a(dljVar);
            Z(dizVar, dljVar);
        }
        if (k || dljVar.k()) {
            this.e.ok(i);
        }
        dmp dmpVar = this.D;
        dmpVar.c(dmpVar.e(i, 1));
    }

    public final void M(int i, List list) {
        if (dlm.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((dlj) list.get(i2)).r();
            }
            hashCode();
            list.size();
            String.valueOf(Arrays.toString(strArr)).length();
        }
        synchronized (this) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = i + i3;
                diz dizVar = (diz) this.b.get(i4);
                dlj dljVar = (dlj) list.get(i3);
                t(dljVar);
                if (dljVar.k() || dizVar.d().k()) {
                    this.e.ok(i4);
                }
                this.F.a(dljVar);
                Z(dizVar, dljVar);
            }
        }
        dmp dmpVar = this.D;
        dmpVar.c(dmpVar.e(i, list.size()));
    }

    public final synchronized void O(boolean z, dhp dhpVar) {
        if (this.ai == null) {
            this.ai = new dko();
        }
        dko dkoVar = this.ai;
        dkoVar.b = z;
        dkoVar.d = dhpVar;
        this.W.addLast(dkoVar);
        this.X.set(true);
        this.ai = null;
    }

    public final void P(boolean z, dhp dhpVar) {
        if (dlm.a) {
            hashCode();
        }
        if (this.z) {
            throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
        }
        if (dhpVar != null) {
            dhpVar.a();
            this.n.addLast(dhpVar);
        }
        y();
        if (!z) {
            return;
        }
        if (dce.b(null)) {
            throw null;
        }
        B();
    }

    final void Q(int i, int i2, afzp afzpVar, int i3) {
        String str;
        ddj ddjVar;
        if (this.k) {
            return;
        }
        ddb ddbVar = null;
        boolean b = dce.b(null);
        dky dkyVar = new dky(afzpVar.a, afzpVar.b, this.b.size() - 1, this.m);
        if (!this.b.isEmpty()) {
            dbu dbuVar = this.ao;
            int i4 = dbuVar == null ? 1 : dbuVar.a;
            for (int i5 = 0; i5 < i4; i5++) {
                A(dkyVar);
            }
        }
        diz dizVar = (diz) afzpVar.a.get(afzpVar.b);
        int o = o(dizVar);
        int n = n(dizVar);
        if (b) {
            throw null;
        }
        cyv cyvVar = this.f;
        tha thaVar = cyvVar.l;
        if (thaVar != null) {
            str = cyvVar.c;
        } else {
            dizVar.d().l();
            dizVar.d().m();
            str = null;
            thaVar = null;
        }
        if (thaVar != null) {
            cyv cyvVar2 = this.f;
            ddbVar = czu.F(thaVar, str, thaVar.a(cyvVar2, 20), cyvVar2.m);
        }
        try {
            if (this.M <= 0 || !czu.y()) {
                ddj ddjVar2 = new ddj();
                dizVar.i(this.f, o, n, ddjVar2);
                if (this.P) {
                    List<diz> list = this.b;
                    cyv cyvVar3 = this.f;
                    ddj ddjVar3 = new ddj();
                    int i6 = 0;
                    for (diz dizVar2 : list) {
                        dizVar2.i(cyvVar3, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), ddjVar3);
                        i6 = Math.max(i6, ddjVar3.b);
                    }
                    ddjVar2.b = i6;
                }
                int max = Math.max(this.H.a(ddjVar2.a, ddjVar2.b, i, i2), 1);
                this.x = ddjVar2;
                this.w = max;
            } else {
                if (i3 == 0) {
                    ddjVar = new ddj(i / this.M, i2);
                } else {
                    ddjVar = new ddj(i, i2 / this.M);
                }
                this.x = ddjVar;
                this.w = this.M;
            }
            if (ddbVar == null) {
                return;
            }
            tha.d(ddbVar);
        } catch (Throwable th) {
            if (ddbVar != null) {
                tha.d(ddbVar);
            }
            throw th;
        }
    }

    @Override // defpackage.dit
    public final void a() {
        ArrayList arrayList;
        if (czu.y()) {
            G(this.b);
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.b);
        }
        E(arrayList);
    }

    @Override // defpackage.dit
    public final void b(ddj ddjVar, int i, int i2, daq daqVar) {
        afzp aa;
        boolean z;
        boolean z2 = daqVar != null;
        int h = this.H.h();
        if (h != 0) {
            if (View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Height mode has to be EXACTLY OR AT MOST for a vertical scrolling RecyclerView");
            }
            if (!z2 && View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Can't use Unspecified width on a vertical scrolling Recycler if dynamic measurement is not allowed");
            }
        } else if (View.MeasureSpec.getMode(i) == 0) {
            throw new IllegalStateException("Width mode has to be EXACTLY OR AT MOST for an horizontal scrolling RecyclerView");
        } else {
            if (!z2 && View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Can't use Unspecified height on an horizontal scrolling Recycler if dynamic measurement is not allowed");
            }
        }
        boolean N = N(i, i2, h, z2);
        if (!this.k || !N) {
            this.Y.set(true);
            try {
                synchronized (this) {
                    if (this.r != -1 && !this.N.get()) {
                        if (h != 1) {
                            if (czu.C(this.s, i2, this.ac.b)) {
                                ddjVar.a = View.MeasureSpec.getSize(i);
                                ddjVar.b = this.ac.b;
                                if (!z) {
                                    return;
                                }
                                return;
                            }
                        } else if (czu.C(this.r, i, this.ac.a)) {
                            ddjVar.a = this.ac.a;
                            ddjVar.b = View.MeasureSpec.getSize(i2);
                            this.Y.set(false);
                            if (!this.z) {
                                return;
                            }
                            U();
                            return;
                        }
                        this.i.set(false);
                        if (!this.k) {
                            this.w = -1;
                        }
                        this.x = null;
                        int size = this.b.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((diz) this.b.get(i3)).j();
                        }
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            this.e.mr();
                        } else {
                            this.g.removeCallbacks(this.aa);
                            this.g.post(this.aa);
                        }
                    }
                    this.r = i;
                    this.s = i2;
                    if (!X() && (aa = aa()) != null) {
                        Q(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), aa, h);
                    }
                    ddj R = R(i, i2, z2);
                    if (h != 1) {
                        if (N && this.x == null) {
                            this.y = daqVar;
                            this.N.set(true);
                        }
                        boolean z3 = this.ab;
                        if (true != z3) {
                            daqVar = null;
                        }
                        this.y = daqVar;
                        this.N.set(z3);
                    } else {
                        if (N && this.x == null) {
                            this.y = daqVar;
                            this.N.set(true);
                        }
                        this.y = null;
                    }
                    int i4 = R.a;
                    ddjVar.a = i4;
                    int i5 = R.b;
                    ddjVar.b = i5;
                    this.ac = new ddj(i4, i5);
                    this.i.set(true);
                    for (dko dkoVar : this.W) {
                        V(dkoVar);
                    }
                    dko dkoVar2 = this.ai;
                    if (dkoVar2 != null) {
                        V(dkoVar2);
                    }
                    if (this.w != -1) {
                        T(this.u, this.v);
                    }
                    this.Y.set(false);
                    if (!this.z) {
                        return;
                    }
                    U();
                    return;
                }
            } finally {
                this.Y.set(false);
                if (this.z) {
                    U();
                }
            }
        }
        throw new RuntimeException("Cannot use manual estimated viewport count when the RecyclerBinder needs an item to determine its size!");
    }

    @Override // defpackage.dit
    public final synchronized void d(int i, int i2) {
        boolean C;
        if (this.r != -1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            int h = this.H.h();
            int i3 = this.r;
            if (i3 != -1) {
                if (h != 0) {
                    C = czu.C(i3, makeMeasureSpec, this.ac.a);
                } else {
                    C = czu.C(this.s, makeMeasureSpec2, this.ac.b);
                }
                if (C) {
                    return;
                }
            }
        }
        b(K, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824), this.y);
    }

    @Override // defpackage.dit
    public final boolean f() {
        return this.q;
    }

    @Override // defpackage.dit
    public final /* bridge */ /* synthetic */ void g() {
    }

    @Override // defpackage.dit
    public final void h() {
    }

    @Override // defpackage.dit
    public final /* bridge */ /* synthetic */ void i() {
    }

    @Override // defpackage.djg
    public final synchronized ComponentTree j(int i) {
        diz dizVar = (diz) this.b.get(i);
        int o = o(dizVar);
        int n = n(dizVar);
        if (dizVar.r(o, n)) {
            return dizVar.b();
        }
        dizVar.i(this.f, o, n, null);
        return dizVar.b();
    }

    @Override // defpackage.djg
    public final boolean k(int i) {
        return l(i) && ((diz) this.b.get(i)).d().i();
    }

    @Override // defpackage.djg
    public final boolean l(int i) {
        return i >= 0 && i < this.b.size();
    }

    public final int n(diz dizVar) {
        if (this.ab) {
            return 0;
        }
        if (Y()) {
            return this.H.f(View.MeasureSpec.makeMeasureSpec(this.ac.b, 1073741824), dizVar.d());
        }
        return this.H.f(this.s, dizVar.d());
    }

    public final int o(diz dizVar) {
        if (Y()) {
            djo djoVar = this.H;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.ac.a, 1073741824);
            dizVar.d();
            return djoVar.i(makeMeasureSpec);
        }
        djo djoVar2 = this.H;
        int i = this.r;
        dizVar.d();
        return djoVar2.i(i);
    }

    public final diz p(dlj dljVar) {
        dby dbyVar = this.ae;
        if (dbyVar == null) {
            dbyVar = null;
        }
        dka dkaVar = this.al;
        boolean z = this.R;
        boolean z2 = this.O;
        boolean z3 = this.S;
        boolean z4 = this.T;
        boolean z5 = this.U;
        boolean z6 = this.V;
        diy c = diz.c();
        if (dljVar == null) {
            dljVar = dix.q();
        }
        c.a = dljVar;
        c.b = dbyVar;
        c.i = dkaVar;
        c.c = z;
        c.h = z2;
        c.e = z3;
        c.d = z4;
        c.f = z5;
        c.g = z6;
        if (c.a != null) {
            return new diz(c);
        }
        throw new IllegalArgumentException("A RenderInfo must be specified to create a ComponentTreeHolder");
    }

    public final dkp q(int i, dlj dljVar) {
        diz p = p(dljVar);
        p.l(false);
        return new dkp(i, p);
    }

    public final void r(dkr dkrVar) {
        if (this.ai == null) {
            this.ai = new dko();
        }
        this.ai.a.add(dkrVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
        r4 = r3.a.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r5 >= r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
        r6 = (defpackage.dkr) r3.a.get(r5);
        r7 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r7 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        if (r7 == 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r7 == 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
        if (r7 == 3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r7 == 4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
        r6 = (defpackage.dkq) r6;
        D(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
        r6 = (defpackage.dkt) r6;
        I(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
        H(((defpackage.dks) r6).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        r6 = (defpackage.dkv) r6;
        M(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
        r6 = (defpackage.dku) r6;
        L(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
        r6 = (defpackage.dkp) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
        if (r6.b.p() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cd, code lost:
        if (defpackage.dlm.a == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
        hashCode();
        r7 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
        r10.F.a(r6.b.d());
        r10.b.add(r6.a, r6.b);
        r6.b.l(true);
        r10.e.ol(r6.a);
        r10.D.f(r6.a, r10.w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
        r3.d.a();
        r10.n.addLast(r3.d);
        y();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlc.s():void");
    }

    public final void u() {
        if (dfz.a || dfz.e) {
            long id = Thread.currentThread().getId();
            long andSet = this.l.getAndSet(id);
            if (id == andSet || andSet == -1) {
                return;
            }
            StringBuilder sb = new StringBuilder(94);
            sb.append("Multiple threads applying change sets at once! (");
            sb.append(andSet);
            sb.append(" and ");
            sb.append(id);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void v(int i, int i2, dlg dlgVar) {
        int i3;
        synchronized (this) {
            if (Y() && (i3 = this.w) != -1) {
                if (i == -1 || i2 == -1) {
                    i = 0;
                    i2 = 0;
                }
                int max = Math.max(i3, i2 - i);
                int size = this.b.size();
                int i4 = (int) (max * this.h);
                dlgVar.a(size, new dkd(this, i - i4, i + max + i4, size));
            }
        }
    }

    public final void w(int i, List list) {
        if (dlm.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((dlj) list.get(i2)).r();
            }
            hashCode();
            list.size();
            String.valueOf(Arrays.toString(strArr)).length();
        }
        synchronized (this) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                dlj dljVar = (dlj) list.get(i3);
                t(dljVar);
                diz p = p(dljVar);
                if (!this.z) {
                    this.b.add(i + i3, p);
                    this.F.a(dljVar);
                } else {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
            }
        }
        this.e.l(i, list.size());
        dmp dmpVar = this.D;
        list.size();
        dmpVar.c(dmpVar.f(i, this.w));
    }

    public final void y() {
        if (!this.n.isEmpty() && this.ag) {
            RecyclerView recyclerView = this.t;
            if (recyclerView != null && recyclerView.at() && recyclerView.r && recyclerView.getWindowVisibility() == 0) {
                ViewParent viewParent = recyclerView;
                while (true) {
                    if (viewParent instanceof View) {
                        View view = (View) viewParent;
                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                            break;
                        }
                        viewParent = view.getParent();
                    } else if (recyclerView.getGlobalVisibleRect(L)) {
                        if (this.n.size() <= 20) {
                            return;
                        }
                        this.n.clear();
                        StringBuilder sb = new StringBuilder();
                        sb.append("recyclerView: ");
                        sb.append(recyclerView);
                        sb.append(", hasPendingAdapterUpdates(): ");
                        sb.append(recyclerView.at());
                        sb.append(", isAttachedToWindow(): ");
                        sb.append(recyclerView.r);
                        sb.append(", getWindowVisibility(): ");
                        sb.append(recyclerView.getWindowVisibility());
                        sb.append(", vie visible hierarchy: ");
                        ArrayList arrayList = new ArrayList();
                        ViewParent viewParent2 = recyclerView;
                        while (viewParent2 instanceof View) {
                            View view2 = (View) viewParent2;
                            String simpleName = view2.getClass().getSimpleName();
                            float alpha = view2.getAlpha();
                            int visibility = view2.getVisibility();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName).length() + 52);
                            sb2.append("view=");
                            sb2.append(simpleName);
                            sb2.append(", alpha=");
                            sb2.append(alpha);
                            sb2.append(", visibility=");
                            sb2.append(visibility);
                            arrayList.add(sb2.toString());
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            viewParent2 = view2.getParent();
                        }
                        sb.append(arrayList);
                        sb.append(", getGlobalVisibleRect(): ");
                        sb.append(recyclerView.getGlobalVisibleRect(L));
                        sb.append(", isComputingLayout(): ");
                        sb.append(recyclerView.av());
                        sb.append(", isSubAdapter: false, visible range: [");
                        sb.append(this.u);
                        sb.append(", ");
                        sb.append(this.v);
                        sb.append("]");
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 56);
                        sb3.append("@OnDataRendered callbacks aren't triggered as expected: ");
                        sb3.append(valueOf);
                        czq.a(2, "RecyclerBinder:DataRenderedNotTriggered", sb3.toString());
                        return;
                    }
                }
            }
            boolean z = recyclerView != null;
            ArrayDeque arrayDeque = new ArrayDeque(this.n);
            this.n.clear();
            this.g.postAtFrontOfQueue(new dkb(arrayDeque, z));
        }
    }

    public final void z() {
        if (this.t != null && this.D.d()) {
            this.t.removeCallbacks(this.G);
            lj.H(this.t, this.G);
        }
        T(this.u, this.v);
    }

    static boolean N(int i, int i2, int i3, boolean z) {
        if (i3 != 1) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                return false;
            }
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            return false;
        }
        return z;
    }
}
