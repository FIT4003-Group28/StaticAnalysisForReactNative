package defpackage;

import java.io.ObjectInputStream;
/* compiled from: PG */
/* renamed from: eaqp  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqp extends eaqq {
    private static final long serialVersionUID = -6728465968995518215L;
    public transient eaon A;
    public transient eaon B;
    public transient eaon C;
    public transient eaon D;
    private transient eaox E;
    private transient eaox F;
    private transient eaox G;
    private transient eaox KZ;
    private transient eaox La;
    private transient eaox Lb;
    private transient eaox Lc;
    private transient int Ld;
    public final eaok a;
    public final Object b;
    public transient eaox c;
    public transient eaox d;
    public transient eaox e;
    public transient eaox f;
    public transient eaox g;
    public transient eaon h;
    public transient eaon i;
    public transient eaon j;
    public transient eaon k;
    public transient eaon l;
    public transient eaon m;
    public transient eaon n;
    public transient eaon o;
    public transient eaon p;
    public transient eaon q;
    public transient eaon r;
    public transient eaon s;
    public transient eaon t;
    public transient eaon u;
    public transient eaon v;
    public transient eaon w;
    public transient eaon x;
    public transient eaon y;
    public transient eaon z;

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqp(eaok eaokVar, Object obj) {
        this.a = eaokVar;
        this.b = obj;
        W();
    }

    private final void W() {
        eaqo eaqoVar = new eaqo();
        eaok eaokVar = this.a;
        if (eaokVar != null) {
            eaqoVar.a(eaokVar);
        }
        V(eaqoVar);
        eaox eaoxVar = eaqoVar.a;
        if (eaoxVar == null) {
            eaoxVar = super.l();
        }
        this.E = eaoxVar;
        eaox eaoxVar2 = eaqoVar.b;
        if (eaoxVar2 == null) {
            eaoxVar2 = super.o();
        }
        this.F = eaoxVar2;
        eaox eaoxVar3 = eaqoVar.c;
        if (eaoxVar3 == null) {
            eaoxVar3 = super.r();
        }
        this.G = eaoxVar3;
        eaox eaoxVar4 = eaqoVar.d;
        if (eaoxVar4 == null) {
            eaoxVar4 = super.u();
        }
        this.KZ = eaoxVar4;
        eaox eaoxVar5 = eaqoVar.e;
        if (eaoxVar5 == null) {
            eaoxVar5 = super.x();
        }
        this.La = eaoxVar5;
        eaox eaoxVar6 = eaqoVar.f;
        if (eaoxVar6 == null) {
            eaoxVar6 = super.B();
        }
        this.c = eaoxVar6;
        eaox eaoxVar7 = eaqoVar.g;
        if (eaoxVar7 == null) {
            eaoxVar7 = super.F();
        }
        this.d = eaoxVar7;
        eaox eaoxVar8 = eaqoVar.h;
        if (eaoxVar8 == null) {
            eaoxVar8 = super.H();
        }
        this.e = eaoxVar8;
        eaox eaoxVar9 = eaqoVar.i;
        if (eaoxVar9 == null) {
            eaoxVar9 = super.K();
        }
        this.f = eaoxVar9;
        eaox eaoxVar10 = eaqoVar.j;
        if (eaoxVar10 == null) {
            eaoxVar10 = super.M();
        }
        this.g = eaoxVar10;
        eaox eaoxVar11 = eaqoVar.k;
        if (eaoxVar11 == null) {
            eaoxVar11 = super.Q();
        }
        this.Lb = eaoxVar11;
        eaox eaoxVar12 = eaqoVar.l;
        if (eaoxVar12 == null) {
            eaoxVar12 = super.S();
        }
        this.Lc = eaoxVar12;
        eaon eaonVar = eaqoVar.m;
        if (eaonVar == null) {
            eaonVar = super.m();
        }
        this.h = eaonVar;
        eaon eaonVar2 = eaqoVar.n;
        if (eaonVar2 == null) {
            eaonVar2 = super.n();
        }
        this.i = eaonVar2;
        eaon eaonVar3 = eaqoVar.o;
        if (eaonVar3 == null) {
            eaonVar3 = super.p();
        }
        this.j = eaonVar3;
        eaon eaonVar4 = eaqoVar.p;
        if (eaonVar4 == null) {
            eaonVar4 = super.q();
        }
        this.k = eaonVar4;
        eaon eaonVar5 = eaqoVar.q;
        if (eaonVar5 == null) {
            eaonVar5 = super.s();
        }
        this.l = eaonVar5;
        eaon eaonVar6 = eaqoVar.r;
        if (eaonVar6 == null) {
            eaonVar6 = super.t();
        }
        this.m = eaonVar6;
        eaon eaonVar7 = eaqoVar.s;
        if (eaonVar7 == null) {
            eaonVar7 = super.v();
        }
        this.n = eaonVar7;
        eaon eaonVar8 = eaqoVar.t;
        if (eaonVar8 == null) {
            eaonVar8 = super.w();
        }
        this.o = eaonVar8;
        eaon eaonVar9 = eaqoVar.u;
        if (eaonVar9 == null) {
            eaonVar9 = super.y();
        }
        this.p = eaonVar9;
        eaon eaonVar10 = eaqoVar.v;
        if (eaonVar10 == null) {
            eaonVar10 = super.z();
        }
        this.q = eaonVar10;
        eaon eaonVar11 = eaqoVar.w;
        if (eaonVar11 == null) {
            eaonVar11 = super.A();
        }
        this.r = eaonVar11;
        eaon eaonVar12 = eaqoVar.x;
        if (eaonVar12 == null) {
            eaonVar12 = super.C();
        }
        this.s = eaonVar12;
        eaon eaonVar13 = eaqoVar.y;
        if (eaonVar13 == null) {
            eaonVar13 = super.D();
        }
        this.t = eaonVar13;
        eaon eaonVar14 = eaqoVar.z;
        if (eaonVar14 == null) {
            eaonVar14 = super.E();
        }
        this.u = eaonVar14;
        eaon eaonVar15 = eaqoVar.A;
        if (eaonVar15 == null) {
            eaonVar15 = super.G();
        }
        this.v = eaonVar15;
        eaon eaonVar16 = eaqoVar.B;
        if (eaonVar16 == null) {
            eaonVar16 = super.I();
        }
        this.w = eaonVar16;
        eaon eaonVar17 = eaqoVar.C;
        if (eaonVar17 == null) {
            eaonVar17 = super.J();
        }
        this.x = eaonVar17;
        eaon eaonVar18 = eaqoVar.D;
        if (eaonVar18 == null) {
            eaonVar18 = super.L();
        }
        this.y = eaonVar18;
        eaon eaonVar19 = eaqoVar.E;
        if (eaonVar19 == null) {
            eaonVar19 = super.N();
        }
        this.z = eaonVar19;
        eaon eaonVar20 = eaqoVar.F;
        if (eaonVar20 == null) {
            eaonVar20 = super.O();
        }
        this.A = eaonVar20;
        eaon eaonVar21 = eaqoVar.G;
        if (eaonVar21 == null) {
            eaonVar21 = super.P();
        }
        this.B = eaonVar21;
        eaon eaonVar22 = eaqoVar.H;
        if (eaonVar22 == null) {
            eaonVar22 = super.R();
        }
        this.C = eaonVar22;
        eaon eaonVar23 = eaqoVar.I;
        if (eaonVar23 == null) {
            eaonVar23 = super.T();
        }
        this.D = eaonVar23;
        eaok eaokVar2 = this.a;
        int i = 0;
        if (eaokVar2 != null) {
            int i2 = ((this.n == eaokVar2.v() && this.l == this.a.s() && this.j == this.a.p() && this.h == this.a.m()) ? 1 : 0) | (this.i == this.a.n() ? 2 : 0);
            if (this.z == this.a.N() && this.y == this.a.L() && this.t == this.a.D()) {
                i = 4;
            }
            i |= i2;
        }
        this.Ld = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        W();
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon A() {
        return this.r;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox B() {
        return this.c;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon C() {
        return this.s;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon D() {
        return this.t;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon E() {
        return this.u;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox F() {
        return this.d;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon G() {
        return this.v;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox H() {
        return this.e;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon I() {
        return this.w;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon J() {
        return this.x;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox K() {
        return this.f;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon L() {
        return this.y;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox M() {
        return this.g;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon N() {
        return this.z;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon O() {
        return this.A;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon P() {
        return this.B;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox Q() {
        return this.Lb;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon R() {
        return this.C;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox S() {
        return this.Lc;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon T() {
        return this.D;
    }

    protected abstract void V(eaqo eaqoVar);

    @Override // defpackage.eaok
    public eaou a() {
        eaok eaokVar = this.a;
        if (eaokVar != null) {
            return eaokVar.a();
        }
        return null;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox l() {
        return this.E;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon m() {
        return this.h;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon n() {
        return this.i;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox o() {
        return this.F;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon p() {
        return this.j;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon q() {
        return this.k;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox r() {
        return this.G;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon s() {
        return this.l;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon t() {
        return this.m;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox u() {
        return this.KZ;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon v() {
        return this.n;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon w() {
        return this.o;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaox x() {
        return this.La;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon y() {
        return this.p;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public final eaon z() {
        return this.q;
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public long U(long j, int i, int i2, int i3) {
        eaok eaokVar = this.a;
        if (eaokVar == null || (this.Ld & 1) != 1) {
            return super.U(j, i, i2, i3);
        }
        return eaokVar.U(j, i, i2, i3);
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public long d(int i, int i2, int i3, int i4) {
        eaok eaokVar = this.a;
        if (eaokVar == null || (this.Ld & 6) != 6) {
            return super.d(i, i2, i3, i4);
        }
        return eaokVar.d(i, i2, i3, i4);
    }

    @Override // defpackage.eaqq, defpackage.eaok
    public long e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        eaok eaokVar = this.a;
        if (eaokVar == null || (this.Ld & 5) != 5) {
            return super.e(i, i2, i3, i4, i5, i6, i7);
        }
        return eaokVar.e(i, i2, i3, i4, i5, i6, i7);
    }
}
