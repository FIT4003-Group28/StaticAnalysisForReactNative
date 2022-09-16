package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ed  reason: default package */
/* loaded from: classes6.dex */
public class ed {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    ed ab;
    ed ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final ec i;
    final ec j;
    final ec k;
    final ec l;
    final ec m;
    final ec n;
    final ec o;
    final ec p;
    protected final ArrayList<ec> q;
    public ed r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public ed() {
        ec ecVar = new ec(this, 2);
        this.i = ecVar;
        ec ecVar2 = new ec(this, 3);
        this.j = ecVar2;
        ec ecVar3 = new ec(this, 4);
        this.k = ecVar3;
        ec ecVar4 = new ec(this, 5);
        this.l = ecVar4;
        ec ecVar5 = new ec(this, 6);
        this.m = ecVar5;
        ec ecVar6 = new ec(this, 8);
        this.n = ecVar6;
        ec ecVar7 = new ec(this, 9);
        this.o = ecVar7;
        this.p = new ec(this, 7);
        ArrayList<ec> arrayList = new ArrayList<>();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(ecVar);
        arrayList.add(ecVar2);
        arrayList.add(ecVar3);
        arrayList.add(ecVar4);
        arrayList.add(ecVar6);
        arrayList.add(ecVar7);
        arrayList.add(ecVar5);
    }

    private final void A(dy dyVar, boolean z, boolean z2, ec ecVar, ec ecVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8;
        int i9 = i6;
        ea b = dyVar.b(ecVar);
        ea b2 = dyVar.b(ecVar2);
        ea b3 = dyVar.b(ecVar.b);
        ea b4 = dyVar.b(ecVar2.b);
        int a = ecVar.a();
        int a2 = ecVar2.a();
        int i10 = this.K;
        boolean z5 = i10 != 8;
        int i11 = i10 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (b3 == null && b4 == null) {
            dv c = dyVar.c();
            c.g(b, i);
            dyVar.g(c);
            if (z3) {
                return;
            }
            if (z) {
                dyVar.g(dy.k(dyVar, b2, b, i4, true));
            } else if (z6) {
                dyVar.g(dy.k(dyVar, b2, b, i11, false));
            } else {
                dv c2 = dyVar.c();
                c2.g(b2, i2);
                dyVar.g(c2);
            }
        } else if (b3 != null && b4 == null) {
            dv c3 = dyVar.c();
            c3.h(b, b3, a);
            dyVar.g(c3);
            if (z) {
                dyVar.g(dy.k(dyVar, b2, b, i4, true));
            } else if (z3) {
            } else {
                if (z6) {
                    dv c4 = dyVar.c();
                    c4.h(b2, b, i11);
                    dyVar.g(c4);
                    return;
                }
                dv c5 = dyVar.c();
                c5.g(b2, i2);
                dyVar.g(c5);
            }
        } else if (b3 == null) {
            dv c6 = dyVar.c();
            c6.h(b2, b4, -a2);
            dyVar.g(c6);
            if (z) {
                dyVar.g(dy.k(dyVar, b2, b, i4, true));
            } else if (z3) {
            } else {
                if (z6) {
                    dv c7 = dyVar.c();
                    c7.h(b2, b, i11);
                    dyVar.g(c7);
                    return;
                }
                dv c8 = dyVar.c();
                c8.g(b, i);
                dyVar.g(c8);
            }
        } else if (!z6) {
            if (z3) {
                dyVar.h(b, b3, a, 3);
                dyVar.i(b2, b4, -a2, 3);
                dyVar.g(dy.l(dyVar, b, b3, a, f, b4, b2, a2, true));
            } else if (z4) {
            } else {
                if (i5 != 1) {
                    if (i9 != 0 || i7 != 0) {
                        if (i7 > 0) {
                            dyVar.i(b2, b, i7, 3);
                        }
                        dyVar.h(b, b3, a, 2);
                        dyVar.i(b2, b4, -a2, 2);
                        dyVar.m(b, b3, a, f, b4, b2, a2);
                        return;
                    }
                    dv c9 = dyVar.c();
                    c9.h(b, b3, a);
                    dyVar.g(c9);
                    dv c10 = dyVar.c();
                    c10.h(b2, b4, -a2);
                    dyVar.g(c10);
                    return;
                }
                if (i9 > i11) {
                    i8 = i7;
                } else {
                    i8 = i7;
                    i9 = i11;
                }
                if (i8 > 0) {
                    if (i8 >= i9) {
                        dyVar.i(b2, b, i8, 3);
                    }
                    dyVar.n(b2, b, i8, 3);
                    dyVar.h(b, b3, a, 2);
                    dyVar.i(b2, b4, -a2, 2);
                    dyVar.m(b, b3, a, f, b4, b2, a2);
                }
                i8 = i9;
                dyVar.n(b2, b, i8, 3);
                dyVar.h(b, b3, a, 2);
                dyVar.i(b2, b4, -a2, 2);
                dyVar.m(b, b3, a, f, b4, b2, a2);
            }
        } else {
            if (z) {
                dyVar.g(dy.k(dyVar, b2, b, i4, true));
            } else {
                dv c11 = dyVar.c();
                c11.h(b2, b, i11);
                dyVar.g(c11);
            }
            int i12 = ecVar.h;
            if (i12 != ecVar2.h) {
                if (i12 == 2) {
                    dv c12 = dyVar.c();
                    c12.h(b, b3, a);
                    dyVar.g(c12);
                    ea d = dyVar.d();
                    dv c13 = dyVar.c();
                    c13.j(b2, b4, d, -a2);
                    dyVar.g(c13);
                    return;
                }
                ea d2 = dyVar.d();
                dv c14 = dyVar.c();
                c14.i(b, b3, d2, a);
                dyVar.g(c14);
                dv c15 = dyVar.c();
                c15.h(b2, b4, -a2);
                dyVar.g(c15);
            } else if (b3 == b4) {
                dyVar.g(dy.l(dyVar, b, b3, 0, 0.5f, b4, b2, 0, true));
            } else if (z4) {
            } else {
                int i13 = ecVar.i;
                ea d3 = dyVar.d();
                dv c16 = dyVar.c();
                c16.i(b, b3, d3, a);
                if (i13 != 2) {
                    dyVar.e(c16, (int) (-c16.d.g(d3)));
                }
                dyVar.g(c16);
                int i14 = ecVar2.i;
                ea d4 = dyVar.d();
                dv c17 = dyVar.c();
                c17.j(b2, b4, d4, -a2);
                if (i14 != 2) {
                    dyVar.e(c17, (int) (-c17.d.g(d4)));
                }
                dyVar.g(c17);
                dyVar.g(dy.l(dyVar, b, b3, a, f, b4, b2, a2, false));
            }
        }
    }

    public void a() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public void b(dw dwVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }

    public final boolean c() {
        return this.r == null;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public final int e() {
        int i = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                i = Math.max(this.e, i);
            } else {
                i = this.e;
                if (i > 0) {
                    this.s = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.f;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int f() {
        int i = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                i = Math.max(this.g, i);
            } else {
                i = this.g;
                if (i > 0) {
                    this.t = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.h;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int g() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int h() {
        return this.af + this.A;
    }

    public final int i() {
        return this.ag + this.B;
    }

    public final int j() {
        return this.w + this.s;
    }

    public final int k() {
        return this.x + this.t;
    }

    public final boolean l() {
        return this.C > 0;
    }

    public void m(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public void n() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s;
        int i4 = this.t;
        this.af = i;
        this.ag = i2;
        this.y = (i3 + i) - i;
        this.z = (i4 + i2) - i2;
    }

    public final void o(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public final void p(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void q(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public final void r(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void s(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void t(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public final void u(int i, ed edVar, int i2, int i3, int i4) {
        v(i).d(edVar.v(i2), i3, i4, 2, 0, true);
    }

    public ec v(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final void w(int i) {
        this.ad = i;
        if (i == 2) {
            o(this.F);
        }
    }

    public final void x(int i) {
        this.ae = i;
        if (i == 2) {
            p(this.G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01ec, code lost:
        if (r13 != (-1)) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(defpackage.dy r42) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed.y(dy):void");
    }

    public void z() {
        int i;
        int i2;
        int p = dy.p(this.i);
        int p2 = dy.p(this.j);
        int p3 = dy.p(this.k) - p;
        int p4 = dy.p(this.l) - p2;
        this.w = p;
        this.x = p2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && p3 < (i2 = this.s)) {
            p3 = i2;
        }
        if (this.ae == 1 && p4 < (i = this.t)) {
            p4 = i;
        }
        this.s = p3;
        this.t = p4;
        int i3 = this.E;
        if (p4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (p3 >= i4) {
            return;
        }
        this.s = i4;
    }
}
