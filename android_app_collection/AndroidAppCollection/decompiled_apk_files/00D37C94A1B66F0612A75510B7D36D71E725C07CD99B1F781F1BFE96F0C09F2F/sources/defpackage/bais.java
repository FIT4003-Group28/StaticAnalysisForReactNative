package defpackage;

import java.io.ObjectInputStream;
/* compiled from: PG */
/* renamed from: bais  reason: default package */
/* loaded from: classes2.dex */
public abstract class bais extends bait {
    private static final long serialVersionUID = -6728465968995518215L;
    private transient bahn A;
    private transient bahn B;
    private transient bahn C;
    private transient bahn D;
    private transient bahn E;
    private transient bahn F;
    private transient bahn H;
    private transient bahn I;

    /* renamed from: J  reason: collision with root package name */
    private transient bahn f136J;
    private transient bahn K;
    private transient bahn WN;
    public final bahl a;
    public final Object b;
    public transient bahv c;
    public transient bahv d;
    public transient bahv e;
    public transient bahv f;
    public transient bahv g;
    public transient bahn h;
    public transient bahn i;
    public transient bahn j;
    public transient bahn k;
    public transient bahn l;
    public transient bahn m;
    private transient bahv n;
    private transient bahv o;
    private transient bahv p;
    private transient bahv q;
    private transient bahv r;
    private transient bahv s;
    private transient bahv t;
    private transient bahn u;
    private transient bahn v;
    private transient bahn w;
    private transient bahn x;
    private transient bahn y;
    private transient bahn z;

    /* JADX INFO: Access modifiers changed from: protected */
    public bais(bahl bahlVar, Object obj) {
        this.a = bahlVar;
        this.b = obj;
        O();
    }

    private final void O() {
        bair bairVar = new bair();
        bahl bahlVar = this.a;
        if (bahlVar != null) {
            bahv F = bahlVar.F();
            if (bair.b(F)) {
                bairVar.a = F;
            }
            bahv I = bahlVar.I();
            if (bair.b(I)) {
                bairVar.b = I;
            }
            bahv G = bahlVar.G();
            if (bair.b(G)) {
                bairVar.c = G;
            }
            bahv E = bahlVar.E();
            if (bair.b(E)) {
                bairVar.d = E;
            }
            bahv D = bahlVar.D();
            if (bair.b(D)) {
                bairVar.e = D;
            }
            bahv B = bahlVar.B();
            if (bair.b(B)) {
                bairVar.f = B;
            }
            bahv J2 = bahlVar.J();
            if (bair.b(J2)) {
                bairVar.g = J2;
            }
            bahv K = bahlVar.K();
            if (bair.b(K)) {
                bairVar.h = K;
            }
            bahv H = bahlVar.H();
            if (bair.b(H)) {
                bairVar.i = H;
            }
            bahv L = bahlVar.L();
            if (bair.b(L)) {
                bairVar.j = L;
            }
            bahv A = bahlVar.A();
            if (bair.b(A)) {
                bairVar.k = A;
            }
            bahv C = bahlVar.C();
            if (bair.b(C)) {
                bairVar.l = C;
            }
            bahn n = bahlVar.n();
            if (bair.a(n)) {
                bairVar.m = n;
            }
            bahn m = bahlVar.m();
            if (bair.a(m)) {
                bairVar.n = m;
            }
            bahn s = bahlVar.s();
            if (bair.a(s)) {
                bairVar.o = s;
            }
            bahn r = bahlVar.r();
            if (bair.a(r)) {
                bairVar.p = r;
            }
            bahn p = bahlVar.p();
            if (bair.a(p)) {
                bairVar.q = p;
            }
            bahn o = bahlVar.o();
            if (bair.a(o)) {
                bairVar.r = o;
            }
            bahn k = bahlVar.k();
            if (bair.a(k)) {
                bairVar.s = k;
            }
            bahn d = bahlVar.d();
            if (bair.a(d)) {
                bairVar.t = d;
            }
            bahn l = bahlVar.l();
            if (bair.a(l)) {
                bairVar.u = l;
            }
            bahn e = bahlVar.e();
            if (bair.a(e)) {
                bairVar.v = e;
            }
            bahn j = bahlVar.j();
            if (bair.a(j)) {
                bairVar.w = j;
            }
            bahn g = bahlVar.g();
            if (bair.a(g)) {
                bairVar.x = g;
            }
            bahn f = bahlVar.f();
            if (bair.a(f)) {
                bairVar.y = f;
            }
            bahn h = bahlVar.h();
            if (bair.a(h)) {
                bairVar.z = h;
            }
            bahn t = bahlVar.t();
            if (bair.a(t)) {
                bairVar.A = t;
            }
            bahn u = bahlVar.u();
            if (bair.a(u)) {
                bairVar.B = u;
            }
            bahn v = bahlVar.v();
            if (bair.a(v)) {
                bairVar.C = v;
            }
            bahn q = bahlVar.q();
            if (bair.a(q)) {
                bairVar.D = q;
            }
            bahn w = bahlVar.w();
            if (bair.a(w)) {
                bairVar.E = w;
            }
            bahn y = bahlVar.y();
            if (bair.a(y)) {
                bairVar.F = y;
            }
            bahn x = bahlVar.x();
            if (bair.a(x)) {
                bairVar.G = x;
            }
            bahn c = bahlVar.c();
            if (bair.a(c)) {
                bairVar.H = c;
            }
            bahn i = bahlVar.i();
            if (bair.a(i)) {
                bairVar.I = i;
            }
        }
        N(bairVar);
        bahv bahvVar = bairVar.a;
        if (bahvVar == null) {
            bahvVar = super.F();
        }
        this.n = bahvVar;
        bahv bahvVar2 = bairVar.b;
        if (bahvVar2 == null) {
            bahvVar2 = super.I();
        }
        this.o = bahvVar2;
        bahv bahvVar3 = bairVar.c;
        if (bahvVar3 == null) {
            bahvVar3 = super.G();
        }
        this.p = bahvVar3;
        bahv bahvVar4 = bairVar.d;
        if (bahvVar4 == null) {
            bahvVar4 = super.E();
        }
        this.q = bahvVar4;
        bahv bahvVar5 = bairVar.e;
        if (bahvVar5 == null) {
            bahvVar5 = super.D();
        }
        this.r = bahvVar5;
        bahv bahvVar6 = bairVar.f;
        if (bahvVar6 == null) {
            bahvVar6 = super.B();
        }
        this.c = bahvVar6;
        bahv bahvVar7 = bairVar.g;
        if (bahvVar7 == null) {
            bahvVar7 = super.J();
        }
        this.d = bahvVar7;
        bahv bahvVar8 = bairVar.h;
        if (bahvVar8 == null) {
            bahvVar8 = super.K();
        }
        this.e = bahvVar8;
        bahv bahvVar9 = bairVar.i;
        if (bahvVar9 == null) {
            bahvVar9 = super.H();
        }
        this.f = bahvVar9;
        bahv bahvVar10 = bairVar.j;
        if (bahvVar10 == null) {
            bahvVar10 = super.L();
        }
        this.g = bahvVar10;
        bahv bahvVar11 = bairVar.k;
        if (bahvVar11 == null) {
            bahvVar11 = super.A();
        }
        this.s = bahvVar11;
        bahv bahvVar12 = bairVar.l;
        if (bahvVar12 == null) {
            bahvVar12 = super.C();
        }
        this.t = bahvVar12;
        bahn bahnVar = bairVar.m;
        if (bahnVar == null) {
            bahnVar = super.n();
        }
        this.u = bahnVar;
        bahn bahnVar2 = bairVar.n;
        if (bahnVar2 == null) {
            bahnVar2 = super.m();
        }
        this.h = bahnVar2;
        bahn bahnVar3 = bairVar.o;
        if (bahnVar3 == null) {
            bahnVar3 = super.s();
        }
        this.v = bahnVar3;
        bahn bahnVar4 = bairVar.p;
        if (bahnVar4 == null) {
            bahnVar4 = super.r();
        }
        this.w = bahnVar4;
        bahn bahnVar5 = bairVar.q;
        if (bahnVar5 == null) {
            bahnVar5 = super.p();
        }
        this.x = bahnVar5;
        bahn bahnVar6 = bairVar.r;
        if (bahnVar6 == null) {
            bahnVar6 = super.o();
        }
        this.y = bahnVar6;
        bahn bahnVar7 = bairVar.s;
        if (bahnVar7 == null) {
            bahnVar7 = super.k();
        }
        this.z = bahnVar7;
        bahn bahnVar8 = bairVar.t;
        if (bahnVar8 == null) {
            bahnVar8 = super.d();
        }
        this.A = bahnVar8;
        bahn bahnVar9 = bairVar.u;
        if (bahnVar9 == null) {
            bahnVar9 = super.l();
        }
        this.B = bahnVar9;
        bahn bahnVar10 = bairVar.v;
        if (bahnVar10 == null) {
            bahnVar10 = super.e();
        }
        this.C = bahnVar10;
        bahn bahnVar11 = bairVar.w;
        if (bahnVar11 == null) {
            bahnVar11 = super.j();
        }
        this.D = bahnVar11;
        bahn bahnVar12 = bairVar.x;
        if (bahnVar12 == null) {
            bahnVar12 = super.g();
        }
        this.i = bahnVar12;
        bahn bahnVar13 = bairVar.y;
        if (bahnVar13 == null) {
            bahnVar13 = super.f();
        }
        this.j = bahnVar13;
        bahn bahnVar14 = bairVar.z;
        if (bahnVar14 == null) {
            bahnVar14 = super.h();
        }
        this.E = bahnVar14;
        bahn bahnVar15 = bairVar.A;
        if (bahnVar15 == null) {
            bahnVar15 = super.t();
        }
        this.k = bahnVar15;
        bahn bahnVar16 = bairVar.B;
        if (bahnVar16 == null) {
            bahnVar16 = super.u();
        }
        this.F = bahnVar16;
        bahn bahnVar17 = bairVar.C;
        if (bahnVar17 == null) {
            bahnVar17 = super.v();
        }
        this.WN = bahnVar17;
        bahn bahnVar18 = bairVar.D;
        if (bahnVar18 == null) {
            bahnVar18 = super.q();
        }
        this.l = bahnVar18;
        bahn bahnVar19 = bairVar.E;
        if (bahnVar19 == null) {
            bahnVar19 = super.w();
        }
        this.m = bahnVar19;
        bahn bahnVar20 = bairVar.F;
        if (bahnVar20 == null) {
            bahnVar20 = super.y();
        }
        this.H = bahnVar20;
        bahn bahnVar21 = bairVar.G;
        if (bahnVar21 == null) {
            bahnVar21 = super.x();
        }
        this.I = bahnVar21;
        bahn bahnVar22 = bairVar.H;
        if (bahnVar22 == null) {
            bahnVar22 = super.c();
        }
        this.f136J = bahnVar22;
        bahn bahnVar23 = bairVar.I;
        if (bahnVar23 == null) {
            bahnVar23 = super.i();
        }
        this.K = bahnVar23;
        bahl bahlVar2 = this.a;
        if (bahlVar2 == null) {
            return;
        }
        if (this.z == bahlVar2.k() && this.x == this.a.p() && this.v == this.a.s()) {
            this.a.n();
        }
        this.a.m();
        if (this.m != this.a.w() || this.l != this.a.q()) {
            return;
        }
        this.a.f();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        O();
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv A() {
        return this.s;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv B() {
        return this.c;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv C() {
        return this.t;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv D() {
        return this.r;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv E() {
        return this.q;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv F() {
        return this.n;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv G() {
        return this.p;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv H() {
        return this.f;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv I() {
        return this.o;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv J() {
        return this.d;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv K() {
        return this.e;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahv L() {
        return this.g;
    }

    protected abstract void N(bair bairVar);

    @Override // defpackage.bait, defpackage.bahl
    public final bahn c() {
        return this.f136J;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn d() {
        return this.A;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn e() {
        return this.C;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn f() {
        return this.j;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn g() {
        return this.i;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn h() {
        return this.E;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn i() {
        return this.K;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn j() {
        return this.D;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn k() {
        return this.z;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn l() {
        return this.B;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn m() {
        return this.h;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn n() {
        return this.u;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn o() {
        return this.y;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn p() {
        return this.x;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn q() {
        return this.l;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn r() {
        return this.w;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn s() {
        return this.v;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn t() {
        return this.k;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn u() {
        return this.F;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn v() {
        return this.WN;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn w() {
        return this.m;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn x() {
        return this.I;
    }

    @Override // defpackage.bait, defpackage.bahl
    public final bahn y() {
        return this.H;
    }

    @Override // defpackage.bahl
    public baht z() {
        bahl bahlVar = this.a;
        if (bahlVar != null) {
            return bahlVar.z();
        }
        return null;
    }
}
