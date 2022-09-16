package com.facebook.react.uimanager;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class b0 implements a0<b0> {
    private static final com.facebook.yoga.c y = d0.a();

    /* renamed from: b  reason: collision with root package name */
    private int f5866b;

    /* renamed from: c  reason: collision with root package name */
    private String f5867c;

    /* renamed from: d  reason: collision with root package name */
    private int f5868d;

    /* renamed from: e  reason: collision with root package name */
    private k0 f5869e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5870f;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<b0> f5872h;
    private b0 i;
    private b0 j;
    private boolean k;
    private b0 m;
    private ArrayList<b0> n;
    private int o;
    private int p;
    private int q;
    private int r;
    private com.facebook.yoga.p v;
    private Integer w;
    private Integer x;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5871g = true;
    private int l = 0;
    private final float[] t = new float[9];
    private final boolean[] u = new boolean[9];
    private final i0 s = new i0(0.0f);

    public b0() {
        if (y()) {
            this.v = null;
            return;
        }
        com.facebook.yoga.p a2 = d1.a().a();
        this.v = a2 == null ? com.facebook.yoga.q.a(y) : a2;
        this.v.a(this);
        Arrays.fill(this.t, Float.NaN);
    }

    private int R() {
        l j = j();
        if (j == l.NONE) {
            return this.l;
        }
        if (j != l.LEAF) {
            return 1;
        }
        return 1 + this.l;
    }

    private void S() {
        com.facebook.yoga.p pVar;
        com.facebook.yoga.j a2;
        float b2;
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5 ? !(!com.facebook.yoga.g.a(this.t[i]) || !com.facebook.yoga.g.a(this.t[6]) || !com.facebook.yoga.g.a(this.t[8])) : !(i == 1 || i == 3 ? !com.facebook.yoga.g.a(this.t[i]) || !com.facebook.yoga.g.a(this.t[7]) || !com.facebook.yoga.g.a(this.t[8]) : !com.facebook.yoga.g.a(this.t[i]))) {
                pVar = this.v;
                a2 = com.facebook.yoga.j.a(i);
                b2 = this.s.b(i);
            } else if (this.u[i]) {
                this.v.e(com.facebook.yoga.j.a(i), this.t[i]);
            } else {
                pVar = this.v;
                a2 = com.facebook.yoga.j.a(i);
                b2 = this.t[i];
            }
            pVar.d(a2, b2);
        }
    }

    private void h(int i) {
        if (j() != l.PARENT) {
            for (b0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.l += i;
                if (parent.j() == l.PARENT) {
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 A() {
        return this.m;
    }

    @Override // com.facebook.react.uimanager.a0
    public final boolean B() {
        return this.k;
    }

    public final com.facebook.yoga.h C() {
        return this.v.c();
    }

    public final float D() {
        return this.v.d();
    }

    public final float E() {
        return this.v.e();
    }

    public final boolean F() {
        com.facebook.yoga.p pVar = this.v;
        return pVar != null && pVar.i();
    }

    public boolean G() {
        return false;
    }

    public final boolean H() {
        com.facebook.yoga.p pVar = this.v;
        return pVar != null && pVar.j();
    }

    public boolean I() {
        return this.v.k();
    }

    public boolean J() {
        return false;
    }

    public boolean K() {
        return I();
    }

    public final void L() {
        com.facebook.yoga.p pVar = this.v;
        if (pVar != null) {
            pVar.l();
        }
    }

    public void M() {
        if (this.f5871g) {
            return;
        }
        this.f5871g = true;
        b0 parent = getParent();
        if (parent == null) {
            return;
        }
        parent.M();
    }

    public void N() {
    }

    public void O() {
        this.v.n();
    }

    public void P() {
        this.v.o();
    }

    public void Q() {
        this.v.p();
    }

    @Override // com.facebook.react.uimanager.a0
    public final int a() {
        ArrayList<b0> arrayList = this.f5872h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.a0
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final int d(b0 b0Var) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= a()) {
                break;
            }
            b0 a2 = a(i);
            if (b0Var == a2) {
                z = true;
                break;
            }
            i2 += a2.R();
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException("Child " + b0Var.t() + " was not a child of " + this.f5866b);
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 a(int i) {
        ArrayList<b0> arrayList = this.f5872h;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(float f2) {
        this.v.g(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(float f2, float f3) {
        this.v.a(f2, f3);
    }

    public void a(int i, float f2) {
        this.v.a(com.facebook.yoga.j.a(i), f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(int i, int i2) {
        this.w = Integer.valueOf(i);
        this.x = Integer.valueOf(i2);
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(b0 b0Var, int i) {
        if (this.f5872h == null) {
            this.f5872h = new ArrayList<>(4);
        }
        this.f5872h.add(i, b0Var);
        b0Var.i = this;
        if (this.v != null && !K()) {
            com.facebook.yoga.p pVar = b0Var.v;
            if (pVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + b0Var.toString() + "' to a '" + toString() + "')");
            }
            this.v.a(pVar, i);
        }
        M();
        int R = b0Var.R();
        this.l += R;
        h(R);
    }

    @Override // com.facebook.react.uimanager.a0
    public final void a(c0 c0Var) {
        z0.a(this, c0Var);
        N();
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(k0 k0Var) {
        this.f5869e = k0Var;
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(n nVar) {
    }

    public void a(v0 v0Var) {
    }

    public void a(com.facebook.yoga.a aVar) {
        this.v.a(aVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(com.facebook.yoga.h hVar) {
        this.v.a(hVar);
    }

    public void a(com.facebook.yoga.i iVar) {
        this.v.a(iVar);
    }

    public void a(com.facebook.yoga.k kVar) {
        this.v.a(kVar);
    }

    public void a(com.facebook.yoga.l lVar) {
        this.v.a(lVar);
    }

    public void a(com.facebook.yoga.m mVar) {
        this.v.a(mVar);
    }

    public void a(com.facebook.yoga.s sVar) {
        this.v.a(sVar);
    }

    public void a(com.facebook.yoga.t tVar) {
        this.v.a(tVar);
    }

    public void a(com.facebook.yoga.w wVar) {
        this.v.a(wVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public void a(Object obj) {
    }

    @Override // com.facebook.react.uimanager.a0
    public final void a(String str) {
        this.f5867c = str;
    }

    @Override // com.facebook.react.uimanager.a0
    public final void a(boolean z) {
        boolean z2 = true;
        c.d.k.a.a.a(getParent() == null, "Must remove from no opt parent first");
        c.d.k.a.a.a(this.m == null, "Must remove from native parent first");
        if (z() != 0) {
            z2 = false;
        }
        c.d.k.a.a.a(z2, "Must remove all native children first");
        this.k = z;
    }

    @Override // com.facebook.react.uimanager.a0
    public boolean a(float f2, float f3, v0 v0Var, n nVar) {
        if (this.f5871g) {
            a(v0Var);
        }
        boolean z = false;
        if (F()) {
            float u = u();
            float p = p();
            float f4 = f2 + u;
            int round = Math.round(f4);
            float f5 = f3 + p;
            int round2 = Math.round(f5);
            int round3 = Math.round(f4 + E());
            int round4 = Math.round(f5 + D());
            int round5 = Math.round(u);
            int round6 = Math.round(p);
            int i = round3 - round;
            int i2 = round4 - round2;
            if (round5 != this.o || round6 != this.p || i != this.q || i2 != this.r) {
                z = true;
            }
            this.o = round5;
            this.p = round6;
            this.q = i;
            this.r = i2;
            if (z) {
                if (nVar != null) {
                    nVar.b(this);
                } else {
                    v0Var.a(getParent().t(), t(), q(), h(), b(), c());
                }
            }
        }
        return z;
    }

    @Override // com.facebook.react.uimanager.a0
    public int b() {
        return this.q;
    }

    @Override // com.facebook.react.uimanager.a0
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public final int a(b0 b0Var) {
        ArrayList<b0> arrayList = this.f5872h;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(b0Var);
    }

    @Override // com.facebook.react.uimanager.a0
    public b0 b(int i) {
        ArrayList<b0> arrayList = this.f5872h;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        b0 remove = arrayList.remove(i);
        remove.i = null;
        if (this.v != null && !K()) {
            this.v.mo250a(i);
        }
        M();
        int R = remove.R();
        this.l -= R;
        h(-R);
        return remove;
    }

    @Override // com.facebook.react.uimanager.a0
    public void b(float f2) {
        this.v.q(f2);
    }

    public void b(int i, float f2) {
        this.s.a(i, f2);
        S();
    }

    @Override // com.facebook.react.uimanager.a0
    public final void b(b0 b0Var, int i) {
        boolean z = true;
        c.d.k.a.a.a(j() == l.PARENT);
        if (b0Var.j() == l.NONE) {
            z = false;
        }
        c.d.k.a.a.a(z);
        if (this.n == null) {
            this.n = new ArrayList<>(4);
        }
        this.n.add(i, b0Var);
        b0Var.m = this;
    }

    public void b(com.facebook.yoga.a aVar) {
        this.v.b(aVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public int c() {
        return this.r;
    }

    @Override // com.facebook.react.uimanager.a0
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public final int e(b0 b0Var) {
        c.d.k.a.a.a(this.n);
        return this.n.indexOf(b0Var);
    }

    public void c(float f2) {
        this.v.c(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public void c(int i) {
        this.f5866b = i;
    }

    public void c(int i, float f2) {
        this.v.b(com.facebook.yoga.j.a(i), f2);
    }

    public void c(com.facebook.yoga.a aVar) {
        this.v.c(aVar);
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 d(int i) {
        c.d.k.a.a.a(this.n);
        b0 remove = this.n.remove(i);
        remove.m = null;
        return remove;
    }

    @Override // com.facebook.react.uimanager.a0
    public final com.facebook.yoga.v d() {
        return this.v.h();
    }

    public void d(float f2) {
        this.v.d(f2);
    }

    public void d(int i, float f2) {
        this.v.c(com.facebook.yoga.j.a(i), f2);
    }

    @Override // com.facebook.react.uimanager.a0
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public boolean c(b0 b0Var) {
        for (b0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == b0Var) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.a0
    public final void e() {
        this.f5871g = false;
        if (F()) {
            L();
        }
    }

    public void e(float f2) {
        this.v.a(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public final void e(int i) {
        this.f5868d = i;
    }

    public void e(int i, float f2) {
        this.t[i] = f2;
        this.u[i] = false;
        S();
    }

    @Override // com.facebook.react.uimanager.a0
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public final void b(b0 b0Var) {
        this.j = b0Var;
    }

    public final float f(int i) {
        return this.v.a(com.facebook.yoga.j.a(i));
    }

    @Override // com.facebook.react.uimanager.a0
    public void f() {
        com.facebook.yoga.p pVar = this.v;
        if (pVar != null) {
            pVar.m();
            d1.a().a(this.v);
        }
    }

    public void f(float f2) {
        this.v.h(f2);
    }

    public void f(int i, float f2) {
        this.t[i] = f2;
        this.u[i] = !com.facebook.yoga.g.a(f2);
        S();
    }

    @Override // com.facebook.react.uimanager.a0
    public void g() {
        if (!y()) {
            this.v.a();
        } else if (getParent() == null) {
        } else {
            getParent().g();
        }
    }

    public void g(float f2) {
        this.v.i(f2);
    }

    public void g(int i) {
        this.v.b(com.facebook.yoga.j.a(i));
    }

    public void g(int i, float f2) {
        this.v.f(com.facebook.yoga.j.a(i), f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public Integer getHeightMeasureSpec() {
        return this.x;
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 getParent() {
        return this.i;
    }

    @Override // com.facebook.react.uimanager.a0
    public Integer getWidthMeasureSpec() {
        return this.w;
    }

    @Override // com.facebook.react.uimanager.a0
    public int h() {
        return this.p;
    }

    public void h(float f2) {
        this.v.j(f2);
    }

    public void h(int i, float f2) {
        this.v.g(com.facebook.yoga.j.a(i), f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public final k0 i() {
        k0 k0Var = this.f5869e;
        c.d.k.a.a.a(k0Var);
        return k0Var;
    }

    public void i(float f2) {
        this.v.k(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public l j() {
        return (y() || B()) ? l.NONE : G() ? l.LEAF : l.PARENT;
    }

    public void j(float f2) {
        this.v.l(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public final int k() {
        c.d.k.a.a.a(this.f5868d != 0);
        return this.f5868d;
    }

    public void k(float f2) {
        this.v.m(f2);
    }

    public void l(float f2) {
        this.v.n(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public final boolean l() {
        return this.f5870f;
    }

    @Override // com.facebook.react.uimanager.a0
    public final String m() {
        String str = this.f5867c;
        c.d.k.a.a.a(str);
        return str;
    }

    public void m(float f2) {
        this.v.o(f2);
    }

    public void n(float f2) {
        this.v.p(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public final boolean n() {
        return this.f5871g || F() || H();
    }

    @Override // com.facebook.react.uimanager.a0
    public final com.facebook.yoga.v o() {
        return this.v.b();
    }

    public void o(float f2) {
        this.v.r(f2);
    }

    @Override // com.facebook.react.uimanager.a0
    public final float p() {
        return this.v.g();
    }

    @Override // com.facebook.react.uimanager.a0
    public int q() {
        return this.o;
    }

    @Override // com.facebook.react.uimanager.a0
    public Iterable<? extends a0> r() {
        if (J()) {
            return null;
        }
        return this.f5872h;
    }

    @Override // com.facebook.react.uimanager.a0
    public void s() {
        if (a() == 0) {
            return;
        }
        int i = 0;
        for (int a2 = a() - 1; a2 >= 0; a2--) {
            if (this.v != null && !K()) {
                this.v.mo250a(a2);
            }
            b0 a3 = a(a2);
            a3.i = null;
            i += a3.R();
            a3.f();
        }
        ArrayList<b0> arrayList = this.f5872h;
        c.d.k.a.a.a(arrayList);
        arrayList.clear();
        M();
        this.l -= i;
        h(-i);
    }

    public void setFlex(float f2) {
        this.v.b(f2);
    }

    public void setFlexGrow(float f2) {
        this.v.e(f2);
    }

    public void setFlexShrink(float f2) {
        this.v.f(f2);
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.f5870f = z;
    }

    @Override // com.facebook.react.uimanager.a0
    public final int t() {
        return this.f5866b;
    }

    public String toString() {
        return "[" + this.f5867c + " " + t() + "]";
    }

    @Override // com.facebook.react.uimanager.a0
    public final float u() {
        return this.v.f();
    }

    @Override // com.facebook.react.uimanager.a0
    public final void v() {
        ArrayList<b0> arrayList = this.n;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.n.get(size).m = null;
            }
            this.n.clear();
        }
    }

    @Override // com.facebook.react.uimanager.a0
    public void w() {
        a(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.a0
    public final b0 x() {
        b0 b0Var = this.j;
        return b0Var != null ? b0Var : A();
    }

    @Override // com.facebook.react.uimanager.a0
    public boolean y() {
        return false;
    }

    @Override // com.facebook.react.uimanager.a0
    public final int z() {
        ArrayList<b0> arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
